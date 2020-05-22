package com.mygdx.game.states;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygdx.game.FlappyBird;

public class MenuState extends State {
    private Texture background;
    private Texture playBtn;

    public MenuState(final GameStateManager gsm) {
        super(gsm);
        background = new Texture("bg.png");
        playBtn = new Texture("playbtn.png");
    }

    @Override
    public void handleInput() {

    }

    @Override
    public void update(final float dt) {

    }

    @Override
    public void render(final SpriteBatch sb) {
        sb.begin();
        sb.draw(background,0,0, FlappyBird.WIDTH,FlappyBird.HEIGHT);
        sb.draw(playBtn,(FlappyBird.WIDTH/2) - (playBtn.getWidth()/2),FlappyBird.HEIGHT/2);
        sb.end();
    }
}
