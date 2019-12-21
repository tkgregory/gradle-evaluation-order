package com.tom

import org.gradle.api.Plugin
import org.gradle.api.Project

class SmallTalkPlugin implements Plugin<Project> {
    @Override
    void apply(Project project) {
        def extension = project.extensions.create('smallTalk', SmallTalkExtension)

        project.afterEvaluate {
            project.task("makeSmallTalkTo$extension.recipient") {
                doLast {
                    println 'How are you?'
                }
            }
        }
    }
}

class SmallTalkExtension {
    public String recipient
}
