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
	
	public void update(float dt) {}
	public void render(SpriteBatch batch) {}
	
}
