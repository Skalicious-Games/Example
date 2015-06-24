package window;

import java.awt.Graphics;
import java.util.LinkedList;

import Objects.Block;
import framework.GameObject;
import framework.ObjectId;

public class Handler {

	public LinkedList<GameObject> object = new LinkedList<GameObject>();
	
	private GameObject tempObject;
	
	public void tick(){
		for(int i = 0; i < object.size(); i++){
			tempObject = object.get(i);		
			tempObject.tick(object);
		}
	}
	
	public void render(Graphics g){
		for(int i = 0; i < object.size(); i++){
			tempObject = object.get(i);
			tempObject.render(g);
		}
	}
	
	public void addObject(GameObject object){
		this.object.add(object);
	}
	
	public void removeObject(GameObject object){
		this.object.remove(object);
	}
	
	
	public void createLevel(){
		for (int xx = 0; xx < Game.WIDTH+32; xx+= 32) {
			addObject(new Block(xx, Game.HEIGHT-32, ObjectId.Block));
			addObject(new Block(Game.WIDTH-32, xx, ObjectId.Block));
			addObject(new Block(0, xx, ObjectId.Block));
		}
	}
}
