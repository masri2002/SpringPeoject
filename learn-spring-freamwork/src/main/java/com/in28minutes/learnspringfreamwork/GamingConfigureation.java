package com.in28minutes.learnspringfreamwork;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.in28minutes.learnspringfreamwork.game.Gamerunner;
import com.in28minutes.learnspringfreamwork.game.GamingConsol;
import com.in28minutes.learnspringfreamwork.game.MarioGame;
import com.in28minutes.learnspringfreamwork.game.PacmanGame;
import com.in28minutes.learnspringfreamwork.game.SuperContraGame;


@Configuration
public class GamingConfigureation {
@Bean
@Primary
public GamingConsol game() {
	var game =new PacmanGame();
	return game;
	
}
@Bean
@Qualifier("game2")
public GamingConsol game2() {
	var game =new MarioGame();
	return game;
	
}

@Bean
@Primary
public Gamerunner gamerunner (GamingConsol game) {
	Gamerunner games=new Gamerunner(game);
	return games;
}
@Bean(name = "game21")
public Gamerunner gamerunner2 (@Qualifier("game2") GamingConsol game2) {
	Gamerunner games=new Gamerunner(game2);
    games.run();   
	return games;
}

//@Bean
//public GamingConsol game2() {
//	var game =new MarioGame();
//	return game;
//	
//}
//@Bean
//public GamingConsol game3() {
//	var game =new SuperContraGame();
//	return game;
//	
//}
}
