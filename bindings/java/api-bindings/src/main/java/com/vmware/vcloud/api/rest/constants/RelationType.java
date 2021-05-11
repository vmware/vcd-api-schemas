
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

import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;

import com.vmware.vcloud.api.rest.links.LinkRelation;
import com.vmware.vcloud.api.rest.version.ApiVersion;



/**
 * Contains a relation(rel) which a link provide to a resource or operation.
 * Each Relation type consist of (value, apiVersion) pair. The value is the presentation value for this rel;
 * The version is the version in which this RelationType is introduced.
 *
 * <Link rel="" type="" href=""/>
 *
 * @since   1.5
 * @version 1.0.0
 *
 * @author  miliev
 */
public enum RelationType implements LinkRelation {

    SELF("self", ApiVersion.VERSION_1_5, GET.class),
    DOWN("down", ApiVersion.VERSION_1_5, GET.class),
    ADD("add", ApiVersion.VERSION_1_5, POST.class),
    UP("up", ApiVersion.VERSION_1_5, GET.class),
    EDIT("edit", ApiVersion.VERSION_1_5, PUT.class),
    REMOVE("remove", ApiVersion.VERSION_1_5, DELETE.class),
    COPY("copy", ApiVersion.VERSION_1_5, POST.class),
    MOVE("move", ApiVersion.VERSION_1_5, POST.class),
    ALTERNATE("alternate", ApiVersion.VERSION_1_5, GET.class),
    TASK_CANCEL("task:cancel", ApiVersion.VERSION_1_5, POST.class),
    DEPLOY("deploy", ApiVersion.VERSION_1_5, POST.class),
    UNDEPLOY("undeploy", ApiVersion.VERSION_1_5, POST.class),
    DISCARD_STATE("discardState", ApiVersion.VERSION_1_5, POST.class),
    POWER_POWER_ON("power:powerOn", ApiVersion.VERSION_1_5, POST.class),
    POWER_POWER_OFF("power:powerOff", ApiVersion.VERSION_1_5, POST.class),
    POWER_RESET("power:reset", ApiVersion.VERSION_1_5, POST.class),
    POWER_REBOOT("power:reboot", ApiVersion.VERSION_1_5, POST.class),
    POWER_SUSPEND("power:suspend", ApiVersion.VERSION_1_5, POST.class),
    POWER_SHUTDOWN("power:shutdown",ApiVersion.VERSION_1_5, POST.class),
    SCREEN_THUMBNAIL("screen:thumbnail", ApiVersion.VERSION_1_5, GET.class),
    SCREEN_ACQUIRE_TICKET("screen:acquireTicket", ApiVersion.VERSION_1_5, GET.class),
    MKS_ACQUIRE_TICKET("screen:acquireMksTicket", ApiVersion.VERSION_5_5, POST.class),
    MEDIA_INSERT_MEDIA("media:insertMedia", ApiVersion.VERSION_1_5, POST.class),
    MEDIA_EJECT_MEDIA("media:ejectMedia", ApiVersion.VERSION_1_5, POST.class),
    DISK_ATTACH("disk:attach", ApiVersion.VERSION_5_1, POST.class),
    DISK_DETACH("disk:detach", ApiVersion.VERSION_5_1, POST.class),
    UPLOAD_DEFAULT("upload:default", ApiVersion.VERSION_1_5, PUT.class),
    UPLOAD_ALTERNATE("upload:alternate", ApiVersion.VERSION_1_5),
    DOWNLOAD_DEFAULT("download:default", ApiVersion.VERSION_1_5, GET.class),
    DOWNLOAD_OVA_DEFAULT("download:ovaDefault", ApiVersion.VERSION_30_0, GET.class),
    DOWNLOAD_ALTERNATE("download:alternate", ApiVersion.VERSION_1_5),
    DOWNLOAD_IDENTITY("download:identity", ApiVersion.VERSION_5_1, GET.class),
    DOWNLOAD_OVA_IDENTITY("download:ovaIdentity", ApiVersion.VERSION_30_0, GET.class),

