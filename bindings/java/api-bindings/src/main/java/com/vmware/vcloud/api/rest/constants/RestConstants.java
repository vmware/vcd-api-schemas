
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

import com.vmware.vcloud.api.rest.schema_v1_5.AdminOrgType;
import com.vmware.vcloud.api.rest.schema_v1_5.AdminVdcType;
import com.vmware.vcloud.api.rest.schema_v1_5.AllocatedIpAddressesType;
import com.vmware.vcloud.api.rest.schema_v1_5.ApiDefinitionType;
import com.vmware.vcloud.api.rest.schema_v1_5.ApiExtensibilityType;
import com.vmware.vcloud.api.rest.schema_v1_5.BootOptionsType;
import com.vmware.vcloud.api.rest.schema_v1_5.CaptureVAppParamsType;
import com.vmware.vcloud.api.rest.schema_v1_5.CatalogItemType;
import com.vmware.vcloud.api.rest.schema_v1_5.CatalogType;
import com.vmware.vcloud.api.rest.schema_v1_5.CloneMediaParamsType;
import com.vmware.vcloud.api.rest.schema_v1_5.CloneVAppParamsType;
import com.vmware.vcloud.api.rest.schema_v1_5.CloneVAppTemplateParamsType;
import com.vmware.vcloud.api.rest.schema_v1_5.ComplianceResultType;
import com.vmware.vcloud.api.rest.schema_v1_5.ComposeVAppParamsType;
import com.vmware.vcloud.api.rest.schema_v1_5.ControlAccessParamsType;
import com.vmware.vcloud.api.rest.schema_v1_5.CopyOrMoveCatalogItemParamsType;
import com.vmware.vcloud.api.rest.schema_v1_5.CreateSnapshotParamsType;
import com.vmware.vcloud.api.rest.schema_v1_5.CreateVmParamsType;
import com.vmware.vcloud.api.rest.schema_v1_5.CurrentUsageSpecType;
import com.vmware.vcloud.api.rest.schema_v1_5.CurrentUsageType;
import com.vmware.vcloud.api.rest.schema_v1_5.CustomizationSectionType;
import com.vmware.vcloud.api.rest.schema_v1_5.DeployVAppParamsType;
import com.vmware.vcloud.api.rest.schema_v1_5.DiskAttachOrDetachParamsType;
import com.vmware.vcloud.api.rest.schema_v1_5.DiskCreateParamsType;
import com.vmware.vcloud.api.rest.schema_v1_5.DiskMoveParamsType;
import com.vmware.vcloud.api.rest.schema_v1_5.DiskType;
import com.vmware.vcloud.api.rest.schema_v1_5.EntityReferenceType;
import com.vmware.vcloud.api.rest.schema_v1_5.ErrorType;
import com.vmware.vcloud.api.rest.schema_v1_5.FromCloudTunnelCreateParamsType;
import com.vmware.vcloud.api.rest.schema_v1_5.FromCloudTunnelListenerListType;
import com.vmware.vcloud.api.rest.schema_v1_5.FromCloudTunnelType;
import com.vmware.vcloud.api.rest.schema_v1_5.GuestCustomizationSectionType;
import com.vmware.vcloud.api.rest.schema_v1_5.GuestCustomizationStatusSectionType;
import com.vmware.vcloud.api.rest.schema_v1_5.HistoricUsageSpecType;
import com.vmware.vcloud.api.rest.schema_v1_5.HistoricUsageType;
import com.vmware.vcloud.api.rest.schema_v1_5.HybridOrgType;
import com.vmware.vcloud.api.rest.schema_v1_5.HybridTicketType;
import com.vmware.vcloud.api.rest.schema_v1_5.InstantiateOvfParamsType;
import com.vmware.vcloud.api.rest.schema_v1_5.InstantiateVAppTemplateParamsType;
import com.vmware.vcloud.api.rest.schema_v1_5.InstantiateVdcTemplateParamsType;
import com.vmware.vcloud.api.rest.schema_v1_5.InstantiateVmTemplateParamsType;
import com.vmware.vcloud.api.rest.schema_v1_5.LeaseSettingsSectionType;
import com.vmware.vcloud.api.rest.schema_v1_5.MediaInsertOrEjectParamsType;
import com.vmware.vcloud.api.rest.schema_v1_5.MetadataType;
import com.vmware.vcloud.api.rest.schema_v1_5.MetadataValueType;
import com.vmware.vcloud.api.rest.schema_v1_5.MksTicketType;
import com.vmware.vcloud.api.rest.schema_v1_5.MoveVAppParamsType;
import com.vmware.vcloud.api.rest.schema_v1_5.MultisiteSessionUserInfoType;
import com.vmware.vcloud.api.rest.schema_v1_5.NetworkConfigSectionType;
import com.vmware.vcloud.api.rest.schema_v1_5.NetworkConnectionSectionType;
import com.vmware.vcloud.api.rest.schema_v1_5.NetworkType;
import com.vmware.vcloud.api.rest.schema_v1_5.OrgAssociationType;
import com.vmware.vcloud.api.rest.schema_v1_5.OrgAssociationsType;
import com.vmware.vcloud.api.rest.schema_v1_5.OrgListType;
import com.vmware.vcloud.api.rest.schema_v1_5.OrgNetworkType;
import com.vmware.vcloud.api.rest.schema_v1_5.OrgType;
import com.vmware.vcloud.api.rest.schema_v1_5.OrgVdcNetworkType;
import com.vmware.vcloud.api.rest.schema_v1_5.OrgVdcRollupType;
import com.vmware.vcloud.api.rest.schema_v1_5.OwnerType;
import com.vmware.vcloud.api.rest.schema_v1_5.ProductSectionListType;
import com.vmware.vcloud.api.rest.schema_v1_5.ProviderVdcType;
import com.vmware.vcloud.api.rest.schema_v1_5.RasdItemsListType;
import com.vmware.vcloud.api.rest.schema_v1_5.RecomposeVAppParamsType;
import com.vmware.vcloud.api.rest.schema_v1_5.ReferencesType;
import com.vmware.vcloud.api.rest.schema_v1_5.RelocateParamsType;
import com.vmware.vcloud.api.rest.schema_v1_5.RemoteUriProbeResultType;
import com.vmware.vcloud.api.rest.schema_v1_5.RoleType;
import com.vmware.vcloud.api.rest.schema_v1_5.RuntimeInfoSectionType;
import com.vmware.vcloud.api.rest.schema_v1_5.ScreenTicketType;
import com.vmware.vcloud.api.rest.schema_v1_5.ServiceType;
import com.vmware.vcloud.api.rest.schema_v1_5.SessionType;
import com.vmware.vcloud.api.rest.schema_v1_5.SiteAssociationType;
import com.vmware.vcloud.api.rest.schema_v1_5.SiteAssociationsType;
import com.vmware.vcloud.api.rest.schema_v1_5.SiteStatusType;
import com.vmware.vcloud.api.rest.schema_v1_5.SiteType;
import com.vmware.vcloud.api.rest.schema_v1_5.SnapshotSectionType;
import com.vmware.vcloud.api.rest.schema_v1_5.SupportedOperatingSystemsInfoType;
import com.vmware.vcloud.api.rest.schema_v1_5.TaskPrototypeType;
import com.vmware.vcloud.api.rest.schema_v1_5.TaskType;
import com.vmware.vcloud.api.rest.schema_v1_5.TasksListType;
import com.vmware.vcloud.api.rest.schema_v1_5.ToCloudTunnelCreateParamsType;
import com.vmware.vcloud.api.rest.schema_v1_5.ToCloudTunnelType;
import com.vmware.vcloud.api.rest.schema_v1_5.TunnelingApplicationListType;
import com.vmware.vcloud.api.rest.schema_v1_5.UndeployVAppParamsType;
import com.vmware.vcloud.api.rest.schema_v1_5.UploadVAppTemplateParamsType;
import com.vmware.vcloud.api.rest.schema_v1_5.UserType;
import com.vmware.vcloud.api.rest.schema_v1_5.VAppNetworkType;
import com.vmware.vcloud.api.rest.schema_v1_5.VAppTemplateType;
import com.vmware.vcloud.api.rest.schema_v1_5.VAppType;
import com.vmware.vcloud.api.rest.schema_v1_5.VdcComputePolicyReferencesType;
import com.vmware.vcloud.api.rest.schema_v1_5.VdcStorageProfileType;
import com.vmware.vcloud.api.rest.schema_v1_5.VdcTemplateType;
import com.vmware.vcloud.api.rest.schema_v1_5.VdcTemplatesType;
import com.vmware.vcloud.api.rest.schema_v1_5.VdcType;
import com.vmware.vcloud.api.rest.schema_v1_5.VirtualHardwareVersionType;
import com.vmware.vcloud.api.rest.schema_v1_5.VmAffinityRuleType;
import com.vmware.vcloud.api.rest.schema_v1_5.VmAffinityRulesType;
import com.vmware.vcloud.api.rest.schema_v1_5.VmCapabilitiesType;
import com.vmware.vcloud.api.rest.schema_v1_5.VmCheckPGCType;
import com.vmware.vcloud.api.rest.schema_v1_5.VmPendingQuestionType;
import com.vmware.vcloud.api.rest.schema_v1_5.VmQuestionAnswerType;
import com.vmware.vcloud.api.rest.schema_v1_5.VmType;
import com.vmware.vcloud.api.rest.schema_v1_5.VmsType;
import com.vmware.vcloud.api.rest.schema_v1_5.extension.PrepareHostParamsType;
import com.vmware.vcloud.api.rest.schema_v1_5.extension.ShieldManagerType;
import com.vmware.vcloud.api.rest.schema_v1_5.extension.TenantMigrationParamsType;
import com.vmware.vcloud.api.rest.schema_v1_5.extension.VMWExtensionType;
import com.vmware.vcloud.api.rest.schema_v1_5.extension.VMWExternalNetworkReferencesType;
import com.vmware.vcloud.api.rest.schema_v1_5.extension.VMWHostGroupType;
import com.vmware.vcloud.api.rest.schema_v1_5.extension.VMWHostGroupsType;
import com.vmware.vcloud.api.rest.schema_v1_5.extension.VMWHostReferencesType;
import com.vmware.vcloud.api.rest.schema_v1_5.extension.VMWNamedVmGroupType;
import com.vmware.vcloud.api.rest.schema_v1_5.extension.VMWProviderVdcReferencesType;
import com.vmware.vcloud.api.rest.schema_v1_5.extension.VMWProviderVdcResourcePoolType;
import com.vmware.vcloud.api.rest.schema_v1_5.extension.VMWStorageProfilesType;
import com.vmware.vcloud.api.rest.schema_v1_5.extension.VMWVmGroupReferencesType;
import com.vmware.vcloud.api.rest.schema_v1_5.extension.VMWVmGroupType;
import com.vmware.vcloud.api.rest.schema_v1_5.extension.VMWVmGroupsType;
import com.vmware.vcloud.api.rest.schema_v1_5.extension.VMWVmHostAffinityRulesType;
import com.vmware.vcloud.api.rest.version.ApiVersion;

