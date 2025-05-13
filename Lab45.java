package bu;

import java.awt.EventQueue;
import javax.swing.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Lab45 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(() -> {
			try {
				Lab45 frame = new Lab45();
				frame.setVisible(true);
			} catch (Exception e) {
				e.printStackTrace();
			}
		});
	}

	public Lab45() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 400);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);

		// Checkbox
		JCheckBox chkShowImage = new JCheckBox("Show Image");
		chkShowImage.setBounds(140, 20, 120, 25);
		contentPane.add(chkShowImage);

		// Image Label
		JLabel lblImage = new JLabel();
		lblImage.setBounds(100, 60, 200, 250); // chỉnh size cho phù hợp với ảnh
		ImageIcon icon = new ImageIcon("hehe.png"); // Thay tên file nếu cần
		lblImage.setIcon(icon);
		lblImage.setVisible(false); // ban đầu ẩn
		contentPane.add(lblImage);

		// Bật/tắt ảnh khi checkbox thay đổi
		chkShowImage.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				lblImage.setVisible(chkShowImage.isSelected());
			}
		});
	}
}
