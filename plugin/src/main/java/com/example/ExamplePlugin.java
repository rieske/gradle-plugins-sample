package com.example;

import org.gradle.api.Plugin;
import org.gradle.api.Project;

class ExamplePlugin implements Plugin<Project> {
    public void apply(Project project) {
        System.out.println("Example plugin applied");
    }
}
