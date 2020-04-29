import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Calculator {
	public Calculator() {
		JFrame frame = new JFrame("학점 계산기");
		JLabel title = new JLabel("학 점 계 산 기 ");

		Dimension dim = new Dimension(500, 600); // 프레임 사이즈 지정
		frame.add(title);

		title.setHorizontalAlignment(SwingConstants.TOP);
		frame.setLocation(200, 400); // 창의 위치 설정
		frame.setPreferredSize(dim);
		frame.pack();
		frame.setVisible(true);

	}

	public static void main(String[] args) {
		Calculator c = new Calculator();

	}
}
