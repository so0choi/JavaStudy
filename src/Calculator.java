import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
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

class ScorePanel extends JPanel {
	JLabel num;
	JComboBox<String> grade; // 성적
	JComboBox<Integer> amount; // 몇 학점인지
	private final String[] grades = { "A+", "A", "B+", "B", "C+", "C", "D+", "D", "F" };
	private final Integer[] amounts = { 3, 2, 1 };
	JTextField name;
	Font font;
	JCheckBox check;

	public int getAmount() {
		return (int) amount.getSelectedItem();
	}

	public String getGrade() {
		return (String) grade.getSelectedItem();
	}

	public ScorePanel() {
		font = new Font("AppleSDGothicNeoM00", 0, 15);
		num = new JLabel();
		num.setFont(font);
		name = new JTextField(10);
		name.setFont(font);
		grade = new JComboBox<String>();
		grade.setFont(font);

		grade.setModel(new DefaultComboBoxModel<String>(grades));
		amount = new JComboBox<Integer>();
		amount.setFont(font);
		amount.setModel(new DefaultComboBoxModel<Integer>(amounts));

		check = new JCheckBox("전공 과목");
		check.setFont(font);

		add(num);
		add(name);
		add(grade);
		add(amount);
		add(check);
	}
}

public class Calculator extends JFrame {
	ScorePanel[] scores;
	JLabel title;
	JPanel inputPanel;
	JPanel result;
	JPanel top;
	JTextField inputTotal;
	JLabel lb1;
	int totalNum = 0;
	final String fontName = "AppleSDGothicNeoM00";
	JButton inputBtn;
	JButton calculBtn;
	Container con;
	Font smallFont;
	Font bigFont;
	JButton resetBtn;

	Calculator() {
		smallFont = new Font(fontName, 0, 15);
		bigFont = new Font(fontName, 0, 25);
		setTitle("학점계산기");
		setSize(400, 580);

		con = getContentPane();

		con.setLayout(null);

		title = new JLabel("학점계산기");
		title.setFont(bigFont);
		title.setBounds(102, 13, 199, 40);
		title.setHorizontalAlignment(SwingConstants.CENTER);
		con.add(title);

		top = new JPanel();
		top.setBounds(20, 67, 340, 35);
		con.add(top);
		top.setLayout(new BorderLayout());

		JPanel count = new JPanel();
		inputTotal = new JTextField(2);
		inputTotal.setFont(smallFont);
		lb1 = new JLabel("과목 수");
		lb1.setFont(smallFont);
		count.add(lb1);
		count.add(inputTotal);
		top.add(count, "West");

		inputBtn = new JButton();
		inputBtn.setText("입력");
		inputBtn.setFont(smallFont);
		inputBtn.setSize(120, 20);
		count.add(inputBtn);

		resetBtn = new JButton();
		resetBtn.setFont(smallFont);
		resetBtn.setSize(110, 20);
		resetBtn.setText("리셋");
		top.add(resetBtn, "Center");

		calculBtn = new JButton();
		calculBtn.setText("계산하기");
		calculBtn.setFont(smallFont);
		calculBtn.setSize(120, 20);
		top.add(calculBtn, "East");

		inputPanel = new JPanel();
		inputPanel.setBounds(14, 120, 360, 430);
		inputPanel.setLayout(new GridLayout(10, 1));
		con.add(inputPanel);
		// 과목 갯수 입력

		result = new JPanel();

		inputBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				totalNum = Integer.parseInt(inputTotal.getText());
				try {
					if (totalNum != 0 && totalNum < 11) {
						scores = new ScorePanel[totalNum];
						for (int i = 0; i < totalNum; i++) {
							scores[i] = new ScorePanel();
							scores[i].num.setText("과목 " + (i + 1));
							inputPanel.add(scores[i]);

						}
						// inputPanel add후 창 새로 고침
						revalidate();
						repaint();
					} else {
						if (totalNum == 0)
							JOptionPane.showMessageDialog(null, "0은 입력 할 수 없습니다");
						else
							JOptionPane.showMessageDialog(null, "과목은 10개까지 입력 할 수 있습니다");
					}
				} catch (Exception exception) {
					exception.printStackTrace();
				}
			}
		});

		calculBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					int totalAmount = 0;
					double result = 0;

					for (int i = 0; i < totalNum; i++) {
						totalAmount += scores[i].getAmount();

						switch (scores[i].getGrade()) {
						case "A+":
							result += (4.5 * scores[i].getAmount());
							break;
						case "A":
							result += (4.0 * scores[i].getAmount());
							break;
						case "B+":
							result += (3.5 * scores[i].getAmount());
							break;
						case "B":
							result += (3.0 * scores[i].getAmount());
							break;
						case "C+":
							result += (2.5 * scores[i].getAmount());
							break;
						case "C":
							result += (2.0 * scores[i].getAmount());
							break;
						case "D+":
							result += (1.5 * scores[i].getAmount());
							break;
						case "D":
							result += (1.0 * scores[i].getAmount());
							break;
						case "F":
							result += (0 * scores[i].getAmount());
							break;

						}

					}

				} catch (Exception exception) {
					System.out.println(exception);
				}

			}
		});

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setVisible(true);
		setLocationRelativeTo(null);
	}

	public void register() {

	}

	public static void main(String[] args) {
		Calculator c = new Calculator();

	}
}
