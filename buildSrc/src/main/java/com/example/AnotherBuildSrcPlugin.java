package com.example;


import org.gradle.api.Plugin;
import org.gradle.api.Project;

class AnotherBuildSrcPlugin implements Plugin<Project> {
    public void apply(Project project) {
        System.out.println("Another buildSrc plugin applied");
    }
}
