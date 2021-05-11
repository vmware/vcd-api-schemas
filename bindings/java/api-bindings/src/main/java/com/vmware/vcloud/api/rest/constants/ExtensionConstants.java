
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

import com.vmware.vcloud.api.rest.schema_v1_5.CertificateUpdateParamsType;
import com.vmware.vcloud.api.rest.schema_v1_5.TaskType;
import com.vmware.vcloud.api.rest.schema_v1_5.TrustStoreUpdateParamsType;
import com.vmware.vcloud.api.rest.schema_v1_5.VendorServicesType;
import com.vmware.vcloud.api.rest.schema_v1_5.extension.AclRuleType;
import com.vmware.vcloud.api.rest.schema_v1_5.extension.AdminApiDefinitionType;
import com.vmware.vcloud.api.rest.schema_v1_5.extension.AdminFileDescriptorType;
import com.vmware.vcloud.api.rest.schema_v1_5.extension.AdminServiceLinkType;
import com.vmware.vcloud.api.rest.schema_v1_5.extension.AdminServiceType;
import com.vmware.vcloud.api.rest.schema_v1_5.extension.AmqpSettingsTestType;
import com.vmware.vcloud.api.rest.schema_v1_5.extension.AmqpSettingsType;
import com.vmware.vcloud.api.rest.schema_v1_5.extension.ApiFilterType;
import com.vmware.vcloud.api.rest.schema_v1_5.extension.AuthorizationCheckParamsType;
import com.vmware.vcloud.api.rest.schema_v1_5.extension.AuthorizationCheckResponseType;
import com.vmware.vcloud.api.rest.schema_v1_5.extension.BlockingTaskOperationParamsType;
import com.vmware.vcloud.api.rest.schema_v1_5.extension.BlockingTaskSettingsType;
import com.vmware.vcloud.api.rest.schema_v1_5.extension.BlockingTaskType;
import com.vmware.vcloud.api.rest.schema_v1_5.extension.BlockingTaskUpdateProgressParamsType;
import com.vmware.vcloud.api.rest.schema_v1_5.extension.BrandingSettingsType;
import com.vmware.vcloud.api.rest.schema_v1_5.extension.BundleUploadParamsType;
import com.vmware.vcloud.api.rest.schema_v1_5.extension.BundleUploadSocketType;
import com.vmware.vcloud.api.rest.schema_v1_5.extension.CatalogSettingsType;
import com.vmware.vcloud.api.rest.schema_v1_5.extension.ComponentManagerSettingsType;
import com.vmware.vcloud.api.rest.schema_v1_5.extension.CpomSettingsType;
import com.vmware.vcloud.api.rest.schema_v1_5.extension.DatastoreType;
import com.vmware.vcloud.api.rest.schema_v1_5.extension.EmailSettingsType;
import com.vmware.vcloud.api.rest.schema_v1_5.extension.ExtensionServicesType;
import com.vmware.vcloud.api.rest.schema_v1_5.extension.GeneralSettingsType;
import com.vmware.vcloud.api.rest.schema_v1_5.extension.HostType;
import com.vmware.vcloud.api.rest.schema_v1_5.extension.ImportMediaParamsType;
import com.vmware.vcloud.api.rest.schema_v1_5.extension.ImportVmAsVAppParamsType;
import com.vmware.vcloud.api.rest.schema_v1_5.extension.ImportVmAsVAppTemplateParamsType;
import com.vmware.vcloud.api.rest.schema_v1_5.extension.ImportVmIntoExistingVAppParamsType;
import com.vmware.vcloud.api.rest.schema_v1_5.extension.ImportVmParamsType;
import com.vmware.vcloud.api.rest.schema_v1_5.extension.KerberosSettingsType;
import com.vmware.vcloud.api.rest.schema_v1_5.extension.LdapSettingsType;
import com.vmware.vcloud.api.rest.schema_v1_5.extension.LicenseType;
import com.vmware.vcloud.api.rest.schema_v1_5.extension.LicensingReportListType;
import com.vmware.vcloud.api.rest.schema_v1_5.extension.LicensingReportType;
import com.vmware.vcloud.api.rest.schema_v1_5.extension.LookupServiceParamsType;
import com.vmware.vcloud.api.rest.schema_v1_5.extension.LookupServiceSettingsType;
import com.vmware.vcloud.api.rest.schema_v1_5.extension.MigrateParamsType;
import com.vmware.vcloud.api.rest.schema_v1_5.extension.NotificationsSettingsType;
import com.vmware.vcloud.api.rest.schema_v1_5.extension.NsxTManagerType;
import com.vmware.vcloud.api.rest.schema_v1_5.extension.NsxTManagersType;
import com.vmware.vcloud.api.rest.schema_v1_5.extension.ObjectExtensionType;
import com.vmware.vcloud.api.rest.schema_v1_5.extension.ObjectExtensionsType;
import com.vmware.vcloud.api.rest.schema_v1_5.extension.OperationLimitsSettingsType;
import com.vmware.vcloud.api.rest.schema_v1_5.extension.PortGroupPoolType;
import com.vmware.vcloud.api.rest.schema_v1_5.extension.PrepareHostParamsType;
import com.vmware.vcloud.api.rest.schema_v1_5.extension.ProviderVdcMergeParamsType;
import com.vmware.vcloud.api.rest.schema_v1_5.extension.RegisterVimServerParamsType;
import com.vmware.vcloud.api.rest.schema_v1_5.extension.ResourceClassActionType;
import com.vmware.vcloud.api.rest.schema_v1_5.extension.ResourceClassType;
import com.vmware.vcloud.api.rest.schema_v1_5.extension.ResourcePoolListType;
import com.vmware.vcloud.api.rest.schema_v1_5.extension.RightRefsType;
import com.vmware.vcloud.api.rest.schema_v1_5.extension.ServiceResourceType;
import com.vmware.vcloud.api.rest.schema_v1_5.extension.ShieldManagerType;
import com.vmware.vcloud.api.rest.schema_v1_5.extension.StrandedItemType;
import com.vmware.vcloud.api.rest.schema_v1_5.extension.SystemConfigurationSettingsType;
import com.vmware.vcloud.api.rest.schema_v1_5.extension.SystemPasswordPolicySettingsType;
import com.vmware.vcloud.api.rest.schema_v1_5.extension.SystemSettingsType;
import com.vmware.vcloud.api.rest.schema_v1_5.extension.UberAdminSettingsType;
import com.vmware.vcloud.api.rest.schema_v1_5.extension.UpdateProviderVdcStorageProfilesParamsType;
import com.vmware.vcloud.api.rest.schema_v1_5.extension.UpdateResourcePoolSetParamsType;
import com.vmware.vcloud.api.rest.schema_v1_5.extension.VMWDiscoveredResourcePoolType;
import com.vmware.vcloud.api.rest.schema_v1_5.extension.VMWDiscoveredResourcePoolsType;
import com.vmware.vcloud.api.rest.schema_v1_5.extension.VMWExtensionType;
import com.vmware.vcloud.api.rest.schema_v1_5.extension.VMWExternalNetworkReferencesType;
import com.vmware.vcloud.api.rest.schema_v1_5.extension.VMWExternalNetworkType;
import com.vmware.vcloud.api.rest.schema_v1_5.extension.VMWHostGroupType;
import com.vmware.vcloud.api.rest.schema_v1_5.extension.VMWHostGroupsType;
import com.vmware.vcloud.api.rest.schema_v1_5.extension.VMWHostReferencesType;
import com.vmware.vcloud.api.rest.schema_v1_5.extension.VMWNetworkPoolReferencesType;
import com.vmware.vcloud.api.rest.schema_v1_5.extension.VMWNetworkPoolType;
import com.vmware.vcloud.api.rest.schema_v1_5.extension.VMWProviderVdcParamsType;
import com.vmware.vcloud.api.rest.schema_v1_5.extension.VMWProviderVdcReferencesType;
import com.vmware.vcloud.api.rest.schema_v1_5.extension.VMWProviderVdcResourcePoolSetType;
import com.vmware.vcloud.api.rest.schema_v1_5.extension.VMWProviderVdcResourcePoolType;
import com.vmware.vcloud.api.rest.schema_v1_5.extension.VMWProviderVdcStorageProfileType;
import com.vmware.vcloud.api.rest.schema_v1_5.extension.VMWProviderVdcType;
import com.vmware.vcloud.api.rest.schema_v1_5.extension.VMWStorageProfilesType;
import com.vmware.vcloud.api.rest.schema_v1_5.extension.VMWVdcTemplateListType;
import com.vmware.vcloud.api.rest.schema_v1_5.extension.VMWVdcTemplateType;
import com.vmware.vcloud.api.rest.schema_v1_5.extension.VMWVdcTemplatesType;
import com.vmware.vcloud.api.rest.schema_v1_5.extension.VMWVimServerReferencesType;
import com.vmware.vcloud.api.rest.schema_v1_5.extension.VMWVmGroupType;
import com.vmware.vcloud.api.rest.schema_v1_5.extension.VMWVmGroupsType;
import com.vmware.vcloud.api.rest.schema_v1_5.extension.VMWVmHostAffinityRuleType;
import com.vmware.vcloud.api.rest.schema_v1_5.extension.VMWVmHostAffinityRulesType;
import com.vmware.vcloud.api.rest.schema_v1_5.extension.VSphereWebClientUrlType;
import com.vmware.vcloud.api.rest.schema_v1_5.extension.VcTrustStoreUpdateParamsType;
import com.vmware.vcloud.api.rest.schema_v1_5.extension.VcTrustStoreUploadSocketType;
import com.vmware.vcloud.api.rest.schema_v1_5.extension.VimObjectRefType;
import com.vmware.vcloud.api.rest.schema_v1_5.extension.VimObjectRefsType;
import com.vmware.vcloud.api.rest.schema_v1_5.extension.VimServerType;
import com.vmware.vcloud.api.rest.schema_v1_5.extension.VlanPoolType;
import com.vmware.vcloud.api.rest.schema_v1_5.extension.VmObjectRefType;
import com.vmware.vcloud.api.rest.schema_v1_5.extension.VmObjectRefsListType;

