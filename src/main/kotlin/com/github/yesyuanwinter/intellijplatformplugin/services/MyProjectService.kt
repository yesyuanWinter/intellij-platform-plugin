package com.github.yesyuanwinter.intellijplatformplugin.services

import com.intellij.openapi.project.Project
import com.github.yesyuanwinter.intellijplatformplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
