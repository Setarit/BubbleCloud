package com.setarit.bubblecloud.controller;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class StartupController implements ViewController{	
	private Stage stage;
	private BorderPane rootLayout;

	public StartupController(Stage primaryStage) {
		this.stage = primaryStage;		
	}

	public void show(){
		showWindow();
		showConfigurationPanel();
		showSetaritPanel();
	}

	private void showSetaritPanel() {
		try {
            // Load configuration panel
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(StartupController.class.getResource("../view/SetaritPanel.fxml"));
            HBox setaritPanelRoot = (HBox) loader.load();            
            
            // Set person overview into the center of root layout.
            rootLayout.setBottom(setaritPanelRoot);            
        } catch (IOException e) {
            e.printStackTrace();
        }
	}

	private void showConfigurationPanel() {
		try {
            // Load configuration panel
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(StartupController.class.getResource("../view/ConfigurationPanel.fxml"));
            AnchorPane configurationPanelRoot = (AnchorPane) loader.load();

            // Set person overview into the center of root layout.
            rootLayout.setCenter(configurationPanelRoot);
        } catch (IOException e) {
            e.printStackTrace();
        }
	}

	private void showWindow() {
		try {
            // Load root layout from fxml file.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(StartupController.class.getResource("../view/WindowPanel.fxml"));
            rootLayout = (BorderPane) loader.load();

            // Show the scene containing the root layout.
            Scene scene = new Scene(rootLayout);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
	}
}
