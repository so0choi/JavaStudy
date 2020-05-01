import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class WindowTest2 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					WindowTest2 window = new WindowTest2();
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
	public WindowTest2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 800, 600);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setTitle("test window");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JPanel end = new JPanel();
		end.setBounds(0, 0, 680, 541);
		frame.getContentPane().add(end);
		end.setLayout(null);

		JButton btnBefore = new JButton("before page");
		btnBefore.setBounds(338, 82, 217, 122);
		end.add(btnBefore);

		JPanel start = new JPanel();
		start.setBounds(0, 0, 593, 416);
		frame.getContentPane().add(start);
		start.setLayout(null);

		JButton btnNext = new JButton("next page");
		btnNext.setBounds(86, 68, 215, 96);
		start.add(btnNext);
		end.setVisible(false);
		btnNext.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				end.setVisible(true);
				start.setVisible(false);
			}
		});

		btnBefore.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				end.setVisible(false);
				start.setVisible(true);

			}
		});
	}
}
