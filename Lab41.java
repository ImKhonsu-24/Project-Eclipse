package bu;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener; // Thêm import
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;

public class Lab41 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Lab41 frame = new Lab41();
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
	public Lab41() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton btnNewButton = new JButton("Open Dialog");
		btnNewButton.setBounds(140, 110, 120, 30);
		contentPane.add(btnNewButton);

		// Thêm ActionListener để mở dialog
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JDialog dialog = new JDialog(Lab41.this, "My Dialog", true); // true = modal
				dialog.setSize(200, 150);
				dialog.setLocationRelativeTo(Lab41.this); // căn giữa cửa sổ chính

				JPanel panel = new JPanel();
				dialog.getContentPane().add(panel);
				panel.setLayout(null);

				JLabel label = new JLabel("Dialog Opened");
				label.setBounds(50, 50, 100, 20);
				panel.add(label);

				dialog.setVisible(true); // Hiển thị dialog
			}
		});
	}
}
