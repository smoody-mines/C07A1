package levelPieces;

import gameEngine.Drawable;
import gameEngine.InteractionResult;
import gameEngine.Moveable;

public class Bonus extends GamePiece implements Drawable, Moveable {

	//Bonus gives the player a point, and moves away from the player by 1 step in each turn
	public Bonus(int location) {
		super('B', "bonus", location);
		// TODO Auto-generated constructor stub
	}
	

	@Override
	public void move(Drawable[] gameBoard, int playerLocation) {
		// TODO Auto-generated method stub
		int step;
		if(playerLocation > this.getLocation()) {
			step = -1;
			if(this.getLocation() - 1 < 0){
				step = 0;
			}
		}
		else {
			step = 1;
			if(this.getLocation() + step >21) {
				step = 0;
			}
		}
		this.setLocation(this.getLocation() + step);
		gameBoard[this.getLocation()] = null;
		gameBoard[this.getLocation() + step] = this;
		
	}

	@Override
	public InteractionResult interact(Drawable[] gameBoard, int playerLocation) {
		// TODO Auto-generated method stub
		if (playerLocation == this.getLocation()) {
			return InteractionResult.GET_POINT;
		}
		else {
			return InteractionResult.NONE;
		}
	}

}
