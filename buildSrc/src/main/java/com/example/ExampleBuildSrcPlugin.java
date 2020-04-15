package com.example;


import org.gradle.api.Plugin;
import org.gradle.api.Project;

class ExampleBuildSrcPlugin implements Plugin<Project> {
    public void apply(Project project) {
        System.out.println("Example buildSrc plugin applied");
    }
}