    SNAPSHOT_CREATE("snapshot:create", ApiVersion.VERSION_5_1, POST.class),
    SNAPSHOT_REVERT_TO_CURRENT("snapshot:revertToCurrent", ApiVersion.VERSION_5_1, POST.class),
    SNAPSHOT_REMOVE_ALL("snapshot:removeAll", ApiVersion.VERSION_5_1, POST.class),

    OVF("ovf", ApiVersion.VERSION_1_5, GET.class),
    OVA("ova", ApiVersion.VERSION_1_5),
    CONTROL_ACCESS("controlAccess", ApiVersion.VERSION_1_5, POST.class),
    PUBLISH("publish", ApiVersion.VERSION_1_5, POST.class),
    PUBLISH_EXTERNAL("publishToExternalOrganizations", ApiVersion.VERSION_5_5, POST.class),
    SUBSCRIBE_EXTERNAL("subscribeToExternalCatalog", ApiVersion.VERSION_5_5, POST.class),

    TENANTS("tenants", ApiVersion.VERSION_30_0, GET.class),
    TENANTS_EDIT("tenants:edit", ApiVersion.VERSION_31_0, PUT.class),
    PUBLISH_ALL("publish:all", ApiVersion.VERSION_30_0, POST.class),
    UNPUBLISH("unpublish", ApiVersion.VERSION_30_0, POST.class),
    UNPUBLISH_ALL("unpublish:all", ApiVersion.VERSION_30_0, POST.class),

    EXTENSION("extension", ApiVersion.VERSION_1_5),
    ENABLE("enable", ApiVersion.VERSION_1_5, POST.class),
    DISABLE("disable", ApiVersion.VERSION_1_5, POST.class),
    MERGE("merge", ApiVersion.VERSION_5_1, POST.class),
    CATALOG_ITEM("catalogItem", ApiVersion.VERSION_1_5, GET.class),
    RECOMPOSE("recompose", ApiVersion.VERSION_1_5, POST.class),
    REGISTER("register", ApiVersion.VERSION_1_5, POST.class),
    UNREGISTER("unregister", ApiVersion.VERSION_1_5, POST.class),
    REPAIR("repair", ApiVersion.VERSION_1_5, POST.class),
    RECONNECT("reconnect", ApiVersion.VERSION_1_5, POST.class),
    DISCONNECT("disconnect", ApiVersion.VERSION_5_5),
    UPGRADE("upgrade", ApiVersion.VERSION_1_5, POST.class),
    ANSWER("answer", ApiVersion.VERSION_1_5, POST.class),
    ADD_ORGS("addOrgs", ApiVersion.VERSION_5_5),
    REMOVE_ORGS("removeOrgs", ApiVersion.VERSION_5_5),
    SYNC("sync", ApiVersion.VERSION_5_5, POST.class),

    VSPHERE_WEB_CLIENT_URL("vSphereWebClientUrl", ApiVersion.VERSION_5_1, GET.class),
    VIM_SERVER_DVSWITCHES("vimServerDvSwitches", ApiVersion.VERSION_5_1),

