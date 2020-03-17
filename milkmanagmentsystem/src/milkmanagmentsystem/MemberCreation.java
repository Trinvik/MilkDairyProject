package milkmanagmentsystem;

import java.awt.BorderLayout;
import java.sql.Connection;
import java.sql.DriverManager;

import javax.swing.JOptionPane;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Set;
import java.awt.event.ActionEvent;
import javax.swing.event.AncestorListener;

import net.proteanit.sql.DbUtils;

import javax.swing.event.AncestorEvent;
import java.awt.Color;
import javax.swing.border.EtchedBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.MatteBorder;
import com.toedter.calendar.JDateChooser;
import javax.swing.JRadioButton;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;
import javax.swing.ImageIcon;
import javax.swing.border.BevelBorder;

public class MemberCreation extends JFrame {
	 private static final long serialVersionUID = 1;
	private JPanel contentPane;
	private JTextField textField;
	private JLabel lblNewLabel_3;
	private JTextField textField_3;
	private JLabel lblNewLabel_4;
	private JTextField textField_4;
	private JLabel lblNewLabel_5;
	private JTextField textField_5;
	private JButton btnNewButton;
	private JLabel lblNewLabel_6;
	private JTextField textField_6;
	private JLabel lblNewLabel_7;
	private JTextField textField_7;
	private JRadioButton Male;
	private JRadioButton Female;

	private 	JDateChooser DOB ;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MemberCreation frame = new MemberCreation();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	Connection connection=null;
	/**
	 * Create the frame.
	 */
	
