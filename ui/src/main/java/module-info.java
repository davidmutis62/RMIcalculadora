module me.kevinmutis.client {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires transitive javafx.graphics;
    requires java.rmi;
    requires me.kevinmutis.shared;

    opens me.kevinmutis.ui to javafx.fxml;
    exports me.kevinmutis.ui;
}
