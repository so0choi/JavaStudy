import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.Box;
import javax.swing.BoxLayout;
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

	public boolean getChecked() {
		return check.isSelected();
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
	JPanel resultPanel;
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
	JLabel resultLabel1;
	JLabel resultLabel2;

	Calculator() {
		smallFont = new Font(fontName, 0, 15);
		bigFont = new Font(fontName, 0, 25);
		setTitle("학점계산기");
		setSize(400, 600);

		con = getContentPane();

		con.setLayout(null);
		con.requestFocus();
		con.setFocusable(true);

		title = new JLabel("학점계산기");
		title.setFont(bigFont);
		title.setBounds(102, 13, 199, 40);
		title.setHorizontalAlignment(SwingConstants.CENTER);

		con.add(title);

		top = new JPanel();
		top.setBounds(20, 67, 340, 30);
		con.add(top);
		top.setLayout(new BoxLayout(top, BoxLayout.X_AXIS));

		JPanel count = new JPanel();
		count.setLayout(new BoxLayout(count, BoxLayout.X_AXIS));
		inputTotal = new JTextField(2);
		inputTotal.setFont(smallFont);

		lb1 = new JLabel("과목 수  ");
		lb1.setFont(smallFont);
		count.add(lb1);
		count.add(inputTotal);

		inputBtn = new JButton();
		inputBtn.setText("입력");
		inputBtn.setFont(smallFont);

		count.add(inputBtn);
		top.add(count);
		top.add(Box.createHorizontalStrut(60));

		resetBtn = new JButton();
		resetBtn.setFont(smallFont);

		resetBtn.setText("리셋");
		top.add(resetBtn);

		calculBtn = new JButton();
		calculBtn.setText("계산하기");
		calculBtn.setFont(smallFont);
		calculBtn.setSize(120, 20);
		top.add(calculBtn);

		inputPanel = new JPanel();
		inputPanel.setBounds(14, 120, 360, 410);
		inputPanel.setLayout(new GridLayout(10, 1));

		con.add(inputPanel);
		// 과목 갯수 입력

		resultPanel = new JPanel();
		resultPanel.setLayout(new GridLayout(2, 1));
		resultPanel.setBounds(90, 500, 360, 60);
		resultLabel1 = new JLabel();
		resultPanel.add(resultLabel1);
		resultLabel1.setFont(smallFont);
		resultLabel2 = new JLabel();
		resultLabel2.setFont(smallFont);
		resultPanel.add(resultLabel2);
		con.add(resultPanel);

		resetBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				inputPanel.removeAll();
				resultPanel.removeAll();
				revalidate();
				repaint();

			}

		});
		inputBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				try {
					totalNum = Integer.parseInt(inputTotal.getText());
					if (totalNum != 0 && totalNum < 9) {
						inputPanel.removeAll();
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
							JOptionPane.showMessageDialog(null, "과목은 8개까지 입력 할 수 있습니다");
					}
				} catch (Exception exception) {
					JOptionPane.showMessageDialog(null, "8 이하의 숫자를 입력하세요!");
				}
			}
		});

		calculBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					double result;
					double primeResult = 0;
					double sum = 0;
					double primeSum = 0;
					int totalAmount = 0;
					int primeAmount = 0;
					for (int i = 0; i < totalNum; i++) {
						totalAmount += scores[i].getAmount();
						sum += (calculGrade(scores[i]) * scores[i].getAmount());
						if (scores[i].getChecked()) {
							primeSum += (calculGrade(scores[i]) * scores[i].getAmount());
							primeAmount += scores[i].getAmount();
						}
					}

					result = Math.round(sum / totalAmount * 100) / 100.0;

					if (primeSum != 0)
						primeResult = primeSum / primeAmount;
					String resultStr1 = "총 수강 학점 : " + totalAmount + "     평균 학점 :" + result;
					String resultStr2 = "전공 수강 학점: " + primeAmount + "   전공 평점: " + primeResult;
					resultLabel1.setText(resultStr1);
					resultLabel2.setText(resultStr2);

				} catch (Exception exception) {
					System.out.println(exception);
				}

			}
		});
		con.addKeyListener(new KeyListener() {

			@Override
			public void keyPressed(KeyEvent arg0) {
				// TODO Auto-generated method stub

			}

			@Override
			public void keyReleased(KeyEvent arg0) {
				// TODO Auto-generated method stub

			}

			@Override
			public void keyTyped(KeyEvent key) {
				int k = key.getKeyCode();
				if (k == KeyEvent.VK_ENTER)
					inputBtn.doClick();

			}

		});

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setVisible(true);
		setLocationRelativeTo(null);
	}

	public double calculGrade(ScorePanel sp) {
		double var = 0;
		switch (sp.getGrade()) {
		case "A+":
			var = 4.5;
			break;
		case "A":
			var = 4.0;
			break;
		case "B+":
			var = 3.5;
			break;
		case "B":
			var = 3.0;
			break;
		case "C+":
			var = 2.5;
			break;
		case "C":
			var = 2.0;
			break;
		case "D+":
			var = 1.5;
			break;
		case "D":
			var = 1.0;
			break;
		default:
			var = 0;
			break;

		}
		return var;

	}

	public static void main(String[] args) {
		Calculator c = new Calculator();

	}
}