/**
 * A variety of vCloud REST API constants
 */
public interface RestConstants {

    public static final String VCLOUD_NAMESPACE_1_5 = "http://www.vmware.com/vcloud/v1.5";

    public static final String ALPHA_ENABLED_CONFIG_KEY = "restapi.alpha.enabled";

    /**
     * URIs for entities
     *
     * TODO: The inconsistent use of trailing slashes needs to be investigated, but be warned that
     * some Apache CXF / JAX-RS code is sensitive to its presence or lack of trailing slashes.
     * (Presumably there's sensitivity in vCD code as well--e.g., in contexts where string
     * concatentation is being done.)
     */
    public static class Uri {
        public final static String SERVER_STATUS = "/server_status";
        public final static String SCHEMA = "/schema/";
        public final static String VERSIONS = "/versions";
        public final static String LOGIN = "/login";
        public final static String LOGOUT = "/logout";
        public final static String SESSIONS = "/sessions";
        public final static String SESSION = "/session";
        public final static String FULL_GATEWAYS = "/fullEdgeGateways";
        public final static String ENTITY = "/entity/";
        public final static String ORGANIZATION = "/org/";
        public final static String VDC = "/vdc/";
        public final static String HARDWARE_VERSION = "/hwv/";
        public final static String VDC_TEMPLATE = "/vdcTemplate/";
        public final static String PROXY_CONFIGURATION = "/proxyConfiguration/";
        public final static String VDC_TEMPLATES = "/vdcTemplates";
        public final static String VAPP_TEMPLATE = "/vAppTemplate/";
        public final static String VAPP = "/vApp/";
        public final static String SHADOW_VM = "/shadowVm/";
        public final static String TASK = "/task/";
        public final static String OPERATIONS = "/operations/";
        public final static String TASKS_LIST = "/tasksList/";
        public final static String MEDIA = "/media/";
        public final static String NETWORK = "/network/";
        public final static String ADD_CATALOG_ITEMS_PATH = "/catalogItems";
        public final static String CATALOG = "/catalog/";
        public final static String CATALOG_ITEM = "/catalogItem/";
        public final static String ERROR = "/error/";
        public final static String CONTROL_ACCESS = "/controlAccess/";
        public final static String QUESTION = "/question";
        public final static String OWNER = "/owner";
        public final static String UNAUTHORIZED_ACCESS = "/unauthorizedAccess/";
        public final static String BAD_REQUEST = "/badRequest/";
        public final static String INTERNAL_ERROR = "/internalError/";
        public final static String GATEWAY_TIMEOUT_ERROR = "/timeoutError/";
        public final static String NOT_ACCEPTABLE_ERROR = "/notAcceptable/";
        public final static String QUERY = "/query";
        public static final String CATALOGS = "/catalogs";
        public static final String MEDIA_LIST = "/mediaList";
        public static final String VAPP_TEMPLATES = "/vAppTemplates";
        public static final String VAPPS = "/vApps";
        public static final String VMS_IN_LEASE = "/vms";
        public static final String SHADOW_VMS = "/shadowVms";
        public static final String METADATA = "/metadata";
        public static final String METADATA_KEY = "/metadata/";
        public final static String DISK = "/disk/";
        public static final String DISKS = "/disks";
        public static final String ATTACHED_VMS = "/attachedVms";
        public final static String VDC_STORAGE_CLASS = "/vdcStorageProfile/";
        public final static String ALLOCATED_IP_ADDRESS="/allocatedAddresses/";
        public final static String SUPPORTED_SYSTEMS_INFO="/supportedSystemsInfo/";
        public final static String VM_CAPABILITIES = "/vmCapabilities/";
        public final static String VM_BOOT_OPTIONS = "/bootOptions/";
        public final static String COMPLIANCE_RESULT = "/complianceResult";
        public final static String API_DEFINITION = "/apidefinition";
        public final static String API_DEFINITIONS_LIST = "/apidefinitions";
        public final static String API_FILE_DESCRIPTORS_LIST = "/files";
        public final static String EXTERNAL_SVC = "/service";
        public final static String EXTENSIBILITY = "/extensibility";
        public final static String VM_AFFINITY_RULE = "/vmAffinityRule/";
        public final static String VM_AFFINITY_RULES = "/vmAffinityRules/";
        public final static String ORG_VDC_ROLLUP = "/vdcRollup";
        public final static String TEST_EMAIL_SETTINGS = "/smtp/test";
        public final static String TEST_LDAP_SETTINGS = "/ldap/test";
        public final static String SYNC_LDAP = "/ldap/sync";