/**
 * This class handles constants needed by {@code ExtensionHandler}
 * @since 1.0
 * @version 1.0.0
 *
 */
public class ExtensionConstants {
    public static final String EXTENSION_NAMESPACE_1_5 = "http://www.vmware.com/vcloud/extension/v1.5";

    public static final String FILE_EXTENSION_ISO = "iso";
    public static final String FILE_EXTENSION_FLOPPY = "flp";

    public static class Uri {
        private Uri() {
        };

        public static final String HOST = "/host/";
        public static final String STRANDED_ITEM = "/strandedItem/";
        public static final String STRANDED_ITEMS = "/strandedItems";
        public static final String VIRTUAL_CENTER = "/vimServer/";
        public static final String NSXT_MANAGERS = "/nsxtManagers";
        public static final String PROVIDER_VDC = "/providervdc/";
        public static final String EXTERNAL_NET = "/externalnet/";
        public static final String ADD_PVDCS = "/providervdcs";
        public static final String ADD_PVDCS_PARAMS = "/providervdcsparams";
        public static final String ADD_EXTERNAL_NETS = "/externalnets";
        public static final String ADD_POOLS = "/networkPools";
        public static final String VMS_OBJECT_REFS_LIST = "/vmsList";
        public static final String IMPORT_VM_AS_VAPP = "/importVmAsVApp";
        public static final String IMPORT_VM = "/importVm";
        public static final String IMPORT_VM_AS_VAPP_TEMPLATE = "/importVmAsVAppTemplate";
        public static final String IMPORT_VM_INTO_EXISTING_VAPP = "/importVmIntoExistingVApp";
        public static final String IMPORT_MEDIA = "/importMedia";
        public static final String EXTENSION = "/admin/extension";
        public static final String RESOURCE_POOL_LIST = "/resourcePoolList";
        public static final String RESOURCE_POOL_VM_LIST = "/vmList";
        public static final String HOST_REFERENCES = "/hostReferences";
        public static final String NETWORK_REFERENCES = "/networks";
        public static final String PROVIDER_VDC_REFERENCES = "/providerVdcReferences";
        public static final String EXTERNAL_NETWORK_REFERENCES = "/externalNetworkReferences";
        public static final String NETWORK_POOL_REFERENCES = "/networkPoolReferences";
        public static final String VIM_SERVER_REFERENCES = "/vimServerReferences";
        public static final String HOST_GROUPS = "/hostGroups";
        public static final String HOST_GROUP = "/hostGroup";
        public static final String VM_HOST_AFFINITY_RULES = "/rules";
        public static final String VM_HOST_AFFINITY_RULE = "/rule";

