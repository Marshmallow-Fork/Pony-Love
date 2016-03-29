package com.marshmallow.ponylove.states;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.marshmallow.ponylove.managers.GameStateManager;

public class SplashState extends State {

	public SplashState(GameStateManager gsm) {
		super(gsm);
	}
	
	@Override
	public void update(float dt) {
		System.out.println("UPDATING!!!");
	}
	
	@Override
	public void render(SpriteBatch batch) {
		
	}
	
	@Override
	public void dispose() {
		
	}
}