        /* OVF sections */
        public final static String LEASE_SETTINGS_SECTION = "/leaseSettingsSection/";
        public final static String STARTUP_SECTION = "/startupSection/";
        public final static String NETWORK_SECTION = "/networkSection/";
        public static final String PRODUCT_SECTIONS = "/productSections/";
        public final static String NETWORK_CONFIG_SECTION = "/networkConfigSection/";
        public final static String NETWORK_CONNECTION_SECTION = "/networkConnectionSection/";
        public final static String OPERATING_SYSTEM_SECTION = "/operatingSystemSection/";
        public static final String GUEST_CUSTOMIZATION_SECTION = "/guestCustomizationSection/";
        public static final String CUSTOMIZATION_SECTION = "/customizationSection/";
        public final static String VIRTUAL_HARDWARE_SECTION = "/virtualHardwareSection/";
        public static final String VIRTUAL_HARDWARE_SECTION_CPU = "/cpu";
        public static final String VIRTUAL_HARDWARE_SECTION_MEMORY = "/memory";
        public static final String VIRTUAL_HARDWARE_SECTION_DISKS = "/disks";
        public static final String VIRTUAL_HARDWARE_SECTION_NETWORK_CARDS = "/networkCards";
        public static final String VIRTUAL_HARDWARE_SECTION_MEDIA_DRIVES = "/media";
        public static final String VIRTUAL_HARDWARE_SECTION_SERIAL_PORTS = "/serialPorts";
        public final static String RUNTIME_INFO_SECTION = "/runtimeInfoSection";
        public final static String SNAPSHOT_SECTION = "/snapshotSection";
        public final static String RECONFIGURE_VM = "/action/reconfigureVm";
        public final static String VM_REAPPLY_COMPUTE_POLICY = "/action/reapplyComputePolicy";
        public final static String GUEST_CUST_STATUS = "/guestcustomizationstatus/";
        public final static String GUEST_CUSTOMIZAION_CHECK_PGC = "/checkpostcustomizationscript/";

        public final static String COMPUTE_POLICIES = "/computePolicies";
        public final static String VDC_COMPUTE_POLICIES = "/vdcComputePolicies";
        public final static String VM_SECURITY_TAGS = "/securityTags/vm";


        /* Metrics */
        public static final class Metrics {
            public static final String BASE = "/metrics";
            public static final String CURRENT = "/current";
            public static final String HISTORIC = "/historic";
            public static final String[] METRIC_GROUP = {"/cpu", "/mem", "/disk"};
            public static final String CPU_USAGE_AVERAGE = "cpu.usage.average";
            public static final String CPU_USAGEMHZ_AVERAGE = "cpu.usagemhz.average";
            public static final String CPU_USAGE_MAXIMUM = "cpu.usage.maximum";
            public static final String MEM_USAGE_AVERAGE = "mem.usage.average";
            public static final String DISK_WRITE_AVERAGE = "disk.write.average";
            public static final String DISK_READ_AVERAGE = "disk.read.average";
            public static final String DISK_USED_LATEST = "disk.used.latest";
            public static final String DISK_PROVISIONED_LATEST = "disk.provisioned.latest";
            public static final String CPU_ALL_PATTERN = "cpu.*";
            public static final String MEM_ALL_PATTERN = "mem.*";
            public static final String DISK_ALL_PATTERN = "disk.*";
            public static final String PERCENT = "PERCENT";
            public static final String MEGAHERTZ = "MEGAHERTZ";
            public static final String KILOBYTE = "KILOBYTE";
            public static final String KILOBYTES_PER_SECOND = "KILOBYTES_PER_SECOND";
        }

        // Hybrid networking
        public static final String HYBRID = "/hybrid";
        public static final String TO_CLOUD_TUNNEL = "/toCloudTunnel";
        public static final String FROM_CLOUD_TUNNEL = "/fromCloudTunnel";

        //Networking proxy api
        public static final String NETWORK_ROOT = "/network";
        public static final String EDGES = "/edges";
        public static final String EDGE = "/edge";
        public static final String NSX_MANAGERS = "/nsxmanagers";
        public static final String NSX_MANAGER_HEALTH = NSX_MANAGERS + "/health";
        public static final String IMPORT_NETWORK = "/orgvdcnetworks/import";
        public static final String IMPORTABLE_NETWORKS = "/orgvdcnetworks/importableswitches";

        //Networking open api
        public static final String VDC_NETWORK_PROFILE = "/networkProfile";
        public static final String FIREWALL_GROUPS = "/firewallGroups";
        public static final String APP_PORT_PROFILES = "/applicationPortProfiles";
        public static final String EDGE_GATEWAY = "/edgeGateways";

        //Networking Multisite
        public static final String MULTISITE_EGRESS_PREFIX = "/multisite/universalrouter/egresspoints";
        public static final String MULTISITE_EGRESS_CONFIGURE = MULTISITE_EGRESS_PREFIX + "/configure";
        public static final String MULTISITE_EGRESS_UNCONFIGURE = MULTISITE_EGRESS_PREFIX + "/unconfigure";
        public static final String MULTISITE_ROUTE_PREFIX = "/multisite/universalrouter/route";
        public static final String MULTISITE_ROUTE_EGRESS_CONFIGURE = MULTISITE_ROUTE_PREFIX + "/egress/configure";
        public static final String MULTISITE_ROUTE_EGRESS_UNCONFIGURE = MULTISITE_ROUTE_PREFIX + "/egress/unconfigure";
        public static final String MULTISITE_ROUTE_UDLR_CONFIGURE = MULTISITE_ROUTE_PREFIX + "/udlr/configure";
        public static final String MULTISITE_ROUTE_UDLR_UNCONFIGURE = MULTISITE_ROUTE_PREFIX + "/udlr/unconfigure";
        public static final String MULTISITE_CROSS_VDC_NETWORK_PREFIX = "/multisite/crossvdcnetworks";
        public static final String MULTISITE_CROSS_VDC_NETWORK_UPDATE = MULTISITE_CROSS_VDC_NETWORK_PREFIX + "/update";
        public static final String MULTISITE_CROSS_VDC_NETWORK_SHRINK = MULTISITE_CROSS_VDC_NETWORK_PREFIX + "/shrink";
        public static final String MULTISITE_CROSS_VDC_NETWORK_EXPAND = MULTISITE_CROSS_VDC_NETWORK_PREFIX + "/expand";


        // Multi-Site
        public static final class MultiSite {
            public static final String SITE = "/site";
            public static final String ASSOCIATIONS = "/associations";
            public static final String ASSOCIATION_DATA = "/associationData";
            public static final String SITE_ASSOCIATIONS = SITE + ASSOCIATIONS;
            public static final String ORGANIZATIONS = "/organizations";
            public static final String STATUS = "/status";
            public static final String ID_PATTERN = "/{id}";
            public static final String LOCAL = "local";
        }

        // Compute policies
        public static final String VDC_MAX_COMPUTE_POLICY = "/maxComputePolicy";
    }

