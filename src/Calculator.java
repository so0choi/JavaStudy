import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Calculator {
	public Calculator() {
		JFrame frame = new JFrame("학점 계산기");
		JLabel title = new JLabel();

		Dimension dim = new Dimension(500, 600); // 프레임 사이즈 지정

		frame.setLocation(200, 400); // 창의 위치 설정
		frame.setPreferredSize(dim);
		title.setText("학점계산기");
		title.setVerticalAlignment(SwingConstants.TOP); // 수직 정렬
		title.setHorizontalAlignment(SwingConstants.CENTER); // 수평 정렬

		Font font = new Font("AppleSDGothicNeoL00", Font.BOLD, 30);
		title.setFont(font);

		title.setOpaque(true); // background색 적용하기 위해 true로 설정해야 함
		Color background = new Color(223, 215, 187);
		title.setBackground(background);

		frame.add(title);
		frame.pack();
		frame.setVisible(true);

	}

	public static void main(String[] args) {
		Calculator c = new Calculator();

	}
}
