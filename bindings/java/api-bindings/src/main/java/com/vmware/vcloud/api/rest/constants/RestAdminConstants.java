
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

import com.vmware.vcloud.api.rest.schema_v1_5.AdminCatalogType;
import com.vmware.vcloud.api.rest.schema_v1_5.AdminFromCloudTunnelType;
import com.vmware.vcloud.api.rest.schema_v1_5.AdminOrgType;
import com.vmware.vcloud.api.rest.schema_v1_5.AdminToCloudTunnelType;
import com.vmware.vcloud.api.rest.schema_v1_5.AdminVdcStorageProfileType;
import com.vmware.vcloud.api.rest.schema_v1_5.AdminVdcType;
import com.vmware.vcloud.api.rest.schema_v1_5.AmqpBrokersType;
import com.vmware.vcloud.api.rest.schema_v1_5.AmqpComponentConfigurationType;
import com.vmware.vcloud.api.rest.schema_v1_5.AmqpComponentConfigurationsType;
import com.vmware.vcloud.api.rest.schema_v1_5.AmqpConfigurationType;
import com.vmware.vcloud.api.rest.schema_v1_5.CertificateUpdateParamsType;
import com.vmware.vcloud.api.rest.schema_v1_5.CertificateUploadSocketType;
import com.vmware.vcloud.api.rest.schema_v1_5.CreateVdcParamsType;
import com.vmware.vcloud.api.rest.schema_v1_5.EdgeGatewayFormFactorType;
import com.vmware.vcloud.api.rest.schema_v1_5.EventType;
import com.vmware.vcloud.api.rest.schema_v1_5.ExternalCatalogSubscriptionParamsType;
import com.vmware.vcloud.api.rest.schema_v1_5.FromCloudTunnelListenerCreateParamsType;
import com.vmware.vcloud.api.rest.schema_v1_5.FromCloudTunnelListenerListType;
import com.vmware.vcloud.api.rest.schema_v1_5.FromCloudTunnelListenerType;
import com.vmware.vcloud.api.rest.schema_v1_5.GatewayFeaturesType;
import com.vmware.vcloud.api.rest.schema_v1_5.GatewayType;
import com.vmware.vcloud.api.rest.schema_v1_5.GroupType;
import com.vmware.vcloud.api.rest.schema_v1_5.HybridSettingsType;
import com.vmware.vcloud.api.rest.schema_v1_5.KeystoreUpdateParamsType;
import com.vmware.vcloud.api.rest.schema_v1_5.KeystoreUploadSocketType;
import com.vmware.vcloud.api.rest.schema_v1_5.OpenIdProviderConfigurationType;
import com.vmware.vcloud.api.rest.schema_v1_5.OpenIdProviderInfoType;
import com.vmware.vcloud.api.rest.schema_v1_5.OrgAssociationType;
import com.vmware.vcloud.api.rest.schema_v1_5.OrgAssociationsType;
import com.vmware.vcloud.api.rest.schema_v1_5.OrgEmailSettingsType;
import com.vmware.vcloud.api.rest.schema_v1_5.OrgFederationSettingsType;
import com.vmware.vcloud.api.rest.schema_v1_5.OrgGeneralSettingsType;
import com.vmware.vcloud.api.rest.schema_v1_5.OrgGuestPersonalizationSettingsType;
import com.vmware.vcloud.api.rest.schema_v1_5.OrgLdapSettingsType;
import com.vmware.vcloud.api.rest.schema_v1_5.OrgLeaseSettingsType;
import com.vmware.vcloud.api.rest.schema_v1_5.OrgOAuthSettingsType;
import com.vmware.vcloud.api.rest.schema_v1_5.OrgOperationLimitsSettingsType;
import com.vmware.vcloud.api.rest.schema_v1_5.OrgPasswordPolicySettingsType;
import com.vmware.vcloud.api.rest.schema_v1_5.OrgSettingsType;
import com.vmware.vcloud.api.rest.schema_v1_5.OrgVAppTemplateLeaseSettingsType;
import com.vmware.vcloud.api.rest.schema_v1_5.OrgVdcNetworkType;
import com.vmware.vcloud.api.rest.schema_v1_5.OrganizationRightsType;
import com.vmware.vcloud.api.rest.schema_v1_5.OrgsType;
import com.vmware.vcloud.api.rest.schema_v1_5.ProviderVdcStorageProfileType;
import com.vmware.vcloud.api.rest.schema_v1_5.ProviderVdcType;
import com.vmware.vcloud.api.rest.schema_v1_5.PublishCatalogParamsType;
import com.vmware.vcloud.api.rest.schema_v1_5.PublishExternalCatalogParamsType;
import com.vmware.vcloud.api.rest.schema_v1_5.ReferencesType;
import com.vmware.vcloud.api.rest.schema_v1_5.RegisterVAppParamsType;
import com.vmware.vcloud.api.rest.schema_v1_5.RightType;
import com.vmware.vcloud.api.rest.schema_v1_5.RoleType;
import com.vmware.vcloud.api.rest.schema_v1_5.SelectorExtensionType;
import com.vmware.vcloud.api.rest.schema_v1_5.SelectorExtensionsType;
import com.vmware.vcloud.api.rest.schema_v1_5.SspiKeytabUpdateParamsType;
import com.vmware.vcloud.api.rest.schema_v1_5.SspiKeytabUploadSocketType;
import com.vmware.vcloud.api.rest.schema_v1_5.SyslogServerType;
import com.vmware.vcloud.api.rest.schema_v1_5.TaskOperationListType;
import com.vmware.vcloud.api.rest.schema_v1_5.TrustStoreUpdateParamsType;
import com.vmware.vcloud.api.rest.schema_v1_5.TrustStoreUploadSocketType;
import com.vmware.vcloud.api.rest.schema_v1_5.TunnelingApplicationListType;
import com.vmware.vcloud.api.rest.schema_v1_5.TunnelingApplicationRegisterParamsType;
import com.vmware.vcloud.api.rest.schema_v1_5.TunnelingApplicationType;
import com.vmware.vcloud.api.rest.schema_v1_5.UpdateVdcStorageProfilesType;
import com.vmware.vcloud.api.rest.schema_v1_5.UserType;
import com.vmware.vcloud.api.rest.schema_v1_5.VCloudType;
import com.vmware.vcloud.api.rest.schema_v1_5.VdcReferencesType;
import com.vmware.vcloud.api.rest.schema_v1_5.extension.DatastoreType;
import com.vmware.vcloud.api.rest.schema_v1_5.extension.EntityReferencesType;
import com.vmware.vcloud.api.rest.schema_v1_5.extension.LdapSettingsType;
import com.vmware.vcloud.api.rest.schema_v1_5.extension.ResourcePoolListType;
import com.vmware.vcloud.api.rest.schema_v1_5.extension.UserEntityRightsType;
import com.vmware.vcloud.api.rest.schema_v1_5.extension.VMWDiscoveredResourcePoolsType;
import com.vmware.vcloud.api.rest.schema_v1_5.extension.VMWProviderVdcType;
import com.vmware.vcloud.api.rest.schema_v1_5.extension.VMWVdcTemplateListType;
import com.vmware.vcloud.api.rest.schema_v1_5.extension.VMWVdcTemplateType;

