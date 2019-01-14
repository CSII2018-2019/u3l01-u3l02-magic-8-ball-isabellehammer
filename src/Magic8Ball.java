
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
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
		
		JLabel titleLabel = new JLabel("Magic 8 Ball");
		
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
		
		JButton shakeBall = new JButton("Shake the ball to recieve a message.");
		shakeBall.setBackground(Color.YELLOW);
		buttonPanel.add(shakeBall);
		
		
	}
	
}