/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pmhau.utils;

import javafx.scene.control.Alert;

/**
 *
 * @author admin
 */
public class AlertManager {
    private static AlertManager instance;
    private final Alert alert;
    
    private AlertManager(){
        alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText("Quizz App");
    }
    public static AlertManager getInstance(){
        if(instance == null)
            instance = new AlertManager();
        return instance;
    }
    public void showAlert(String msg){
        this.alert.setContentText(msg);
        this.alert.showAndWait();
    }
}
