import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Frame {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JLabel label = new JLabel("new text");
		JButton btn1 = new JButton("click this");
		JTextArea textArea = new JTextArea(); // 여러줄
		JTextField textField = new JTextField(200);// 한줄
		JPanel btnPanel = new JPanel();
		JButton btn2 = new JButton("exit");

		btn1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				label.setText(textArea.getText());
			}

		});

		btn2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);

			}
		});
		panel.setLayout(new BorderLayout()); // 원하는 특정 부분에 놓을 수 있음
		btnPanel.add(btn1);
		btnPanel.add(btn2);
		panel.add(btnPanel, BorderLayout.WEST);
		panel.add(label, BorderLayout.NORTH);

		panel.add(textArea, BorderLayout.CENTER);

		frame.add(panel); // frame에 panel 넣어야 사용할 수 있다

		frame.setResizable(false); // 창 사이즈 변경 못하게
		frame.setVisible(true);
		frame.setPreferredSize(new Dimension(840, 840 / 12 * 9)); // 3:4
		frame.setSize(840, 840 / 12 * 9);
		frame.setLocationRelativeTo(null); // 가운데 출력
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 끄면 프로그램 종료 되도록
	}
}