/**
 * Constants used in the Admin API handlers. Has media types and uri paths.
 *
 * @author vjohnson
 *
 */
public class RestAdminConstants {

    /* Not to be initialized */
    private RestAdminConstants() {
    }

    public static class Uri {
        private Uri() {
        };

        public static final String ADMIN_PREFIX = "/admin";
        public static final String ADMIN = ADMIN_PREFIX + "/";
        public static final String PROVIDER_VDC = "/providervdc/";
        public static final String PROVIDER_VDCS = "/providervdcs";
        public static final String VDC_REFERENCES = "/vdcReferences";
        public static final String ORG_VDC = "/vdcs";
        public static final String ADMIN_VDC = "/vdc/";
        public static final String ORGANIZATION = "/org/";
        public static final String USER = "/user/";
        public static final String GROUP = "/group/";
        public static final String RIGHT = "/right/";
        public static final String ROLE = "/role/";
        public static final String CATALOG = "/catalog/";
        public static final String CATALOGS = "/catalogs";
        public static final String NETWORK = "/network/";
        public static final String NETWORKS = "/networks";
        public static final String NETWORK_POOL = "/networkPool/";
        public static final String GATEWAY = "/edgeGateway/";
        public static final String GATEWAYS = "/edgeGateways";
        public static final String ADD_USERS_PATH = "/users";
        public static final String ADD_GROUPS_PATH = "/groups";
        public static final String ADD_CATALOGS_PATH = "/catalogs";
        public static final String ADD_ORGANIZATIONS_PATH = "orgs";
        public static final String ADD_VDCS_PATH = "/vdcs";
        public static final String ADD_VDCS_PARAMS_PATH = "/vdcsparams";
        public static final String ADD_ORG_NETWORKS_PATH = "/networks";
        public static final String ADD_ROLES_PATH = "roles";
        public static final String ORG_SETTINGS = "/settings";
        public static final String ORG_GENERAL_SETTINGS = "/general";
        public static final String ORG_FEDERATION_SETTINGS = "/federation";
        public static final String ORG_FEDERATION_SAML_ALIAS = "/alias/";
        public static final String ORG_OAUTH_SETTINGS = "/oauth";
        public static final String OPENID_PROVIDER_CONFIG = "/openIdProviderConfig";
        public static final String ORG_LDAP_SETTINGS = "/ldap";
        public static final String VAPP_TEMPLATE_LEASE_SETTINGS = "/vAppTemplateLeaseSettings";
        public static final String ORG_EMAIL_SETTINGS = "/email";
        public static final String ORG_PASSWORD_POLICY_SETTINGS = "/passwordPolicy";
        public static final String ORG_VAPP_LEASE_SETTINGS = "/vAppLeaseSettings";
        public static final String RIGHTS = "/rights";
        public static final String ROLES = "/roles";
        public static final String USERS = "/users";
        public static final String STRANDEDUSERS = "/strandedUsers";
        public static final String GROUPS = "/groups";
        public static final String VDC_TEMPLATE = "/vdcTemplate";
        public static final String VDC_TEMPLATES = "/vdcTemplates";
        public static final String VDCS = "/vdcs";
        public static final String ORGANIZATIONS = "/orgs";
        public static final String VDC_STORAGE_CLASS = "/vdcStorageProfile";
        public static final String VDC_STORAGE_CLASSES = "/vdcStorageProfiles";
        public static final String PVDC_STORAGE_CLASS = "/pvdcStorageProfile";
        public static final String AVAILABLE_STORAGE_PROFILES = "/availableStorageProfiles";
        public static final String EVENTS = "/events";
        public static final String ORG_GUEST_PERSONALIZATION_SETTINGS = "/guestPersonalizationSettings";
        public static final String ORG_OPERATION_LIMITS_SETTINGS = "/operationLimitsSettings";
        public static final String CBM_DATA = "/cbmData";
        public static final String TUNNELING_APPLICATION = "/hybrid/tunnelingApplication";
        public static final String HYBRID_SETTINGS = "/hybrid/settings";
        public static final String HYBRID_TO_CLOUD_TUNNEL = "/hybrid/toCloudTunnel";
        public static final String HYBRID_FROM_CLOUD_TUNNEL = "/hybrid/fromCloudTunnel";
        public static final String HYBRID_FROM_CLOUD_TUNNEL_LISTENER = "/hybrid/fromCloudTunnelListener";
        public static final String ORG_ASSOCIATIONS = "/associations";
        public static final String LOCAL_ASSOCIATION_DATA = "/localAssociationData";
        public static final String EVENT = "/event";
        public final static String AMQP = "/amqp";
        public final static String AMQP_BROKER = "/broker";
        public final static String AMQP_COMPONENT = "/component";
        public final static String EXTENSION = "/extension";
        public final static String OBJECT_EXTENSION = "/object";
        public final static String SELECTOR_EXTENSIONS = "/selectorExtensions";
        public final static String COMPUTE_POLICIES = "/computePolicies";
        public static final String EDGE_CLUSTERS = "/edgeClusters";
        public static final String VDC_GROUPS = "/vdcGroups";
    }

