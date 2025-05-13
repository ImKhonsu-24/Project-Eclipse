package bu;

import java.awt.EventQueue;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

public class Lab2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Lab2 frame = new Lab2();
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
	public Lab2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 300, 200);

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout()); // Đặt layout để căn giữa
		setContentPane(contentPane);
		
		JButton btnNewButton = new JButton("Exit");
		btnNewButton.setBackground(new Color(0, 0, 0)); // nền đen
		btnNewButton.setForeground(new Color(0, 0, 0)); // chữ đỏ

		// Thêm sự kiện thoát
		btnNewButton.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent e) {
				System.exit(0); // Thoát ứng dụng
			}
		});
		
		contentPane.add(btnNewButton, BorderLayout.CENTER); // Đặt ở giữa cửa sổ
	}
}
