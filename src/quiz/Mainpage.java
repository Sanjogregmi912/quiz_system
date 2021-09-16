package quiz;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EtchedBorder;

public class Mainpage implements ActionListener{
	
//fonts 
	Font font = new Font(null,Font.PLAIN,30); 
	Font font1 =new Font("Times New Roman",Font.BOLD,20);
	
//frame 
	JFrame frame = new JFrame();
	//panel to show components
	JPanel panel = new JPanel();
//buttons for login and register
	JButton login_button =  new JButton("Login");
	JButton register_button = new JButton("Click here to register for attempting the quiz");
	// textfield where user type username and password
	JTextField username_text = new JTextField();
	JTextField password_text = new JTextField();
	// label for back is img background
	JLabel label_back = new JLabel();
	//label_heading is heading label when user opnes
	JLabel label_heading = new JLabel();
	JLabel username_label = new JLabel();
	JLabel password_label = new JLabel();
	
 	
	
	
	
	Mainpage(){
//code for heading to get bigger and location
		label_heading.setText("WELCOME TO THE QUIZ SYSTEM");
		label_heading.setBounds(100,5,500,200);
		label_heading.setFont(font);
		// usernamelabel
        username_label.setBounds(200, 250, 300, 50);
        username_label.setText("Username");
        username_label.setFont(font1);
        // username text field
        username_text.setBounds(180, 290, 200, 30);
        username_text.setVisible(true);
        username_text.setEditable(true);
		
        // password label
        password_label.setBounds(200, 330, 300, 50);
        password_label.setText("Password :");
        password_label.setFont(font1);
        // textfield for password
        password_text.setBounds(180, 370, 200, 30);
        password_text.setVisible(true);
        password_text.setEditable(true);
        
        // login button
		login_button.setBounds(240,430,100,50);
		login_button.setFocusable(false);
		login_button.addActionListener(this);
		login_button.setVisible(true);
		login_button.setBorder(new EtchedBorder(10));
		login_button.setForeground(Color.black);
		login_button.setBackground(Color.white);
		login_button.setFont(font1);
		
		// register button 
		register_button.setBounds(180,500,400,50);
		register_button.setFocusable(false);
		register_button.addActionListener(this);
		register_button.setBorder(new EtchedBorder(10));
		register_button.setForeground(Color.black);
		register_button.setBackground(Color.CYAN);
		register_button.setFont(font1);
        
		//image for background in mainpage
		ImageIcon image12 = new ImageIcon("adminback1.jpg");
		label_back.setIcon(image12);
	 	label_back.setBounds(0,0,800,800);
	 	//panel 
	 	panel.setBounds(0,0,800,800);
	 	panel.setVisible(true);
	 	panel.add(username_text);
	 	panel.add(label_heading);
	 	panel.add(username_label);
	 	panel.add(password_label);
	 	panel.add(password_text);
	 	panel.add(login_button);
	 	panel.add(register_button);
	 	panel.add(label_back);
	 	panel.setLayout(new BorderLayout());
	 	
		// frame 
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setSize(800,800);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		frame.add(panel);
		frame.setLayout(new BorderLayout());
	}

	public static void main(String[] args) {
		new Mainpage();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		
	}

}