    public static class MediaType {
        private MediaType() {
        };

        public static final String ADMIN_MEDIA_TYPE_PREFIX = "application/vnd.vmware.admin.";
        public static final String VCLOUDM = VCloudType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public static final String PROVIDER_VDCM = ProviderVdcType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public static final String VMW_PROVIDER_VDCM = VMWProviderVdcType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public static final String VDC_REFERENCESM = VdcReferencesType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public static final String ADMIN_VDCM = AdminVdcType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public static final String ORGANIZATIONM = AdminOrgType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        // SYSTEM_ORGANIZATIONM is used only in links
        public static final String SYSTEM_ORGANIZATIONM = "application/vnd.vmware.admin.systemOrganization" + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public static final String USERM = UserType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public static final String GROUPM = GroupType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public static final String ROLEM = RoleType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public static final String RIGHTM = RightType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public static final String RIGHT_REFERENCESM = "application/vnd.vmware.admin.rightReferences+xml";
        public static final String CATALOGM = AdminCatalogType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public static final String ORGSM = OrgsType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public static final String ORGRIGHTSM = OrganizationRightsType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        // ORG_NETWORKM "collides" with Constants.ORG_NETWORK
        public static final String ORG_NETWORKM = "application/vnd.vmware.admin.orgNetwork" + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        // NETWORKM is used only in links
        public static final String NETWORKM = "application/vnd.vmware.admin.network" + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public static final String NETWORK_POOLM = "application/vnd.vmware.admin.networkPool" + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public static final String GATEWAYM = GatewayType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public static final String GATEWAY_SERVICESM = GatewayFeaturesType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public static final String GATEWAY_SYSLOGSERVERSETTINGSM = SyslogServerType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public static final String GATEWAY_FORM_FACTORM = EdgeGatewayFormFactorType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public static final String ORG_VDC_NETWORKM = OrgVdcNetworkType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public static final String PUBLISH_PARAMSM = PublishCatalogParamsType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public static final String PUBLISH_EXTERNAL_CATALOG_PARAMSM  = PublishExternalCatalogParamsType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public static final String EXT_CATALOG_SUBSCRIPTION_PARAMSM  = ExternalCatalogSubscriptionParamsType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public static final String ORG_SETTINGSM = OrgSettingsType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public static final String VAPP_TEMPLATE_LEASE_SETTINGS = OrgVAppTemplateLeaseSettingsType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public static final String TASK_OPERATION_LISTM = TaskOperationListType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public static final String ORGANIZATION_ASSOCIATIONM = OrgAssociationType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public static final String ORGANIZATION_ASSOCIATIONSM = OrgAssociationsType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public static final String ORGANIZATION_GENERAL_SETTINGSM = OrgGeneralSettingsType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public static final String ORGANIZATION_FEDERATION_SETTINGSM = OrgFederationSettingsType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        //approved MIME type for SAML v2.0 metadata (https://www.iana.org/assignments/media-types/application/samlmetadata+xml)
        public static final String ORGANIZATION_FEDERATION_SAML_METADATA_TYPE = "application/samlmetadata+xml";
        public static final String ORGANIZATION_OAUTH_SETTINGSM = OrgOAuthSettingsType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public static final String OPENID_PROVIDER_INFO = OpenIdProviderInfoType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public static final String OPENID_PROVIDER_CONFIG = OpenIdProviderConfigurationType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public static final String ORGANIZATION_LDAP_SETTINGSM = OrgLdapSettingsType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public static final String LDAP_SETTINGSM = LdapSettingsType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public static final String ORGANIZATION_EMAIL_SETTINGSM = OrgEmailSettingsType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public static final String ORGANIZATION_PASSWORD_POLICY_SETTINGSM = OrgPasswordPolicySettingsType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public static final String ORGANIZATION_VAPP_LEASE_SETTINGSM = OrgLeaseSettingsType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public static final String UPDATE_VDC_STORAGE_CLASSM = UpdateVdcStorageProfilesType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public static final String EVENTM = EventType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public static final String ORG_GUEST_PERSONALIZATION_SETTINGSM = OrgGuestPersonalizationSettingsType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public static final String ORG_OPERATION_LIMITS_SETTINGSM = OrgOperationLimitsSettingsType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public static final String CREATE_VDC_PARAMS = CreateVdcParamsType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        // ENTITY_REFERENCESM is used to query user privileges over a set of entities
        public static final String ENTITY_REFERENCESM = EntityReferencesType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        // USER_ENTITY_RIGHTS_LISTM is output to the above ENTITY_REFERENCESM query
        public static final String USER_ENTITY_RIGHTS_LISTM = UserEntityRightsType.CONTENT_TYPE+ XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public static final String REFERENCESM = ReferencesType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public static final String REGISTER_VAPP_PARAMS = RegisterVAppParamsType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public static final String VDC_STORAGE_CLASSM = AdminVdcStorageProfileType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public static final String PVDC_STORAGE_CLASSM = ProviderVdcStorageProfileType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public static final String VDC_TEMPLATEM = VMWVdcTemplateType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public static final String VDC_TEMPLATE_LISTM = VMWVdcTemplateListType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;

