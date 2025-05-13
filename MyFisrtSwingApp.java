package bu;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class MyFisrtSwingApp extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyFisrtSwingApp frame = new MyFisrtSwingApp();
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
	public MyFisrtSwingApp() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 500);

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout()); // Thêm dòng này để dùng BorderLayout

		setContentPane(contentPane);

		JLabel lblNewLabel = new JLabel("Hello World", SwingConstants.CENTER); // Căn giữa theo chiều ngang
		lblNewLabel.setVerticalAlignment(SwingConstants.CENTER); // Căn giữa theo chiều dọc

		contentPane.add(lblNewLabel, BorderLayout.CENTER); // Thêm vào CENTER để nằm giữa
	}
}
