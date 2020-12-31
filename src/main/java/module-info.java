module mmmc {
    requires javafx.controls;
    requires tornadofx;
    requires kotlin.stdlib;
    requires com.jfoenix;
    requires kfoenix;

    exports com.github.franckyi.mmmc.app;
    exports com.github.franckyi.mmmc.controller;
    exports com.github.franckyi.mmmc.view;

    opens com.github.franckyi.mmmc.css;
}