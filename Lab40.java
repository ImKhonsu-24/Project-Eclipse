package bu;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener; // Thêm import này
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;

public class Lab40 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private int count = 0; // Thêm biến count để lưu số lần nhấn

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Lab40 frame = new Lab40();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Lab40() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 300, 200);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Count: 0");
		lblNewLabel.setBounds(90, 45, 100, 13);
		contentPane.add(lblNewLabel);

		JButton btnNewButton = new JButton("Click me");
		btnNewButton.setBounds(90, 76, 100, 21);
		contentPane.add(btnNewButton);

		// Thêm ActionListener cho nút
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count++; // Tăng biến đếm
				lblNewLabel.setText("Count: " + count); // Cập nhật text
			}
		});
	}
}
