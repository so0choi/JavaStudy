import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class JPanel01 extends JPanel {
	JLabel label;
	String[] number;
	JComboBox combo;

	public JPanel01() {
		setLayout(null);
		label = new JLabel("과목 수 :");
		number = new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" };
		combo = new JComboBox(number);
		add(label);
		add(combo);
	}
}

public class Calculator extends JFrame {
	String[] fruits = { "apple", "banana", "mango" };
	ImageIcon[] images = { new ImageIcon("images/apple.jpg"), new ImageIcon("images/banana.jpg"),
			new ImageIcon("images/mango.jpg") };
	JLabel imgLabel = new JLabel(images[0]);

	Calculator() {
		setTitle("콤보박스 활용 예제");
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JComboBox combo = new JComboBox(fruits);
		c.add(combo);
		c.add(imgLabel);

		// 콤보박스에 Action 리스너 등록. 선택된 아이템의 이미지 출력
		combo.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JComboBox cb = (JComboBox) e.getSource();
				int index = cb.getSelectedIndex();
				imgLabel.setIcon(images[index]);
			}
		});
		setSize(300, 250);
		setVisible(true);

	}

	public void register() {

	}

	public static void main(String[] args) {
		Calculator c = new Calculator();

	}
}
