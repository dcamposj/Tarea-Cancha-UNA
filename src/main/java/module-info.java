module cr.ac.una.pz.cancha {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;
    requires java.logging;
    requires javafx.web;
    
    opens cr.ac.una.pz.cancha to javafx.fxml;
    exports cr.ac.una.pz.cancha;
}
