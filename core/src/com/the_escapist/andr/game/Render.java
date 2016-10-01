package com.the_escapist.andr.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

/**
 * Created by NKostya on 01.10.2016.
 */
public class Render {

    private World world;
    private OrthographicCamera orthographicCamera;
    private ShapeRenderer shapeRenderer;

    public Render(World world) {
        this.world = world;
        orthographicCamera = new OrthographicCamera();
        orthographicCamera.setToOrtho(true, 136, 204);
        shapeRenderer = new ShapeRenderer();
        shapeRenderer.setProjectionMatrix(orthographicCamera.combined);
    }

    public void render() {
//        Gdx.app.log("GameScreen", "renderer");
        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        shapeRenderer.begin(ShapeRenderer.ShapeType.Filled);

        shapeRenderer.setColor(87/255.0f, 109/255.0f, 120/255.0f, 1);

//        shapeRenderer.rect(world.getRectangle().x, world.getRectangle().y, world.getRectangle().width, world.getRectangle().height);

        shapeRenderer.end();
    }
}
