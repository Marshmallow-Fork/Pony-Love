package com.marshmallow.ponylove.entities;

import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;

/**
 * Basic Entity class that holds a position, rotation and a boundary box.
 * 
 * @see MoveableEntity
 * @author Northern Sprint
 */
public abstract class Entity {

	protected Rectangle bounds;
	/** rotation in radians */
	protected Vector2 rotation;
	protected Vector2 pos;
	
	public Entity() {
		this(new Rectangle(), new Vector2(0.0f, 0.0f), new Vector2(0.0f, 0.0f));
	}
	
	public Entity(Rectangle bounds, Vector2 pos, Vector2 rotation) {
		this.bounds = bounds;
		this.pos = pos;
		this.rotation = rotation;
	}
	
	public void setPos(Vector2 pos) {
		this.pos = pos;
	}
	
	public void draw() {}

}
