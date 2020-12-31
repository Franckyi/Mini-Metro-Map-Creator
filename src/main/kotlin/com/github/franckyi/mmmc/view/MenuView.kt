package com.github.franckyi.mmmc.view

import com.github.franckyi.mmmc.controller.MenuController
import tornadofx.*

class MenuView : View() {
    private val controller: MenuController by inject()

    override val root = menubar {
        menu("File") {
            item("New project", "Ctrl+N") {
                action(controller::newProject)
            }
            item("Open...", "Ctrl+O") {
                action(controller::open)
            }
            separator()
            item("Save", "Ctrl+S") {
                action(controller::save)
            }
            separator()
            item("Quit", "Ctrl+Q") {
                action(controller::quit)
            }
        }
        menu("Edit") {
            item("Undo", "Ctrl+Z") {
                action(controller::undo)
            }
            item("Redo", "Ctrl+Y") {
                action(controller::redo)
            }
        }
    }
}