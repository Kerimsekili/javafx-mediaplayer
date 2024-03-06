module com.ks.mediaplayerwithfx {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.ks.mediaplayerwithfx to javafx.fxml;
    exports com.ks.mediaplayerwithfx;
}