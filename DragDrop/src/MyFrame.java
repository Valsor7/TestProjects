import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class MyFrame extends JFrame {

	private JButton btnDel;
	private MyPanel panel;
	private JPanel mainPanel;

	public MyFrame() {
		// TODO Auto-generated constructor stub
		setSize(400, 400);
		setLayout(new BorderLayout());
		panel = new MyPanel();
		mainPanel = new JPanel();
		btnDel = new JButton("delete");
		mainPanel.add(btnDel);
		add(mainPanel, BorderLayout.SOUTH);
		add(panel, BorderLayout.CENTER);
		btnDel.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				int check = panel.getNumb();
				if (check > 0) {
					panel.remove(panel.delBtn());
					panel.repaint();
				}	
			}	
		});
	}
}
