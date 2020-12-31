package com.github.franckyi.mmmc.controller

import javafx.application.Platform
import javafx.stage.FileChooser.ExtensionFilter
import tornadofx.*

class MenuController : Controller() {
    fun newProject() {
        println("new")
    }

    fun open() {
        chooseFile("Select your project file", arrayOf(ExtensionFilter("MMMC Project", "mmmc")))
    }

    fun save() {
        println("save")
    }

    fun quit() {
        Platform.exit()
    }

    fun undo() {
        println("undo")
    }

    fun redo() {
        println("redo")
    }
}