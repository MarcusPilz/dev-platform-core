package com.dbsystel.maven.plugins;

import java.io.File;

import org.apache.maven.execution.MavenSession;
import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugins.annotations.Parameter;
import org.apache.maven.project.MavenProject;
import org.apache.maven.settings.Settings;

/**
 * 
 * @author MarcusPilz
 *
 */
public abstract class AbstractPlatformMojo extends AbstractMojo {
    /**
     * Provides a reference to the settings file.
     * 
     */
    @Parameter(property = "settings", readonly = true, required = true, defaultValue = "${settings}")
    private Settings settings;

    /**
     * The maven project
     * 
     */
    @Parameter(property = "project", defaultValue = "${project}", required = true, readonly = true)
    protected MavenProject project;

    /**
     * The Maven session.
     */
    @Parameter(defaultValue = "${session}", readonly = true, required = true)
    private MavenSession session;

    /**
     * A flag used to disable the source procedure. This is primarily intended for usage from the command line to
     * occasionally adjust the build.
     *
     * @since 2.2
     */
    @Parameter(property = "skip", defaultValue = "false")
    protected boolean skip;

    /**
     * platform valid Values are tibco
     */
    @Parameter(property = "platform", defaultValue = "tibco")
    protected String platform;

    /**
     * fileExtension
     */
    @Parameter(property = "fileExtension", defaultValue = "")
    protected String fileExtension;

    /**
     * Tibco Settings
     */
    /**
     * Location of tibco home
     */
    @Parameter(property = "tibco.home")
    protected String TIBCO_HOME = "tibco.home";

    /**
     * Used Tibco Version
     * 
     */
    @Parameter(property = "tibco.version", required = false, defaultValue = "5.9")
    protected String tibcoVersion;

    /**
     * Location of buildlibrary utility tra
     */
    @Parameter(property = "tibco.buildlibrary.tra.path")
    protected String BUILDLIBRARY_UTILITY_TRA_PATH = "tibco.buildlibrary.tra.path";

    /**
     * Location of buildlibrary utility
     */
    @Parameter(property = "tibco.buildlibrary.path")
    protected String BUILDLIBRARY_UTILITY_PATH = "tibco.buildlibrary.path";

    /**
     * Binary Extension, f.e. .exe, .sh
     */
    protected final static String SCRIPT_EXTENSION = "script.extension";

    /**
     * Location of buildear utility
     */
    @Parameter(property = "tibco.buildear.path")
    protected String BUILDEAR_UTILITY_PATH = "tibco.buildear.path";

    /**
     * Location of buildear utility tra
     */
    @Parameter(property = "tibco.buildear.tra.path")
    protected String BUILDEAR_UTILITY_TRA_PATH = "tibco.buildear.tra.path";

    /**
     * Name of buildlibrary utility
     */
    protected final static String BUILDEAR_UTILITY = "buildear";

    protected final static String TIBCO_APPMANAGE_UTILITY = "appmanage";

    protected final static String TIBCO_EMS_ADMIN_UTILITY = "tibemsadmin";

    /**
     * Location of the vcrepo.dat
     */
    @Parameter(property = "projectLocation", required = true, readonly = true)
    private String projectLocation;

    /**
     * 
     * @return the directory default is ${poject.build.directory}
     */
    protected String getDirectory() {
        if (platform.equals("tibco")) {
            if (!this.project.getBuild().getDirectory().equals(this.project.getBasedir() + File.separator + "target")) {
                return this.project.getBasedir() + File.separator + "target";
            }
        }
        return this.project.getBuild().getDirectory();
    }

    /**
     * 
     * @return the outputDirectory default is ${poject.build.outputDirectory} for the tibco paltform it returns the
     *         directory
     * 
     */
    protected String getOutputDirectory() {
        if (platform.equals("tibco")) {
            if (!this.project.getBuild().getOutputDirectory()
                    .equals(this.project.getBasedir() + File.separator + "target")) {
                return this.project.getBasedir() + File.separator + "target";
            }
        }
        return this.project.getBuild().getOutputDirectory();
    }

}
