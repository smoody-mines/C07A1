package levelPieces;

import gameEngine.Drawable;
import gameEngine.InteractionResult;
import gameEngine.Moveable;

public class Coin extends GamePiece implements Drawable {

	public Coin(int location) {
		super('O', "Coin", location);
	}
	// Step on the same space as a coin to collect it.
	@Override
	public InteractionResult interact(Drawable[] gameBoard, int playerLocation) {
		if (playerLocation == this.getLocation()) {
			return InteractionResult.GET_POINT;
		}
		else {
			return InteractionResult.NONE;
		}
		
	}

}