        public static final String VM_GROUP = "/vmGroup";
        public static final String VM_GROUPS = "/vmGroups";
        @Deprecated
        public static final String LICENSING = "/licensing/";
        @Deprecated
        public static final String LICENSING_REPORT_LIST = "reports";
        @Deprecated
        public static final String LICENSING_REPORT = "report/";
        public static final String DATASTORE_LIST = "/datastores";
        public static final String DATASTORE = "/datastore/";
        public static final String ORG_NETWORKS_ALL = "/orgNetworks";
        public static final String VAPPS_ALL = "/vapps";
        public static final String ORG_VDCS = "/orgVdcs";
        public static final String SYSTEM_SETTINGS = "/settings";
        public static final String GENERAL_SETTINGS = "/general";
        public static final String AMQP_SETTINGS = "/amqp";
        public static final String NOTIFICATIONS_SETTINGS = "/notifications";
        public static final String SYSTEM_PASSWORD_POLICY_SETTINGS = "/passwordPolicy";
        public static final String BLOCKING_TASK_SETTINGS = "/blockingTask";
        public static final String BLOCKING_TASK_OPERATIONS = "/operations";
        public static final String BLOCKING_TASK = "/blockingTask/";
        public static final String BLOCKING_TASKS = "/blockingTasks/";
        public static final String UBER_ADMIN_SETTINGS = "/uberAdminSettings";
        public static final String PVDC_RESOURCE_POOLS = "/resourcePools";
        public static final String PVDC_RESOURCE_POOL = "/resourcePool/";
        public static final String DISCOVER_RESOURCE_POOLS =  "/discoverResourcePools";
        public static final String ORGANIZATION_VDC_RESOURCE_POOLS = "/resourcePools";
        public static final String LDAP_SETTINGS = "/ldapSettings";
        public static final String BRANDING_SETTINGS = "/branding";
        public static final String LICENSE_SETTINGS = "/license";
        public static final String EMAIL_SETTINGS = "/email";
        public static final String VSPHERE_WEB_CLIENT_URL = "/vSphereWebClientUrl";
        public static final String LOOKUP_SERVICE_SETTINGS = "/lookupService";
        public static final String STORAGE_PROFILES = "/storageProfiles";
        public static final String CATALOG_SETTINGS = "/catalog";
        public static final String OPERATION_LIMITS_SETTINGS = "/operationLimitsSettings";
        public static final String CPOM_SETTINGS = "/cpom";

