package com.github.franckyi.mmmc.view

import kfoenix.*
import tornadofx.*

class GeneralView : View("General") {
    override val root = form {
        fieldset {
            field("Name") {
                jfxtextfield()
            }
        }
    }
}
