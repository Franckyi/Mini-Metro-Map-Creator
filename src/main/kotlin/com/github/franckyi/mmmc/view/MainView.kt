package com.github.franckyi.mmmc.view

import tornadofx.*

class MainView : View("Mini Metro Map Creator") {
    override val root = borderpane {
        top<MenuView>()
        center<ProjectView>()
    }
}