        public static final String AVAILABLE_STORAGE_CLASSES = "/availableStorageProfiles";
        public static final String PVDC_STORAGE_PROFILE = "/pvdcStorageProfile";
        public static final String RESOURCE_POOL = "/resourcePool/";
        public static final String VSM = "/vsm";
        public static final String CONFIGURATION_SETTINGS = EXTENSION + "/configurationSettings";
        public static final String API_DEFINITION = RestConstants.Uri.API_DEFINITION;
        public static final String API_DEFINITIONS = RestConstants.Uri.API_DEFINITIONS_LIST;
        public static final String API_FILE_DESCRIPTORS = RestConstants.Uri.API_FILE_DESCRIPTORS_LIST;
        public static final String API_FILE_DESCRIPTOR = "/file";
        public static final String SERVICE = RestConstants.Uri.EXTERNAL_SVC;
        public static final String RIGHTS = "/rights";
        public static final String LINKS = "/links";
        public static final String LOCALIZATION_BUNDLES = "/localizationbundles";
        public static final String LINK = "/link";
        public static final String SERVICE_CONFIG = "/apifilter";
        public static final String SERVICE_CONFIGS = "/apifilters";
        public static final String SERVICE_ACL_RULE = "/aclrule";
        public static final String SERVICE_ACL_RULES = "/aclrules";
        public static final String RESOURCE_CLASS_ACTION = "/resourceclassaction";
        public static final String RESOURCE_CLASS_ACTIONS = "/resourceclassactions";
        public static final String SERVICE_RESOURCE = "/serviceresource";
        public static final String SERVICE_RESOURCES = "/serviceresources";
        public static final String RESOURCE_CLASS = "/resourceclass";
        public static final String RESOURCE_CLASSES = "/resourceclasses";
        public static final String AUTHORIZATION_CHECK = "/authorizationcheck";
        public static final String SERVICE_BASE_URI = EXTENSION + SERVICE;
        public static final String VENDOR_SERVICES = "/vendorServices";

        public static final String CONTENT_CATALOG = "/catalog";

        public static final String VDC_TEMPLATE_EXTENSION = EXTENSION + "/vdcTemplate";
        public static final String VDC_TEMPLATE = "/vdcTemplate";
        public static final String VDC_TEMPLATES = "/vdcTemplates";
        public static final String VDC_TEMPLATE_REFS = "/vdcTemplateReferences";

        public static final String OBJECT_EXTENSION = "/object";
        public static final String NAMED_VM_GROUP_REFS = "/namedVmGroupReferences";
    }

    /**
     * Action URIs
     */
    public static class ActionUri {
        private ActionUri() {
        };

        public static final String HOST = "/host";
        public static final String PREPARE_HOST = "/action/prepare";
        public static final String UNPREPARE_HOST = "/action/unprepare";
        public static final String DISABLE = "/action/disable";
        public static final String ENABLE = "/action/enable";
        public static final String REPAIR = "/action/repair";
        public static final String SYNC = "/action/sync";
        public static final String REGISTER_VIM_SERVER = "/action/registervimserver";
        public static final String UNREGISTER_VIM_SERVER = "/action/unregister";
        public static final String FORCE_VIM_SERVER_RECONNECT = "/action/forcevimserverreconnect";
        public static final String FORCE_VIM_SERVER_DISCONNECT = "/action/forcevimserverdisconnect";
        public static final String PROVIDER_VDC_MERGE = "/action/merge";
        public static final String UPGRADE_HOST_AGENT = "/action/upgrade";
        public static final String TASK_EXTENSION_REQUEST_RESUME = "/action/resume";
        public static final String TASK_EXTENSION_REQUEST_ABORT = "/action/abort";
        public static final String TASK_EXTENSION_REQUEST_FAIL = "/action/fail";
        public static final String TASK_EXTENSION_REQUEST_UPDATE_PROGRESS = "/action/updateProgress";
        public static final String AMQP_TEST = "/action/test";
        public static final String UPDATE_PVDC_RESOURCE_POOLS = "/action/updateResourcePools";
        public static final String FORCE_DELETE_STRANDED_ITEM = "/action/forceDelete";
        public static final String ADD_RIGHTS = "/action/addRights";
        public static final String REFRESH_STORAGE_CLASSES = "/action/refreshStorageProfiles";
        public static final String REFRESH_VIRTUAL_CENTER = "/action/refresh";
        public static final String VM_MIGRATE = "/action/migrateVms";
        public static final String CLEAR_UNUSED_RIGHTS = "/action/clearunusedrights";
        public static final String CLEAR_UNUSED_BUNDLES = "/action/clearunusedlocalizationbundles";
        public static final String MANDATORY = "/action/makeMandatory";
        public static final String OPTIONAL = "/action/makeOptional";

