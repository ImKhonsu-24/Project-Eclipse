package bu;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Color;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class Lab3 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtname;
	private JButton btncheck;
	private JTextField textnumber;
	private JTextField textdate;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Lab3 frame = new Lab3();
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
	public Lab3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		txtname = new JTextField();
		txtname.setBounds(89, 41, 166, 19);
		txtname.setColumns(10);
		
		textnumber = new JTextField();
		textnumber.setBounds(89, 62, 166, 19);
		textnumber.setColumns(10);
		
		textdate = new JTextField();
		textdate.setBounds(89, 86, 166, 19);
		
		JLabel lblNewLabel = new JLabel("Họ Tên");
		lblNewLabel.setBounds(34, 42, 45, 13);
		
		JLabel lblNewLabel_1 = new JLabel("Mã SV");
		lblNewLabel_1.setBounds(34, 65, 45, 13);
		
		JTextArea textcomment = new JTextArea();
		textcomment.setBounds(89, 156, 166, 97);
		contentPane.add(textcomment);
		
		JLabel lblNewLabel_2 = new JLabel("Nội dung");
		lblNewLabel_2.setBounds(34, 152, 45, 13);
		contentPane.setLayout(null);
		contentPane.add(lblNewLabel);
		contentPane.add(lblNewLabel_1);
		contentPane.add(lblNewLabel_2);
		contentPane.add(txtname);
		contentPane.add(btncheck);
		contentPane.add(textnumber);
		
		JLabel lblNewLabel_3 = new JLabel("Ngày sinh");
		lblNewLabel_3.setBounds(34, 88, 45, 13);
		contentPane.add(lblNewLabel_3);
		
		btncheck = new JButton("OK");
		btncheck.setForeground(new Color(0, 0, 0));
		btncheck.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String hoten = txtname.getText();
				String msv = textnumber.getText();
				String ngaysinh = textdate.getText();
				String hienthi = "Ho ten" + hoten + "\nMasv" + msv + "Ngay sinh" + ngaysinh;
				textcomment.setText(hienthi);
			}
		});
		

		

		btncheck.setBounds(89, 115, 45, 21);
		btncheck.setBackground(new Color(255, 255, 0));
		contentPane.add(textdate);
		textdate.setColumns(10);
		

	}
}
