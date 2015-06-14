import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;


public class User_Login extends JFrame {

	private JPanel contentPane;
	private JTextField username;
	private JTextField password;
	
	/**
	 * Launch the application.
	 * @throws UnsupportedLookAndFeelException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 * @throws ClassNotFoundException 
	 */
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
		UIManager.setLookAndFeel("com.seaglasslookandfeel.SeaGlassLookAndFeel");
		UIManager.getLookAndFeelDefaults().put("defaultFont", new Font("Microsoft Yahei",Font.PLAIN,13));
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					User_Login frame = new User_Login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws UnsupportedLookAndFeelException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 * @throws ClassNotFoundException 
	 */
	public User_Login() {
		setResizable(false);
		setOpacity(0.9f);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 314, 178);
		contentPane = new JPanel();

		contentPane.setBackground(SystemColor.inactiveCaptionText);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		username = new JTextField();
		username.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent arg0) {
				if(username.getText().compareTo("用户名：")==0)
					username.setText("");
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(username.getText().compareTo("")==0)
					username.setText("用户名：");
			}
		});

		
		username.setToolTipText("");
		username.setBounds(60, 23, 200, 30);
		contentPane.add(username);
		username.setColumns(10);
		
		password = new JTextField();
		password.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(password.getText().compareTo("密码：")==0)
					password.setText("");
				
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(password.getText().compareTo("")==0)
					password.setText("密码：");		
			}
		});
		//textField_1.setToolTipText("");
		password.setText("密码：");
		username.setText("用户名：");
		password.setBounds(60, 66, 200, 30);
		contentPane.add(password);
		password.setColumns(10);
		
		JButton btnNewButton = new JButton("\u767B\u5F55");
		btnNewButton.setBounds(70, 106, 74, 34);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\u6CE8\u518C");
		btnNewButton_1.setBounds(167, 106, 74, 34);
		contentPane.add(btnNewButton_1);
	}
}