        public static final String AMQP_CERTIFICATE_UPDATE = "/action/updateAmqpCertificate";
        public static final String AMQP_CERTIFICATE_RESET = "/action/resetAmqpCertificate";
        public static final String AMQP_TRUSTSTORE_UPDATE = "/action/updateAmqpTruststore";
        public static final String AMQP_TRUSTSTORE_RESET = "/action/resetAmqpTruststore";
        public static final String VC_TRUSTSTORE_UPDATE = "/action/updateVcTrustsore";
        public static final String VC_TRUSTSTORE_RESET = "/action/resetVcTrustsore";
        // Note: the preceding part of the Paths includes word componentManager
        public static final String REGISTER_CM = "/action/register";
        public static final String UNREGISTER_CM = "/action/unregister";

        public static final String VM_GROUP_ADD_VMS = "/action/addVms";
        public static final String VM_GROUP_REMOVE_VMS = "/action/removeVms";

    }

    public static class MediaType {
        private MediaType() {
        };

        public static final String VMW_EXTENSIONM = VMWExtensionType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public static final String VMW_PROVIDER_VDC_REFERENCESM = VMWProviderVdcReferencesType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public static final String VMW_EXTERNAL_NETWORK_REFERENCESM = VMWExternalNetworkReferencesType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        // NETWORKEXT is used only in links
        public static final String NETWORKEXT = "application/vnd.vmware.admin.extension.network" + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        // Points to VimObjectRefListType
        public static final String VIM_SERVER_NETWORKS = "application/vnd.vmware.admin.vimServerNetworks" + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public static final String VMW_NETWORK_POOL_REFERENCESM = VMWNetworkPoolReferencesType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public static final String VMW_VIM_SERVER_REFERENCESM = VMWVimServerReferencesType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public static final String VMW_HOST_REFERENCESM = VMWHostReferencesType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public static final String HOSTM = HostType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public static final String VIRTUAL_CENTERM = VimServerType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public static final String VMW_PROVIDER_VDCM = VMWProviderVdcType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public static final String VMW_PVDC_STORAGE_PROFILEM = VMWProviderVdcStorageProfileType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public static final String VMW_EXTERNAL_NETM = VMWExternalNetworkType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public static final String PREPARE_HOST_PARAMSM = PrepareHostParamsType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public static final String REGISTER_VIM_SERVERM = RegisterVimServerParamsType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public static final String NSXT_MANAGERSM = NsxTManagersType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public static final String NSXT_MANAGERM = NsxTManagerType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public static final String VMS_OBJECT_REFS_LISTM = VmObjectRefsListType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public static final String IMPORT_VM_AS_VAPP_PARAMS = ImportVmAsVAppParamsType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public static final String IMPORT_VM_PARAMS = ImportVmParamsType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public static final String IMPORT_VM_AS_VAPP_TEMPLATE_PARAMS = ImportVmAsVAppTemplateParamsType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public static final String IMPORT_VM_INTO_EXISTING_VAPP_PARAMS = ImportVmIntoExistingVAppParamsType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public static final String IMPORT_MEDIA_PARAMS = ImportMediaParamsType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public static final String RESOURCE_POOL_LIST = ResourcePoolListType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public static final String VMW_HOST_GROUP = VMWHostGroupType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public static final String VMW_HOST_GROUPS = VMWHostGroupsType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public static final String VMW_VM_HOST_AFFINITY_RULE = VMWVmHostAffinityRuleType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public static final String VMW_VM_HOST_AFFINITY_RULES = VMWVmHostAffinityRulesType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;

