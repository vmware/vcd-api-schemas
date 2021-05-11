
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

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import javax.ws.rs.core.MediaType;

/**
 * Maintains mapping of types for xml <-> json {@link MediaType}s and their corresponding Java types
 * <P>
 * This class provides the core functionality for managing all the information. The information
 * itself is populated by a compile-time generated class, that extends this class and supplies all
 * the information that will be populated. The public methods in this class serve as access to that
 * information through the generated class
 * <P>
 * Important implementation notes: The generated class will be in the same package as this class
 * allowing access to all package-private or more visible components of this class. This allows us
 * to avoid having to generate complex logic via code generation, thus restricting code-generation
 * to a simplified implementation of compile time generation of data that get populated into this
 * class.
 */
abstract class VCloudMediaTypesBase {
    static final Map<String, String> XML_JSON_MAP = new HashMap<>();
    static final Map<String, String> JSON_XML_MAP = new HashMap<>();
    static final Map<String, Class<?>> CONTENT_TYPE_CLASS_MAP = new HashMap<>();
    static final Map<Class<?>, String> CLASS_CONTENT_TYPE_MAP = new HashMap<>();

    static final String XML_FORMAT_SUFFIX = "+xml";
    static final String JSON_FORMAT_SUFFIX = "+json";


    protected static void mapContentTypeToClass(String contentType, Class<?> clazz) {
        XML_JSON_MAP.put(contentType + XML_FORMAT_SUFFIX,  contentType + JSON_FORMAT_SUFFIX);
        JSON_XML_MAP.put(contentType + JSON_FORMAT_SUFFIX, contentType + XML_FORMAT_SUFFIX);
        if (CONTENT_TYPE_CLASS_MAP.containsKey(contentType.toLowerCase())) {
            System.err.printf("duplicate %s: existing: %s, new: %s\n", contentType,
                    CONTENT_TYPE_CLASS_MAP.get(contentType.toLowerCase()).toString(), clazz.toString());
        }
        CONTENT_TYPE_CLASS_MAP.put(contentType.toLowerCase(), clazz);
        CLASS_CONTENT_TYPE_MAP.put(clazz, contentType);
    }

    /**
     * Looks up the corresponding {@code xml} serialized {@link MediaType} for the specified
     * {@code json} serialized one.
     * <p>
     * e.g. {@code application/vnd.vmware.vm+json} would return
     * {@code application/vnd.vmware.vm+xml}
     *
     * @param jsonType
     *            media type specifying {@code json} serialization
     * @return corresponding media type specifying {@code xml} serialization or {@code null} if
     *         none found
     */
    public final String getXmlTypeFor(final String jsonType) {
        return JSON_XML_MAP.get(jsonType);
    }

    /**
     * Looks up the corresponding {@code json} serialized {@link MediaType} for the specified
     * {@code xml} serialized one.
     * <p>
     * e.g. {@code application/vnd.vmware.vm+xml} would return
     * {@code application/vnd.vmware.vm+json}
     *
     * @param xmlType
     *            media type specifying {@code xml} serialization
     * @return corresponding media type specifying {@code json} serialization or {@code null} if
     *         none found
     */
    public final String getJsonTypeFor(final String xmlType) {
        return XML_JSON_MAP.get(xmlType);
    }

    /**
     * Returns the {@link Class} object for the generated type identified by the specified
     * {@link MediaType}
     * <p>
     * <b>Note:</b> The {@code content-type} specified as argument must match the
     * {@code  <meta:content-type>} value specified in xsd files and correspondingly present in
     * generated java files as the {@code CONTENT_TYPE} field. The value may, optionally, be
     * suffixed with either {@value VCloudMediaTypesBase#XML_FORMAT_SUFFIX} or
     * {@value #JSON_FORMAT_SUFFIX} <br>
     * e.g. following are legal values:
     * <ul>
     * <li>{@code application/vnd.vmware.vm}</li>
     * <li>{@code application/vnd.vmware.vm+xml}</li>
     * <li>{@code application/vnd.vmware.vm+json}</li>
     * </ul>
     * <p>
     * If you have a full media type value with header parameters, use
     * {@link #getClassFor(MediaType)} version of this method instead.
     * <br>e.g. following values will result in lookup failures and {@code null} will be returned:
     * <ul>
     * <li>{@code application/*+xml}
     * <li>{@code application/*+json}
     * <li>{@code application/*+xml;version=x.0}
     * <li>{@code application/*+json;version=x.0}
     * <li>{@code application/vnd.vmware.vm+xml;version=x.0}</li>
     * <li>{@code application/vnd.vmware.vm+json;version=x.0}</li>
     * </ul>
     *
     * @see #getClassFor(MediaType)
     * @param contentType
     *            content-type as described above
     * @return {@link Class} for the corresponding generated Java type.
     */
    public final Class<?> getClassFor(final String contentType) {
        final String baseContentType = contentType.replaceAll("\\+((xml)|(json))$", "");
        return CONTENT_TYPE_CLASS_MAP.get(baseContentType.toLowerCase());
    }

