package com.nguyenkykhoi.ToDoList_App;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class App extends Application {
	@Override
	public void start(Stage primaryStage) {

		GridPane grid = new GridPane();
		grid.setHgap(5);
		grid.setVgap(5);

		Scene scene = new Scene(grid, 400, 300);

		// Tạo nút thêm
		Button btn = new Button("Click me");

		// Tạo chỗ nhập
		TextField TFinput = new TextField();

		// Tạo danh sách
		ListView<String> List = new ListView<>();

		grid.add(btn, 0, 0);
		grid.add(TFinput, 0, 0);
		grid.add(List, 0, 1);

		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}