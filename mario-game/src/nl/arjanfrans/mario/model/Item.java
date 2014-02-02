package nl.arjanfrans.mario.model;

import com.badlogic.gdx.math.Interpolation;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.actions.Actions;

public class Item extends Actor {
	protected World world;
	
	public Item(World world, boolean visible) {
		this.world = world;
		this.setVisible(visible);
	}
	
	

}
