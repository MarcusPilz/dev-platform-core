package com.dbsystel.maven.common;

public interface PropertyNames extends PropertyMessages {
    /**
     * 
     */
    public final static String SKIP_COMPILE = "compile.skip";

    public final static String PROPERTIES_SAVE_SERVICES_SUCCESS = "Successfully saved properties to file";

    public final static String PROPERTIES_SAVE_SERVICES_FAILURE = "Failed to save properties to XML file";

    public final static String PROPERTIES_SAVE_GVS_SUCCESS = "Successfully saved properties to file";

    public final static String PROPERTIES_SAVE_GVS_FAILURE = "Failed to save properties to XML file";

    /**
     * name of the domain artifact deployed to
     */
    public final static String domainNameProperty = "domainName";

    public final static String domainUsernameProperty = "username";

    public final static String domainPasswordProperty = "password";

    /**
     * Configuration Settings to install
     */
    public final static String SKIP_INSTALL = "install.skip";

    public final static String HOSTNAME = "install.hostname";

    public final static String PORT = "install.port";

    /**
     * Given Global Variables used during deployment
     * 
     * @see tibco-install-plugin
     */
    /**
     * Configuration Parameter where to export the Application Deployment Descriptor. This Application Deployment
     * Descriptor is generated with the corresponding ear-File and AppManage Utility
     */
    public static final String DEPLOYMENT_DESCRIPTOR = "install.deploymentDescriptor";

    /**
     * Configuration Parameter where to export the used deployment Descriptor
     */
    public static final String DEPLOYMENT_DESCRIPTOR_FINAL = "install.deploymentDescriptorFinal";

    public static final String DEPLOYMENT_GLOBAL_VARIABLES = "install.deploymentGlobalVariables";

    public static final String DEPLOYENT_COMMON_VARIABLES = "install.deploymentCommonVariables";

    public static final String DEPLOYMENT_GLOBAL_VARIABLES_REFERENCE = "install.deploymentGlobalVariablesReference";

    public static final String deploymentServicesProperty = "install.deploymentServices";

    /**
     * Location (@see File) for the definition of the services properties
     */
    public static final String DEPLOYMENT_SERVICES = "deploymentServicesProperty";

    public static final String deploymentServicesCommonProperty = "install.deploymentCommonServices";

    public static final String DEPLOYMENT_GLOBAL_SERVICES_REFERENCE_PROPERTY = "install.deploymentGlobalServicesReference";

    public final static String MERGING_PROPERTIES = "Merging properties...";

    public final static String NOTHING_TO_MERGE = "Nothing to merge.";

    public final static String MERGE_FAILURE = "Failed to merge properties";

    public final static String PROPERTIES_LOAD_FAILURE = "Failed to load properties";

    public final static String USING_GVS_COMMON_FILE = "Using Global Variables common properties file";

    /**
     * Used by Tibco
     */
    public final static String CREATING_XML_FROM_EAR = "Extracting the XML Config from ear ";

    public final static String CREATE_XML_FROM_EAR_FAILED = "The extraction of the XML Deploymentdescriptor file from ear file has failed";

    public final static String CREATE_XML_FROM_EAR_SUCCESS = "Successfully extracted the XML Deployment Descriptor to ";

    public final static String CREATING_XML_FROM_DOMAIN = "Extracting the XML Deployment from domain ";

    public final static String CREATE_XML_FROM_DOMAIN_SUCCESS = "Successfully extracted the XML Deployment Descriptor to ";

    public final static String CREATE_XML_FROM_DOMAIN_FAILED = "The extraction of the XML Deploymentdescriptor file from the deployed application file has failed";

    public final static String USING_EAR = "Using EAR : ";

    public final static String USING_XML = "Using XML : ";

    public final static String DEPLOY_EAR_FAILED = "The Deployment of the application failed!";

    public final static String DEPLOYING_APPLICATION = "Deploying Application to ";

    public final static String DEPLOYING_ON_DOMAIN = " on domain ";

    public static final String APPLICATION_MANAGEMENT_COPY_FAILURE = "Failed to copy the Application Management file from";

    public static final String APPLICATION_MANAGEMENT_LOAD_FAILURE = "Failed to load the Application Management file in";

    public static final String PROPERTIES_GLOBAL_VARIABLES_LOAD_FAILURE = "Failed to load the Global Variables Properties file in";

    public static final String PROPERTIES_SERVICES_LOAD_FAILURE = "Failed to load the Services Properties file in";