    COLLABORATION_RESUME("resume", ApiVersion.VERSION_1_5, POST.class),
    COLLABORATION_ABORT("abort", ApiVersion.VERSION_1_5, POST.class),
    COLLABORATION_FAIL("fail", ApiVersion.VERSION_1_5, POST.class),
    ENTER_MAINTENANCE_MODE("enterMaintenanceMode", ApiVersion.VERSION_1_5, POST.class),
    EXIT_MAINTENANCE_MODE("exitMaintenanceMode", ApiVersion.VERSION_1_5, POST.class),
    TASK("task", ApiVersion.VERSION_1_5, GET.class),
    TASK_OWNER("task:owner", ApiVersion.VERSION_1_5, GET.class),
    PREVIOUS_PAGE("previousPage", ApiVersion.VERSION_1_5, GET.class),
    NEXT_PAGE("nextPage", ApiVersion.VERSION_1_5, GET.class),
    FIRST_PAGE("firstPage",ApiVersion.VERSION_1_5, GET.class),
    LAST_PAGE("lastPage", ApiVersion.VERSION_1_5, GET.class),
    INSTALL_VMWARE_TOOLS("installVmwareTools", ApiVersion.VERSION_1_5, POST.class),
    CONSOLIDATE("consolidate", ApiVersion.VERSION_1_5, POST.class),
    ENTITY("entity", ApiVersion.VERSION_1_5, GET.class),
    ENTITY_RESOLVER("entityResolver", ApiVersion.VERSION_1_5, GET.class),
    RELOCATE("relocate", ApiVersion.VERSION_1_5, POST.class),
    BLOCKING_TASKS("blockingTask", ApiVersion.VERSION_1_5, GET.class),
    UPDATE_PROGRESS("updateProgress", ApiVersion.VERSION_1_5, POST.class),
    SYNC_SYSLOG_SETTINGS("syncSyslogSettings" , ApiVersion.VERSION_1_5, POST.class),
    TAKE_OWNERSHIP("takeOwnership", ApiVersion.VERSION_5_6, POST.class),
    UNLOCK("unlock", ApiVersion.VERSION_1_5, POST.class),
    SHADOW_VMS("shadowVms", ApiVersion.VERSION_1_5, GET.class),
    TEST("test", ApiVersion.VERSION_1_5),
    UPDATE_RESOURCE_POOLS("update:resourcePools", ApiVersion.VERSION_1_5, POST.class),
    REMOVE_FORCE("remove:force", ApiVersion.VERSION_5_1, DELETE.class),
    STORAGE_CLASS("storageProfile", ApiVersion.VERSION_5_1, GET.class),
    REFRESH_STORAGE_CLASSES("refreshStorageProfiles", ApiVersion.VERSION_5_1, POST.class),
    REFRESH_VIRTUAL_CENTER("refreshVirtualCenter", ApiVersion.VERSION_5_1, POST.class),
    CHECK_COMPLIANCE("checkCompliance", ApiVersion.VERSION_5_1, POST.class),
    FORCE_FULL_CUSTOMIZATION("customizeAtNextPowerOn", ApiVersion.VERSION_5_6, POST.class),
    RELOAD_FROM_VC("reloadFromVc", ApiVersion.VERSION_5_6, POST.class),
    METRICS_DAY_VIEW("interval:day", ApiVersion.VERSION_5_1),
    METRICS_WEEK_VIEW("interval:week", ApiVersion.VERSION_5_1),
    METRICS_MONTH_VIEW("interval:month", ApiVersion.VERSION_5_1),
    METRICS_YEAR_VIEW("interval:year", ApiVersion.VERSION_5_1),
    METRICS_PREVIOUS_RANGE("range:previous", ApiVersion.VERSION_5_1),
    METRICS_NEXT_RANGE("range:next", ApiVersion.VERSION_5_1),
    METRICS_LATEST_RANGE("range:latest", ApiVersion.VERSION_5_1),
    MIGRATE_VMS("migrateVms", ApiVersion.VERSION_5_1, POST.class),
    RP_VM_LIST("resourcePoolVmList", ApiVersion.VERSION_5_1, GET.class),
    CREATE_EVENT("event:create", ApiVersion.VERSION_5_1, POST.class),
    CREATE_TASK("task:create", ApiVersion.VERSION_5_1, POST.class),
    UPLOAD_BUNDLE("bundle:upload", ApiVersion.VERSION_5_1, POST.class),
    CLEANUP_BUNDLES("bundles:cleanup", ApiVersion.VERSION_5_1, POST.class),
    AUTHORIZATION_CHECK("authorization:check", ApiVersion.VERSION_5_1, POST.class),
    EDGEGATEWAY_REDEPLOY("edgeGateway:redeploy", ApiVersion.VERSION_5_1, POST.class),
    EDGEGATEWAY_REAPPLY_SERVICES("edgeGateway:reapplyServices", ApiVersion.VERSION_5_1, POST.class),
    EDGEGATEWAY_CONFIGURE_SERVICES("edgeGateway:configureServices", ApiVersion.VERSION_5_1, POST.class),
    EDGEGATEWAY_CONFIGURE_SYSLOG("edgeGateway:configureSyslogServerSettings", ApiVersion.VERSION_5_11),
    EDGEGATEWAY_UPDATE_PROPERTIES("edgeGateway:updateProperties", ApiVersion.VERSION_27_0),
    EDGEGATEWAY_SYNC_SYSLOG_SETTINGS("edgeGateway:syncSyslogSettings", ApiVersion.VERSION_5_1, POST.class),
    EDGEGATEWAY_UPGRADE("edgeGateway:upgrade", ApiVersion.VERSION_5_1, POST.class),
    EDGEGATEWAY_UPGRADE_NETWORKING("edgeGateway:convertToAdvancedNetworking", ApiVersion.VERSION_7_0),
    EDGEGATEWAY_CONVERT_TO_ADVANCED_GATEWAY("edgeGateway:convertToAdvancedGateway", ApiVersion.VERSION_27_0),
    EDGEGATEWAY_ENABLE_DISTRIBUTED_ROUTING("edgeGateway:enableDistributedRouting", ApiVersion.VERSION_29_0),
    EDGEGATEWAY_DISABLE_DISTRIBUTED_ROUTING("edgeGateway:disableDistributedRouting", ApiVersion.VERSION_29_0),
    EDGEGATEWAY_SHOW_CONFIGURE_SERVICES_UI("edgeGateway:showConfigureServicesUI", ApiVersion.VERSION_27_0),
    EDGEGATEWAY_MODIFY_FORM_FACTOR("edgeGateway:modifyFormFactor", ApiVersion.VERSION_11_0),
    VDC_MANAGE_FIREWALL("manageFirewall", ApiVersion.VERSION_7_0),