    /**
     * Content types for entities and parameters
     */
    public static class MediaType {
        public final static String ENTITY = com.vmware.vcloud.api.rest.schema_v1_5.EntityType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public final static String ORGANIZATION = OrgType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public final static String ADMIN_ORGANIZATION = AdminOrgType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public final static String ORGANIZATION_LIST = OrgListType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public final static String VDC = VdcType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public final static String ADMIN_VDC = AdminVdcType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public final static String VDC_TEMPLATE = VdcTemplateType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public final static String VDC_TEMPLATE_LIST = VdcTemplatesType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public final static String INSTANTIATE_VDC_TEMPLATE_PARAMS = InstantiateVdcTemplateParamsType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public final static String UPLOAD_VAPP_TEMPLATE_PARAMS = UploadVAppTemplateParamsType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public final static String INSTANTIATE_OVF_PARAMS = InstantiateOvfParamsType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public final static String INSTANTIATE_VAPP_TEMPLATE_PARAMS = InstantiateVAppTemplateParamsType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public final static String INSTANTIATE_VM_TEMPLATE_PARAMS = InstantiateVmTemplateParamsType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public final static String CLONE_VAPP_PARAMS = CloneVAppParamsType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public final static String MOVE_VAPP_PARAMS =  MoveVAppParamsType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public final static String CLONE_VAPP_TEMPLATE_PARAMS = CloneVAppTemplateParamsType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public final static String COPY_OR_MOVE_CATALOG_ITEM_PARAMS = CopyOrMoveCatalogItemParamsType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public final static String CLONE_MEDIA_PARAMS = CloneMediaParamsType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public final static String DEPLOY_VAPP_PARAMS = DeployVAppParamsType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public final static String UNDEPLOY_VAPP_PARAMS = UndeployVAppParamsType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public final static String CAPTURE_VAPP_PARAMS = CaptureVAppParamsType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public final static String COMPOSE_VAPP_PARAMS = ComposeVAppParamsType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
	public final static String CREATE_VM_PARAM = CreateVmParamsType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public final static String VAPP_TEMPLATE = VAppTemplateType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public final static String VAPP = VAppType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public final static String VM = VmType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public final static String SHADOW_VM = "application/vnd.vmware.vcloud.shadowvm" + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public final static String VMS = VmsType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public final static String MEDIA = com.vmware.vcloud.api.rest.schema_v1_5.MediaType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public final static String VAPP_NETWORK = VAppNetworkType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public final static String ORG_NETWORK = OrgNetworkType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public final static String ORG_VDC_NETWORK = OrgVdcNetworkType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public final static String NETWORK = NetworkType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public final static String TASK = TaskType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public final static String TASKS_LIST = TasksListType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public final static String TASK_PROTOTYPE = TaskPrototypeType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public final static String CATALOG = CatalogType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public final static String CATALOG_ITEM = CatalogItemType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public final static String ERROR = ErrorType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public final static String SCREEN_TICKET = ScreenTicketType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public final static String MKS_TICKET = MksTicketType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public final static String CONTROL_ACCESS = ControlAccessParamsType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        @Deprecated
        public final static String REMOTE_URI_PROBE_RESULT = RemoteUriProbeResultType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public final static String MEDIA_INSERT_EJECT_PARAMS = MediaInsertOrEjectParamsType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public final static String QUESTION = VmPendingQuestionType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public final static String ANSWER = VmQuestionAnswerType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public final static String RECOMPOSE_VAPP_PARAMS = RecomposeVAppParamsType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public final static String RELOCATE_VM_PARAMS = RelocateParamsType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public final static String OWNER = OwnerType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public final static String USER = UserType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public final static String REFERENCES = ReferencesType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public final static String QUERY_RESULTS_CONTENT_TYPE = "application/vnd.vmware.vcloud.query.records";
        public final static String RECORDS = QUERY_RESULTS_CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public final static String IDRECORDS = "application/vnd.vmware.vcloud.query.idrecords" + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public final static String QUERY_LIST = "application/vnd.vmware.vcloud.query.queryList" + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public final static String SESSION = SessionType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public final static String SHADOW_VMS = "application/vnd.vmware.vcloud.shadowVms" + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public final static String METADATA = MetadataType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public final static String METADATA_ITEM_VALUE = MetadataValueType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public final static String ENTITY_REFERENCE = EntityReferenceType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public final static String DISK = DiskType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public final static String DISK_CREATE_PARAMS = DiskCreateParamsType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public final static String DISK_ATTACH_DETACH_PARAMS = DiskAttachOrDetachParamsType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public final static String DISK_MOVE_PARAMS = DiskMoveParamsType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public final static String VMW_STORAGE_PROFILES_TYPE_CLASS = VMWStorageProfilesType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public final static String VDC_STORAGE_CLASS = VdcStorageProfileType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public final static String ALLOCATED_NETWORK_IPS = AllocatedIpAddressesType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public final static String SUPPORTED_SYSTEMS_INFOM = SupportedOperatingSystemsInfoType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public final static String CREATE_SNAPSHOT_PARAMS = CreateSnapshotParamsType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public final static String API_DEFINITIONM = ApiDefinitionType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public final static String EXTERNAL_SVCM = ServiceType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public final static String API_EXTENSIBILITY = ApiExtensibilityType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public static final String VMW_EXTENSION = VMWExtensionType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public static final String VMW_PROVIDER_VDC = VMWProviderVdcReferencesType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public static final String PROVIDER_VDC = ProviderVdcType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public static final String ROLE = RoleType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public static final String VMW_EXTERNAL_NETWORK_REFERENCES = VMWExternalNetworkReferencesType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public static final String VMW_HOST_REFERENCES = VMWHostReferencesType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public static final String VMW_VMS_IN_VMGROUP = "application/vnd.vmware.vcloud.VmGroupVmsRecord" + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public static final String VMW_VM_GROUP = VMWVmGroupType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public static final String VMW_VM_GROUPS = VMWVmGroupsType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public static final String VMW_NAMED_VM_GROUP = VMWNamedVmGroupType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public static final String VMW_VM_GROUP_REFERENCES = VMWVmGroupReferencesType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public static final String VMW_HOST_GROUP = VMWHostGroupType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public static final String VMW_HOST_GROUPS = VMWHostGroupsType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public static final String VMW_RESOURCE_POOL = VMWProviderVdcResourcePoolType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public static final String HARDWARE_VERSION = VirtualHardwareVersionType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public static final String TENANT_MIGRATION_PARAMS = TenantMigrationParamsType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public static final String VSM = ShieldManagerType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public static final String ORG_VDC_ROLLUP = OrgVdcRollupType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;

        /*OVF sections */
        public final static String LEASE_SETTINGS_SECTION = LeaseSettingsSectionType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public final static String STARTUP_SECTION = "application/vnd.vmware.vcloud.startupSection" + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public final static String NETWORK_SECTION = "application/vnd.vmware.vcloud.networkSection" + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public final static String NETWORK_CONFIG_SECTION = NetworkConfigSectionType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public final static String PRODUCT_SECTIONS = ProductSectionListType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public final static String NETWORK_CONNECTION_SECTION = NetworkConnectionSectionType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public final static String OPERATING_SYSTEM_SECTION = "application/vnd.vmware.vcloud.operatingSystemSection" + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public final static String VIRTUAL_HARDWARE_SECTION = "application/vnd.vmware.vcloud.virtualHardwareSection" + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public final static String RUNTIME_INFO_SECTION = RuntimeInfoSectionType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public final static String GUEST_CUSTOMIZATION_SECTION = GuestCustomizationSectionType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public final static String CUSTOMIZATION_SECTION = CustomizationSectionType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public final static String SNAPSHOT_SECTION = SnapshotSectionType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;

