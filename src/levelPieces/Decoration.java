package levelPieces;

import gameEngine.Drawable;
import gameEngine.GameEngine;

public class Decoration implements Drawable {

	//This class will not be a gamePiece, it will only be drawn and will not do anything else
	
	private int location;
	private char symbol = 'D';
	
	public Decoration(int location) {
		// TODO Auto- constructor stub
		this.location = location;
	}
	
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println(symbol);
	}
	
	public int getLocation() {
		return location;
	}
	
	/**
	 * @param newLocation - location to place piece
	 */
	public void setLocation(int newLocation) {
		// Ensure the location remains on the board
		if (newLocation >= 0 && newLocation < GameEngine.BOARD_SIZE)
			location = newLocation;
	}

}
