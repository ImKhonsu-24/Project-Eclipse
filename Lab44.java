package bu;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSlider;
import javax.swing.JLabel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Lab44 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(() -> {
			try {
				Lab44 frame = new Lab44();
				frame.setVisible(true);
			} catch (Exception e) {
				e.printStackTrace();
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Lab44() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 200);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		// JLabel mẫu
		JLabel lblNewLabel = new JLabel("Sample text");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 20)); // Font ban đầu
		lblNewLabel.setBounds(140, 30, 150, 30);
		contentPane.add(lblNewLabel);

		// Slider điều chỉnh cỡ chữ
		JSlider slider = new JSlider();
		slider.setMinimum(10);
		slider.setMaximum(50);
		slider.setValue(20); // Giá trị khởi đầu
		slider.setBounds(49, 81, 280, 50);
		contentPane.add(slider);

		// ChangeListener để đổi font theo slider
		slider.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				int size = slider.getValue();
				lblNewLabel.setFont(new Font("Arial", Font.PLAIN, size));
			}
		});
	}
}
