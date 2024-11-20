module dk.easv.demo16 {
    requires javafx.controls;
    requires javafx.fxml;


    opens dk.easv.demo16 to javafx.fxml;
    exports dk.easv.demo16;
}