        public static final String TRUSTSTORE_UPDATE_PARAMSM = TrustStoreUpdateParamsType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public static final String TRUSTSTORE_UPLOAD_SOCKETM = TrustStoreUploadSocketType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public static final String CERTIFICATE_UPDATE_PARAMSM = CertificateUpdateParamsType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public static final String CERTIFICATE_UPLOAD_SOCKETM = CertificateUploadSocketType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public static final String KEY_STORE_UPDATE_PARAMSM = KeystoreUpdateParamsType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public static final String KEY_STORE_UPLOAD_SOCKETM = KeystoreUploadSocketType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public static final String SSPI_KEYTAB_UPDATE_PARAMSM = SspiKeytabUpdateParamsType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public static final String SSPI_KEYTAB_UPLOAD_SOCKETM = SspiKeytabUploadSocketType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;

        public static final String TUNNELING_APPLICATION_REGISTER_PARAMS = TunnelingApplicationRegisterParamsType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public static final String TUNNELING_APPLICATION = TunnelingApplicationType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public static final String TUNNELING_APPLICATION_LIST = TunnelingApplicationListType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;

        public static final String HYBRID_SETTINGS = HybridSettingsType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public static final String TO_CLOUD_TUNNEL_TYPE = AdminToCloudTunnelType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public static final String FROM_CLOUD_TUNNEL_TYPE = AdminFromCloudTunnelType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public static final String FROM_CLOUD_TUNNEL_LISTENER_TYPE = FromCloudTunnelListenerType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public static final String FROM_CLOUD_TUNNEL_LISTENER_CREATE_PARAMS_TYPE = FromCloudTunnelListenerCreateParamsType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public static final String FROM_CLOUD_TUNNEL_LISTENER_LIST_TYPE = FromCloudTunnelListenerListType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;

