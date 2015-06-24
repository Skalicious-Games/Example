package framework;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import window.Handler;

public class KeyInput extends KeyAdapter{
	
	Handler handler;
	
	public KeyInput(Handler handler){
		this.handler = handler;
	}
	
	public void keyPressed(KeyEvent e){
		int key = e.getKeyCode();
		
		for(int i = 0; i < handler.object.size(); i++){
			
			GameObject tempObject = handler.object.get(i);
			
			if(tempObject.getId() == ObjectId.Player){
				//Right Press
				if(key == KeyEvent.VK_D) tempObject.setVelX(5);
				//Left Press
				if(key == KeyEvent.VK_A) tempObject.setVelX(-5);
			}
		}
		
		
		if (key == KeyEvent.VK_ESCAPE){
			System.exit(1);
		}
	}
	
	public void keyReleased(KeyEvent e){
		int key = e.getKeyCode();
		
		for(int i = 0; i < handler.object.size(); i++){
			GameObject tempObject = handler.object.get(i);
			if(tempObject.getId() == ObjectId.Player){
				//Right Press
				if(key == KeyEvent.VK_D) tempObject.setVelX(0);
				//Left Press
				if(key == KeyEvent.VK_A) tempObject.setVelX(0);
				//Space Press
				if(key == KeyEvent.VK_SPACE) tempObject.setVelY(-10);
			}
		}
		
	}
	
}
