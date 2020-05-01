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
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;

public class WindowTest {

	private JFrame frame;
	private String[] grade;

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
	public class scoreTemplate extends JLabel {

	}

	private void initialize() {
		grade = new String[] { "A+", "A", "A-", "B+", "B", "B-", "C+", "C", "C-", "D+", "D", "D-", "F" };
		frame = new JFrame();
		frame.getContentPane().setBackground(SystemColor.window);
		frame.setBounds(100, 100, 394, 409);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setResizable(false);

		JButton btnNewButton = new JButton("과목 추가");
		btnNewButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

			}
		});

		btnNewButton.setBackground(new Color(240, 255, 240));
		btnNewButton.setFont(new Font("AppleSDGothicNeoM00", Font.PLAIN, 17));
		btnNewButton.setBounds(26, 67, 119, 33);
		frame.getContentPane().add(btnNewButton);

		JLabel title = new JLabel("학점 계산기");
		title.setFont(new Font("AppleSDGothicNeoM00", Font.PLAIN, 25));
		title.setHorizontalAlignment(SwingConstants.CENTER);
		title.setBounds(87, 13, 199, 40);
		frame.getContentPane().add(title);

		JButton button = new JButton("계산하기");
		button.setBackground(new Color(240, 248, 255));
		button.setFont(new Font("AppleSDGothicNeoM00", Font.PLAIN, 17));
		button.setBounds(219, 67, 119, 33);
		frame.getContentPane().add(button);

		JPanel container = new JPanel();
		container.setBounds(14, 106, 360, 260);
		frame.getContentPane().add(container);
		container.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(14, 13, 312, 40);
		container.add(panel);
		panel.setBackground(Color.ORANGE);
		panel.setLayout(null);

		JLabel label = new JLabel("과목 1");
		label.setBounds(14, 9, 56, 23);
		panel.add(label);
		label.setFont(new Font("AppleSDGothicNeoL00", Font.PLAIN, 17));

		JComboBox comboBox = new JComboBox();
		comboBox.setBackground(Color.WHITE);
		comboBox.setBounds(212, 11, 47, 24);
		panel.add(comboBox);
		comboBox.setModel(new DefaultComboBoxModel(grade));
		comboBox.setSelectedIndex(0);

		JCheckBox checkBox = new JCheckBox("전공 과목");
		checkBox.setBackground(Color.ORANGE);
		checkBox.setFont(new Font("AppleSDGothicNeoL00", Font.PLAIN, 15));
		checkBox.setBounds(91, 8, 87, 27);
		panel.add(checkBox);

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(14, 64, 312, 40);
		container.add(panel_1);
		panel_1.setBackground(new Color(64, 224, 208));
		panel_1.setLayout(null);

		JLabel label_1 = new JLabel("과목 2");
		label_1.setFont(new Font("AppleSDGothicNeoL00", Font.PLAIN, 17));
		label_1.setBounds(14, 9, 56, 23);
		panel_1.add(label_1);

		JCheckBox checkBox_1 = new JCheckBox("전공 과목");
		checkBox_1.setBackground(new Color(64, 224, 208));
		checkBox_1.setFont(new Font("AppleSDGothicNeoL00", Font.PLAIN, 15));
		checkBox_1.setBounds(94, 8, 87, 27);
		panel_1.add(checkBox_1);

		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(grade));
		comboBox_1.setSelectedIndex(0);
		comboBox_1.setBounds(214, 11, 47, 24);
		panel_1.add(comboBox_1);

		JPanel panel_2 = new JPanel();
		panel_2.setBounds(14, 114, 312, 38);
		container.add(panel_2);
		panel_2.setBackground(new Color(154, 205, 50));
		panel_2.setLayout(null);

		JLabel label_2 = new JLabel("과목 3");
		label_2.setFont(new Font("AppleSDGothicNeoL00", Font.PLAIN, 17));
		label_2.setBounds(14, 9, 56, 23);
		panel_2.add(label_2);

		JCheckBox checkBox_2 = new JCheckBox("전공 과목");
		checkBox_2.setBackground(new Color(154, 205, 50));
		checkBox_2.setFont(new Font("AppleSDGothicNeoL00", Font.PLAIN, 15));
		checkBox_2.setBounds(92, 8, 87, 27);
		panel_2.add(checkBox_2);

		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(grade));
		comboBox_2.setSelectedIndex(0);
		comboBox_2.setBounds(213, 9, 47, 24);
		panel_2.add(comboBox_2);

		JPanel panel_3 = new JPanel();
		panel_3.setBounds(14, 159, 312, 41);
		container.add(panel_3);
		panel_3.setBackground(new Color(100, 149, 237));
		panel_3.setLayout(null);

		JLabel label_3 = new JLabel("과목 4");
		label_3.setFont(new Font("AppleSDGothicNeoL00", Font.PLAIN, 17));
		label_3.setBounds(14, 9, 56, 23);
		panel_3.add(label_3);

		JCheckBox checkBox_3 = new JCheckBox("전공 과목");
		checkBox_3.setBackground(new Color(100, 149, 237));
		checkBox_3.setFont(new Font("AppleSDGothicNeoL00", Font.PLAIN, 15));
		checkBox_3.setBounds(92, 8, 87, 27);
		panel_3.add(checkBox_3);

		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setModel(new DefaultComboBoxModel(grade));
		comboBox_3.setSelectedIndex(0);
		comboBox_3.setBounds(214, 11, 47, 24);
		panel_3.add(comboBox_3);

		JPanel panel_4 = new JPanel();
		panel_4.setBounds(14, 209, 312, 42);
		container.add(panel_4);
		panel_4.setBackground(new Color(250, 128, 114));
		panel_4.setLayout(null);

		JLabel label_4 = new JLabel("과목 5");
		label_4.setFont(new Font("AppleSDGothicNeoL00", Font.PLAIN, 17));
		label_4.setBounds(14, 9, 56, 23);
		panel_4.add(label_4);

		JCheckBox checkBox_4 = new JCheckBox("전공 과목");
		checkBox_4.setBackground(new Color(250, 128, 114));
		checkBox_4.setFont(new Font("AppleSDGothicNeoL00", Font.PLAIN, 15));
		checkBox_4.setBounds(90, 8, 87, 27);
		panel_4.add(checkBox_4);

		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setModel(new DefaultComboBoxModel(grade));
		comboBox_4.setSelectedIndex(0);
		comboBox_4.setBounds(217, 9, 47, 24);
		panel_4.add(comboBox_4);

		JPanel panel_5 = new JPanel();
		panel_5.setBounds(14, 264, 312, 42);
		container.add(panel_5);
		panel_5.setLayout(null);
		panel_5.setBackground(new Color(250, 128, 114));

		JLabel label_5 = new JLabel("과목 5");
		label_5.setFont(new Font("AppleSDGothicNeoL00", Font.PLAIN, 17));
		label_5.setBounds(14, 9, 56, 23);
		panel_5.add(label_5);

		JCheckBox checkBox_5 = new JCheckBox("전공 과목");
		checkBox_5.setFont(new Font("AppleSDGothicNeoL00", Font.PLAIN, 15));
		checkBox_5.setBackground(new Color(250, 128, 114));
		checkBox_5.setBounds(90, 8, 87, 27);
		panel_5.add(checkBox_5);

		JComboBox comboBox_5 = new JComboBox();
		comboBox_5.setModel(new DefaultComboBoxModel(grade));
		comboBox_5.setSelectedIndex(0);
		comboBox_5.setBounds(217, 9, 47, 24);
		panel_5.add(comboBox_5);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(340, 13, 20, 234);
		container.add(scrollPane);

	}
}
