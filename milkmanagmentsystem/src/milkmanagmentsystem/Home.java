package milkmanagmentsystem;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import java.awt.Color;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.border.EtchedBorder;

import com.jtattoo.plaf.aero.AeroLookAndFeel;
import com.sun.xml.internal.fastinfoset.sax.Properties;

import javax.swing.JSeparator;
import javax.swing.border.BevelBorder;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;

public class Home extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel_1;

	/**
	 * Launch the application.
	 * @throws UnsupportedLookAndFeelException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 * @throws ClassNotFoundException 
	 */
	public static void main(String[] args)  {
		//UIManager.setLookAndFeel("com.jtatoo.plaf.aluminium.AluminiumLookAndFeel");
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home frame = new Home();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public void mainclass()
	{
		
	
	Thread clock=new Thread()
			{
					public void run()
					{
						try
						{
							while(true)
							{
						Calendar cal=new GregorianCalendar();
						int day=cal.get(Calendar.DATE);
						int month=cal.get(Calendar.MONTH);
						int year=cal.get(Calendar.YEAR);
						int second=cal.get(Calendar.SECOND);
						int minute=cal.get(Calendar.MINUTE);
						int hour=cal.get(Calendar.HOUR);
					lblNewLabel_1.setText("Time "+hour+":"+minute+":"+second+" Date  "+day+"/"+month+"/"+year);
					
							sleep(1000);
						}
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
			
			
			};
	clock.start();
	
	}
	
	/**
	 * Create the frame.
	 */
	public Home() {
	
		setFont(new Font("Dialog", Font.BOLD, 16));
		setTitle("DAIRY MANAGEMENT SYSTEM");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1383, 752);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(245, 255, 250));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		 contentPane.setLayout(null);
		
		 lblNewLabel_1 = new JLabel("New label");
		 lblNewLabel_1.setBounds(1065, 11, 292, 48);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Member Master");
		btnNewButton.setBackground(new Color(245, 255, 250));
		btnNewButton.addPropertyChangeListener(new PropertyChangeListener() {
			public void propertyChange(PropertyChangeEvent arg0) {
			}
		});
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MemberCreation m=new MemberCreation();
				m.setVisible(true);
			}
			
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton.setBounds(90, 79, 179, 54);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Milk Parameters");
		btnNewButton_1.setBackground(new Color(240, 255, 240));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				fatrange f=new fatrange();
				f.setVisible(true);
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnNewButton_1.setBounds(90, 163, 179, 54);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Milk Acquirement");
		btnNewButton_2.setBackground(new Color(240, 255, 240));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Procurement p=new Procurement();
				p.setVisible(true);
				
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnNewButton_2.setBounds(90, 258, 179, 54);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Feed Issue");
		btnNewButton_3.setBackground(new Color(240, 255, 240));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FeedIssue f= new FeedIssue();
				f.setVisible(true);
			}
		});
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnNewButton_3.setBounds(90, 361, 179, 54);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Advance Payment");
		btnNewButton_4.setBackground(new Color(240, 255, 240));
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdvancePayment ap=new AdvancePayment();
				ap.setVisible(true);
				
			}
		});
		btnNewButton_4.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnNewButton_4.setBounds(90, 458, 179, 60);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("Reports");
		btnNewButton_5.setBackground(new Color(240, 255, 240));
		btnNewButton_5.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				report r =new report();
				r.setVisible(true);
			}
		});
		btnNewButton_5.setBounds(90, 561, 179, 54);
		contentPane.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("Logout");
		btnNewButton_6.setBackground(new Color(240, 255, 240));
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int confirmValue = JOptionPane.showConfirmDialog(null, "Do you really want to Logout?");
				if(confirmValue == 0)
					System.exit(0);
			}
		});
		btnNewButton_6.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnNewButton_6.setBounds(90, 648, 179, 54);
		contentPane.add(btnNewButton_6);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(Home.class.getResource("/resources/output (10).png")));
		lblNewLabel.setBounds(271, 70, 1096, 643);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("MILK PRODUCER'S CO-OPERATIVE SOCIETY");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel_2.setBounds(382, 6, 614, 54);
		contentPane.add(lblNewLabel_2);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(224, 255, 255));
		panel.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel.setBounds(367, 0, 622, 72);
		contentPane.add(panel);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setIcon(new ImageIcon(Home.class.getResource("/resources/resize-15840117841576020353shree.jpg")));
		lblNewLabel_4.setBounds(0, 79, 91, 54);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setIcon(new ImageIcon(Home.class.getResource("/resources/resize-15840119441596331893logout.jpg")));
		lblNewLabel_5.setBounds(0, 648, 91, 54);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("New label");
		lblNewLabel_6.setIcon(new ImageIcon(Home.class.getResource("/resources/resize-1584012209542679441reports.png")));
		lblNewLabel_6.setBounds(0, 561, 91, 54);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("New label");
		lblNewLabel_7.setIcon(new ImageIcon(Home.class.getResource("/resources/resize-15840123681064559060payments.jpg")));
		lblNewLabel_7.setBounds(0, 458, 91, 60);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("New label");
		lblNewLabel_8.setIcon(new ImageIcon(Home.class.getResource("/resources/resize-1584012591117765084feed.gif")));
		lblNewLabel_8.setBounds(0, 363, 91, 52);
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("New label");
		lblNewLabel_9.setIcon(new ImageIcon(Home.class.getResource("/resources/resize-15840127011332999899cans.jpg")));
		lblNewLabel_9.setBounds(0, 258, 91, 54);
		contentPane.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("New label");
		lblNewLabel_10.setIcon(new ImageIcon(Home.class.getResource("/resources/resize-1584013023562252304clr.jpg")));
		lblNewLabel_10.setBounds(0, 163, 91, 54);
		contentPane.add(lblNewLabel_10);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setIcon(new ImageIcon(Home.class.getResource("/resources/resize-15840150081082620365hh.jpg")));
		lblNewLabel_3.setBounds(0, 0, 1367, 68);
		contentPane.add(lblNewLabel_3);
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		 mainclass();

		
	}
	}





