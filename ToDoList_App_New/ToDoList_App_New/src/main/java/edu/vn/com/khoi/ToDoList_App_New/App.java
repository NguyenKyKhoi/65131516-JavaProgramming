package edu.vn.com.khoi.ToDoList_App_New;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * JavaFX App
 */
public class App extends Application {

	@Override
	public void start(Stage primaryStage) {

		GridPane grid = new GridPane();
		grid.setHgap(20);
		grid.setVgap(5);

		Scene scene = new Scene(grid, 550, 450);

		// Tạo nút thêm
		Button button = new Button("Add Task");

		// Tạo nút xóa
		Button deleteButton = new Button("Delete Task");

		// Tạo chỗ nhập
		TextField TFinput = new TextField();

		// cho nút và chỗ nhập vào 1 chỗ ngang hàng
		HBox hbox = new HBox(5);
		hbox.getChildren().addAll(button, TFinput);

		// Tạo danh sách
		ListView<CheckBox> List = new ListView<>();

		// danh sách đã xong
		ListView<CheckBox> listDone = new ListView<>();

		Text tDone = new Text("Task Done");

		// Thêm sự kiện khi nhấn
		button.setOnAction(e -> {
			String text = TFinput.getText();
			if (!text.isEmpty()) {
				CheckBox checkBox = new CheckBox(text);

				checkBox.setOnAction(ecb -> {
					if (checkBox.isSelected()) {
						List.getItems().remove(checkBox);
						listDone.getItems().add(checkBox);
					} else {
						listDone.getItems().remove(checkBox);
						List.getItems().add(checkBox);
					}
				});

				List.getItems().add(checkBox);
				TFinput.clear();
			}
		});

		// thêm sự kiện khi nhấn nút xóa
		deleteButton.setOnAction(d -> {
			CheckBox selectionInList = List.getSelectionModel().getSelectedItem();
			CheckBox selectionInDone = listDone.getSelectionModel().getSelectedItem();
			if (selectionInList != null) {
				List.getItems().remove(selectionInList);
			} else if (selectionInDone != null) {
				listDone.getItems().remove(selectionInDone);
			}
		});

		grid.add(hbox, 0, 0);
		grid.add(List, 0, 1);
		grid.add(tDone, 1, 0);
		grid.add(listDone, 1, 1);
		grid.add(deleteButton, 0, 2);

		primaryStage.setTitle("To Do List App");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}