        public static final String EVENT = EventType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;

        public static final String AMQP_CONFIGM = AmqpConfigurationType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public static final String AMQP_BROKERSM = AmqpBrokersType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public static final String AMQP_COMPONENTSM = AmqpComponentConfigurationsType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public static final String AMQP_COMPONENTM = AmqpComponentConfigurationType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;

        public static final String SELECTOR_EXTENSION = SelectorExtensionType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;
        public static final String SELECTOR_EXTENSIONS = SelectorExtensionsType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;

        public static final String DATASTORE = DatastoreType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;

        public static final String DISCOVER_RP_TYPE = VMWDiscoveredResourcePoolsType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;

        public static final String EMPTY_MEDIA_TYPE = null;

        public static final String RESOURCE_POOL_LIST = ResourcePoolListType.CONTENT_TYPE + XmlJsonTypeMatcher.XML_FORMAT_SUFFIX;

        public static final String VCLOUDM_JSON = VCloudType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String PROVIDER_VDCM_JSON = ProviderVdcType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String VDC_REFERENCESM_JSON = VdcReferencesType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String ADMIN_VDCM_JSON = AdminVdcType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String ORGANIZATIONM_JSON = AdminOrgType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String SYSTEM_ORGANIZATIONM_JSON = "application/vnd.vmware.admin.systemOrganization" + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String USERM_JSON = UserType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String GROUPM_JSON = GroupType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String ROLEM_JSON = RoleType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String RIGHTM_JSON = RightType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String CATALOGM_JSON = AdminCatalogType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String ORGSM_JSON = OrgsType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String ORGRIGHTSM_JSON = OrganizationRightsType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String ORG_NETWORKM_JSON = "application/vnd.vmware.admin.orgNetwork" + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String NETWORKM_JSON = "application/vnd.vmware.admin.network" + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String NETWORK_POOLM_JSON = "application/vnd.vmware.admin.networkPool" + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String GATEWAYM_JSON = GatewayType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String GATEWAY_SERVICESM_JSON = GatewayFeaturesType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String GATEWAY_SYSLOGSERVERSETTINGSM_JSON = SyslogServerType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String GATEWAY_FORM_FACTORM_JSON = EdgeGatewayFormFactorType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String ORG_VDC_NETWORKM_JSON = OrgVdcNetworkType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String PUBLISH_PARAMSM_JSON = PublishCatalogParamsType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String PUBLISH_EXTERNAL_CATALOG_PARAMSM_JSON  = PublishExternalCatalogParamsType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String EXT_CATALOG_SUBSCRIPTION_PARAMSM_JSON  = ExternalCatalogSubscriptionParamsType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String ORG_SETTINGSM_JSON = OrgSettingsType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String VAPP_TEMPLATE_LEASE_SETTINGS_JSON = OrgVAppTemplateLeaseSettingsType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String TASK_OPERATION_LISTM_JSON = TaskOperationListType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String ORGANIZATION_ASSOCIATIONM_JSON = OrgAssociationType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String ORGANIZATION_ASSOCIATIONSM_JSON = OrgAssociationsType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String ORGANIZATION_GENERAL_SETTINGSM_JSON = OrgGeneralSettingsType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String ORGANIZATION_FEDERATION_SETTINGSM_JSON = OrgFederationSettingsType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String ORGANIZATION_OAUTH_SETTINGSM_JSON = OrgOAuthSettingsType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String OPENID_PROVIDER_INFO_JSON = OpenIdProviderInfoType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String OPENID_PROVIDER_CONFIG_JSON = OpenIdProviderConfigurationType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String ORGANIZATION_LDAP_SETTINGSM_JSON = OrgLdapSettingsType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String LDAP_SETTINGSM_JSON = LdapSettingsType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String ORGANIZATION_EMAIL_SETTINGSM_JSON = OrgEmailSettingsType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String ORGANIZATION_PASSWORD_POLICY_SETTINGSM_JSON = OrgPasswordPolicySettingsType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String ORGANIZATION_VAPP_LEASE_SETTINGSM_JSON = OrgLeaseSettingsType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String UPDATE_VDC_STORAGE_CLASSM_JSON = UpdateVdcStorageProfilesType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String EVENTM_JSON = EventType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String ORG_GUEST_PERSONALIZATION_SETTINGSM_JSON = OrgGuestPersonalizationSettingsType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String ORG_OPERATION_LIMITS_SETTINGSM_JSON = OrgOperationLimitsSettingsType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String CREATE_VDC_PARAMS_JSON = CreateVdcParamsType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String ENTITY_REFERENCESM_JSON = EntityReferencesType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String USER_ENTITY_RIGHTS_LISTM_JSON = UserEntityRightsType.CONTENT_TYPE+ XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String REFERENCESM_JSON = ReferencesType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String REGISTER_VAPP_PARAMS_JSON = RegisterVAppParamsType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String VDC_STORAGE_CLASSM_JSON = AdminVdcStorageProfileType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String PVDC_STORAGE_CLASSM_JSON = ProviderVdcStorageProfileType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String VDC_TEMPLATEM_JSON = VMWVdcTemplateType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String VDC_TEMPLATE_LISTM_JSON = VMWVdcTemplateListType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String TRUSTSTORE_UPDATE_PARAMSM_JSON = TrustStoreUpdateParamsType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String TRUSTSTORE_UPLOAD_SOCKETM_JSON = TrustStoreUploadSocketType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String CERTIFICATE_UPDATE_PARAMSM_JSON = CertificateUpdateParamsType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String CERTIFICATE_UPLOAD_SOCKETM_JSON = CertificateUploadSocketType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String KEY_STORE_UPDATE_PARAMSM_JSON = KeystoreUpdateParamsType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String KEY_STORE_UPLOAD_SOCKETM_JSON = KeystoreUploadSocketType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String SSPI_KEYTAB_UPDATE_PARAMSM_JSON = SspiKeytabUpdateParamsType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String SSPI_KEYTAB_UPLOAD_SOCKETM_JSON = SspiKeytabUploadSocketType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String TUNNELING_APPLICATION_REGISTER_PARAMS_JSON = TunnelingApplicationRegisterParamsType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String TUNNELING_APPLICATION_JSON = TunnelingApplicationType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String TUNNELING_APPLICATION_LIST_JSON = TunnelingApplicationListType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String HYBRID_SETTINGS_JSON = HybridSettingsType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String TO_CLOUD_TUNNEL_TYPE_JSON = AdminToCloudTunnelType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String FROM_CLOUD_TUNNEL_TYPE_JSON = AdminFromCloudTunnelType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String FROM_CLOUD_TUNNEL_LISTENER_TYPE_JSON = FromCloudTunnelListenerType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String FROM_CLOUD_TUNNEL_LISTENER_CREATE_PARAMS_TYPE_JSON = FromCloudTunnelListenerCreateParamsType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String FROM_CLOUD_TUNNEL_LISTENER_LIST_TYPE_JSON = FromCloudTunnelListenerListType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String EVENT_JSON = EventType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String AMQP_CONFIGM_JSON = AmqpConfigurationType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String AMQP_BROKERSM_JSON = AmqpBrokersType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String AMQP_COMPONENTSM_JSON = AmqpComponentConfigurationsType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String AMQP_COMPONENTM_JSON = AmqpComponentConfigurationType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String SELECTOR_EXTENSION_JSON = SelectorExtensionType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String SELECTOR_EXTENSIONS_JSON = SelectorExtensionsType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String DATASTORE_JSON = DatastoreType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String DISCOVER_RP_TYPE_JSON = VMWDiscoveredResourcePoolsType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String VCDNI_TO_VXLAN_MIGRATION_JSON = "application/vnd.vmware.admin.vdcnitovxlanmigration" + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;
        public static final String RESOURCE_POOL_LIST_JSON = ResourcePoolListType.CONTENT_TYPE + XmlJsonTypeMatcher.JSON_FORMAT_SUFFIX;

    }

