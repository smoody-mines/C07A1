package levelPieces;

import java.util.ArrayList;

import gameEngine.Drawable;
import gameEngine.Moveable;

public class LevelSetup {
	private int playerStartLoc = 7;
	
	private ArrayList<Moveable> movingPieces;
	private ArrayList<GamePiece> interactingPieces;
	Drawable[] board;
	
	public void createLevel(int levelNum){ //create initial levels. Calls appropriate level method
		board = new Drawable[21];
		interactingPieces = new ArrayList<GamePiece>();
		movingPieces = new ArrayList<Moveable>();
		
		if (levelNum == 1) {level1();}
		
		else if(levelNum == 2) {level2();}
		
		else {
			System.out.println("Recieved Level not 1 or 2");
		}
	
	}
	
	private void level1(){ //place a number of gamePieces on the board for level 1
		insertPuppy(3);
		insertSpike(1);
		insertCoin(4);
		insertCoin(8);
		insertWizard(17);
	}
	
	private void level2(){ //place a number of gamePieces on the board for  level 2
		insertPuppy(1);
		insertSpike(4);
		insertSpike(10);
		insertCop(11);
		
		
	}
	
	/*
	 * The following insert___ functions will place one of the according game pieces at the index given.
	 * They will also add new pieces to interactingPieces or movingPieces when appropriate.
	 */
	
	private void insertPuppy(int position) {
		Puppy newPiece = new Puppy(position); 
		board[position] = newPiece;
		interactingPieces.add(newPiece);
	}
	
	private void insertCoin(int position) {
		Coin newPiece = new Coin(position); 
		board[position] = newPiece;
		interactingPieces.add(newPiece);
	}
	
	private void insertSpike(int position) {
		Spike newPiece = new Spike(position); 
		board[position] = newPiece;
		interactingPieces.add(newPiece);
	}
	
	private void insertWizard(int position) {
		Wizard newPiece = new Wizard(position); 
		board[position] = newPiece;
		interactingPieces.add(newPiece);
	}
	
	private void insertCop(int position) {
		Cop newPiece = new Cop(position); 
		board[position] = newPiece;
		interactingPieces.add(newPiece);
		movingPieces.add(newPiece);
	}
	
	public int getPlayerStartLoc() {
		return playerStartLoc;
	}

	public Drawable[] getBoard() {
		return board;
	}

	public ArrayList<Moveable> getMovingPieces() {
		return movingPieces;
	}

	public ArrayList<GamePiece> getInteractingPieces() {
		return interactingPieces;
	}


}
