package com.in28minutes.learnspringfreamwork.game;

public class Gamerunner {
	private GamingConsol game;
public Gamerunner (GamingConsol game) {
	this.game=game;
}
public void run() {
	System.out.println("Running game: "+ game);
	game.up();
	game.down();
	game.left();
	game.right();
}
}
