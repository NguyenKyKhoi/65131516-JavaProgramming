package myproject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class ToDoListGUI extends JFrame {
    private TaskManager manager;
    private DefaultListModel<String> listModel;
    private JList<String> taskJList;
    private JTextField taskInput;

    public ToDoListGUI() {
        manager = new TaskManager(); // Khởi tạo bộ xử lý logic

        // 1. Cài đặt Cửa sổ chính
        setTitle("Dự án To-Do List");
        setSize(700, 700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout(10, 10));

        // 2. Khu vực hiển thị danh sách (Ở giữa)
        listModel = new DefaultListModel<>();
        taskJList = new JList<>(listModel);
        taskJList.setFont(new Font("Arial", Font.PLAIN, 16));
        JScrollPane scrollPane = new JScrollPane(taskJList);
        add(scrollPane, BorderLayout.CENTER);

        // 3. Khu vực nhập liệu (Phía trên)
        JPanel inputPanel = new JPanel(new BorderLayout(5, 5));
        taskInput = new JTextField();
        taskInput.setFont(new Font("Arial", Font.PLAIN, 16));
        JButton addButton = new JButton("Thêm công việc");
        
        inputPanel.add(taskInput, BorderLayout.CENTER);
        inputPanel.add(addButton, BorderLayout.EAST);
        add(inputPanel, BorderLayout.NORTH);

        // 4. Khu vực chức năng (Phía dưới)
        JPanel actionPanel = new JPanel(new FlowLayout());
        JButton completeButton = new JButton("Đổi trạng thái (Xong/Chưa xong)");
        JButton deleteButton = new JButton("Xóa công việc");

        actionPanel.add(completeButton);
        actionPanel.add(deleteButton);
        add(actionPanel, BorderLayout.SOUTH);

        // 5. Bắt sự kiện cho nút Thêm
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = taskInput.getText().trim();
                if (!text.isEmpty()) {
                    manager.addTask(text);
                    updateListUI(); // Cập nhật lại giao diện
                    taskInput.setText(""); // Xóa rỗng ô nhập liệu
                } else {
                    JOptionPane.showMessageDialog(ToDoListGUI.this, "Vui lòng nhập nội dung!");
                }
            }
        });

        // 6. Bắt sự kiện cho nút Đổi trạng thái
        completeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedIndex = taskJList.getSelectedIndex();
                if (selectedIndex != -1) {
                    manager.toggleTaskCompletion(selectedIndex);
                    updateListUI();
                } else {
                    JOptionPane.showMessageDialog(ToDoListGUI.this, "Hãy chọn 1 công việc trên danh sách để cập nhật!");
                }
            }
        });

        // 7. Bắt sự kiện cho nút Xóa
        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedIndex = taskJList.getSelectedIndex();
                if (selectedIndex != -1) {
                    manager.removeTask(selectedIndex);
                    updateListUI();
                } else {
                    JOptionPane.showMessageDialog(ToDoListGUI.this, "Hãy chọn 1 công việc trên danh sách để xóa!");
                }
            }
        });
    }

    // Hàm lấy dữ liệu từ TaskManager và vẽ lại lên giao diện
    private void updateListUI() {
        listModel.clear();
        ArrayList<Task> tasks = manager.getTasks();
        for (Task t : tasks) {
            listModel.addElement(t.toString());
        }
    }

    // Chạy chương trình
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ToDoListGUI().setVisible(true);
            }
        });
    }
}