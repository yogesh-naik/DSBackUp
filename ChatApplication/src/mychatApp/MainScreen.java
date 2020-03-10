package mychatApp;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;

public class MainScreen extends JFrame implements WritableGUI{

	private JPanel contentPane;
	private JTextField ipTextField;
	private JTextField portTextField;
	private JTextField textField;
	JTextArea chat;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainScreen frame = new MainScreen();
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
	public MainScreen() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 662, 380);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		ipTextField = new JTextField();
		ipTextField.setBounds(12, 13, 251, 22);
		contentPane.add(ipTextField);
		ipTextField.setColumns(10);
		
		portTextField = new JTextField();
		portTextField.setText("1234");
		portTextField.setBounds(291, 13, 116, 22);
		contentPane.add(portTextField);
		portTextField.setColumns(10);
		
		JButton connectButton = new JButton("Connect");
		connectButton.setBounds(419, 12, 97, 25);
		contentPane.add(connectButton);
		
		JButton disconnectButton = new JButton("Disconnect");
		disconnectButton.setBounds(528, 13, 110, 22);
		contentPane.add(disconnectButton);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(55, 93, 4, 22);
		contentPane.add(textArea);
		
		chat = new JTextArea();
		chat.setBounds(12, 61, 626, 185);
		contentPane.add(chat);
		
		textField = new JTextField();
		textField.setBounds(12, 272, 374, 51);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton send = new JButton("Send");
		send.setBounds(419, 280, 161, 34);
		contentPane.add(send);
	}

	@Override
	public void write(String s) {
		// TODO Auto-generated method stub
		chat.append(s + System.lineSeparator());
	}
}
