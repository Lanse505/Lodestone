/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package org.parchmentmc.lodestone;

import org.gradle.api.Plugin;
import org.gradle.api.Project;

/**
 * LodestonePlugin is a Gradle plugin that applies the Lodestone functionality to a project.
 * It implements the Plugin interface to define the plugin behavior when applied to a project.
 */
public class LodestonePlugin implements Plugin<Project> {

    /**
     * Applies the Lodestone plugin functionality to the specified Gradle project.
     * It creates and configures a LodestoneExtension for the project.
     *
     * @param project The Gradle project to apply the plugin to.
     */
    public void apply(Project project) {
        LodestoneExtension extension = project.getExtensions().create("lodestone", LodestoneExtension.class, project);
    }
}
