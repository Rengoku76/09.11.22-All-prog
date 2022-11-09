module com.example.lab10bel {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.lab10bel to javafx.fxml;
    exports com.example.lab10bel;
}