        public static final String VMW_VM_GROUP = VMWVmGroupType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public static final String VMW_VM_GROUPS = VMWVmGroupsType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        @Deprecated
        public static final String LICENSING_REPORT = LicensingReportType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        @Deprecated
        public static final String LICENSING_REPORT_LIST = LicensingReportListType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public static final String VMW_NETWORK_POOLM = VMWNetworkPoolType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public static final String PORT_GROUP_POOLM = PortGroupPoolType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public static final String VLAN_POOLM = VlanPoolType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public static final String VIM_OBJECT_REFS = VimObjectRefsType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public static final String VIM_OBJECT_REF = VimObjectRefType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public static final String VM_OBJECT_REF = VmObjectRefType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public static final String DATASTOREM = DatastoreType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        // Used on ReferencesType
        public static final String EDGE_GATEWAYM = "application/vnd.vmware.admin.edgeGateway" + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public static final String DATASTORE_LISTM = "application/vnd.vmware.admin.datastoreList" + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public static final String SYSTEM_SETTINGSM = SystemSettingsType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public static final String GENERAL_SETTINGSM = GeneralSettingsType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public static final String AMQP_SETTINGSM = AmqpSettingsType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public static final String NOTIFICATIONS_SETTINGSM = NotificationsSettingsType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public static final String SYSTEM_PASSWORD_POLICY_SETTINGSM = SystemPasswordPolicySettingsType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public static final String BLOCKING_TASK_SETTINGSM = BlockingTaskSettingsType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public static final String BLOCKING_TASKM = BlockingTaskType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public static final String MIGRATE_VM_PARAMS = MigrateParamsType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        // Used on ReferencesType
        public static final String BLOCKING_TASKSM = "application/vnd.vmware.admin.blockingTaskList" + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public static final String BLOCKING_TASK_OPERATION_PARAMSM  = BlockingTaskOperationParamsType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public static final String BLOCKING_TASK_UPDATE_PROGRESS_OPERATION_PARAMSM  = BlockingTaskUpdateProgressParamsType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public static final String UBER_ADMIN_SETTINGS = UberAdminSettingsType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public static final String AMQP_TESTM = AmqpSettingsTestType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public static final String VMW_PROVIDER_VDC_RESOURCE_POOL = VMWProviderVdcResourcePoolType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public static final String VMW_PROVIDER_VDC_RESOURCE_POOL_SET = VMWProviderVdcResourcePoolSetType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public static final String VMW_DISCOVERED_RESOURCE_POOLS = VMWDiscoveredResourcePoolsType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public static final String VMW_DISCOVERED_RESOURCE_POOL = VMWDiscoveredResourcePoolType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public static final String VMW_PROVIDER_VDC_UPDATE_STORAGE_PROFILES = UpdateProviderVdcStorageProfilesParamsType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public static final String PROVIDER_RESOURCE_POOL_SET_UPDATE_PARAMSM  = UpdateResourcePoolSetParamsType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public static final String VMW_ORGANIZATION_VDC_RESOURCE_POOL_SET = "application/vnd.vmware.admin.OrganizationVdcResourcePoolSet" + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public static final String LDAP_SETTINGSM = LdapSettingsType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public static final String BRANDING_SETTINGSM = BrandingSettingsType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public static final String LICENSE_SETTINGSM = LicenseType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public static final String EMAIL_SETTINGSM = EmailSettingsType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public static final String SYSTEM_CONFIGURATIONM = SystemConfigurationSettingsType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public static final String VSPHERE_WEB_CLIENT_URL  = VSphereWebClientUrlType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public static final String VSHIELD_MANAGERM = ShieldManagerType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public static final String VMW_PROVIDER_VDC_PARAMS = VMWProviderVdcParamsType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public static final String KERBEROS_SETTINGSM = KerberosSettingsType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public static final String STRANDED_ITEMM = StrandedItemType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public static final String EXTERNAL_SERVICEM = AdminServiceType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public static final String EXTENSION_SERVICESM = ExtensionServicesType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public static final String BUNDLE_UPLOAD_PARAMS_TYPEM = BundleUploadParamsType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public static final String BUNDLE_UPLOAD_SOCKET_TYPEM = BundleUploadSocketType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public static final String EXTERNAL_LINKM = AdminServiceLinkType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public static final String EXTERNAL_SERVICE_CONFIGM = ApiFilterType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public static final String LOOKUP_SERVICE_SETTINGS = LookupServiceSettingsType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public static final String LOOKUP_SERVICE_PARAMS = LookupServiceParamsType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public static final String CATALOG_SETTINGSM = CatalogSettingsType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public static final String OPERATION_LIMITS_SETTINGS = OperationLimitsSettingsType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public static final String CPOM_SETTINGS = CpomSettingsType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;

        public static final String AUTHORIZATION_CHECK_PARAMSM = AuthorizationCheckParamsType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public static final String AUTHORIZATION_CHECK_RESPONSEM = AuthorizationCheckResponseType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public static final String SERVICE_ACL_RULEM = AclRuleType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public static final String SERVICE_RESOURCEM = ServiceResourceType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public static final String RESOURCE_CLASS_ACTIONM = ResourceClassActionType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public static final String RESOURCE_CLASSM = ResourceClassType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;

        public static final String API_DEFINITIONM = AdminApiDefinitionType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public static final String API_FILE_DESCRIPTORM = AdminFileDescriptorType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public static final String VMW_STORAGE_PROFILES = VMWStorageProfilesType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public static final String RIGHTSM  = RightRefsType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public static final String MERGE_PARAMSM = ProviderVdcMergeParamsType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;

        public static final String TRUSTSTORE_UPDATE_PARAMSM = TrustStoreUpdateParamsType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public static final String CERTIFICATE_UPDATE_PARAMSM = CertificateUpdateParamsType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public static final String VC_TRUSTSTORE_UPDATE_PARAMSM = VcTrustStoreUpdateParamsType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public static final String VC_TRUSTSTORE_UPLOAD_SOCKETM = VcTrustStoreUploadSocketType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public static final String VENDOR_SERVICES_TYPEM = VendorServicesType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public static final String REGISTER_COMPONENT_MANAGER = ComponentManagerSettingsType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public static final String UNREGISTER_COMPONENT_MANAGER = ComponentManagerSettingsType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public static final String COMPONENT_MANAGER_SETTINGS = ComponentManagerSettingsType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;

