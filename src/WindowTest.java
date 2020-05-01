import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class WindowTest {

	private JFrame frame;
	private String[] grade;
	private String[] amount;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					WindowTest window = new WindowTest();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public WindowTest() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private static int btnCount = 0;
	private static boolean reset = false;
	private JTextField totalCount;

	private void initialize() {
		grade = new String[] { "A+", "A", "A-", "B+", "B", "B-", "C+", "C", "C-", "D+", "D", "D-", "F" };
		amount = new String[] { "3", "2", "1" };
		frame = new JFrame();
		frame.getContentPane().setBackground(SystemColor.window);
		frame.setBounds(100, 100, 394, 584);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setResizable(false);

		JButton btnNewButton = new JButton("과목 추가");

		btnNewButton.setBackground(new Color(240, 255, 240));
		btnNewButton.setFont(new Font("AppleSDGothicNeoM00", Font.PLAIN, 17));
		btnNewButton.setBounds(14, 66, 119, 33);
		frame.getContentPane().add(btnNewButton);

		JLabel title = new JLabel("학점 계산기");
		title.setFont(new Font("AppleSDGothicNeoM00", Font.PLAIN, 25));
		title.setHorizontalAlignment(SwingConstants.CENTER);
		title.setBounds(87, 13, 199, 40);
		frame.getContentPane().add(title);

		JButton button = new JButton("계산하기");

		button.setBackground(new Color(240, 248, 255));
		button.setFont(new Font("AppleSDGothicNeoM00", Font.PLAIN, 17));
		button.setBounds(255, 67, 119, 33);
		frame.getContentPane().add(button);

		JPanel resultPanel = new JPanel();
		resultPanel.setBounds(14, 106, 360, 430);
		frame.getContentPane().add(resultPanel);
		resultPanel.setLayout(null);

		JLabel resultLabel = new JLabel();
		resultLabel.setFont(new Font("AppleSDGothicNeoL00", Font.PLAIN, 18));
		resultLabel.setBounds(55, 29, 219, 183);
		resultPanel.add(resultLabel);
		resultPanel.setVisible(false);

		JPanel container = new JPanel();
		container.setBounds(14, 106, 360, 430);
		frame.getContentPane().add(container);
		container.setLayout(null);

		JPanel grade1 = new JPanel();
		grade1.setBounds(14, 13, 312, 40);
		container.add(grade1);
		grade1.setBackground(Color.ORANGE);
		grade1.setLayout(null);

		JLabel label = new JLabel("과목 1");
		label.setBounds(14, 9, 56, 23);
		grade1.add(label);
		label.setFont(new Font("AppleSDGothicNeoL00", Font.PLAIN, 17));

		JComboBox combo1 = new JComboBox();
		combo1.setBackground(Color.WHITE);
		combo1.setBounds(251, 11, 47, 24);
		grade1.add(combo1);
		combo1.setModel(new DefaultComboBoxModel(grade));
		combo1.setSelectedIndex(0);

		JCheckBox checkBox = new JCheckBox("전공 과목");
		checkBox.setBackground(Color.ORANGE);
		checkBox.setFont(new Font("AppleSDGothicNeoL00", Font.PLAIN, 15));
		checkBox.setBounds(70, 8, 87, 27);
		grade1.add(checkBox);

		JComboBox amount1 = new JComboBox();
		amount1.setBounds(167, 11, 70, 24);
		amount1.setModel(new DefaultComboBoxModel(amount));
		amount1.setSelectedIndex(0);
		grade1.add(amount1);

		JPanel grade2 = new JPanel();
		grade2.setBounds(14, 64, 312, 40);
		container.add(grade2);
		grade2.setBackground(new Color(64, 224, 208));
		grade2.setLayout(null);

		JLabel label_1 = new JLabel("과목 2");
		label_1.setFont(new Font("AppleSDGothicNeoL00", Font.PLAIN, 17));
		label_1.setBounds(14, 9, 56, 23);
		grade2.add(label_1);

		JCheckBox checkBox_1 = new JCheckBox("전공 과목");
		checkBox_1.setBackground(new Color(64, 224, 208));
		checkBox_1.setFont(new Font("AppleSDGothicNeoL00", Font.PLAIN, 15));
		checkBox_1.setBounds(68, 8, 87, 27);
		grade2.add(checkBox_1);

		JComboBox combo2 = new JComboBox();
		combo2.setModel(new DefaultComboBoxModel(grade));
		combo2.setSelectedIndex(0);
		combo2.setBounds(251, 11, 47, 24);
		grade2.add(combo2);

		JComboBox amount2 = new JComboBox();
		amount2.setBounds(165, 11, 70, 24);
		amount2.setModel(new DefaultComboBoxModel(amount));
		amount2.setSelectedIndex(0);
		grade2.add(amount2);

		JPanel grade3 = new JPanel();
		grade3.setBounds(14, 114, 312, 38);
		container.add(grade3);
		grade3.setBackground(new Color(154, 205, 50));
		grade3.setLayout(null);

		JLabel label_2 = new JLabel("과목 3");
		label_2.setFont(new Font("AppleSDGothicNeoL00", Font.PLAIN, 17));
		label_2.setBounds(14, 9, 56, 23);
		grade3.add(label_2);

		JCheckBox checkBox_2 = new JCheckBox("전공 과목");
		checkBox_2.setBackground(new Color(154, 205, 50));
		checkBox_2.setFont(new Font("AppleSDGothicNeoL00", Font.PLAIN, 15));
		checkBox_2.setBounds(70, 8, 87, 27);
		grade3.add(checkBox_2);

		JComboBox combo3 = new JComboBox();
		combo3.setModel(new DefaultComboBoxModel(grade));
		combo3.setSelectedIndex(0);
		combo3.setBounds(251, 11, 47, 24);
		grade3.add(combo3);

		JComboBox amount3 = new JComboBox();
		amount3.setBounds(167, 8, 70, 24);
		amount3.setModel(new DefaultComboBoxModel(amount));
		amount3.setSelectedIndex(0);
		grade3.add(amount3);

		JPanel grade4 = new JPanel();
		grade4.setBounds(14, 159, 312, 41);
		container.add(grade4);
		grade4.setBackground(new Color(100, 149, 237));
		grade4.setLayout(null);

		JLabel label_3 = new JLabel("과목 4");
		label_3.setFont(new Font("AppleSDGothicNeoL00", Font.PLAIN, 17));
		label_3.setBounds(14, 9, 56, 23);
		grade4.add(label_3);

		JCheckBox checkBox_3 = new JCheckBox("전공 과목");
		checkBox_3.setBackground(new Color(100, 149, 237));
		checkBox_3.setFont(new Font("AppleSDGothicNeoL00", Font.PLAIN, 15));
		checkBox_3.setBounds(68, 8, 87, 27);
		grade4.add(checkBox_3);

		JComboBox combo4 = new JComboBox();
		combo4.setModel(new DefaultComboBoxModel(grade));
		combo4.setSelectedIndex(0);
		combo4.setBounds(251, 11, 47, 24);
		grade4.add(combo4);

		JComboBox amount4 = new JComboBox();
		amount4.setBounds(165, 11, 70, 24);
		amount4.setModel(new DefaultComboBoxModel(amount));
		amount4.setSelectedIndex(0);
		grade4.add(amount4);

		JPanel grade5 = new JPanel();
		grade5.setBounds(14, 209, 312, 42);
		container.add(grade5);
		grade5.setBackground(new Color(250, 128, 114));
		grade5.setLayout(null);

		JLabel label_4 = new JLabel("과목 5");
		label_4.setFont(new Font("AppleSDGothicNeoL00", Font.PLAIN, 17));
		label_4.setBounds(14, 9, 56, 23);
		grade5.add(label_4);

		JCheckBox checkBox_4 = new JCheckBox("전공 과목");
		checkBox_4.setBackground(new Color(250, 128, 114));
		checkBox_4.setFont(new Font("AppleSDGothicNeoL00", Font.PLAIN, 15));
		checkBox_4.setBounds(71, 8, 87, 27);
		grade5.add(checkBox_4);

		JComboBox combo5 = new JComboBox();
		combo5.setModel(new DefaultComboBoxModel(grade));
		combo5.setSelectedIndex(0);
		combo5.setBounds(251, 11, 47, 24);
		grade5.add(combo5);

		JComboBox amount5 = new JComboBox();
		amount5.setBounds(167, 11, 70, 24);
		amount5.setModel(new DefaultComboBoxModel(amount));
		amount5.setSelectedIndex(0);
		grade5.add(amount5);

		JPanel grade6 = new JPanel();
		grade6.setBounds(14, 264, 312, 42);
		container.add(grade6);
		grade6.setLayout(null);
		grade6.setBackground(Color.YELLOW);

		JLabel label_5 = new JLabel("과목 6");
		label_5.setBackground(Color.YELLOW);
		label_5.setFont(new Font("AppleSDGothicNeoL00", Font.PLAIN, 17));
		label_5.setBounds(14, 9, 56, 23);
		grade6.add(label_5);

		JCheckBox checkBox_5 = new JCheckBox("전공 과목");
		checkBox_5.setFont(new Font("AppleSDGothicNeoL00", Font.PLAIN, 15));
		checkBox_5.setBackground(Color.YELLOW);
		checkBox_5.setBounds(68, 8, 87, 27);
		grade6.add(checkBox_5);
		grade6.setVisible(false);

		JComboBox combo6 = new JComboBox();
		combo6.setModel(new DefaultComboBoxModel(grade));
		combo6.setSelectedIndex(0);
		combo6.setBounds(251, 11, 47, 24);
		grade6.add(combo6);

		JComboBox amount6 = new JComboBox();
		amount6.setBounds(165, 8, 70, 24);
		amount6.setModel(new DefaultComboBoxModel(amount));
		amount6.setSelectedIndex(0);
		grade6.add(amount6);

		JPanel grade7 = new JPanel();
		grade7.setLayout(null);
		grade7.setBackground(new Color(173, 216, 230));
		grade7.setBounds(14, 319, 312, 42);
		container.add(grade7);
		grade7.setVisible(false);

		JLabel label_6 = new JLabel("과목 7");
		label_6.setFont(new Font("AppleSDGothicNeoL00", Font.PLAIN, 17));
		label_6.setBounds(14, 9, 56, 23);
		grade7.add(label_6);

		JCheckBox checkBox_6 = new JCheckBox("전공 과목");
		checkBox_6.setFont(new Font("AppleSDGothicNeoL00", Font.PLAIN, 15));
		checkBox_6.setBackground(new Color(173, 216, 230));
		checkBox_6.setBounds(64, 8, 87, 27);
		grade7.add(checkBox_6);

		JComboBox combo7 = new JComboBox();
		combo7.setModel(new DefaultComboBoxModel(grade));
		combo7.setSelectedIndex(0);
		combo7.setBounds(251, 11, 47, 24);

		grade7.add(combo7);

		JComboBox amount7 = new JComboBox();
		amount7.setBounds(167, 11, 70, 24);
		amount7.setModel(new DefaultComboBoxModel(amount));
		amount7.setSelectedIndex(0);
		grade7.add(amount7);

		JPanel grade8 = new JPanel();
		grade8.setLayout(null);
		grade8.setBackground(new Color(123, 104, 238));
		grade8.setBounds(14, 373, 312, 42);
		container.add(grade8);
		grade8.setVisible(false);

		JLabel label_7 = new JLabel("과목 8");
		label_7.setFont(new Font("AppleSDGothicNeoL00", Font.PLAIN, 17));
		label_7.setBounds(14, 9, 56, 23);
		grade8.add(label_7);

		JCheckBox checkBox_7 = new JCheckBox("전공 과목");
		checkBox_7.setFont(new Font("AppleSDGothicNeoL00", Font.PLAIN, 15));
		checkBox_7.setBackground(new Color(123, 104, 238));
		checkBox_7.setBounds(66, 8, 87, 27);
		grade8.add(checkBox_7);

		JComboBox comboBox_7 = new JComboBox();
		comboBox_7.setModel(new DefaultComboBoxModel(grade));
		comboBox_7.setSelectedIndex(0);
		comboBox_7.setBounds(251, 11, 47, 24);
		grade8.add(comboBox_7);

		JComboBox amount8 = new JComboBox();
		amount8.setBounds(167, 11, 70, 24);
		amount8.setModel(new DefaultComboBoxModel(amount));
		amount8.setSelectedIndex(0);
		grade8.add(amount8);

		JLabel label_8 = new JLabel("과목 수");
		label_8.setFont(new Font("AppleSDGothicNeoL00", Font.PLAIN, 17));
		label_8.setBounds(137, 69, 56, 26);
		frame.getContentPane().add(label_8);

		totalCount = new JTextField();
		totalCount.setBounds(194, 72, 23, 26);
		frame.getContentPane().add(totalCount);
		totalCount.setColumns(5);

		btnNewButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (btnCount < 3) {
					if (btnCount == 1)
						grade6.setVisible(true);
					else if (btnCount == 2)
						grade7.setVisible(true);
					else if (btnCount == 3)
						grade8.setVisible(true);
					btnCount++;
				} else {
					JOptionPane.showMessageDialog(null, "과목은 8개 까지 추가할 수 있습니다");
				}
			}
		});

		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				if (reset == true) {
					reset = false;
					resultPanel.setVisible(false);
				} else {
					reset = true;
					button.setText("돌아가기");
					resultPanel.setVisible(true);

					int sumAmount;
					int total = Integer.parseInt(totalCount.getText());
					int amount[] = new int[total];
					for (int i = 0; i < total; i++) {

					}

					sumAmount = Integer.parseInt(amount1.getSelectedItem().toString());
					resultLabel.setText("");

				}

			}
		});

	}
}
