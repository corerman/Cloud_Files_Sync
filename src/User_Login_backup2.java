import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Toolkit;

import javax.swing.JMenuBar;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

import java.awt.Dialog.ModalExclusionType;
import java.awt.SystemColor;

import javax.swing.JTree;
import javax.swing.JProgressBar;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import java.awt.Font;


public class User_Login_backup2 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;
	private JLabel label_1;

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
					User_Login_backup2 frame = new User_Login_backup2();
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
	public User_Login_backup2() {
		setBackground(SystemColor.activeCaptionBorder);
		setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\\u8D44\u6599\u57FA\u5730\\\u8BBE\u8BA1\u8D44\u6E90\\google.ico"));
		setResizable(false);
		setAlwaysOnTop(true);
		setTitle("\u6587\u4EF6\u4E91\u52A0\u901F");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 261, 183);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		textField = new JTextField();
		textField.setFont(new Font("свт╡", Font.PLAIN, 15));
		textField.setBounds(67, 29, 163, 29);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(67, 76, 163, 29);
		
		JButton button = new JButton("\u767B\u5F55");
		button.setBounds(39, 116, 68, 23);
		
		JButton button_1 = new JButton("\u6CE8\u518C");
		button_1.setBounds(145, 116, 68, 23);
		
		JLabel label = new JLabel("\u7528\u6237\u540D");
		label.setBounds(15, 34, 48, 15);
		contentPane.setLayout(null);
		
		label_1 = new JLabel("\u5BC6\u7801");
		label_1.setBounds(23, 83, 27, 15);
		contentPane.add(label_1);
		contentPane.add(label);
		contentPane.add(textField);
		contentPane.add(passwordField);
		contentPane.add(button);
		contentPane.add(button_1);
	}
}
