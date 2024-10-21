module com.example.ssdp {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.ssdp to javafx.fxml;
    exports com.example.ssdp;
}