        public final static String RASD_ITEM = "application/vnd.vmware.vcloud.rasdItem" + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public final static String RASD_ITEMS_LIST = RasdItemsListType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;

        public final static String OVF = "text/xml";
        public final static String OVA = "application/binary";
        public final static String APPLICATION_XML = "application/*" + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public static final String VM_CAPABILITIESM = VmCapabilitiesType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public static final String COMPLIANCE_RESULTM = ComplianceResultType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;

        public static final String HYBRID_ORG = HybridOrgType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public static final String HYBRID_TICKET = HybridTicketType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public static final String TO_CLOUD_TUNNEL_CREATE_PARAMS_TYPE = ToCloudTunnelCreateParamsType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public static final String TO_CLOUD_TUNNEL_TYPE = ToCloudTunnelType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public static final String FROM_CLOUD_TUNNEL_CREATE_PARAMS_TYPE = FromCloudTunnelCreateParamsType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public static final String FROM_CLOUD_TUNNEL_TYPE = FromCloudTunnelType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public static final String TUNNELING_APPLICATION_LIST = TunnelingApplicationListType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public static final String FROM_CLOUD_TUNNEL_LISTENER_LIST = FromCloudTunnelListenerListType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;

        public static final String METRICS_CURRENT_SPEC_TYPE = CurrentUsageSpecType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public static final String METRICS_CURRENT_TYPE = CurrentUsageType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public static final String METRICS_HISTORIC_SPEC_TYPE = HistoricUsageSpecType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public static final String METRICS_HISTORIC_TYPE = HistoricUsageType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;

        public static final String PREPARE_HOST_PARAMS = PrepareHostParamsType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;

        public static final String EMPTY_MEDIA_TYPE = null;
        public static final String GUEST_CUSTOMIZATION_STATUS_SECTION = GuestCustomizationStatusSectionType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public static final String GUEST_CUSTOMIZAION_CHECK_PGC = VmCheckPGCType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;

        // VM Affinity Rules
        public static final String VM_AFFINITY_RULE = VmAffinityRuleType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public static final String VM_AFFINITY_RULES = VmAffinityRulesType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;

        // VM host affinity
        public static final String VMW_VM_HOST_AFFINITY_RULES = VMWVmHostAffinityRulesType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public static final String VM_BOOT_OPTIONS = BootOptionsType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;

        public static final String VDC_COMPUTE_POLICY_REFS = VdcComputePolicyReferencesType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public static final String VDC_COMPUTE_POLICY = "application/vnd.vmware.vcloud.vdcComputePolicyType" + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;

        // Open API
        public final static String APPLICATION_JSON = "application/json";

        // MultiSite
        public static final String SITE = SiteType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public static final String SITE_ASSOCIATIONS = SiteAssociationsType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public static final String SITE_ASSOCIATION = SiteAssociationType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
	public static final String SITE_STATUS = SiteStatusType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
	public static final String MULTISITE_USER_SESSION_INFO = MultisiteSessionUserInfoType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public final static String PROXY_CONFIGURATION = "application/vnd.vmware.admin.proxyConfiguration" + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;

