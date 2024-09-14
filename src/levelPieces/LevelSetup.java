package levelPieces;

import java.util.ArrayList;

import gameEngine.Drawable;
import gameEngine.Moveable;

public class LevelSetup {
	private int playerStartLoc = 7;
	
	private ArrayList<Moveable> movingPieces = new ArrayList<Moveable>();
	private ArrayList<GamePiece> interactingPieces = new ArrayList<GamePiece>();
	private Drawable[] board;
	
	public void createLevel(int levelNum){
		
		if (levelNum == 1) {level1();}
		
		else if(levelNum == 2) {level2();}
		
		else {
			System.out.println("Recieved Level not 1 or 2");
		}
	
	}
	
	private void level1(){
		board = new Drawable[21];
		insertSitter(3);
		insertSpike(1);
	}
	
	private void level2(){
		board = new Drawable[21];
		insertSitter(1);
		insertSpike(4);
		insertSpike(10);
		
		
	}
	
	private void insertSitter(int position) {
		Sitter newPiece = new Sitter(position); 
		board[position] = newPiece;
		interactingPieces.add(newPiece);
	}
	
	private void insertSpike(int position) {
		Spike newPiece = new Spike(position); 
		board[position] = newPiece;
		interactingPieces.add(newPiece);
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
