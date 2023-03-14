package com.example.learningspring;

public class GameRunner {
    private final MarioGame marioGame;

    public GameRunner(MarioGame marioGame) {
        this.marioGame = marioGame;
    }

    public void run() {
        System.out.println("Running :" + this.marioGame);
        marioGame.down();
        marioGame.up();
        marioGame.left();
    }
}
