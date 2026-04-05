package myproject;

import java.util.ArrayList;

public class TaskManager {
	private ArrayList<Task> taskList;

	public TaskManager() {
		taskList = new ArrayList<>();
	}

	// Thêm công việc
	public void addTask(String description) {
		taskList.add(new Task(description));
	}

	// Xóa công việc theo vị trí
	public void removeTask(int index) {
		if (index >= 0 && index < taskList.size()) {
			taskList.remove(index);
		}
	}

	// Đảo ngược trạng thái hoàn thành của công việc
	public void toggleTaskCompletion(int index) {
		if (index >= 0 && index < taskList.size()) {
			Task task = taskList.get(index);
			task.setCompleted(!task.isCompleted());
		}
	}

	// Lấy toàn bộ danh sách
	public ArrayList<Task> getTasks() {
		return taskList;
	}
}
