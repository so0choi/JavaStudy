import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Calculator {

	public Calculator() {
		JFrame frame = new JFrame("학점 계산기");
		frame.setLocation(200, 400); // 창의 위치 설정
		Dimension dim = new Dimension(500, 600); // 프레임 사이즈 지정
		frame.setPreferredSize(dim);
		Font font = new Font("AppleSDGothicNeoL00", Font.BOLD, 30);

		JPanel panel1 = new JPanel();
		JLabel title = new JLabel();
		title.setText("학점계산기");
		title.setFont(font);
		panel1.setLayout(new BoxLayout(panel1, BoxLayout.X_AXIS));
		panel1.add(title);

		JPanel panel2 = new JPanel();
		panel2.setLayout(new BoxLayout(panel2, BoxLayout.X_AXIS));
		JButton button = new JButton("Test");
		button.setFont(font);
		// 버튼 클릭 이벤트 코드
		ActionListener listener = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

			}

		};
		panel2.add(button);

		JPanel panel = new JPanel();
		panel.add(panel1);
		panel.add(panel2);

//		title.setOpaque(true); // background색 적용하기 위해 true로 설정해야 함
//		Color background = new Color(223, 215, 187);
//		title.setBackground(background);

		JLabel count = new JLabel("과목 수");

		frame.add(panel);
		frame.pack();
		frame.setVisible(true);

	}

	public void register() {

	}

	public static void main(String[] args) {
		Calculator c = new Calculator();

	}
}
