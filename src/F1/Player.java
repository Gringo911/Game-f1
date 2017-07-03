package F1;


import java.awt.Image;
 
import javax.swing.ImageIcon;


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
			
		}
		layer1 -= v;
		layer2  -= v;
		
	}
}


