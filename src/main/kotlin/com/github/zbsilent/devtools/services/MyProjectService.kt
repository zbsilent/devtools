package com.github.zbsilent.devtools.services

import com.github.zbsilent.devtools.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
