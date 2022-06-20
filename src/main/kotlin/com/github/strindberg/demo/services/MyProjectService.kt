package com.github.strindberg.demo.services

import com.intellij.openapi.project.Project
import com.github.strindberg.demo.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
