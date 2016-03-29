package com.marshmallow.ponylove.states;

import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector3;
import com.marshmallow.ponylove.managers.GameStateManager;

public abstract class State {
	
	protected GameStateManager gsm;
	protected Vector3 mouse;
	protected OrthographicCamera cam;
	
	public State(GameStateManager gsm) {
		this.gsm = gsm;
	}
	
	/**
	 * Called every frame.
	 * @param dt delta time
	 */
	public void update(float dt) {}
	
	/**
	 * Called every frame after the update function.
	 * @param batch the universal SpriteBatch (do not create a new SpriteBatch)
	 */
	public void render(SpriteBatch batch) {}
	
	/**
	 * Called when switching states.
	 * <br/><br/>
	 * You should call the dispose function on child objects. Ie, Textures, Sprites...
	 */
	public void dispose() {}
	
}
