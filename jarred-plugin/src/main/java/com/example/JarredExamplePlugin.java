package com.example;

import org.gradle.api.Plugin;
import org.gradle.api.Project;

class JarredExamplePlugin implements Plugin<Project> {
    public void apply(Project project) {
        System.out.println("Jarred example plugin applied");
    }
}
