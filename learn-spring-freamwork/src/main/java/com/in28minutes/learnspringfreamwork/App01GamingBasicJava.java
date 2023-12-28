package com.in28minutes.learnspringfreamwork;

import com.in28minutes.learnspringfreamwork.game.Gamerunner;
import com.in28minutes.learnspringfreamwork.game.MarioGame;
import com.in28minutes.learnspringfreamwork.game.PacmanGame;
import com.in28minutes.learnspringfreamwork.game.SuperContraGame;

public class App01GamingBasicJava {

	public static void main(String[] args) {

				//var Game =new MarioGame();
		//var Game = new SuperContraGame();
		var Game = new PacmanGame();
		var gameRunner =new Gamerunner(Game);
     gameRunner.run();
	}

}
