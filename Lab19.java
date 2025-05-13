package bu;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;

public class Lab19 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Lab19 frame = new Lab19();
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
	public Lab19() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		
		JTabbedPane tabbedPane_1 = new JTabbedPane(JTabbedPane.TOP);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addComponent(tabbedPane, GroupLayout.DEFAULT_SIZE, 456, Short.MAX_VALUE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(73)
							.addComponent(tabbedPane_1, GroupLayout.PREFERRED_SIZE, 379, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(tabbedPane, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
					.addGap(101)
					.addComponent(tabbedPane_1, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(89, Short.MAX_VALUE))
		);
		
		JLabel lblNewLabel_3 = new JLabel("123");
		tabbedPane_1.addTab("Home", null, lblNewLabel_3, null);
		
		JLabel label_1 = new JLabel("456");
		tabbedPane_1.addTab("Profile", null, label_1, null);
		
		JLabel lblNewLabel_4 = new JLabel("789");
		tabbedPane_1.addTab("Setting", null, lblNewLabel_4, null);
		
		JLabel lblNewLabel = new JLabel("Biu");
		tabbedPane.addTab("Home", null, lblNewLabel, null);
		
		JLabel label = new JLabel("Buoi");
		tabbedPane.addTab("Profile", null, label, null);
		
		JLabel lblNewLabel_1 = new JLabel("Lon");
		tabbedPane.addTab("Setting", null, lblNewLabel_1, null);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		tabbedPane.addTab("New tab", null, lblNewLabel_2, null);
		contentPane.setLayout(gl_contentPane);
	}
}
