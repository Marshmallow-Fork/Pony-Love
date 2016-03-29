package com.marshmallow.ponylove.entities;

import com.badlogic.gdx.math.Vector2;

/**
 * 
 * 
 * @see Entity
 * @author Northern Sprint
 */
public class MoveableEntity extends Entity {

	/** Current speed direction */
	protected Vector2 dir;
	/** New speed direction */
	protected Vector2 ndir;
	/** Current speed */
	protected float speed;
	/** New speed */
	protected float nspeed;
	/** Acceleration */
	protected float accel;
	/** Speed of rotation */
	protected float rspeed;
	protected float friction;
	
	public MoveableEntity() {
		super();
		dir = new Vector2();
		speed = 0.0f;
	}
	
	public void update(float dt) {
		
	}
	
	/**
	 * 
	 * @param dir
	 * @param speed
	 */
	public void setMovement(Vector2 dir, float speed) {
		
	}
	
	/**
	 * 
	 * @param rot Rotation in degrees
	 */
	public void rotate(float rot) {
		dir.rotate(rot);
	}
	
	/**
	 * Do not call this for movement
	 * @see MoveableEntity setMovement()
	 */
	@Override
	public void setPos(Vector2 pos) {
		super.setPos(pos);
	}
}
