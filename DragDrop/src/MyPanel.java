import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.geom.Point2D;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.TransferHandler;


public class MyPanel extends JPanel implements MouseListener, MouseMotionListener {
	
	private int numb = 0;
	private Point btnPoint;
	private boolean isEnable;
	
	public MyPanel() {
		// TODO Auto-generated constructor stub
		setSize(200, 200);
		setLayout(null);
		this.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				super.mouseClicked(e);
				isEnable = true;
				if (isEnable) {
					btnPoint = e.getPoint();
					addBtn();
					isEnable = false;	
				}
			}
		});
		
	}
	public void addBtn() {
		numb++;
		JButton btn = new JButton(String.valueOf(numb));
		add(btn);
		btn.setBounds(btnPoint.x, btnPoint.y, 50, 25);
		btn.addMouseListener(this);
		btn.addMouseMotionListener(this);
		revalidate();
	}
	
	
	
	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void mouseDragged(MouseEvent arg0) {
		// TODO Auto-generated method stub
		try {
			Point p = this.getMousePosition();
			arg0.getComponent().setLocation(p);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		revalidate();
	
	}
	
	@Override
	public void mouseMoved(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	public int getNumb(){
		return numb;
	}
	public int  delBtn() {
		// TODO Auto-generated method stub
		numb--;
		return numb;
	}
	
	
	
}
