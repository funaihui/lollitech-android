package com.lollitech.lollitechandroid.services

import com.intellij.openapi.project.Project
import com.lollitech.lollitechandroid.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
