package com.khoi.huongdan;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class App extends Application {
	@Override
	public void start(Stage stage) {

		Label lblTitle = new Label("FORM NHẬP LIỆU NÂNG CAO");
		lblTitle.setStyle("-fx-font-weight: bold; -fx-font-size: 16px;");

		// 1-2. Vẫn dùng TextField thông thường cho Tên
		TextField txtName = new TextField();
		txtName.setPromptText("Nhập tên công việc...");

		// --- CÁC THÀNH PHẦN MỚI TỪ 5 ĐẾN 10 ---

		// 5. PasswordField (Ô nhập mật khẩu)
		PasswordField txtPass = new PasswordField();
		txtPass.setPromptText("Nhập mã bí mật (ẩn chữ)...");

		// 6. ComboBox (Danh sách xổ xuống)
		ComboBox<String> cbCategory = new ComboBox<>();
		cbCategory.getItems().addAll("Học tập", "Làm việc", "Thể thao");
		cbCategory.setPromptText("Chọn danh mục");

		// 7. CheckBox (Hộp kiểm vuông)
		CheckBox chkUrgent = new CheckBox("Đánh dấu là Khẩn cấp");

		// 8. RadioButton (Nút tròn chọn 1 trong nhiều)
		RadioButton rbEasy = new RadioButton("Dễ");
		RadioButton rbHard = new RadioButton("Khó");

		// Phải đưa RadioButton vào ToggleGroup để chúng tự loại trừ nhau (Chỉ được chọn
		// 1)
		ToggleGroup difficultyGroup = new ToggleGroup();
		rbEasy.setToggleGroup(difficultyGroup);
		rbHard.setToggleGroup(difficultyGroup);
		rbEasy.setSelected(true); // Đặt mặc định chọn "Dễ"

		HBox hboxRadio = new HBox(15, new Label("Độ khó: "), rbEasy, rbHard);
		hboxRadio.setAlignment(Pos.CENTER);

		// 9. DatePicker (Bộ chọn ngày tháng)
//		DatePicker datePicker = new DatePicker();
//		datePicker.setPromptText("Chọn ngày hoàn thành (Deadline)");

		// Nút lưu thông tin
		Button btnSave = new Button("Lưu Thông Tin");

		// 10. Alert (Hộp thoại thông báo Pop-up)
		btnSave.setOnAction(e -> {
			// Khi bấm nút, tạo một hộp thoại thông báo thành công
			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setTitle("Thông báo");
			alert.setHeaderText("Đã lưu thành công!");

			// Nối dữ liệu để in ra xem thử
			String info = "Tên: " + txtName.getText() + "\n" + "Khẩn cấp: " + (chkUrgent.isSelected() ? "Có" : "Không");
			alert.setContentText(info);

			// Hiển thị hộp thoại lên
//			alert.showAndWait();
		});

		// Đưa tất cả vào VBox
		VBox root = new VBox(15); // Khoảng cách 15px
		root.setPadding(new Insets(20));
		root.setAlignment(Pos.CENTER);

		root.getChildren().addAll(lblTitle, txtName, txtPass, cbCategory, chkUrgent, hboxRadio, btnSave); // datePicker,

		// Thiết lập Scene
		Scene scene = new Scene(root, 400, 450); // Chiều cao 450 để chứa đủ đồ

		stage.setTitle("Minh họa 10 Controls JavaFX");
		stage.setScene(scene);
		stage.show();
	}

	public static void main(String[] args) {
		launch();
	}

}