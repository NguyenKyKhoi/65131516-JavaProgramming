package com.nguyenkykhoi.ToDoList_App;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
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

		// cho nút và chỗ nhập vào 1 chỗ ngang hàng
		HBox hbox = new HBox(5);
		hbox.getChildren().addAll(btn, TFinput);

		// Tạo danh sách
		ListView<CheckBox> List = new ListView<>();

		// Thêm sự kiện khi nhấn
		btn.setOnAction(e -> {
			String text = TFinput.getText();
			if (!text.isEmpty()) {
				CheckBox checkBox = new CheckBox(text);
				List.getItems().add(checkBox);
				TFinput.clear();
			}
		});

		grid.add(hbox, 0, 0);
		grid.add(List, 0, 1);

		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}