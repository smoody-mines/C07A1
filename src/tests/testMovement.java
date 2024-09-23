package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import gameEngine.Drawable;
import gameEngine.GameEngine;
import levelPieces.Bonus;
import levelPieces.Cop;
import levelPieces.Spike;

class testMovement {



	@Test
	void testCop() {
		Drawable [] gameBoard = new Drawable[GameEngine.BOARD_SIZE];
		Cop cop = new Cop(0);
		gameBoard[0] = cop;
		gameBoard[1] = new Spike(1);
		gameBoard[3] = new Spike(3);
		gameBoard[4] = new Spike(4);
		int playerLoc = 20;
		
		// first move and test. Should approach player and jump over 1 spike
		cop.move(gameBoard, playerLoc);
		assertEquals(cop.getLocation(), 2);
		
		// second move and tests. Should approach player and jump over 2 spikes
		cop.move(gameBoard, playerLoc);
		assertEquals(cop.getLocation(), 5);
		
		// moves cop 14 times to index 19
		for(int i = 0; i < 15; i++) { 
			cop.move(gameBoard, playerLoc);
		}
		assertEquals(cop.getLocation(), 19);
		cop.move(gameBoard, playerLoc);
		//Since the player is one space away. The cop could not move.
		assertEquals(cop.getLocation(), 19); 
	}
	
	@Test
	void testBonus() {
		Drawable [] gameBoard = new Drawable[GameEngine.BOARD_SIZE];
		Bonus bonus = new Bonus(3);
		gameBoard[3] = bonus;
		int playerLoc = 4;
		
		bonus.move(gameBoard, playerLoc);
		assertEquals(bonus.getLocation(), 2); //should move away from the player
		playerLoc--; // player will follow one step
		
		bonus.move(gameBoard, playerLoc);
		assertEquals(bonus.getLocation(), 1); //should move away from the player
		playerLoc--; // player will follow one step
		
		bonus.move(gameBoard, playerLoc);
		assertEquals(bonus.getLocation(), 0); //should move away from the player
		playerLoc--; // player will follow one step
		
		bonus.move(gameBoard, playerLoc);
		assertEquals(bonus.getLocation(), 0); //should not be able to move due to boundary
		
	}

}