        public final static String ENTITY_JSON = com.vmware.vcloud.api.rest.schema_v1_5.EntityType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public final static String ORGANIZATION_JSON = OrgType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public final static String ADMIN_ORGANIZATION_JSON = AdminOrgType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public final static String ORGANIZATION_LIST_JSON = OrgListType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public final static String VDC_JSON = VdcType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public final static String ADMIN_VDC_JSON = AdminVdcType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public final static String VDC_TEMPLATE_JSON = VdcTemplateType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public final static String VDC_TEMPLATE_LIST_JSON = VdcTemplatesType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public final static String INSTANTIATE_VDC_TEMPLATE_PARAMS_JSON = InstantiateVdcTemplateParamsType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public final static String UPLOAD_VAPP_TEMPLATE_PARAMS_JSON = UploadVAppTemplateParamsType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public final static String INSTANTIATE_OVF_PARAMS_JSON = InstantiateOvfParamsType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public final static String INSTANTIATE_VAPP_TEMPLATE_PARAMS_JSON = InstantiateVAppTemplateParamsType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public final static String INSTANTIATE_VM_TEMPLATE_PARAMS_JSON = InstantiateVmTemplateParamsType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public final static String CLONE_VAPP_PARAMS_JSON = CloneVAppParamsType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public final static String MOVE_VAPP_PARAMS_JSON = MoveVAppParamsType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public final static String CLONE_VAPP_TEMPLATE_PARAMS_JSON = CloneVAppTemplateParamsType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public final static String COPY_OR_MOVE_CATALOG_ITEM_PARAMS_JSON = CopyOrMoveCatalogItemParamsType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public final static String CLONE_MEDIA_PARAMS_JSON = CloneMediaParamsType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public final static String DEPLOY_VAPP_PARAMS_JSON = DeployVAppParamsType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public final static String UNDEPLOY_VAPP_PARAMS_JSON = UndeployVAppParamsType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public final static String CAPTURE_VAPP_PARAMS_JSON = CaptureVAppParamsType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public final static String COMPOSE_VAPP_PARAMS_JSON = ComposeVAppParamsType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public final static String CREATE_VM_PARAM_JSON = CreateVmParamsType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public final static String VAPP_TEMPLATE_JSON = VAppTemplateType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public final static String VAPP_JSON = VAppType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public final static String VM_JSON = VmType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public final static String SHADOW_VM_JSON = "application/vnd.vmware.vcloud.shadowvm" + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public final static String VMS_JSON = VmsType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public final static String MEDIA_JSON = com.vmware.vcloud.api.rest.schema_v1_5.MediaType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public final static String VAPP_NETWORK_JSON = VAppNetworkType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public final static String ORG_NETWORK_JSON = OrgNetworkType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public final static String ORG_VDC_NETWORK_JSON = OrgVdcNetworkType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public final static String NETWORK_JSON = NetworkType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public final static String TASK_JSON = TaskType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public final static String TASKS_LIST_JSON = TasksListType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public final static String TASK_PROTOTYPE_JSON = TaskPrototypeType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public final static String CATALOG_JSON = CatalogType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public final static String CATALOG_ITEM_JSON = CatalogItemType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public final static String ERROR_JSON = ErrorType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public final static String SCREEN_TICKET_JSON = ScreenTicketType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public final static String MKS_TICKET_JSON = MksTicketType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public final static String CONTROL_ACCESS_JSON = ControlAccessParamsType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        @Deprecated
        public final static String REMOTE_URI_PROBE_RESULT_JSON = RemoteUriProbeResultType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public final static String MEDIA_INSERT_EJECT_PARAMS_JSON = MediaInsertOrEjectParamsType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public final static String QUESTION_JSON = VmPendingQuestionType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public final static String ANSWER_JSON = VmQuestionAnswerType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public final static String RECOMPOSE_VAPP_PARAMS_JSON = RecomposeVAppParamsType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public final static String RELOCATE_VM_PARAMS_JSON = RelocateParamsType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public final static String OWNER_JSON = OwnerType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public final static String USER_JSON = UserType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public final static String REFERENCES_JSON = ReferencesType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public final static String RECORDS_JSON = QUERY_RESULTS_CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public final static String IDRECORDS_JSON = "application/vnd.vmware.vcloud.query.idrecords" + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public final static String QUERY_LIST_JSON = "application/vnd.vmware.vcloud.query.queryList" + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public final static String SESSION_JSON = SessionType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public final static String SHADOW_VMS_JSON = "application/vnd.vmware.vcloud.shadowVms" + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public final static String METADATA_JSON = MetadataType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public final static String METADATA_ITEM_VALUE_JSON = MetadataValueType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public final static String ENTITY_REFERENCE_JSON = EntityReferenceType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public final static String DISK_JSON = DiskType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public final static String DISK_CREATE_PARAMS_JSON = DiskCreateParamsType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public final static String DISK_ATTACH_DETACH_PARAMS_JSON = DiskAttachOrDetachParamsType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public final static String DISK_MOVE_PARAMS_JSON = DiskMoveParamsType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public final static String VMW_STORAGE_PROFILES_TYPE_CLASS_JSON = VMWStorageProfilesType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public final static String VDC_STORAGE_CLASS_JSON = VdcStorageProfileType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public final static String ALLOCATED_NETWORK_IPS_JSON = AllocatedIpAddressesType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public final static String SUPPORTED_SYSTEMS_INFOM_JSON = SupportedOperatingSystemsInfoType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public final static String CREATE_SNAPSHOT_PARAMS_JSON = CreateSnapshotParamsType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public final static String API_DEFINITIONM_JSON = ApiDefinitionType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public final static String EXTERNAL_SVCM_JSON = ServiceType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public final static String API_EXTENSIBILITY_JSON = ApiExtensibilityType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String VMW_EXTENSION_JSON = VMWExtensionType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String VMW_PROVIDER_VDC_JSON = VMWProviderVdcReferencesType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String PROVIDER_VDC_JSON = ProviderVdcType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String ROLE_JSON = RoleType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String VMW_EXTERNAL_NETWORK_REFERENCES_JSON = VMWExternalNetworkReferencesType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String VMW_HOST_REFERENCES_JSON = VMWHostReferencesType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String VMW_VMS_IN_VMGROUP_JSON = "application/vnd.vmware.vcloud.VmGroupVmsRecord" + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String VMW_VM_GROUP_JSON = VMWVmGroupType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String VMW_VM_GROUPS_JSON = VMWVmGroupsType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String VMW_NAMED_VM_GROUP_JSON = VMWNamedVmGroupType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String VMW_VM_GROUP_REFERENCES_JSON = VMWVmGroupReferencesType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String VMW_HOST_GROUP_JSON = VMWHostGroupType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String VMW_HOST_GROUPS_JSON = VMWHostGroupsType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String VMW_RESOURCE_POOL_JSON = VMWProviderVdcResourcePoolType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String HARDWARE_VERSION_JSON = VirtualHardwareVersionType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String TENANT_MIGRATION_PARAMS_JSON = TenantMigrationParamsType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public final static String LEASE_SETTINGS_SECTION_JSON = LeaseSettingsSectionType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public final static String STARTUP_SECTION_JSON = "application/vnd.vmware.vcloud.startupSection" + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public final static String NETWORK_SECTION_JSON = "application/vnd.vmware.vcloud.networkSection" + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public final static String NETWORK_CONFIG_SECTION_JSON = NetworkConfigSectionType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public final static String PRODUCT_SECTIONS_JSON = ProductSectionListType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public final static String NETWORK_CONNECTION_SECTION_JSON = NetworkConnectionSectionType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public final static String OPERATING_SYSTEM_SECTION_JSON = "application/vnd.vmware.vcloud.operatingSystemSection" + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public final static String VIRTUAL_HARDWARE_SECTION_JSON = "application/vnd.vmware.vcloud.virtualHardwareSection" + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public final static String RUNTIME_INFO_SECTION_JSON = RuntimeInfoSectionType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public final static String GUEST_CUSTOMIZATION_SECTION_JSON = GuestCustomizationSectionType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public final static String CUSTOMIZATION_SECTION_JSON = CustomizationSectionType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public final static String SNAPSHOT_SECTION_JSON = SnapshotSectionType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public final static String RASD_ITEM_JSON = "application/vnd.vmware.vcloud.rasdItem" + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public final static String RASD_ITEMS_LIST_JSON = RasdItemsListType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String VM_CAPABILITIESM_JSON = VmCapabilitiesType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String COMPLIANCE_RESULTM_JSON = ComplianceResultType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String HYBRID_ORG_JSON = HybridOrgType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String HYBRID_TICKET_JSON = HybridTicketType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String TO_CLOUD_TUNNEL_CREATE_PARAMS_TYPE_JSON = ToCloudTunnelCreateParamsType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String TO_CLOUD_TUNNEL_TYPE_JSON = ToCloudTunnelType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String FROM_CLOUD_TUNNEL_CREATE_PARAMS_TYPE_JSON = FromCloudTunnelCreateParamsType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String FROM_CLOUD_TUNNEL_TYPE_JSON = FromCloudTunnelType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String TUNNELING_APPLICATION_LIST_JSON = TunnelingApplicationListType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String FROM_CLOUD_TUNNEL_LISTENER_LIST_JSON = FromCloudTunnelListenerListType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String METRICS_CURRENT_SPEC_TYPE_JSON = CurrentUsageSpecType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String METRICS_CURRENT_TYPE_JSON = CurrentUsageType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String METRICS_HISTORIC_SPEC_TYPE_JSON = HistoricUsageSpecType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String METRICS_HISTORIC_TYPE_JSON = HistoricUsageType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String PREPARE_HOST_PARAMS_JSON = PrepareHostParamsType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String GUEST_CUSTOMIZATION_STATUS_SECTION_JSON = GuestCustomizationStatusSectionType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String GUEST_CUSTOMIZAION_CHECK_PGC_JSON = VmCheckPGCType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String VM_AFFINITY_RULE_JSON = VmAffinityRuleType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String VM_AFFINITY_RULES_JSON = VmAffinityRulesType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String VMW_VM_HOST_AFFINITY_RULES_JSON = VMWVmHostAffinityRulesType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String VM_BOOT_OPTIONS_JSON = BootOptionsType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String SITE_JSON = SiteType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String SITE_ASSOCIATIONS_JSON = SiteAssociationsType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String SITE_ASSOCIATION_JSON = SiteAssociationType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String SITE_STATUS_JSON = SiteStatusType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String MULTISITE_USER_SESSION_INFO_JSON = MultisiteSessionUserInfoType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String ORG_ASSOCIATION = OrgAssociationType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public static final String ORG_ASSOCIATION_JSON = OrgAssociationType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String ORG_ASSOCIATIONS = OrgAssociationsType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public static final String ORG_ASSOCIATIONS_JSON = OrgAssociationsType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String ORG_VDC_ROLLUP_JSON = OrgVdcRollupType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String VDC_COMPUTE_POLICY_REFS_JSON = VdcComputePolicyReferencesType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String VDC_COMPUTE_POLICY_JSON = "application/vnd.vmware.vcloud.vdcComputePolicyType" + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;

        public static final String APPLICATION_YAML = "application/yaml";
    }

    /**
     * Action URIs
     */
    public static class ActionUri {
        //Content Library operations
        public final static String CATALOG_ITEM_UPLOAD = "/action/upload";

        //vdc upload operations
        public final static String UPLOAD_VAPP_TEMPLATE = "/action/uploadVAppTemplate";
        public final static String INSTANTIATE_OVF = "/action/instantiateOvf";
        public final static String VDC_MEDIA = "/media";

        public final static String CLONE_MEDIA = "/action/cloneMedia";
        public final static String CLONE_VAPP_TEMPLATE = "/action/cloneVAppTemplate";
        public final static String CATALOG_ITEM_COPY = "/action/copy";
        public final static String CATALOG_ITEM_MOVE = "/action/move";
        public final static String CATALOG_SYNC = "/action/sync";
        public final static String CATALOG_ITEM_SYNC = "/action/sync";