    RIGHTS("rights", ApiVersion.VERSION_5_1, GET.class),
    CLEANUP_RIGHTS("rights:cleanup", ApiVersion.VERSION_5_1, POST.class),

    ORGVDCNETWORK_CONVERT_TO_SUBINTERFACE("orgVdcNetwork:convertToSubInterface", ApiVersion.VERSION_27_0),
    ORGVDCNETWORK_CONVERT_TO_INTERNAL_INTERFACE("orgVdcNetwork:convertToInternalInterface", ApiVersion.VERSION_29_0),
    ORGVDCNETWORK_CONVERT_TO_DISTRIBUTED_INTERFACE("orgVdcNetwork:convertToDistributedInterface", ApiVersion.VERSION_29_0),

    CERTIFICATE_UPDATE("certificate:update", ApiVersion.VERSION_5_1, POST.class),
    CERTIFICATE_RESET("certificate:reset", ApiVersion.VERSION_5_1, POST.class),
    TRUSTSTORE_UPDATE("truststore:update", ApiVersion.VERSION_5_1, POST.class),
    TRUSTSTORE_RESET("truststore:reset", ApiVersion.VERSION_5_1, POST.class),
    KEY_STORE_UPDATE("keystore:update", ApiVersion.VERSION_5_1, POST.class),
    KEY_STORE_RESET("keystore:reset", ApiVersion.VERSION_5_1, POST.class),
    SSPI_KEYTAB_UPDATE("keytab:update", ApiVersion.VERSION_5_1, POST.class),
    SSPI_KEYTAB_RESET("keytab:reset", ApiVersion.VERSION_5_1, POST.class),

