module com.lincy.beroepsProduct2een {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.lin.beroepsproduct2een to javafx.fxml;
    exports com.example.beroepsproduct2een;
}