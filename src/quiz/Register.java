package quiz;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EtchedBorder;

public class Register  implements ActionListener{
	Font font = new Font("Times New Roman",Font.PLAIN,18);
	
	JFrame frame = new JFrame();
	
	JPanel Register_panel = new JPanel();
	
	JLabel toplabel = new JLabel();
	JLabel firstname_label = new JLabel();
	JLabel lastname_label = new JLabel();
	JLabel age_label = new JLabel();
	JLabel faculty_label = new JLabel();
	JLabel Contact_label = new JLabel();
	JLabel user_name = new JLabel();
	JLabel password_label = new JLabel();
	JLabel confirm_password_label = new JLabel();
	JLabel label_back = new JLabel();
	JLabel time = new JLabel();
	
	
	JTextField firstname = new JTextField();
	JTextField lastname = new JTextField();
	JTextField age = new JTextField();
	JTextField contact = new JTextField();
	JTextField Username = new JTextField();
	JPasswordField password = new JPasswordField();
	JPasswordField confirm_password = new JPasswordField();
	
	JButton submit = new JButton("Submit");
	JButton back_button = new JButton("Back");
	
	String[] department_option = {"Select Here","BSc Hons Computing","BSc Hons Ethical Hacking",};
	
	JComboBox department = new JComboBox(department_option);
	
	JCheckBox show_password = new JCheckBox("Show Password");
	
	Register(){
		toplabel.setBounds(200,0,400,50);
		toplabel.setText("Kindly Fill Your Appropirate Detail ");
		toplabel.setFont(new Font(null,Font.PLAIN,26));
		toplabel.setForeground(Color.black);
		
		// firstname label
		firstname_label.setBounds(100,30,100,50);
		firstname_label.setText("First Name:");
		firstname_label.setFont(font);
		//first name text field
		firstname.setBounds(100,70,200,30);
		// lastname label and textfield
		lastname_label.setBounds(100,100,100,50);
		lastname_label.setText("Last Name:");
		lastname_label.setFont(font);
		
		lastname.setBounds(100,140,200,30);
		
		// age label and field
		age_label.setBounds(100,160,100,50);
		age_label.setText("Age:");
		age_label.setFont(font);
		
		age.setBounds(100,200,200,30);
		// faculty label and combobox
		faculty_label.setBounds(100,400,100,50);
		faculty_label.setText("Department:");
		faculty_label.setFont(font);
		
		department.setBounds(100,440,200,30);
		department.addActionListener(this);
		// username field and labels
		user_name.setBounds(100,220,300,50);
		user_name.setText("Username  :");
		user_name.setFont(font);
		
		Username.setBounds(100,260,200,30);
		
		// password label and field
		password_label.setBounds(100,280,300,50);
		password_label.setText("Password :");
		password_label.setFont(font);
		
		password.setBounds(100,320,200,30);
	
		// to show the written password in both textfield
		show_password.setBounds(300,350,150,30);
		show_password.addActionListener(this);
		
		
		// to  confirm if they match or not
		confirm_password_label.setBounds(100,350,200,30);
		confirm_password_label.setText("Confirm Password : ");
		confirm_password_label.setFont(font);
		
		confirm_password.setBounds(100,380,200,30);
		// to enter the type data to get insert in database 
		submit.setEnabled(true);
		submit.setBackground(Color.white);
		submit.setBounds(250,500,160,30);
		submit.addActionListener(this);
		
		// background image
		ImageIcon image1 = new ImageIcon("regback.jpg");
		label_back.setIcon(image1);
	 	label_back.setBounds(0,0,1000,800);
	 	
	 	// displaying current time
		
		Currenttime();
		
		// back button  			

		back_button.setBounds(5,5,100,30);
		back_button.setFocusable(false);
		back_button.addActionListener(this);
		back_button.setBorder(new EtchedBorder(10));
		back_button.setForeground(Color.black);
		back_button.setBackground(Color.white );
		back_button.setFont(font);
	
		
		
		Register_panel.add(toplabel);
		Register_panel.add(lastname_label);
		Register_panel.add(age_label);
		Register_panel.add(faculty_label);
		Register_panel.add(Contact_label);
		Register_panel.add(firstname_label);
		Register_panel.add(user_name);
		Register_panel.add(password_label);
		Register_panel.add(confirm_password_label);
		Register_panel.add(firstname);
		Register_panel.add(lastname);
		Register_panel.add(age);
		Register_panel.add(department);
		Register_panel.add(contact);
		Register_panel.add(Username);
		Register_panel.add(password);
		Register_panel.add(show_password);
		Register_panel.add(confirm_password);
		Register_panel.add(submit);
		Register_panel.add(back_button);
		Register_panel.add(label_back);
		
		Register_panel.add(time);
		
		Register_panel.setBounds(0,0,1000,800);
		Register_panel.setLayout(new BorderLayout());
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(800,600);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		frame.setLayout(null);
		frame.add(Register_panel);
		frame.setLayout(new BorderLayout());
		

		
		
	}
	// function to display current time
	public void Currenttime() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
		LocalDateTime now = LocalDateTime.now();
		time.setText("Time of Registation : "+dtf.format(now));
		time.setBounds(400,40,200,30);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
public static void main(String [] args) {
	new Register();
}
}