        public static final String VDC_TEMPLATE_REFSM = VMWVdcTemplateListType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public static final String VDC_TEMPLATESM = VMWVdcTemplatesType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public static final String VDC_TEMPLATEM = VMWVdcTemplateType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;

        public static final String OBJECT_EXTENSION = ObjectExtensionType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public static final String OBJECT_EXTENSIONS = ObjectExtensionsType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public static final String TASK = TaskType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;

        public static final String VMW_EXTENSIONM_JSON = VMWExtensionType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String VMW_PROVIDER_VDC_REFERENCESM_JSON = VMWProviderVdcReferencesType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String VMW_EXTERNAL_NETWORK_REFERENCESM_JSON = VMWExternalNetworkReferencesType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String NETWORKEXT_JSON = "application/vnd.vmware.admin.extension.network" + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String VIM_SERVER_NETWORKS_JSON = "application/vnd.vmware.admin.vimServerNetworks" + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String VMW_NETWORK_POOL_REFERENCESM_JSON = VMWNetworkPoolReferencesType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String VMW_VIM_SERVER_REFERENCESM_JSON = VMWVimServerReferencesType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String VMW_HOST_REFERENCESM_JSON = VMWHostReferencesType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String HOSTM_JSON = HostType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String VIRTUAL_CENTERM_JSON = VimServerType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String NSXT_MANAGERSM_JSON = NsxTManagersType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String NSXT_MANAGERM_JSON = NsxTManagerType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String VMW_PROVIDER_VDCM_JSON = VMWProviderVdcType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String VMW_PVDC_STORAGE_PROFILEM_JSON = VMWProviderVdcStorageProfileType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String VMW_EXTERNAL_NETM_JSON = VMWExternalNetworkType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String PREPARE_HOST_PARAMSM_JSON = PrepareHostParamsType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String REGISTER_VIM_SERVERM_JSON = RegisterVimServerParamsType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String VMS_OBJECT_REFS_LISTM_JSON = VmObjectRefsListType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String IMPORT_VM_AS_VAPP_PARAMS_JSON = ImportVmAsVAppParamsType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String IMPORT_VM_PARAMS_JSON = ImportVmParamsType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String IMPORT_VM_AS_VAPP_TEMPLATE_PARAMS_JSON = ImportVmAsVAppTemplateParamsType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String IMPORT_VM_INTO_EXISTING_VAPP_PARAMS_JSON = ImportVmIntoExistingVAppParamsType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String IMPORT_MEDIA_PARAMS_JSON = ImportMediaParamsType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String RESOURCE_POOL_LIST_JSON = ResourcePoolListType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String VMW_HOST_GROUP_JSON = VMWHostGroupType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String VMW_HOST_GROUPS_JSON = VMWHostGroupsType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String VMW_VM_HOST_AFFINITY_RULE_JSON = VMWVmHostAffinityRuleType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String VMW_VM_HOST_AFFINITY_RULES_JSON = VMWVmHostAffinityRulesType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String VMW_VM_GROUP_JSON = VMWVmGroupType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String VMW_VM_GROUPS_JSON = VMWVmGroupsType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String LICENSING_REPORT_JSON = LicensingReportType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String LICENSING_REPORT_LIST_JSON = LicensingReportListType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String VMW_NETWORK_POOLM_JSON = VMWNetworkPoolType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String PORT_GROUP_POOLM_JSON = PortGroupPoolType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String VLAN_POOLM_JSON = VlanPoolType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String VIM_OBJECT_REFS_JSON = VimObjectRefsType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String VIM_OBJECT_REF_JSON = VimObjectRefType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String VM_OBJECT_REF_JSON = VmObjectRefType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String DATASTOREM_JSON = DatastoreType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String EDGE_GATEWAYM_JSON = "application/vnd.vmware.admin.edgeGateway" + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String DATASTORE_LISTM_JSON = "application/vnd.vmware.admin.datastoreList" + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String SYSTEM_SETTINGSM_JSON = SystemSettingsType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String GENERAL_SETTINGSM_JSON = GeneralSettingsType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String AMQP_SETTINGSM_JSON = AmqpSettingsType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String NOTIFICATIONS_SETTINGSM_JSON = NotificationsSettingsType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String SYSTEM_PASSWORD_POLICY_SETTINGSM_JSON = SystemPasswordPolicySettingsType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String BLOCKING_TASK_SETTINGSM_JSON = BlockingTaskSettingsType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String BLOCKING_TASKM_JSON = BlockingTaskType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String MIGRATE_VM_PARAMS_JSON = MigrateParamsType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String BLOCKING_TASKSM_JSON = "application/vnd.vmware.admin.blockingTaskList" + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String BLOCKING_TASK_OPERATION_PARAMSM_JSON  = BlockingTaskOperationParamsType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String BLOCKING_TASK_UPDATE_PROGRESS_OPERATION_PARAMSM_JSON  = BlockingTaskUpdateProgressParamsType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String UBER_ADMIN_SETTINGS_JSON = UberAdminSettingsType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String AMQP_TESTM_JSON = AmqpSettingsTestType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String VMW_PROVIDER_VDC_RESOURCE_POOL_JSON = VMWProviderVdcResourcePoolType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String VMW_PROVIDER_VDC_RESOURCE_POOL_SET_JSON = VMWProviderVdcResourcePoolSetType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String VMW_DISCOVERED_RESOURCE_POOLS_JSON = VMWDiscoveredResourcePoolsType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String VMW_DISCOVERED_RESOURCE_POOL_JSON = VMWDiscoveredResourcePoolType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String VMW_PROVIDER_VDC_UPDATE_STORAGE_PROFILES_JSON = UpdateProviderVdcStorageProfilesParamsType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String PROVIDER_RESOURCE_POOL_SET_UPDATE_PARAMSM_JSON  = UpdateResourcePoolSetParamsType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String VMW_ORGANIZATION_VDC_RESOURCE_POOL_SET_JSON = "application/vnd.vmware.admin.OrganizationVdcResourcePoolSet" + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String LDAP_SETTINGSM_JSON = LdapSettingsType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String BRANDING_SETTINGSM_JSON = BrandingSettingsType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String LICENSE_SETTINGSM_JSON = LicenseType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String EMAIL_SETTINGSM_JSON = EmailSettingsType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String SYSTEM_CONFIGURATIONM_JSON = SystemConfigurationSettingsType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String VSPHERE_WEB_CLIENT_URL_JSON  = VSphereWebClientUrlType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String VSHIELD_MANAGERM_JSON = ShieldManagerType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String VMW_PROVIDER_VDC_PARAMS_JSON = VMWProviderVdcParamsType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String KERBEROS_SETTINGSM_JSON = KerberosSettingsType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String STRANDED_ITEMM_JSON = StrandedItemType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String EXTERNAL_SERVICEM_JSON = AdminServiceType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String EXTENSION_SERVICESM_JSON = ExtensionServicesType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String BUNDLE_UPLOAD_PARAMS_TYPEM_JSON = BundleUploadParamsType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String BUNDLE_UPLOAD_SOCKET_TYPEM_JSON = BundleUploadSocketType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String EXTERNAL_LINKM_JSON = AdminServiceLinkType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String EXTERNAL_SERVICE_CONFIGM_JSON = ApiFilterType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String LOOKUP_SERVICE_SETTINGS_JSON = LookupServiceSettingsType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String LOOKUP_SERVICE_PARAMS_JSON = LookupServiceParamsType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String CATALOG_SETTINGSM_JSON = CatalogSettingsType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String OPERATION_LIMITS_SETTINGS_JSON = OperationLimitsSettingsType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String CPOM_SETTINGS_JSON = CpomSettingsType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String AUTHORIZATION_CHECK_PARAMSM_JSON = AuthorizationCheckParamsType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String AUTHORIZATION_CHECK_RESPONSEM_JSON = AuthorizationCheckResponseType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String SERVICE_ACL_RULEM_JSON = AclRuleType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String SERVICE_RESOURCEM_JSON = ServiceResourceType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String RESOURCE_CLASS_ACTIONM_JSON = ResourceClassActionType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String RESOURCE_CLASSM_JSON = ResourceClassType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String API_DEFINITIONM_JSON = AdminApiDefinitionType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String API_FILE_DESCRIPTORM_JSON = AdminFileDescriptorType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String VMW_STORAGE_PROFILES_JSON = VMWStorageProfilesType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String RIGHTSM_JSON  = RightRefsType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String MERGE_PARAMSM_JSON = ProviderVdcMergeParamsType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String VC_TRUSTSTORE_UPDATE_PARAMSM_JSON = VcTrustStoreUpdateParamsType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String VC_TRUSTSTORE_UPLOAD_SOCKETM_JSON = VcTrustStoreUploadSocketType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String VENDOR_SERVICES_TYPEM_JSON = VendorServicesType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String REGISTER_COMPONENT_MANAGER_JSON = ComponentManagerSettingsType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String UNREGISTER_COMPONENT_MANAGER_JSON = ComponentManagerSettingsType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String COMPONENT_MANAGER_SETTINGS_JSON = ComponentManagerSettingsType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String VDC_TEMPLATE_REFSM_JSON = VMWVdcTemplateListType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String VDC_TEMPLATESM_JSON = VMWVdcTemplatesType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String VDC_TEMPLATEM_JSON = VMWVdcTemplateType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String OBJECT_EXTENSION_JSON = ObjectExtensionType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String OBJECT_EXTENSIONS_JSON = ObjectExtensionsType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String TASK_JSON = TaskType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;

        public static final String EMPTY_MEDIA_TYPE = null;
    }
}

