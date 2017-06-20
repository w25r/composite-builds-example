package org.gradle.example;

import org.gradle.api.Plugin;
import org.gradle.api.Project;

public class SimplePlugin implements Plugin<Project> {

    @Override
    public void apply(Project project) {
        project.getTasks().create("helloWorld", task -> task.doFirst(t -> {
                project.getLogger().lifecycle("Hello, World!");
        }));
    }
}