	private JTable table;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	private JLabel lblNewLabel_8;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JLabel lblNewLabel_12;
	private JTextField textField_1;
	private JLabel lblNewLabel_14;
	private JLabel lblNewLabel_15;
	public MemberCreation() {
		setResizable(false);
		 connection=Dbconnection.dbconnect();
		setTitle("MILKMANAGEMENTSYSTEM");
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 890, 495);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(245, 255, 250));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Name:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(304, 67, 51, 14);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		textField.setBounds(359, 66, 140, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("DateOfBirth:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(24, 130, 83, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Gender:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(298, 130, 57, 14);
		contentPane.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("NomineeName:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(6, 100, 101, 19);
		contentPane.add(lblNewLabel_3);
		
		textField_3 = new JTextField();
		textField_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		textField_3.setBounds(113, 99, 140, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		lblNewLabel_4 = new JLabel("PanCard No:");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_4.setBounds(21, 166, 97, 14);
		contentPane.add(lblNewLabel_4);
		
		textField_4 = new JTextField();
		textField_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		textField_4.setBounds(113, 165, 140, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		lblNewLabel_5 = new JLabel("Phone No:");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_5.setBounds(287, 166, 68, 14);
		contentPane.add(lblNewLabel_5);
		
		textField_5 = new JTextField();
		textField_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		textField_5.setBounds(362, 165, 140, 20);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		btnNewButton = new JButton("SAVE");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			/*		String name=textField.getText();
				String place=textField_1.getText();
				String milkcardno=textField_2.getText();
				String accountno=textField_3.getText();
				String pancardno=textField_4.getText();
				String phoneno=textField_5.getText();
				String adharno=textField_6.getText();
				String MemberId=textField_7.getText();
				
				
				try {
                    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/MPS", "root", "root");

                    String query = "INSERT INTO member_creation values('" + MemberId + "','" + name + "','" + place + "','" + milkcardno + "','" +
                    		accountno + "','" + pancardno + "','" + phoneno+ "','" + adharno+ "')";

                    Statement sta = connection.createStatement();
                    
                    int x = sta.executeUpdate(query);
                    
                    if (x == 0) {
                        JOptionPane.showMessageDialog(btnNewButton, "This is alredy exist");
                    } else {
                        JOptionPane.showMessageDialog(btnNewButton,
                           "Your account is sucessfully created");
                        
                    }
                    connection.close();
                } catch (Exception exception) {
                    exception.printStackTrace();
                }*/
				
				SimpleDateFormat  sdf= new SimpleDateFormat("yyyy-MM-dd");
				String DateOfBirth=sdf.format(DOB.getDate());
				try
				{
					 String query = "INSERT INTO member_creation(MemberId,Name,DateOfBirth,Gender,NomineeName,Address,PanCardNO,AdharCardNo,BankName,AccountNo,IFSCCode,PhoneNo) values(?,?,?,?,?,?,?,?,?,?,?,?)";
					 PreparedStatement sta=connection.prepareStatement(query);
				
						sta.setString(1,textField_7.getText());
						sta.setString(2,textField.getText());
						String gender = null;
						if(Male.isSelected())
						{
						 gender = "M";
						}
						if(Female.isSelected())
						{
						 gender = "F";
						}
						
						sta.setString(4, gender);
						sta.setString(3, DateOfBirth);
						sta.setString(12, textField_5.getText());
						sta.setString(5,textField_3.getText());
						sta.setString(6,textField_1.getText());
						sta.setString(7,textField_4.getText());
						sta.setString(8,textField_6.getText());
						sta.setString(9,textField_8.getText());
						sta.setString(10,textField_10.getText());
						sta.setString(11,textField_9.getText());
						//sta.setString(12,textField_9.getText());
						
						sta.execute();
						JOptionPane.showConfirmDialog(null, "Saved Data");
						sta.close();
						textField_7.setText(" ");
						textField.setText("");
						textField_8.setText(" ");
						textField_4.setText(" ");
						textField_6.setText(" ");
						textField_10.setText(" ");
						textField_9.setText("");
						textField_5.setText(" ");
						textField_3.setText(" ");
						textField_1.setText(" ");
				}
				catch(Exception E) {
					JOptionPane.showConfirmDialog(null, "Some thing went Wrong");
					E.printStackTrace();
							
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton.setBounds(776, 211, 89, 23);
		contentPane.add(btnNewButton);
		
		lblNewLabel_6 = new JLabel("AadharNo:");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_6.setBounds(585, 166, 69, 14);
		contentPane.add(lblNewLabel_6);
		
		textField_6 = new JTextField();
		textField_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		textField_6.setBounds(662, 165, 140, 20);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		lblNewLabel_7 = new JLabel("MemberId:");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_7.setBounds(34, 62, 73, 14);
		contentPane.add(lblNewLabel_7);
		
		textField_7 = new JTextField();
		textField_7.setBounds(113, 61, 140, 20);
		contentPane.add(textField_7);
		textField_7.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(6, 202, 768, 243);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		JButton btnNewButton_1 = new JButton("view");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				try {
					String query="Select Sl_No,MemberId,Name,Gender,DateOfBirth,PanCardNo,AdharCardNo,BankName,AccountNo,IFSCCode,PhoneNo from member_creation";
					PreparedStatement sta=connection.prepareStatement(query);
					ResultSet rs=sta.executeQuery();
					table.setModel(DbUtils.resultSetToTableModel(rs));
					
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		});
		btnNewButton_1.setBounds(776, 409, 89, 23);
		contentPane.add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("DELETE");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				try {
					String query="delete from Member_Creation where MemberId='"+textField_7.getText()+"'";
					PreparedStatement sta=connection.prepareStatement(query);
					sta.execute();
					JOptionPane.showConfirmDialog(null, " Data Deleted");
			
				
					sta.close();
					textField_7.setText(" ");
					textField.setText("");
					textField_8.setText(" ");
					textField_4.setText(" ");
					textField_6.setText(" ");
					textField_10.setText(" ");
					textField_9.setText("");
					textField_5.setText(" ");
					textField_3.setText(" ");
					textField_1.setText(" ");
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_2.setBounds(776, 275, 89, 23);
		contentPane.add(btnNewButton_2);
		
		btnNewButton_3 = new JButton("UPDATE");
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 15)); 
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String G = null;
					if(Male.isSelected())
					{
					 G = "M";
					}
					if(Female.isSelected())
					{
					 G= "F";
					}
					String query="update  Member_Creation set MemberId= '"+textField_7.getText()+"' , Name= '"+textField.getText()+"', Gender= '"+G+"', BankName= '"+textField_8.getText()+"', PanCardNo= '"+textField_4.getText()+"', AdharCardNo= '"+textField_6.getText()+"', Accountno= '"+textField_10.getText()+"',IFSCCode= '"+textField_9.getText()+"', PhoneNo= '"+textField_5.getText()+"' where MemberId='"+textField_7.getText()+" '";
					PreparedStatement sta=connection.prepareStatement(query);
					sta.execute();
					JOptionPane.showConfirmDialog(null, " Data updated");
			
				
					sta.close();
					textField_7.setText(" ");
					textField.setText("");
					textField_8.setText(" ");
					textField_4.setText(" ");
					textField_6.setText(" ");
					textField_10.setText(" ");
					textField_9.setText("");
					textField_5.setText(" ");
					
				} catch (Exception ex) {
					// TODO Auto-generated catch block
					ex.printStackTrace();
				}
				
				
			}
			
		});
		btnNewButton_3.setBounds(776, 343, 89, 23);
		contentPane.add(btnNewButton_3);
		
		JLabel lblNewLabel_9 = new JLabel("Bank Name:");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_9.setBounds(569, 64, 89, 20);
		contentPane.add(lblNewLabel_9);
		
		textField_8 = new JTextField();
		textField_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		textField_8.setBounds(661, 66, 141, 20);
		contentPane.add(textField_8);
		textField_8.setColumns(10);
		
		JLabel lblNewLabel_10 = new JLabel("IFSC Code:");
		lblNewLabel_10.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_10.setBounds(575, 129, 83, 17);
		contentPane.add(lblNewLabel_10);
		
		textField_9 = new JTextField();
		textField_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		textField_9.setBounds(661, 129, 140, 20);
		contentPane.add(textField_9);
		textField_9.setColumns(10);
		
		JLabel lblNewLabel_11 = new JLabel("AccountNo:");
		lblNewLabel_11.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_11.setBounds(569, 105, 89, 14);
		contentPane.add(lblNewLabel_11);
		
		textField_10 = new JTextField();
		textField_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		textField_10.setBounds(661, 101, 140, 20);
		contentPane.add(textField_10);
		textField_10.setColumns(10);
		
		 DOB = new JDateChooser();
		DOB.addPropertyChangeListener(new PropertyChangeListener() {
			public void propertyChange(PropertyChangeEvent evt) {
				//DOB.setDateFormatString("dd-MM-yyyy");
				
			}
		});
		DOB.addAncestorListener(new AncestorListener() {
			public void ancestorAdded(AncestorEvent arg0) {
				
			}
			public void ancestorMoved(AncestorEvent arg0) {
			}
			public void ancestorRemoved(AncestorEvent arg0) {
			}
		});
		DOB.setBounds(113, 130, 140, 20);
		contentPane.add(DOB);
		
		Male = new JRadioButton("Male");
		Male.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Male.isSelected())
				{
					
					Female.setSelected(false);
				}
			}
		});
		Male.setFont(new Font("Tahoma", Font.PLAIN, 16));
		Male.setBounds(359, 126, 57, 23);
		contentPane.add(Male);
		
	 Female= new JRadioButton("Female");
		Female.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Female.isSelected())
				{
					
					 Male.setSelected(false);
				}
				
			}
		});
		Female.setFont(new Font("Tahoma", Font.PLAIN, 16));
		Female.setBounds(418, 126, 81, 23);
		contentPane.add(Female);
		
		lblNewLabel_12 = new JLabel("Address:");
		lblNewLabel_12.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_12.setBounds(289, 102, 68, 14);
		contentPane.add(lblNewLabel_12);
		
		textField_1 = new JTextField();
		textField_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		textField_1.setBounds(359, 101, 140, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		lblNewLabel_8 = new JLabel("MEMBER MASTER");
		lblNewLabel_8.setBounds(324, 11, 212, 25);
		contentPane.add(lblNewLabel_8);
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 22));
		
		lblNewLabel_14 = new JLabel("New label");
		lblNewLabel_14.setIcon(new ImageIcon(MemberCreation.class.getResource("/resources/resize-1584026781174196280MilkWallpapers02110.jpg")));
		lblNewLabel_14.setBounds(0, 0, 884, 466);
		contentPane.add(lblNewLabel_14);
		
		lblNewLabel_15 = new JLabel("New label");
		lblNewLabel_15.setBounds(0, 0, 884, 466);
		contentPane.add(lblNewLabel_15);
		//this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		
	}
}

