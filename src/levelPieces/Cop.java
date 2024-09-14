package levelPieces;

import gameEngine.Drawable;
import gameEngine.InteractionResult;
import gameEngine.Moveable;

public class Cop extends GamePiece implements Drawable, Moveable {

	
	public Cop(int location) {
		super('C', "Cop", location);
	}
	
	@Override
	public void move(Drawable[] gameBoard, int playerLocation) {
		
		// TODO Auto-generated method stub
		int step = 0;
		if(playerLocation > this.getLocation()) {
			while(gameBoard[this.getLocation() + step] != null) {
				step += 1;
				if(this.getLocation() + step > 21) {
					step = 0;
					break;
				}
			}
		}
		else {
			while(gameBoard[this.getLocation() + step] != null) {
				step -= 1;
				if(this.getLocation() + step < 0) {
					step = 0;
					break;
				}
			}
		}
		this.setLocation(this.getLocation() + step);
		gameBoard[this.getLocation()] = null;
		gameBoard[this.getLocation() + step] = this;
		
	}

	@Override
	public InteractionResult interact(Drawable[] gameBoard, int playerLocation) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				if (playerLocation == this.getLocation()) {
					return InteractionResult.KILL;
				}
				else {
					return InteractionResult.NONE;
				}
	}
}
