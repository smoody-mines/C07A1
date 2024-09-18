package levelPieces;

import gameEngine.Drawable;
import gameEngine.InteractionResult;
import gameEngine.Moveable;

public class Coin extends GamePiece implements Drawable {

	public Coin(int location) {
		super('O', "Coin", location);
	}
	private boolean collected = false;// keeps track of whether or not the coin has been picked up.
	
	// Step on the same space as a coin to collect it.
	@Override
	public InteractionResult interact(Drawable[] gameBoard, int playerLocation) {
		if ( !collected && playerLocation == this.getLocation()) {
			this.symbol = ' '; // make disappear after collecting
			collected = true;
			return InteractionResult.GET_POINT;
		}
		else {
			return InteractionResult.NONE;
		}
		
	}

}