    SERVICE_LINKS("down:serviceLinks", ApiVersion.VERSION_5_1, GET.class),
    API_FILTERS("down:apiFilters", ApiVersion.VERSION_5_1, GET.class),
    RESOURCE_CLASSES("down:resourceClasses", ApiVersion.VERSION_5_1, GET.class),
    RESOURCE_CLASS_ACTIONS("down:resourceClassActions", ApiVersion.VERSION_5_1, GET.class),
    SERVICES("down:services", ApiVersion.VERSION_5_1, GET.class),
    ACL_RULES("down:aclRules", ApiVersion.VERSION_5_1, GET.class),
    FILE_DESCRIPTORS("down:fileDescriptors", ApiVersion.VERSION_5_1, GET.class),
    API_DEFINITIONS("down:apiDefinitions", ApiVersion.VERSION_5_1, GET.class),
    SERVICE_RESOURCES("down:serviceResources", ApiVersion.VERSION_5_1, GET.class),
    ORG_VDC_FULL_GATEWAY("fullEdgeGateway", ApiVersion.VERSION_29_0),
    ORG_VDC_GATEWAYS("edgeGateways", ApiVersion.VERSION_5_1, GET.class),
    ORG_VDC_NETWORKS("orgVdcNetworks", ApiVersion.VERSION_5_1, GET.class),
    API_EXTENSIBILITY("down:extensibility", ApiVersion.VERSION_5_1, POST.class),
    API_SERVICE_QRY("down:service", ApiVersion.VERSION_5_1, GET.class),
    API_APIDEFINITIONS_QRY("down:apidefinitions", ApiVersion.VERSION_5_1, GET.class),
    API_FILES_QRY("down:files", ApiVersion.VERSION_5_1, GET.class),
    RECONFIGURE_VM("reconfigureVm", ApiVersion.VERSION_5_1, POST.class),
    VM_REAPPLY_COMPUTE_POLICY("reapplyComputePolicy", ApiVersion.Alias.VM_REAPPLY_COMPUTE_POLICY.getMapping(), POST.class),
    VM_CHECK_COMPUTE_POLICY_COMPLIANCE("checkComputePolicyCompliance", ApiVersion.Alias.VM_REAPPLY_COMPUTE_POLICY.getMapping(), POST.class),

    HYBRID("down:hybrid", ApiVersion.VERSION_5_6),
    HYBRID_ACQUIRE_CONTROL_TICKET("hybrid:acquireControlTicket", ApiVersion.VERSION_5_6),
    HYBRID_ACQUIRE_TICKET("hybrid:acquireTicket", ApiVersion.VERSION_5_6),
    HYBRID_REFRESH_TUNNEL("hybrid:refresh", ApiVersion.VERSION_6_0),

    METRICS("metrics", ApiVersion.VERSION_5_6, POST.class),

    FEDERATION_REGENERATE_CERTIFICATE("federation:regenerateFederationCertificate", ApiVersion.VERSION_5_6),
    TEMPLATE_INSTANTIATE("instantiate", ApiVersion.VERSION_5_7, POST.class),
    ADD_VMS("addVms", ApiVersion.VERSION_27_0),
    REMOVE_VMS("removeVms", ApiVersion.VERSION_27_0),

