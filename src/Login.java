import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login extends JFrame {
	public Login() {
		JPanel panel = new JPanel();
		JTextField textID = new JTextField(10);
		JLabel label = new JLabel("ID :  ");
		JPasswordField textPass = new JPasswordField(10);
		JLabel passLabel = new JLabel("Password:   ");
		JButton logBtn = new JButton("Log in");

		panel.add(label);
		panel.add(textID);
		panel.add(passLabel);
		panel.add(textPass);
		panel.add(logBtn);

		logBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String id = "sy123";
				String pass = "1234";
				if (id.equals(textID.getText()) && pass.equals(textPass.getText())) {
					JOptionPane.showMessageDialog(null, "Login success");
				} else {
					JOptionPane.showMessageDialog(null, "fail");
				}

			}
		});

		add(panel);
		setVisible(true);
		setSize(600, 400);
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new Login();
	}
}
