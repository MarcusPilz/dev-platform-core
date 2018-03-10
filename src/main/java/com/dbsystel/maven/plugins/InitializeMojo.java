package com.dbsystel.maven.plugins;

import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.Mojo;

@Mojo(name = "initialize")
public class InitializeMojo extends AbstractPlatformMojo {

    public void execute() throws MojoExecutionException, MojoFailureException {
        getLog().debug(" initialize...");
        if (platform.equals("tibco")) {

        }
    }
}