        //vdc template operations
        public final static String INSTANTIATE_TEMPLATE = "/action/instantiate";

        //organization operations
        public final static String MIGRATE_TENANT = "/action/migrateTenant";

        //vdc vApp creation operations
        public final static String INSTANTIATE_VAPP_TEMPLATE = "/action/instantiateVAppTemplate";
        public final static String CLONE_VAPP = "/action/cloneVApp";
        public final static String MOVE_VAPP = "/action/moveVApp";
        public final static String CAPTURE_VAPP = "/action/captureVApp";
        public final static String COMPOSE_VAPP = "/action/composeVApp";
	public final static String CREATE_VM = "/action/createVm";
        public final static String INSTANTIATE_VM_FROM_TEMPLATE = "/action/instantiateVmFromTemplate";

        //vdc disk operations
        public final static String CREATE_DISK = "/disk";
        public final static String MOVE_DISK = "/action/moveDisk";

        public final static String VAPP_DISCARD_STATE = "/action/discardSuspendedState";

        //VAppTemplate operations
        public final static String ENABLE_DOWNLOAD     = "/action/enableDownload";
        public final static String DISABLE_DOWNLOAD    = "/action/disableDownload";

        //VApp Power operations
        public final static String VAPP_DEPLOY = "/action/deploy";
        public final static String VAPP_UNDEPLOY = "/action/undeploy";
        public final static String VAPP_POWER_ON = "/power/action/powerOn";
        public final static String VAPP_POWER_OFF = "/power/action/powerOff";
        public final static String VAPP_RESET = "/power/action/reset";
        public final static String VAPP_SUSPEND = "/power/action/suspend";
        public final static String VAPP_SHUTDOWN = "/power/action/shutdown";
        public final static String VAPP_REBOOT = "/power/action/reboot";
        //VApp operations
        public final static String VAPP_SCREEN = "/screen";
        public final static String VAPP_ACQUIRE_TICKET = "/screen/action/acquireTicket";
        public final static String VAPP_ACQUIRE_MKS_TICKET = "/screen/action/acquireMksTicket";
        public final static String VAPP_INSERT_MEDIA = "/media/action/insertMedia";
        public final static String VAPP_EJECT_MEDIA = "/media/action/ejectMedia";
        public final static String VAPP_ATTACH_DISK = "/disk/action/attach";
        public final static String VAPP_DETACH_DISK = "/disk/action/detach";
        public final static String VAPP_QUESTION_ANSWER = "/question/action/answer";
        public final static String VAPP_ENTER_MAINTENANCE_MODE = "/action/enterMaintenanceMode";
        public final static String VAPP_EXIT_MAINTENANCE_MODE = "/action/exitMaintenanceMode";
        public final static String RECOMPOSE_VAPP = "/action/recomposeVApp";
        public final static String VM_INSTALL_VMWARE_TOOLS = "/action/installVMwareTools";
        public final static String VM_UPGRADE_HARDWARE_VERSION = "/action/upgradeHardwareVersion";
        public final static String VM_CONSOLIDATE = "/action/consolidate";
        public final static String VM_RELOCATE = "/action/relocate";
        public final static String VM_ENABLE_NESTED_HV="/action/enableNestedHypervisor";
        public final static String VM_DISABLE_NESTED_HV="/action/disableNestedHypervisor";
        public final static String VM_CHECK_COMPLIANCE="/action/checkCompliance";
        public final static String VM_FORCE_FULL_CUSTOMIZATION = "/action/customizeAtNextPowerOn";
        public final static String VM_RELOAD_FROM_VC = "/action/reloadFromVc";
        public final static String VM_BOOT_OPTIONS="/action/bootOptions";
        public final static String VM_CHECK_COMPUTE_POLICY_COMPLIANCE = "/action/checkComputePolicyCompliance";
        public final static String CONVERT_VAPP_TO_STAND_ALONE_VM = "/action/convertAllVAppVmsToStandAloneVms";
        public final static String CONVERT_STAND_ALONE_VM_TO_VAPP = "/action/convertStandAloneVmToVApp";

        // Snapshot operations
        public final static String SNAPSHOT_CREATE = "/action/createSnapshot";
        public final static String SNAPSHOT_REVERT_TO_CURRENT = "/action/revertToCurrentSnapshot";
        public final static String SNAPSHOT_REMOVE_ALL_SNAPSHOTS = "/action/removeAllSnapshots";

        // Storage policy operations
        public final static String MAKE_DEFAULT = "/action/makeDefault";

        // User operations
        public final static String USER_UNLOCK = "/action/unlock";
        public final static String USER_ENTITY_RIGHTS = "/entityRights";
        public final static String USER_GRANTED_RIGHTS = "/grantedRights";
        public final static String USER_TAKE_OWNERSHIP = "/action/takeOwnership";

        // network operations
        public final static String NETWORK_RESET = "/action/reset";
        public final static String NETWORK_SYNC_SYSLOG_SETTINGS = "/action/syncSyslogServerSettings";
        public final static String NETWORK_CONVERT_TO_SUB_INTERFACE = "/action/convertToSubInterface";
        public final static String NETWORK_CONVERT_TO_INTERNAL_INTERFACE = "/action/convertToInternalInterface";
        public final static String NETWORK_CONVERT_TO_DISTRIBUTED_INTERFACE = "/action/convertToDistributedInterface";

        // ovf generation
        public final static String OVF = "/ovf";

        // Access control
        public final static String CONTROL_ACCESS = "/action/controlAccess";
        public final static String CONTROL_ACCESS_VIEW = Uri.CONTROL_ACCESS;

        public final static String CANCEL_TASK = "/action/cancel";

        public final static String PUBLISH = "/action/publish";

        public final static String PUBLISH_TO_EXTERNAL_ORGANIZATIONS = "/action/publishToExternalOrganizations";
        public final static String SUBSCRIBE_TO_EXTERNAL_CATALOG= "/action/subscribeToExternalCatalog";
        @Deprecated
        public final static String PROBE_REMOTE_LIBRARY = "/probeRemoteLibrary";

        // Hybrid
        public final static String HYBRID_ACQUIRE_CONTROL_TICKET = "/action/acquireControlTicket";
        public final static String HYBRID_ACQUIRE_TICKET = "/action/acquireTicket";
    }

    public static class QueryParams {
        public static final String PAGE = "page";
        public static final String PAGE_SIZE = "pageSize";
        public static final int DEFAULT_PAGE = 1;
        public static final int DEFAULT_PAGE_SIZE = 25;
        public static final String OFFSET = "offset";
        public static final String FIELDS = "fields";
        public static final String FILTER = "filter";
        public static final String LINKS = "links";
        public static final String DEFAULT_LINKS = "false";
        public static final String SORT_ASC = "sortAsc";
        public static final String SORT_DESC = "sortDesc";
        public static final String TYPE = "type";
        public static final String QUERY_FIELDS_SEPARATOR = ",";
        public static final String QUERY_PARAMS_SEPARATOR = "&";
        public static final String ASSOCIATION_OFFSETS = "assocOffsets";
        public static final String CURSOR = "cursor";
        public static final int MAX_PAGE_SIZE = 128;
    }

    public static class AuditEventStatus {
        public static final int SUCCESS = 2;
        public static final int FAILURE = 3;
    }

    public static class ApiVersionAttributes {
        public static final String API_VERSION_ATTRIBUTE_1_5 = API_VERSION_ATTR + ApiVersion.VERSION_1_5.value();
    }