    /**
     * Returns the {@link Class} object for the generated type identified by the specified
     * {@link MediaType}
     * <p>
     * Media type can be all valid <i>non-wildcard</i> values as used in API calls. Header
     * parameters may be present. They <code>{type}/{subtype}</code> portion of the specified
     * argument will used for lookup. This value must match the {@code  <meta:content-type>} value
     * specified in xsd files and correspondingly present in generated java files as the
     * {@code CONTENT_TYPE} field. <br>
     * e.g. following are legal values when used to construct a {@link MediaType} object:
     * <ul>
     * <li>{@code application/vnd.vmware.vm}</li>
     * <li>{@code application/vnd.vmware.vm+xml}</li>
     * <li>{@code application/vnd.vmware.vm+json}</li>
     * <li>{@code application/vnd.vmware.vm+xml;version=x.0}</li>
     * <li>{@code application/vnd.vmware.vm+json;version=x.0}</li>
     * </ul>
     * <p>
     * Wild-card values are useless for any lookups. Thus, following values will result in lookup
     * failures and {@code null} will be returned:
     * <ul>
     * <li>{@code application/*+xml}
     * <li>{@code application/*+json}
     * <li>{@code application/*+xml;version=x.0}
     * <li>{@code application/*+json;version=x.0}
     * </ul>
     *
     * @see #getClassFor(String)
     * @see MediaType#valueOf(String)
     *
     * @param contentType
     *            {@link MediaType} representing the content-type whose Java {@link Class} must be
     *            looked up
     * @return {@link Class} for the corresponding generated Java type.
     */
    public final Class<?> getClassFor(final MediaType mediaType) {
        return getClassFor(String.format("%s/%s", mediaType.getType(), mediaType.getSubtype()));
    }

    /**
     * Returns media type (<code>type/subtype</code>) as a {@link String} for the specified
     * {@link Class}
     * <p>
     * It is assumed that the parameter is one of the generated types from the .xsd schema.
     *
     * @param clazz
     *            {@link Class} representing one of the generated types
     * @return {@link String} representing the {@code MediaType} for the content-type using
     *         {@code xml} serialization for the specified {@link Class} must be looked up
     * @throws IllegalArgumentException
     *             if the specified {@link Class} is <code>null</code> or not one of the generated
     *             types
     */
    public final String getXmlMediaTypeFor(final Class<?> clazz) throws IllegalArgumentException {
        return getSuffixedMediaTypeFor(clazz, XML_FORMAT_SUFFIX);
    }

    /**
     * Returns media type (<code>type/subtype</code>) as a {@link String} for the specified
     * {@link Class}
     * <p>
     * It is assumed that the parameter is one of the generated types from the .xsd schema.
     *
     * @param clazz
     *            {@link Class} representing one of the generated types
     * @return {@link String} representing the {@code MediaType} for the content-type using
     *         {@code json} serialization for the specified {@link Class} must be looked up
     * @throws IllegalArgumentException
     *             if the specified {@link Class} is <code>null</code> or not one of the generated
     *             types
     */
    public final String getJsonMediaTypeFor(final Class<?> clazz) throws IllegalArgumentException {
        return getSuffixedMediaTypeFor(clazz, JSON_FORMAT_SUFFIX);
    }

    private String getSuffixedMediaTypeFor(final Class<?> clazz, final String suffix) throws IllegalArgumentException {
        return Optional.of(clazz).map(CLASS_CONTENT_TYPE_MAP::get).map(s -> s + suffix)
                .orElseThrow(() -> new IllegalArgumentException(
                        String.format("Class: %s is null or not a type generated from vcd .xsd schema", clazz)));
    }
}

