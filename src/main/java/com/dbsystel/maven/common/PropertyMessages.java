package com.dbsystel.maven.common;

public interface PropertyMessages {
    //INFO MESSGAES
    public static final String SKIP_MESSAGE = "Skipping by configuration...";

    public static final String APPLICATION_MANAGEMENT_COPY_FAILURE_MESSAGE = "Failed to copy the Application Management file from...";

    public static final String APPLICATION_MANAGEMENT_LOAD_FAILURE_MESSAGE = "Failed to load the Application Management file in...";

    public static final String APPLICATION_MANAGEMENT_MERGE_FAILURE_MESSAGE = "Failed to merge the Application Management file in...";

    public static final String APPLICATION_MANAGEMENT_MERGE_SUCCESS_MESSAGE = "Successfully merged the Application Management file in...";

    public static final String PROPERTIES_GLOBAL_VARABLES_LOAD_FAILURE_MESSAGES = "Failed to load the Gloabl Variables Properties in ...";

    public static final String XML_LOAD_SUCCESS = "Successfully loaded properties from XML file";

    public static final String XML_LOAD_FAILURE = "Failed to load properties from XML file";

    //DEBUG MESSAGES
    public static final String DEBUG_MESSAGE_NO_CREDS = "No username and password in settings.xml file - falling back to CLI entry";

    public static final String DEBUG_MESSAGE_NO_ID = "No <id> element was found in the POM - Getting credentials from CLI entry";

    public static final String DEBUG_MESSAGE_NO_SERVER_SECTION = "No <server> section was found for the specified id";

    public static final String DEBUG_MESSAGE_NO_SETTINGS_FILE = "No settings.xml file was found in this Mojo's execution context";

    public static final String DEBUG_MESSAGE_POM_HAS_CREDS = "Getting credentials from the POM";

    public static final String DEBUG_MESSAGE_SETTINGS_HAS_CREDS = "Found username and password in the settings.xml file";

    public static final String DEBUG_MESSAGE_SETTINGS_HAS_ID = "Found the server's id in the settings.xml file";

    //ERROR MESSAGES
    public static final String TIBCO_UTILITY_BINARY_NOTFOUND = "The TIBCO AppManage or buildear binary can't be found.";

    public static final String TIBCO_HAWK_BINARY_NOTFOUND = "The TIBCO Hawk binary folder can't be found.";

    //INSTALL MESSGAES
    public final static String PROPERTIES_SAVE_SERVICES_SUCCESS = "Successfully saved properties to file";

    public final static String PROPERTIES_SAVE_SERVICES_FAILURE = "Failed to save properties to XML file";

    public final static String PROPERTIES_SAVE_GVS_SUCCESS = "Successfully saved properties to file";

    public final static String PROPERTIES_SAVE_GVS_FAILURE = "Failed to save properties to XML file";

    public final static String USING_SERVICES_REFERENCE_FILE = "Using Services reference properties file";

    public final static String USING_GVS_REFERENCE_FILE = "Using Global Variables reference properties file";

    public final static String USING_SERVICES_COMMON_FILE = "Using Services common properties file";

    public final static String MERGING_PROPERTIES = "Merging properties...";

    public final static String NOTHING_TO_MERGE = "Nothing to merge.";

    public final static String MERGE_FAILURE = "Failed to merge properties";

    public final static String PROPERTIES_LOAD_FAILURE = "Failed to load properties";

    public final static String USING_GVS_COMMON_FILE = "Using Global Variables common properties file";

}
