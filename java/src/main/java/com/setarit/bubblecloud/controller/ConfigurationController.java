package com.setarit.bubblecloud.controller;

import com.setarit.bubblecloud.model.LocalPathWrapper;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableColumn.CellDataFeatures;
import javafx.scene.control.TableView;
import javafx.scene.layout.BorderPane;
import javafx.util.Callback;

/**
 * Controller for the ConfigurationPanel
 * @author Setarit
 *
 */
public class ConfigurationController {

	@FXML
	private BorderPane authenticationRequiredErrorMessage;
	@FXML
	private TableView<LocalPathWrapper> syncPathTable;
	@FXML
	private TableColumn<LocalPathWrapper, Boolean> activatedColumn;
	@FXML
	private TableColumn<LocalPathWrapper, String> pathColumn;
	
	/**
	 * Called automatically
	 */
	@FXML
	private void initialize(){
		pathColumn.setCellValueFactory(new Callback<CellDataFeatures<LocalPathWrapper, String>, ObservableValue<String>>() {
			public ObservableValue<String> call(CellDataFeatures<LocalPathWrapper, String> cellValue) {
				return new SimpleStringProperty(cellValue.getValue().getPath().toString());
			}
		});
		activatedColumn.setCellValueFactory(new Callback<CellDataFeatures<LocalPathWrapper, Boolean>, ObservableValue<Boolean>>() {
			public ObservableValue<Boolean> call(CellDataFeatures<LocalPathWrapper, Boolean> cellValue) {
				return cellValue.getValue().isActivated();
			}
		});
		
		authenticationRequiredErrorMessage.setVisible(false);
	}
	
}
