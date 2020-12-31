package com.github.franckyi.mmmc.app

import com.github.franckyi.mmmc.view.MainView
import tornadofx.*

class MapCreatorApp : App(MainView::class) {
    override fun onBeforeShow(view: UIComponent) {
        FX.primaryStage.scene.stylesheets += "/com/github/franckyi/mmmc/css/dark2.css"
    }
}