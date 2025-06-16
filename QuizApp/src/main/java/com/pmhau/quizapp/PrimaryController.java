package com.pmhau.quizapp;

import com.pmhau.utils.AlertManager;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class PrimaryController {
    public void handleJoin(ActionEvent event) throws IOException{
        Scene s = new Scene(new FXMLLoader(App.class.getResource("questions.fxml")).load());
        
        Stage stage = App.s;
        stage.setScene(s);
        stage.showAndWait();
    }
    public void handleResult(ActionEvent event){
        AlertManager.getInstance().showAlert("Result: Comming soon...");
    }
}
