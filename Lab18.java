package bu;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Color;

public class Lab18 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Lab18 frame = new Lab18();
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
	public Lab18() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(8, 8, 0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		contentPane.add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.BLACK);
		contentPane.add(panel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		contentPane.add(panel_2);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBackground(Color.BLACK);
		contentPane.add(panel_1_1);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.WHITE);
		contentPane.add(panel_3);
		
		JPanel panel_1_2 = new JPanel();
		panel_1_2.setBackground(Color.BLACK);
		contentPane.add(panel_1_2);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setBackground(Color.WHITE);
		contentPane.add(panel_2_1);
		
		JPanel panel_1_1_1 = new JPanel();
		panel_1_1_1.setBackground(Color.BLACK);
		contentPane.add(panel_1_1_1);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBackground(Color.BLACK);
		contentPane.add(panel_7);
		
		JPanel panel_1_6 = new JPanel();
		panel_1_6.setBackground(Color.WHITE);
		contentPane.add(panel_1_6);
		
		JPanel panel_2_5 = new JPanel();
		panel_2_5.setBackground(Color.BLACK);
		contentPane.add(panel_2_5);
		
		JPanel panel_1_1_5 = new JPanel();
		panel_1_1_5.setBackground(Color.WHITE);
		contentPane.add(panel_1_1_5);
		
		JPanel panel_3_4 = new JPanel();
		panel_3_4.setBackground(Color.BLACK);
		contentPane.add(panel_3_4);
		
		JPanel panel_1_2_4 = new JPanel();
		panel_1_2_4.setBackground(Color.WHITE);
		contentPane.add(panel_1_2_4);
		
		JPanel panel_2_1_4 = new JPanel();
		panel_2_1_4.setBackground(Color.BLACK);
		contentPane.add(panel_2_1_4);
		
		JPanel panel_1_1_1_4 = new JPanel();
		panel_1_1_1_4.setBackground(Color.WHITE);
		contentPane.add(panel_1_1_1_4);
		
		JPanel panel_4_1 = new JPanel();
		panel_4_1.setBackground(Color.WHITE);
		contentPane.add(panel_4_1);
		
		JPanel panel_1_3_1 = new JPanel();
		panel_1_3_1.setBackground(Color.BLACK);
		contentPane.add(panel_1_3_1);
		
		JPanel panel_2_2_1 = new JPanel();
		panel_2_2_1.setBackground(Color.WHITE);
		contentPane.add(panel_2_2_1);
		
		JPanel panel_1_1_2_1 = new JPanel();
		panel_1_1_2_1.setBackground(Color.BLACK);
		contentPane.add(panel_1_1_2_1);
		
		JPanel panel_3_1_1 = new JPanel();
		panel_3_1_1.setBackground(Color.WHITE);
		contentPane.add(panel_3_1_1);
		
		JPanel panel_1_2_1_1 = new JPanel();
		panel_1_2_1_1.setBackground(Color.BLACK);
		contentPane.add(panel_1_2_1_1);
		
		JPanel panel_2_1_1_1 = new JPanel();
		panel_2_1_1_1.setBackground(Color.WHITE);
		contentPane.add(panel_2_1_1_1);
		
		JPanel panel_1_1_1_1_1 = new JPanel();
		panel_1_1_1_1_1.setBackground(Color.BLACK);
		contentPane.add(panel_1_1_1_1_1);
		
		JPanel panel_5_1 = new JPanel();
		panel_5_1.setBackground(Color.BLACK);
		contentPane.add(panel_5_1);
		
		JPanel panel_1_4_1 = new JPanel();
		panel_1_4_1.setBackground(Color.WHITE);
		contentPane.add(panel_1_4_1);
		
		JPanel panel_2_3_1 = new JPanel();
		panel_2_3_1.setBackground(Color.BLACK);
		contentPane.add(panel_2_3_1);
		
		JPanel panel_1_1_3_1 = new JPanel();
		panel_1_1_3_1.setBackground(Color.WHITE);
		contentPane.add(panel_1_1_3_1);
		
		JPanel panel_3_2_1 = new JPanel();
		panel_3_2_1.setBackground(Color.BLACK);
		contentPane.add(panel_3_2_1);
		
		JPanel panel_1_2_2_1 = new JPanel();
		panel_1_2_2_1.setBackground(Color.WHITE);
		contentPane.add(panel_1_2_2_1);
		
		JPanel panel_2_1_2_1 = new JPanel();
		panel_2_1_2_1.setBackground(Color.BLACK);
		contentPane.add(panel_2_1_2_1);
		
		JPanel panel_1_1_1_2_1 = new JPanel();
		panel_1_1_1_2_1.setBackground(Color.WHITE);
		contentPane.add(panel_1_1_1_2_1);
		
		JPanel panel_6_1 = new JPanel();
		panel_6_1.setBackground(Color.WHITE);
		contentPane.add(panel_6_1);
		
		JPanel panel_1_5_1 = new JPanel();
		panel_1_5_1.setBackground(Color.BLACK);
		contentPane.add(panel_1_5_1);
		
		JPanel panel_2_4_1 = new JPanel();
		panel_2_4_1.setBackground(Color.WHITE);
		contentPane.add(panel_2_4_1);
		
		JPanel panel_1_1_4_1 = new JPanel();
		panel_1_1_4_1.setBackground(Color.BLACK);
		contentPane.add(panel_1_1_4_1);
		
		JPanel panel_3_3_1 = new JPanel();
		panel_3_3_1.setBackground(Color.WHITE);
		contentPane.add(panel_3_3_1);
		
		JPanel panel_1_2_3_1 = new JPanel();
		panel_1_2_3_1.setBackground(Color.BLACK);
		contentPane.add(panel_1_2_3_1);
		
		JPanel panel_2_1_3_1 = new JPanel();
		panel_2_1_3_1.setBackground(Color.WHITE);
		contentPane.add(panel_2_1_3_1);
		
		JPanel panel_1_1_1_3_1 = new JPanel();
		panel_1_1_1_3_1.setBackground(Color.BLACK);
		contentPane.add(panel_1_1_1_3_1);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(Color.BLACK);
		contentPane.add(panel_4);
		
		JPanel panel_1_3 = new JPanel();
		panel_1_3.setBackground(Color.WHITE);
		contentPane.add(panel_1_3);
		
		JPanel panel_2_2 = new JPanel();
		panel_2_2.setBackground(Color.BLACK);
		contentPane.add(panel_2_2);
		
		JPanel panel_1_1_2 = new JPanel();
		panel_1_1_2.setBackground(Color.WHITE);
		contentPane.add(panel_1_1_2);
		
		JPanel panel_3_1 = new JPanel();
		panel_3_1.setBackground(Color.BLACK);
		contentPane.add(panel_3_1);
		
		JPanel panel_1_2_1 = new JPanel();
		panel_1_2_1.setBackground(Color.WHITE);
		contentPane.add(panel_1_2_1);
		
		JPanel panel_2_1_1 = new JPanel();
		panel_2_1_1.setBackground(Color.BLACK);
		contentPane.add(panel_2_1_1);
		
		JPanel panel_1_1_1_1 = new JPanel();
		panel_1_1_1_1.setBackground(Color.WHITE);
		contentPane.add(panel_1_1_1_1);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(Color.WHITE);
		contentPane.add(panel_5);
		
		JPanel panel_1_4 = new JPanel();
		panel_1_4.setBackground(Color.BLACK);
		contentPane.add(panel_1_4);
		
		JPanel panel_2_3 = new JPanel();
		panel_2_3.setBackground(Color.WHITE);
		contentPane.add(panel_2_3);
		
		JPanel panel_1_1_3 = new JPanel();
		panel_1_1_3.setBackground(Color.BLACK);
		contentPane.add(panel_1_1_3);
		
		JPanel panel_3_2 = new JPanel();
		panel_3_2.setBackground(Color.WHITE);
		contentPane.add(panel_3_2);
		
		JPanel panel_1_2_2 = new JPanel();
		panel_1_2_2.setBackground(Color.BLACK);
		contentPane.add(panel_1_2_2);
		
		JPanel panel_2_1_2 = new JPanel();
		panel_2_1_2.setBackground(Color.WHITE);
		contentPane.add(panel_2_1_2);
		
		JPanel panel_1_1_1_2 = new JPanel();
		panel_1_1_1_2.setBackground(Color.BLACK);
		contentPane.add(panel_1_1_1_2);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(Color.BLACK);
		contentPane.add(panel_6);
		
		JPanel panel_1_5 = new JPanel();
		panel_1_5.setBackground(Color.WHITE);
		contentPane.add(panel_1_5);
		
		JPanel panel_2_4 = new JPanel();
		panel_2_4.setBackground(Color.BLACK);
		contentPane.add(panel_2_4);
		
		JPanel panel_1_1_4 = new JPanel();
		panel_1_1_4.setBackground(Color.WHITE);
		contentPane.add(panel_1_1_4);
		
		JPanel panel_3_3 = new JPanel();
		panel_3_3.setBackground(Color.BLACK);
		contentPane.add(panel_3_3);
		
		JPanel panel_1_2_3 = new JPanel();
		panel_1_2_3.setBackground(Color.WHITE);
		contentPane.add(panel_1_2_3);
		
		JPanel panel_2_1_3 = new JPanel();
		panel_2_1_3.setBackground(Color.BLACK);
		contentPane.add(panel_2_1_3);
		
		JPanel panel_1_1_1_3 = new JPanel();
		panel_1_1_1_3.setBackground(Color.WHITE);
		contentPane.add(panel_1_1_1_3);
	}

}
