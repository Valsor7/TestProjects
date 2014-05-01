import java.awt.EventQueue;

import javax.swing.JFrame;


public class Main {
	public static void main(String[]  args) {
		EventQueue.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				MyFrame frame = new MyFrame();
				frame.setVisible(true);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			}
		});
		 
	}
}		