package F1;

import java.awt.Graphics2D;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

import javax.swing.Timer;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Road extends JPanel implements  ActionListener {
	
	Timer mainTimer = new Timer(20, this);
	
	Image img = new ImageIcon("res/road.png").getImage();
	
	Player p = new Player();
	
	public Road(){
		mainTimer.start();
	}
	
	public void paint(Graphics g) {
		g = (Graphics2D)g;
		g.drawImage(img, p.layer1, 0,null);
		g.drawImage(img, p.layer2, 0,null);
		g.drawImage(p.img, p.x, p.y, null);
	}
	
	public void actionPerformed(ActionEvent e){
		p.move();
		repaint();
	}
	}


