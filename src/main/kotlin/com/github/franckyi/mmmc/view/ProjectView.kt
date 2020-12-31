package com.github.franckyi.mmmc.view

import tornadofx.*

class ProjectView : View() {
    private val general: GeneralView by inject()
    private val map: MapView by inject()
    private val lines: LinesView by inject()
    private val stations: StationsView by inject()
    private val areas: AreasView by inject()

    override val root = drawer {
        item(general, expanded = true)
        item(map)
        item(lines)
        item(stations)
        item(areas)
    }
}