    MAKE_DEFAULT("makeDefault", ApiVersion.VERSION_35_0),
    MAKE_MANDATORY("makeMandatory", ApiVersion.VERSION_27_0),
    MAKE_OPTIONAL("makeOptional", ApiVersion.VERSION_27_0),
    NSX("nsx", ApiVersion.VERSION_27_0),
    EDGES("down:edges", ApiVersion.VERSION_27_0),
    EDGE("down:edge", ApiVersion.VERSION_27_0),
    DFW("down:dfwSection", ApiVersion.VERSION_27_0),
    DFW_ENABLE("add:dfwEnable", ApiVersion.VERSION_27_0),
    DFW_DISABLE("remove:dfwDisable", ApiVersion.VERSION_27_0),
    OPENAPI("openapi", ApiVersion.VERSION_29_0),
    ROLE_LINK("linkToTemplate", ApiVersion.VERSION_29_0),
    ROLE_UNLINK("unlinkFromTemplate", ApiVersion.VERSION_29_0),
    SITE("site", ApiVersion.Alias.MULTI_SITE.getMapping()),
    FANOUT_SKIPPED("fanout:skipped", ApiVersion.VERSION_30_0),
    FANOUT_FAILED("fanout:failed", ApiVersion.VERSION_30_0),
    REGENERATE_KEY_PAIR("regenerateKeyPair", ApiVersion.Alias.MULTI_SITE.getMapping()),
    WORKFLOWS_BROWSE("down:workflows", ApiVersion.Alias.VRO_WORKFLOW_SUPPORT.getMapping(), GET.class),
    WORKFLOWS_PRESENT("action:present", ApiVersion.Alias.VRO_WORKFLOW_SUPPORT.getMapping(), POST.class),
    WORKFLOWS_EXECUTE("action:execute", ApiVersion.Alias.VRO_WORKFLOW_SUPPORT.getMapping(), POST.class),
    ORG_VDC_ROLLUP("rollup", ApiVersion.Alias.ORG_VDC_ROLLUP.getMapping(), GET.class),
    VDC_GROUPS("networkZones", ApiVersion.Alias.MULTI_SITE_NETWORKING.getMapping(), GET.class),
    IMPORT_NETWORK("import:network", ApiVersion.Alias.NSX_T_SUPPORT.getMapping(), POST.class),
    IMPORTABLE_SWITCHES("down:importableSwitches", ApiVersion.Alias.NSX_T_SUPPORT.getMapping(), GET.class),
    NETWORK_RESET("reset:network", ApiVersion.Alias.ORG_VDC_NETWORKING.getMapping(), POST.class),
    VDC_NETWORK_PROFILE("down:vdcNetworkProfile", ApiVersion.Alias.EDGE_CLUSTER.getMapping(), GET.class),
    FIREWALL_GROUP("down:firewallGroups", ApiVersion.Alias.NSXT_SERVICES.getMapping(), GET.class),
    APP_PORT_PROFILE("down:appPortProfiles", ApiVersion.Alias.NSXT_SERVICES.getMapping(), GET.class),
    GATEWAY_IMPORT("import", ApiVersion.Alias.NSXT_ROUTER_IMPORT.getMapping(), GET.class),
    RESOURCE_POOL("down:resourcePools", ApiVersion.Alias.VC_RESOURCE_POOLS.getMapping(), GET.class),
    CAPABILITIES("vdcCapabilities", ApiVersion.VERSION_32_0, GET.class),
    VDC_MAX_COMPUTE_POLICY_CREATE("down:maxComputePolicy", ApiVersion.VERSION_33_0, PUT.class),
    DOWN_ALL_TASK_OPERATIONS("down:allTaskOperations", ApiVersion.VERSION_33_0, GET.class),
    ORIGINAL_LINKED_VAPP("linkedVApp:original", ApiVersion.VERSION_34_0, GET.class),
    GENERATED_LINKED_VAPP("linkedVApp:generatedByMove", ApiVersion.VERSION_34_0, GET.class),
    CONVERT_VAPP_TO_STAND_ALONE_VM("convertAllVAppVmsToStandAloneVms", ApiVersion.VERSION_35_0, POST.class),
    CONVERT_STAND_ALONE_VM_TO_VAPP("convertStandAloneVmToVApp", ApiVersion.VERSION_35_0, POST.class),

    OPENID_PROVIDER_CONFIG("openIdProviderConfig", ApiVersion.Alias.OAUTH_PROVIDER_CONFIG.getMapping(),
            POST.class),

    ENTITY_RESOLVE("entity:resolve", ApiVersion.VERSION_36_0, POST.class),
    ;


    private final String value;
    private final ApiVersion apiVersion;
    private Class<? extends Annotation> impliedHTTPVerb;
    private final static Map<String, RelationType> cachedValues;

    static {
        Map<String, RelationType> cache = new HashMap<>();
        for (RelationType c: RelationType.values()) {
            cache.put(c.value(), c);
        }
        cachedValues = Collections.unmodifiableMap(cache);
    }


    // TODO: collapse these two constructors once all the enums have a valid value for impliedHTTPVerb
    RelationType(String value, ApiVersion apiVersion) {
        this.value = value;
        this.apiVersion = apiVersion;
        this.impliedHTTPVerb = null;
    }

    RelationType(String value, ApiVersion apiVersion, Class<? extends Annotation> impliedHTTPVerb) {
        this.value = value;
        this.apiVersion = apiVersion;
        this.impliedHTTPVerb = impliedHTTPVerb;
    }

    @Override
    public String value() {
        return value;
    }

    public ApiVersion apiVersion() {
        return apiVersion;
    }

    public Class<? extends Annotation> impliedHTTPVerb() {
        return impliedHTTPVerb;
    }

    public static RelationType fromValue(String v) {

        RelationType rt = cachedValues.get(v);
        if (rt == null) {
            throw new IllegalArgumentException(v.toString());
        }

        return rt;
    }

}