    /**
     * Action URIs
     */
    public static class ActionUri {
        public static final String ORG_ENABLE = "/action/enable";
        public static final String ORG_DISABLE = "/action/disable";
        public static final String ORG_RELOAD_STS_AUTH = "/action/reloadStsAuthSettings";
        public static final String ORG_FEDERATION_REGENERATE_CERTIFICATE = "/action/regenerateFederationCertificate";
        public static final String VDC_ENABLE = "/action/enable";
        public static final String VDC_DISABLE = "/action/disable";
        public static final String REGISTER_VAPP = "/action/registerVApp";
        public static final String UPDATE_RIGHTS = "/action/update";
        public static final String GATEWAY_REDEPLOY = "/action/redeploy";
        public static final String GATEWAY_REAPPLY_SERVICES = "/action/reapplyServices";
        public static final String GATEWAY_MODIFY_FORM_FACTOR = "/action/modifyFormFactor";
        public static final String GATEWAY_SYNC_SYSLOG = "/action/syncSyslogServerSettings";
        public static final String GATEWAY_UPGRADE_CONFIG = "/action/upgradeConfig";
        public static final String GATEWAY_CONFIGURE_SERVICES = "/action/configureServices";
        public static final String GATEWAY_UPDATE_PROPERTIES = "/action/updateProperties";
        public static final String GATEWAY_CONFIGURE_SYSLOGSERVER_SETTINGS = "/action/configureSyslogServerSettings";
        public static final String GATEWAY_UPGRADE_NETWORKING="/action/convertToAdvancedNetworking";
        public static final String GATEWAY_UPGRADE_TO_ADVANCED_GATEWAY ="/action/convertToAdvancedGateway";
        public static final String GATEWAY_ENABLE_DISTRIBUTED_ROUTING ="/action/enableDistributedRouting";
        public static final String GATEWAY_DISABLE_DISTRIBUTED_ROUTING ="/action/disableDistributedRouting";

