package myproject;

public class Task {
	private String description;
	private boolean isCompleted;

	// Hàm khởi tạo (Constructor)
	public Task(String description) {
		this.description = description;
		this.isCompleted = false; // Mặc định là chưa hoàn thành
	}

	// Các Getters và Setters
	public String getDescription() {
		return description;
	}

	public boolean isCompleted() {
		return isCompleted;
	}

	public void setCompleted(boolean completed) {
		isCompleted = completed;
	}

	// Ghi đè phương thức toString để hiển thị lên giao diện
	@Override
	public String toString() {
		return (isCompleted ? "[X] " : "[ ] ") + description;
	}
}
