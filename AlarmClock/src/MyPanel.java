import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Timer;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class MyPanel extends JPanel implements ActionListener {
	
	private JTextField hourField;
	private JTextField minField;
	private JButton btnSet;
	private int hour;
	private int min;
	private Boolean isEnabled;

	public MyPanel() {
		// TODO Auto-generated constructor stub
		setSize(200, 200);
		minField = new JTextField(2);
		hourField = new JTextField(2);
		add(new JLabel("hours:"));
		add(hourField);
		add(new JLabel("minutes:"));
		add(minField);
		btnSet = new JButton("set");
		btnSet.addActionListener(this);
		add(btnSet);

	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
		if (!(minField.getText().equals("") || hourField.getText().equals(""))) {
			min = Integer.parseInt(minField.getText());
			hour = Integer.parseInt(hourField.getText());
		} else {
			JOptionPane.showMessageDialog(new JFrame(), "enter correctly time", "Innane worning", JOptionPane.WARNING_MESSAGE);
		}
		
		if (hour>24 || min > 59 ) {
			JOptionPane.showMessageDialog(new JFrame(), "enter correctly time", "Innane worning", JOptionPane.WARNING_MESSAGE);
		} else {
			isEnabled = true;
			Thread t = new Thread(new Runnable() {
				@Override
				public void run() {
					// TODO Auto-generated method stub
					while(isEnabled){
						alarmTime(hour, min);
					}
				}
			});
			t.start();
		}	
	}
	
	private void alarmTime(int hour, int min){
		GregorianCalendar cal = new GregorianCalendar();
		int currH = cal.get(GregorianCalendar.HOUR_OF_DAY);
		int currM = cal.get(GregorianCalendar.MINUTE);
		if (hour == currH && min == currM) {
			JOptionPane.showMessageDialog(new JFrame(), "Your alarm");
			isEnabled = false;
		}
	}
	
}
