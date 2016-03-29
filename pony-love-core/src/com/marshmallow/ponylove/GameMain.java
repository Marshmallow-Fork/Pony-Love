package com.marshmallow.ponylove;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.marshmallow.ponylove.managers.GameStateManager;
import com.marshmallow.ponylove.states.SplashState;

public class GameMain implements ApplicationListener {

	public static final int APP_WIDTH = 640;
	public static final int APP_HEIGHT = 480;
	public static final boolean APP_RESIZABLE = true;

	public static final String APP_TITLE = "Pony Love Centre";
	public static final String APP_VERSION = "0.0.1"; //Release - build - patch
	
	private GameStateManager gsm;
	private SpriteBatch batch;
	
	@Override
	public void create () {
		gsm = new GameStateManager();
		batch = new SpriteBatch();
		Gdx.gl.glClearColor(0, 0, 0, 1);
		
		//start showing states
		gsm.push(new SplashState(gsm));
	}

	@Override
	public void render () {
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		gsm.update(Gdx.graphics.getDeltaTime());
		gsm.render(batch);
	}

	@Override
	public void resize(int width, int height) {
		
	}

	@Override
	public void pause() {
		
	}

	@Override
	public void resume() {
		
	}

	@Override
	public void dispose() {
		
	}
}
