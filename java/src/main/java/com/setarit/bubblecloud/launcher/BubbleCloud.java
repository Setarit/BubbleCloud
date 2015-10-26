package com.setarit.bubblecloud.launcher;

import com.setarit.bubblecloud.controller.StartupController;
import com.setarit.bubblecloud.controller.ViewController;

import javafx.application.Application;
import javafx.stage.Stage;

public class BubbleCloud extends Application{
	
	
	public static void main(String[] args){
		launch(args);//launch javafx
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("BubbleCloud - Setarit");
		ViewController startupController = new StartupController(primaryStage);
		startupController.show();
	}	
	
}
