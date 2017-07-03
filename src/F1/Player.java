package F1;


import java.awt.Image;
 


import java.awt.Image;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Player {
   
    Image img = new ImageIcon("res/carjneleft.png").getImage();
	
	int v = 12;
	int dv = 0;
	int s = 0;
	
	int x = 30;
	int y = 500;
	
	int layer1 = 0;
	int layer2 = 1200;
	public void move() {
		
		s +=v;
		if (layer2 - v <= 0){
			layer1 = 0;
			layer2 = 1200;
		} else {
			
		
		layer1 -= v;
		layer2  -= v;
		
	}

}
public void  keyPressed(KeyEvent e){
	JOptionPane.showMessageDialog(null,"key pressed");
	
}

public void keyReleased(KeyEvent e){
	JOptionPane.showMessageDialog(null,"key released");	
}

}

