package levelPieces;

import gameEngine.Drawable;
import gameEngine.InteractionResult;
import gameEngine.Moveable;

public class Cop extends GamePiece implements Drawable, Moveable {

	
	public Cop(int location) {
		super('C', "Cop", location);
	}
	
	@Override
	// The cop tries to chase down the player by moving in towards the player to the next open space, but will not move if directly next to the player.
	// note: last step is just to avoid the player landing on top of the cop without an interaction due to the order of processes in the gameEngine
	
	public void move(Drawable[] gameBoard, int playerLocation) { 
		
		// TODO Auto-generated method stub
		int step = 0;
		if(playerLocation > this.getLocation() + 1) {
			while(gameBoard[this.getLocation() + step] != null) {
				step += 1;
				if(this.getLocation() + step > 21) {
					step = 0;
					break;
				}
			}
		}
		else if(playerLocation < this.getLocation() - 1) {
			while(gameBoard[this.getLocation() + step] != null) {
				step -= 1;
				if(this.getLocation() + step < 0) {
					step = 0;
					break;
				}
			}
		}
		
		gameBoard[this.getLocation()] = null;
		gameBoard[this.getLocation() + step] = this;
		this.setLocation(this.getLocation() + step);
		
	}

	//If the player lands on the cop, the player loses
	@Override
	public InteractionResult interact(Drawable[] gameBoard, int playerLocation) { 
				if (playerLocation == this.getLocation()) {
					return InteractionResult.KILL;
				}
				else {
					return InteractionResult.NONE;
				}
	}
}
