package com.github.lyzhonghua.myjson2dart.services

import com.intellij.openapi.project.Project
import com.github.lyzhonghua.myjson2dart.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