        public static final String HYBRID_REFRESH_TO_CLOUD_TUNNEL = "/action/refresh";

        public static final String AMQP_CERTIFICATE_UPDATE = "/action/updateAmqpCertificate";
        public static final String AMQP_CERTIFICATE_RESET = "/action/resetAmqpCertificate";
        public static final String AMQP_TRUSTSTORE_UPDATE = "/action/updateAmqpTruststore";
        public static final String AMQP_TRUSTSTORE_RESET = "/action/resetAmqpTruststore";

        public static final String VAPP_RUNTIME_LEASE_EXPIRE = "/action/expireVAppsRuntimeLease";
        public static final String VAPP_STORAGE_LEASE_EXPIRE = "/action/expireVAppsStorageLease";
        public static final String VAPPTEMPLATE_STORAGE_LEASE_EXPIRE = "/action/expireVAppTemplatesStorageLease";

        // Role link/unlink template Deprecated in ApiVersion Alias RBAC_2
        @Deprecated
        public final static String ROLE_RELINK_TO_TEMPLATE = "/action/relinkToTemplate";
        @Deprecated
        public final static String ROLE_UNLINK_FROM_TEMPLATE = "/action/unlinkFromTemplate";

        public static final String REGENERATE_KEY_PAIR = "/action/regenerateKeyPair";
    }
}

