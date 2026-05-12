package com.nguyenkykhoi.ToDoList_App;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ListView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * JavaFX App
 */
public class App extends Application {

	@Override
	public void start(Stage primaryStage) {
		// 1. Tạo một ListView, khai báo luôn là nó sẽ chứa các CheckBox
		ListView<CheckBox> listView = new ListView<>();

		// 2. Tạo trực tiếp các nút CheckBox
		CheckBox task1 = new CheckBox("Học giao diện JavaFX");
		CheckBox task2 = new CheckBox("Ôn tập C#");
		task2.setSelected(true); // Thử cho cái này được tích sẵn
		CheckBox task3 = new CheckBox("Làm To-Do List");

		// 3. Ném các CheckBox đó vào ListView
		listView.getItems().addAll(task1, task2, task3);

		// 4. Đưa ListView vào Layout và hiển thị
		VBox root = new VBox(10);
		root.getChildren().add(listView);

		Scene scene = new Scene(root, 300, 400);
		primaryStage.setTitle("To-Do List Đơn Giản");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}