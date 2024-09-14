package levelPieces;

import java.util.ArrayList;

import gameEngine.Drawable;
import gameEngine.Moveable;

public class LevelSetup {
	private int playerStartLoc = 7;
	
	private ArrayList<Moveable> movingPieces;
	private ArrayList<GamePiece> interactingPieces;
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
		board[0] = new Sitter(0);
	}
	
	private void level2(){
		board = new Drawable[21];
		board[0] = new Sitter(6);
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
