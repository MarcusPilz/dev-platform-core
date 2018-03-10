package com.dbsystel.maven.plugins;

import org.apache.commons.lang3.SystemUtils;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.ResolutionScope;

import com.dbsystel.maven.common.PropertyNames;

@Mojo(name = "validate", defaultPhase = LifecyclePhase.VALIDATE, threadSafe = true,
        executionStrategy = "once-per-session", requiresDependencyResolution = ResolutionScope.TEST)
public class ValidateMojo extends AbstractPlatformMojo implements PropertyNames {

    /**
     * 
     */
    public void execute() throws MojoExecutionException, MojoFailureException {
        this.getLog().debug("validate...");

        if (this.skip) {
            this.getLog().info(SKIP_MESSAGE);
        }

        if (platform.equals("tibco")) {
            checkTibcoUtilities();
        } else {
            throw new MojoExecutionException("Unsupported Platfrom is set ..." + platform);
        }

    }

    /**
     * Check Property Setting to TIBCO Binaries are correct
     * 
     * @throws MojoExecutionException
     */
    protected void checkTibcoUtilities() throws MojoExecutionException {
        this.getLog().debug("Check TIBCO Utilities");
        if (SystemUtils.IS_OS_WINDOWS) {
            fileExtension = ".exe";
        } else {
            fileExtension = "";
        }
    }

    //    protected void checkUtilities() throws MojoExecutionException, MojoFailureException {
    //        this.getLog().debug("Check " + PropertyNames.VALIDATE_UTILITY + " Utility in... " + tibcoHome);
    //
    //        
    //
    //        if (tibcoHome != null && tibcoValidate == null) {
    //            tibcoValidate = new File(tibcoHome + System.getProperty("file.separator") + "designer"
    //                    + System.getProperty("file.separator") + tibcoVersion + System.getProperty("file.separator")
    //                    + "bin" + System.getProperty("file.separator") + PropertyNames.VALIDATE_UTILITY + fileExtension);
    //
    //            this.getLog().debug("Binary::" + tibcoValidate.getAbsolutePath());
    //
    //        }
    //
    //        if (tibcoValidate == null || !tibcoValidate.exists() || !tibcoValidate.isFile()) {
    //            throw new MojoExecutionException(TIBCO_UTILITY_BINARY_NOTFOUND);
    //        }
    //
    //        if (validateProjectTraFile == null) {
    //            if (fileExtension.equals("")) {
    //                validateProjectTraFile = tibcoValidate.getAbsolutePath().concat(".tra");
    //            } else {
    //                validateProjectTraFile = tibcoValidate.getAbsolutePath().replace(fileExtension, ".tra");
    //            }
    //            this.getLog().info("VALIDATE_TRAFILE" + "::" + validateProjectTraFile);
    //        }
    //    }

}
