import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Welcome implements ActionListener { 
	JFrame wFrame = new JFrame(); 
	JPanel wPanel = new JPanel();
	JLabel wLabel = new JLabel("Welcome to Monopoly");  
	JButton wButton = new JButton("Start"); 
	
	Welcome() {
	}
	
	public void WelcomePanel() { 
		wFrame.setSize(300,300); 
		wPanel.setBounds(50, 50, 200, 200); 
		wPanel.add(wLabel); 
		wPanel.add(wButton); 
		wButton.addActionListener(this); 
	}
	
	public void actionPerformed(ActionEvent e) { 
		wFrame.dispatchEvent(new WindowEvent(wFrame, WindowEvent.WINDOW_CLOSING));
	}
}

		
