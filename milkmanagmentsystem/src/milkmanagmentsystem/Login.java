package milkmanagmentsystem;

import java.awt.EventQueue;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Image;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import javafx.scene.control.ComboBox;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import javax.swing.JComboBox;

public class Login extends JFrame {

	private JFrame frmMps;
	private JTextField text1;
	private JPasswordField text2;

	
	public static void main(String[] args) {
		splashscreen sh=new splashscreen();
		sh.setVisible(true);
		sh.setLocationRelativeTo(null);
		try
		{
			for(int i=0;i<100;i++)
			{
				Thread.sleep(30);
			}
			sh.setVisible(false);
			
		}
		catch(Exception e) {
			
		}
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				
				try {
					Login window = new Login();
					window.frmMps.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Login() {
		initialize();
		
	
			}
	

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMps = new JFrame();
		frmMps.setResizable(false);
		frmMps.setFont(new Font("Dialog", Font.BOLD, 12));
		frmMps.setTitle("DAIRY MANAGEMENT SYSTEM");
		frmMps.setBounds(100, 100, 719, 364);
		frmMps.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMps.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Enter Username");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(30, 77, 130, 41);
		frmMps.getContentPane().add(lblNewLabel);
		
		text1 = new JTextField();
		text1.setBounds(170, 89, 117, 20);
		frmMps.getContentPane().add(text1);
		text1.setColumns(10);
		
		JComboBox<String> comboBox = new JComboBox<String>();
		//comboBox.addItem("..Select..");
		comboBox.addItem("Admin");
		comboBox.addItem("user");
		
	
		
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		comboBox.setBounds(170, 194, 117, 20);
		frmMps.getContentPane().add(comboBox);
		
		JLabel lblNewLabel_1 = new JLabel("Enter Password");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(30, 153, 130, 14);
		frmMps.getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String str=text1.getText().toString();
				String str1=text2.getText().toString();
				String str2=(String) comboBox.getSelectedItem().toString();
				System.out.println(str2);
				if(str.equalsIgnoreCase("mps")&&str1.equals("user")&&str2.equalsIgnoreCase("user"))
				{
				JOptionPane.showMessageDialog(null, "LOGIN SUCCESSFULL!!!");
				Home h=new Home();
				h.setVisible(true);
				
				}	
				else if(str.equalsIgnoreCase("mps")&&str1.equals("user")&&str2.equalsIgnoreCase("admin"))
				{
					SocietyCreation s=new SocietyCreation();
					s.setVisible(true);
				}
			
			
				else
				{
					JOptionPane.showMessageDialog(null, "Please check your name and Password","Invalid username/password",JOptionPane.WARNING_MESSAGE);
					text1.setText(" ");
					text2.setText("");
					text1.requestFocus();
					
				}
				
				
			}
			}
		);
		btnNewButton.setBounds(103, 247, 89, 23);
		frmMps.getContentPane().add(btnNewButton);
		
		text2 = new JPasswordField();
		text2.setBounds(170, 150, 117, 20);
		frmMps.getContentPane().add(text2);
		
		JLabel lblNewLabel_2 = new JLabel("SIGN IN");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_2.setBounds(135, 11, 101, 28);
		frmMps.getContentPane().add(lblNewLabel_2);
		
		JButton btnNewButton_1 = new JButton("Exit");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int confirmValue = JOptionPane.showConfirmDialog(null, "Do you really want to exit?");
				//System.out.println(confirmValue);
				if(confirmValue == 0)
				System.exit(0);
				if(confirmValue==1)
					text1.requestFocus();
				if(confirmValue == 2)
					text1.requestFocus();
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_1.setBounds(317, 247, 89, 23);
		frmMps.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel_5 = new JLabel("Type");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_5.setBounds(103, 188, 46, 28);
		frmMps.getContentPane().add(lblNewLabel_5);
		
		
		
		JButton btnNewButton_2 = new JButton("Clear");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				text1.setText(" ");
				text2.setText("");
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_2.setBounds(213, 247, 89, 23);
		frmMps.getContentPane().add(btnNewButton_2);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setIcon(new ImageIcon(Login.class.getResource("/resources/output (8).png")));
		lblNewLabel_3.setBounds(0, 0, 713, 335);
		frmMps.getContentPane().add(lblNewLabel_3);
		
	}
}
