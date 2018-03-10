package com.dbsystel.maven.common;

import org.apache.maven.AbstractMavenLifecycleParticipant;
import org.apache.maven.MavenExecutionException;
import org.apache.maven.execution.MavenSession;
import org.apache.maven.rtinfo.RuntimeInformation;
import org.codehaus.plexus.component.annotations.Component;
import org.codehaus.plexus.component.annotations.Requirement;
import org.codehaus.plexus.logging.Logger;

@Component(role = AbstractMavenLifecycleParticipant.class)
public class DevPlatformLifecycleParticipant extends AbstractMavenLifecycleParticipant {
    @Requirement
    private Logger logger;

    @Requirement
    RuntimeInformation runtime;

    @Override
    public void afterSessionStart(MavenSession session) throws MavenExecutionException {
        logger.debug("afterSessionStart");
    }

    @Override
    public void afterProjectsRead(MavenSession session) throws MavenExecutionException {
        logger.debug("afterProjectsRead");
    }
}