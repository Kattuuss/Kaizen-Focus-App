module com.kaizen.kaizenclient {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.kaizen.kaizenclient to javafx.fxml;
    exports com.kaizen.kaizenclient;
    exports com.kaizen.kaizenclient.controllers;
    opens com.kaizen.kaizenclient.controllers to javafx.fxml;
}