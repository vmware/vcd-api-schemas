
package com.vmware.vcloud.api.rest.constants;

/*-
 * #%L
 * vcd-api-bindings-java :: vCloud Director REST API bindings
 * %%
 * Copyright (C) 2013 - 2021 VMware
 * %%
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 * 
 * 1. Redistributions of source code must retain the above copyright notice,
 *    this list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 * 
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDERS OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 * #L%
 */

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Maintains mapping of types for xml <-> json lookups
 *
 */
public class XmlJsonTypeMatcher {

    private static final Map<String, String> XML_JSON_MAP = new HashMap<>();
    private static final Map<String, String> JSON_XML_MAP = new HashMap<>();

    private static final int PUBLIC_STATIC_FINAL = Modifier.PUBLIC | Modifier.STATIC | Modifier.FINAL;

    public static final String XML_FORMAT_SUFFIX = "+xml";
    public static final String JSON_FORMAT_SUFFIX = "+json";

    static {
        initializeMaps();
    }

    private static void initializeMaps() {
        loadTypes(RestConstants.MediaType.class);
        loadTypes(RestAdminConstants.MediaType.class);
        loadTypes(ExtensionConstants.MediaType.class);
    }

    private static Collection<? extends String> loadTypes(Class<?> clazz) {
        final Field[] declaredFields = clazz.getDeclaredFields();
        Arrays.stream(declaredFields)
            .map(XmlJsonTypeMatcher::extractFieldValue)
            .filter(Objects::nonNull)
            .forEach(XmlJsonTypeMatcher::putInMaps);

        return null;
    }

    private static final String extractFieldValue(Field field) {
        if (!isPublicStaticFinalString(field)) {
            return null;
        }

        try {
            return (String) field.get(null);
        } catch (IllegalArgumentException | IllegalAccessException e) {
            throw new AssertionError(e);
        }
    }

    private static final boolean isPublicStaticFinalString(Field field) {
        final int modifiers = field.getModifiers();
        return ((PUBLIC_STATIC_FINAL & modifiers) == PUBLIC_STATIC_FINAL)
                && String.class.equals(field.getType());
    }

    private static final void putInMaps(String value) {
        final String xmlTypeValue;
        final String jsonTypeValue;

        if (value.endsWith(XML_FORMAT_SUFFIX)) {
            xmlTypeValue = value;
            jsonTypeValue = value.replaceFirst("\\" + XML_FORMAT_SUFFIX + "$",  JSON_FORMAT_SUFFIX);

            XML_JSON_MAP.put(xmlTypeValue, JSON_XML_MAP.containsKey(jsonTypeValue) ? jsonTypeValue : null);
            JSON_XML_MAP.replace(jsonTypeValue, xmlTypeValue);
        } else if (value.endsWith(JSON_FORMAT_SUFFIX)) {
            jsonTypeValue = value;
            xmlTypeValue = value.replaceFirst("\\" + JSON_FORMAT_SUFFIX + "$", XML_FORMAT_SUFFIX);

            JSON_XML_MAP.put(jsonTypeValue, XML_JSON_MAP.containsKey(xmlTypeValue) ? xmlTypeValue : null);
            XML_JSON_MAP.replace(xmlTypeValue, jsonTypeValue);
        } else {
            // types that don't end with xml or json (e.g. image/*), there isn't much to do.
            return;
        }
    }

    public static final String getXmlTypeFor(final String jsonType) {
        return JSON_XML_MAP.get(jsonType);
    }

    public static final String getJsonTypeFor(final String xmlType) {
        return XML_JSON_MAP.get(xmlType);
    }
}

