package com.mygdx.game.states;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygdx.game.FlappyBird;
import com.mygdx.game.sprites.Bird;
import com.mygdx.game.sprites.Tube;

public class PlayState extends State {
    private Bird bird;
    private Texture bg;
    private Tube tube;

    public PlayState(GameStateManager gsm) {
        super(gsm);
        bird = new Bird(50, 100);
        bg = new Texture("bg.png");
        cam.setToOrtho(false, FlappyBird.WIDTH / 2, FlappyBird.HEIGHT / 2);
        tube = new Tube(100);
    }

    @Override
    protected void handleInput() {
        if (Gdx.input.justTouched()) {
            bird.jump();
        }
    }

    @Override
    public void update(final float dt) {
        handleInput();
        bird.update(dt);
    }

    @Override
    public void render(final SpriteBatch sb) {
        sb.setProjectionMatrix(cam.combined);
        sb.begin();
        sb.draw(bg, cam.position.x - (cam.viewportWidth / 2), 0);
        sb.draw(bird.getTexture(), bird.getPosition().x, bird.getPosition().y);
        sb.draw(tube.getTopTube(),tube.getPosTopTube().x,tube.getPosTopTube().y);
        sb.draw(tube.getBottomTube(),tube.getPosBottomTube().x,tube.getPosBottomTube().y);
        sb.end();
    }

    @Override
    public void dispose() {

    }
}
