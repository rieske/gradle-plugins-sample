package com.example;

import org.gradle.api.Plugin;
import org.gradle.api.Project;

class PublishedExamplePlugin implements Plugin<Project> {
    public void apply(Project project) {
        System.out.println("Published example plugin applied");
    }
}