    public static class MinorErrorCodes {
        public static final String INTERNAL_SERVER_ERROR = "INTERNAL_SERVER_ERROR";
        public static final String BAD_REQUEST = "BAD_REQUEST";
        public static final String RESOURCE_NOT_FOUND = "RESOURCE_NOT_FOUND";
        public static final String FORBIDDEN = "ACCESS_TO_RESOURCE_IS_FORBIDDEN";
        public static final String METHOD_NOT_ALLOWED = "METHOD_NOT_ALLOWED";
        public static final String CONFLICT = "CONFLICT";
        public static final String UNSUPPORTED_MEDIA_TYPE = "UNSUPPORTED_MEDIA_TYPE";
        public static final String NOT_ACCEPTABLE = "NOT_ACCEPTABLE";
        public static final String NEW_LOCATION = "NEW_LOCATION";
        public static final String BAD_GATEWAY = "BAD_GATEWAY";
        public static final String GATEWAY_TIMEOUT = "GATEWAY_TIMEOUT";
        public static final String UNAUTHORIZED = "UNAUTHORIZED";

        public static final String UNKNOWN = "UNKNOWN";

        public static final String INVALID_REFERENCE = "INVALID_REFERENCE";
        public static final String INVALID_STATE = "INVALID_STATE";
        public static final String INVENTORY_OBJECT_NOT_FOUND = "INVENTORY_OBJECT_NOT_FOUND";
        public static final String EULA_NOT_ACCEPTED = "EULA_NOT_ACCEPTED";

        public static final String TUNNELING_APPLICATION_NOT_FOUND = "TUNNELING_APPLICATION_NOT_FOUND";

        public static final String TOO_MANY_FROM_CLOUD_TUNNEL_PORTS_ALLOCATED = "TOO_MANY_FROM_CLOUD_TUNNEL_PORTS_ALLOCATED";

        public static final String CANNOT_RESOLVE_TO_CLOUD_TUNNEL_DESTINATION_ID = "CANNOT_RESOLVE_TO_CLOUD_TUNNEL_DESTINATION_ID";

        public static final String ERROR_CREATING_FROM_CLOUD_TUNNEL_HANDLERS = "ERROR_CREATING_FROM_CLOUD_TUNNEL_HANDLERS";

        public static final String FROM_CLOUD_TUNNEL_LISTENER_FOR_TUNNEL_NOT_FOUND = "FROM_CLOUD_TUNNEL_LISTENER_FOR_TUNNEL_NOT_FOUND";

        public static final String SERVICE_NOT_READY = "SERVICE_NOT_READY";

        public static final String ORG_MEMBER_IMPORT = "ORG_MEMBER_IMPORT";

        public static final String DUPLICATE_NAME = "DUPLICATE_NAME";
        public static final String BUSY_ENTITY = "BUSY_ENTITY";

        public static final String INVALID_MULTISITE_QUERY_ARGS = "INVALID_MULTISITE_QUERY_ARGS";
        public static final String INVALID_MULTISITE_SCOPE = "INVALID_MULTISITE_SCOPE";
    }

    public static class HttpStatusCodes {
        public static final int SC_OK = 200;
        public static final int SC_CREATED = 201;
        public static final int SC_ACCEPTED = 202;
        public static final int SC_NO_CONTENT = 204;
        public static final int SC_PARTIAL_CONTENT = 206;
        public static final int SC_MOVED_PERMANENTLY = 301;
        /**
         * HTTP BAD REQUEST status code
         */
        public static final int SC_BAD_REQUEST = 400;

        /**
         * HTTP UNAUTHORIZED status code
         */
        public static final int SC_UNAUTHORIZED = 401;

        /**
         * HTTP Forbidden status code
         */
        public static final int SC_FORBIDDEN = 403;

        /**
         * HTTP NOT FOUND status code
         */
        public static final int SC_NOT_FOUND = 404;

        /**
         * HTTP Method not allowed status code
         */
        public static final int SC_METHOD_NOT_ALLOWED = 405;

        /**
         * HTTP Not Acceptable status code
         */
        public static final int SC_NOT_ACCEPTABLE = 406;

        /**
         * HTTP Conflict status code
         */
        public static final int SC_CONFLICT = 409;

        /**
         * HTTP Unsupported Media Type
         */
        public static final int SC_UNSUPPORTED_MEDIA_TYPE = 415;

        /**
         * HTTP Internal server error status code
         */
        public static final int SC_INTERNAL_SERVER_ERROR = 500;

        public static final int SC_BAD_GATEWAY = 502;

        public static final int SC_SERVICE_NOT_AVAILABLE = 503;

        /**
         * HTTP Gateway Timeout
         */
        public static final int SC_GATEWAY_TIMEOUT_ERROR = 504;
    }

    public static interface DeleteParameters {

        /**
         * Forced deletion
         */
        public static final String FORCE = "force";

        /**
         * Recursive deletion of child objects
         */
        public static final String RECURSIVE = "recursive";
    }

    public static final String VCLOUD_AUTHENTICATION_HEADER = "x-vcloud-authorization";

    public static final String VCLOUD_TENANT_CONTEXT_HEADER = "X-VMWARE-VCLOUD-TENANT-CONTEXT";

    public static final String VCLOUD_CLIENT_REQUEST_ID_HEADER = "X-VMWARE-VCLOUD-CLIENT-REQUEST-ID";

    public static final String VCLOUD_REQUEST_ID_HEADER = "X-VMWARE-VCLOUD-REQUEST-ID";

    public static final String VCLOUD_TASK_ID_HEADER = "X-VMWARE-VCLOUD-TASK-ID";

    public static final String VCLOUD_TASK_HREF_HEADER = "X-VMWARE-VCLOUD-TASK-HREF";

    public static final String MULTISITE_QUERY_HEADER = "X-VMWARE-VCLOUD-MULTISITE-QUERY";

    public static final String RESOLVED_OBJECT_TYPE_HEADER = "X-VMWARE-VCLOUD-OBJECT-TYPE";

    public static final String VCLOUD_COOKIE_NAME = "vcloud-token";

    public static final String SESSION_COOKIE_NAME = "vcloud_session_id";

    public static final String JWT_COOKIE_NAME = "vcloud_jwt";

    public static final String VCLOUD_AUTH_CONTEXT_HEADER = "X-VMWARE-VCLOUD-AUTH-CONTEXT";

    public static final String VCLOUD_ACCESS_TOKEN_HEADER = "X-VMWARE-VCLOUD-ACCESS-TOKEN";

    public static final String VCLOUD_TOKEN_TYPE_HEADER = "X-VMWARE-VCLOUD-TOKEN-TYPE";

    public static final String VCLOUD_TASK_HEADER = "X-VMWARE-VCOULD-TASK-LOCATION";

    public static final String API_VERSION_5_7 = "5.7";

    public static final String API_VERSION_ATTR = "version" + "=";

    public static final String MULTISITE_ATTR = "multisite" + "=";

    public static final String MULTISITE_ATTR_GLOBAL = "global";

    public static final String MULTISITE_ATTR_LOCAL = "local";

    public static final String MULTISITE_ATTR_SEPARATOR = ":";

    public static final String OPENAPI_BASE_PATH = "/cloudapi";
    public static final String OPENAPI_DEFAULT_VERSION = "1.0.0";

    public static final String OPENAPI_ENTITY_CONTEXT = "OPENAPI.ENTITYCONTEXT";

    public static final String NETWORK_BASE_PATH = "/network";

    public static final String MESSAGING_PATH = "/messaging";

    public static final String MQTT_PATH = "/mqtt";

    // API Defaults
    public static final String UNSUPPORTED_ENUM_VALUE = "-";
}

