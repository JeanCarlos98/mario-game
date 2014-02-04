package nl.arjanfrans.mario.model;

import nl.arjanfrans.mario.graphics.Tiles;

import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.Touchable;


public class Flag extends Actor {
	private Animation animation;
	private float stateTime;
	private float endX;
	private float endY;
	
	public Flag(float x, float y, float width, float height, float endX, float endY) {
		animation = Tiles.getAnimation(0.15f, "evil_flag");
		animation.setPlayMode(Animation.LOOP_PINGPONG);
		this.setOrigin(width / 2, height);
		this.setBounds(x + (8 * World.scale), y, 2 * World.scale, height);
		this.setTouchable(Touchable.disabled);
		this.endX = endX;
		this.endY = endY;
	}
	
	@Override
	public void act(float delta) {
		stateTime += delta;
		super.act(delta);
	}


	@Override
	public void draw(SpriteBatch batch, float parentAlpha) {
		batch.draw(animation.getKeyFrame(stateTime), this.getX() - (1 * World.scale), this.getHeight() , 
				animation.getKeyFrame(stateTime).getRegionWidth() * World.scale, animation.getKeyFrame(stateTime).getRegionHeight() * World.scale);
	}
	
	public Rectangle rect() {
		return new Rectangle(this.getX(), this.getY(), this.getWidth(), this.getHeight());
	}

	public float getEndX() {
		return endX;
	}

	public float getEndY() {
		return endY;
	}
	
	


}
