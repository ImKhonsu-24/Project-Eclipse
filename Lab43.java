package bu;

import java.awt.EventQueue;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Lab43 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(() -> {
			try {
				Lab43 frame = new Lab43();
				frame.setVisible(true);
			} catch (Exception e) {
				e.printStackTrace();
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Lab43() {
		setTitle("Confirm on Close");
		setBounds(100, 100, 400, 300);
		setDefaultCloseOperation(DO_NOTHING_ON_CLOSE); 

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		// Thêm WindowListener
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				int result = JOptionPane.showConfirmDialog(
					Lab43.this,
					"Are you sure you want to exit?",
					"Confirm Exit",
					JOptionPane.YES_NO_OPTION
				);

				if (result == JOptionPane.YES_OPTION) {
					System.exit(0);
				}
			}
		});
	}
}
