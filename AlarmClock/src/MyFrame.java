import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class MyFrame extends JFrame {

	public MyFrame() {
		// TODO Auto-generated constructor stub
		setSize(400, 400);
		setLocation(300, 300);
		setLayout(new BorderLayout());
		MyPanel panel = new MyPanel();
		add(panel, BorderLayout.CENTER);
		pack();
	}	
	
	
	
}