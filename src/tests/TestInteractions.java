package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import gameEngine.Drawable;
import gameEngine.GameEngine;
import gameEngine.InteractionResult;
import levelPieces.Bodybuilder;
import levelPieces.Bonus;
import levelPieces.Coin;
import levelPieces.Cop;
import levelPieces.Puppy;

class TestInteractions {

	@Test
	public void testBodyBuilder() {
		Drawable [] gameBoard = new Drawable[GameEngine.BOARD_SIZE];
		Bodybuilder bBuilder = new Bodybuilder(5);
		gameBoard[5] = bBuilder;
		assertEquals(InteractionResult.NONE, bBuilder.interact(gameBoard, 5));
	}
	
	@Test
	public void testBonus() {
		Drawable [] gameBoard = new Drawable[GameEngine.BOARD_SIZE];
		Bonus bonus = new Bonus(4);
		gameBoard[4] = bonus;
		assertEquals(InteractionResult.GET_POINT, bonus.interact(gameBoard, 4));
	}
	
	@Test
	public void testCoin() {
		Drawable [] gameBoard = new Drawable[GameEngine.BOARD_SIZE];
		Coin coin = new Coin(4);
		gameBoard[4] = coin;
		assertEquals(InteractionResult.GET_POINT, coin.interact(gameBoard, 4));
	}
	
	@Test
	public void testCop() {
		Drawable [] gameBoard = new Drawable[GameEngine.BOARD_SIZE];
		Cop cop = new Cop(4);
		gameBoard[4] = cop;
		assertEquals(InteractionResult.KILL, cop.interact(gameBoard, 4));
	}
	
	@Test
	public void testPuppy() {
		Drawable [] gameBoard = new Drawable[GameEngine.BOARD_SIZE];
		Puppy puppy = new Puppy(4);
		gameBoard[4] = puppy;
		assertEquals(InteractionResult.ADVANCE, puppy.interact(gameBoard, 4));
	}
}