    public static final String APPLICATION_MANAGEMENT_MERGE_FAILURE = "Failed to merge the Properties files in the Application Management file";

    public static final String APPLICATION_MANAGEMENT_MERGE_SUCCESS = "Successfully merged the Properties in the final XML Deployment Descriptor in";

    public static final String EXPORT_EAR_FROM_DOMAIN = "Exporting an EAR File and Configuring for an Application...";

    public final static String deployedProjectNameProperty = "deploy.project.name";

    public static final String deploymentGlobalVariablesProperty = "deploy.properties.globalVariables";

    public static final String deploymentGlobalVariablesReferenceProperty = "deploy.properties.globalVariables.reference";

    public static final String deploymentServicesReferenceProperty = "deploy.properties.services.reference";

    public static final String deploymentGlobalVariablesCommonProperty = "deploy.properties.globalVariables.common";

    /**
     * Name of AppManage utility
     */
    String APPMANAGE_UTILITY = "AppManage";

    /**
     * Name of AppManage utility
     */
    String APPMANAGE_UTILITY_PATH = "tibco.appmanage.path";

    /**
     * Path to the TIBCO "AppManage" TRA configuration file.
     */
    String APPMANAGE_TRA_PATH = "appmanage.tra.path";

    /**
     * Name of buildear utility
     */
    String BUILDEAR_UTILITY = "buildear";

    /**
     * Name of Buildear utility
     */
    String BUILDEAR_UTILITY_PATH = "tibco.buildear.path";

    /**
     * Path to the TIBCO Designer "buildlibrary" TRA configuration file.
     */
    String BUILDEAR_TRA_PATH = "buildear.tra.path";

    /**
     * 
     */
    String DEPLOY_FORCE = "deploy.force";

    /**
     * 
     */
    String DEPLOY_ENABLED = "deploy.enabled";

    /**
     * 
     */
    String ID = "tibco-as.id";

    /**
     * 
     */
    String JAVA_HOME = "java.home";

    /**
     * 
     */
    String PASSWORD = "password";

    /**
     * 
     */
    String USERNAME = "username";

    /**
     * 
     */
    String TIMEOUT = "tibco.timeout";

    /**
     * 
     */
    String SKIP = "tibco.deploy.skip";

    /**
     * Path to the TIBCO home directory.
     */
    String TIBCO_HOME_DIR = "tibco.home";

    /**
     * Version of the Tibco Software
     */
    String TIBCO_VERSION = "tibco.version";

    /**
     * Version of the Tibco Software
     */
    String HAWK_VERSION = "hawk.version";

    /**
     * Delployment Mode
     */
    String DEPLOYMENT_MODE = "install.deploymentMode";

    /**
     * Delployment Mode
     */
    String DOMAIN_NAME = "tibco.domainname";

    /**
     * 
     */
    String FINALNAME = "project.build.finalName";

    /**
     * 
     */
    String CLASSIFIER = "classifier";

    /**
     * 
     */
    String DIRECTORY = "project.build.directory";

    /**
     * 
     */
    String SERVER_URL = "tibco-as.url";

    /**
     * 
     */
    String SOURCE_ENCODING = "project.build.sourceEncoding";

    /**
     * 
     */
    String IGNORE_REFERENCE_FILES = "ignoreReferenceFiles";

    /**
     * 
     */
    String IGNORE_COMMON_FILES = "ignoreCommonFiles";

    /**
     * Name of validate utility
     */
    public final String VALIDATE_UTILITY = "validateproject";

    /**
     * Name of validate utility
     */
    public final String VALIDATE_UTILITY_PATH = "tibco.validate.path";

    /**
     * Name of validate utility tra
     */
    public final String VALIDATE_UTILITY_TRA_PATH = "tibco.validate.tra.path";

    /**
     * Name of designer utility
     */
    public final String BUILDLIBRARY_UTILITY = "buildlibrary";

    /**
     * Name of buildlibrary utility tra
     */
    public final String BUILDLIBRARY_UTILITY_TRA_PATH = "tibco.buildlibrary.tra.path";

    /**
     * Name of buildlibrary utility
     */
    public final String BUILDLIBRARY_UTILITY_PATH = "tibco.buildlibrary.path";

    /**
     * Binary Extension, f.e. .exe, .sh
     */
    public final String SCRIPT_EXTENSION = "script.extension";

    /**
     * Name of buildlibrary utility tra
     */
    public final String BUILDEAR_UTILITY_TRA_PATH = "tibco.buildear.tra.path";

}
