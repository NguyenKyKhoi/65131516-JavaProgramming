package edu.vn.com.khoi.codetuhoc;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class App extends Application {

	@Override
	public void start(Stage stage) {

		GridPane grid = new GridPane();
		grid.setHgap(20);
		grid.setVgap(5);
		Scene scene = new Scene(grid, 550, 450);

		Label lb1 = new Label("Hello World !");
		Button b1 = new Button("Nhấn ở đây !");
		TextField tf1 = new TextField();
		PasswordField pw1 = new PasswordField();
		CheckBox cb1 = new CheckBox("The World");
		RadioButton rb1 = new RadioButton("The End");
		ListView<CheckBox> list = new ListView<>();

//		b1.seton

		grid.add(lb1, 0, 0);
		grid.add(b1, 1, 0);
		grid.add(tf1, 0, 1);
		grid.add(pw1, 1, 1);
		grid.add(cb1, 0, 2);
		grid.add(rb1, 1, 2);
		grid.add(list, 0, 3);

		stage.setTitle("Hướng dẫn");
		stage.setScene(scene);
		stage.show();
	}

	public static void main(String[] args) {
		launch();
	}

	// equals()
	// toUpperCase()
	// remove(vitri)

//	btnAdd.setOnAction(e -> {
//        String noiDung = txtInput.getText(); // Lấy chữ từ TextField
//        
//        // .trim() để xóa khoảng trắng thừa ở 2 đầu. .isEmpty() để kiểm tra rỗng
//        if (!noiDung.trim().isEmpty()) { 
//            dataList.add(noiDung);  // Thêm vào danh sách
//            txtInput.clear();       // Xóa trắng TextField để tiện nhập chữ mới
//            txtInput.requestFocus();// Tự động nháy con trỏ chuột lại vào ô nhập
//        }
//    });

	// xóa cái dòng cần xóa trong list

//	btnDelete.setOnAction(e -> {
//	    // 1. Lấy vị trí dòng đang được chọn trên giao diện
//	    int viTriDangChon = listView.getSelectionModel().getSelectedIndex();
//
//	    // 2. Kiểm tra xem người dùng có thực sự đang chọn dòng nào không
//	    // (Nếu không chọn gì mà bấm xóa, hàm trên sẽ trả về -1)
//	    if (viTriDangChon >= 0) {
//	        dataList.remove(viTriDangChon); // Xóa đúng vị trí đó khỏi danh sách ngầm
//	    } else {
//	        System.out.println("Vui lòng chọn một mục để xóa!");
//	    }
//	});

//	// 1. Khai báo nút bấm
//	Button btnThem = new Button("Thêm");
//
//	// 2. Viết chức năng (Sự kiện khi nhấn nút)
//	btnThem.setOnAction(e -> {
//	    
//	    // Bước 1: Lấy dữ liệu từ ô nhập (TextField)
//	    String duLieu = txtNhap.getText(); 
//	    
//	    // Bước 2: Kiểm tra xem ô nhập có bị trống không
//	    if (!duLieu.isEmpty()) { 
//	        
//	        // Bước 3: Thêm dữ liệu vào danh sách 
//	        danhSach.add(duLieu); 
//	        
//	        // Bước 4: Xóa sạch chữ trong ô nhập để tiện gõ chữ mới
//	        txtNhap.clear(); 
//	    }
//	});

}