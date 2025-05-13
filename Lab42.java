package bu;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.border.EmptyBorder;

public class Lab42 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Lab42 frame = new Lab42();
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
	public Lab42() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 300, 200);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		String[] colors = {"Red", "Blue", "Green", "Yellow", "Black"};
		JComboBox<String> comboBox = new JComboBox<>(colors);
		comboBox.setBounds(80, 70, 120, 30);
		contentPane.add(comboBox);

		// Xử lý sự kiện khi chọn màu
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String selectedColor = (String) comboBox.getSelectedItem();
				JOptionPane.showMessageDialog(Lab42.this, "You selected: " + selectedColor);
			}
		});
	}
}
