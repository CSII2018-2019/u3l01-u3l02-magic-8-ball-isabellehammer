
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Magic8Ball extends JFrame{
	
	public Magic8Ball() {
		
		initGUI();
		
		setTitle("Game Window");
		setSize(300, 150);
		setResizable(true);
		setLocationRelativeTo(null);
		
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
	}
	

	public void initGUI(){
		
		JLabel titleLabel = new JLabel("Ask a yes or no question and shake the ball for an answer.");
		
		Font titleFont = new Font (Font.SERIF, Font.BOLD + Font.ITALIC, 32);
		titleLabel.setFont(titleFont);
		titleLabel.setForeground(new Color(107, 158, 239));
		titleLabel.setBackground(new Color(241, 169, 242));
		titleLabel.setOpaque(true);
		
		add(titleLabel, BorderLayout.PAGE_START);
		titleLabel.setHorizontalAlignment(JLabel.CENTER);
		
		JPanel buttonPanel = new JPanel();
		buttonPanel.setBackground(new Color(241, 169, 242));
		add(buttonPanel, BorderLayout.PAGE_END);
		
		JButton shakeBall = new JButton("SHAKE");
		shakeBall.setBackground(Color.YELLOW);
		shakeBall.addActionListener(new ActionListener() {
			public void actionPerformed (ActionEvent e) {
				randomizePhrase();
			}
		});
		buttonPanel.add(shakeBall);
		
		
	}
	
	
	private void randomizePhrase() {
		String [] ballPhrases = {"odds aren't good", "odds are good", "no", "yes", "count on it", "don't count on it", "maybe", "ask again"};
		String phrase = ballPhrases[(int)(Math.random() * ballPhrases.length)];
		
	}
	


	private void add(JLabel titleLabel, String pageStart) {
		// TODO Auto-generated method stub
		
	}
	
}