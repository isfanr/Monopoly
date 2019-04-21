/*import java.awt.*;
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
}*/
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Welcome implements ActionListener { 
	JFrame wFrame = new JFrame(); 
	JPanel wPanel = new JPanel();
	JLabel wLabel = new JLabel("Welcome to Monopoly"); 
	JButton wButton = new JButton("START"); 
	
	public static void main(String[] args) {
		new Welcome();
	}
	
	public Welcome() { 
		
		wFrame.setSize(300,300); 
		wFrame.getContentPane().setBackground(Color.black);
		wFrame.setLayout(null);
		wFrame.setVisible(true);		
		
		wPanel.setBounds(50, 50, 200, 200);
		wFrame.add(wPanel);
		
		wLabel.setForeground(Color.black);
		wPanel.add(wLabel); 		
		
		wButton.setBounds(275, 400, 60, 80);
		wPanel.add(wButton);

		wButton.addActionListener(this); 
	}
	
	public void NewGame() {
		
		String nama1 = JOptionPane.showInputDialog(null, "Pemain 1: ", "New Game", JOptionPane.QUESTION_MESSAGE);		
		String nama2 = JOptionPane.showInputDialog(null, "Pemain 2: ", "New Game", JOptionPane.QUESTION_MESSAGE);
		String cmd = JOptionPane.showInputDialog(null, "Ketik 'MULAI' ", "New Game", JOptionPane.QUESTION_MESSAGE);
	}
	public void actionPerformed(ActionEvent e) { 
		wFrame.dispatchEvent(new WindowEvent(wFrame, WindowEvent.WINDOW_CLOSING));
		NewGame();
	}
}

		
