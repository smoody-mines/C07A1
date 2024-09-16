package levelPieces;

import gameEngine.Drawable;
import gameEngine.InteractionResult;

public class Spike extends GamePiece implements Drawable {
	
	public Spike(int location) {
		super('^', "Spike", location);
	}
	// The spike will kill the player if they step on it.
	@Override
	public InteractionResult interact(Drawable[] gameBoard, int playerLocation) {
		// TODO Auto-generated method stub
		if (playerLocation == this.getLocation()) {
			return InteractionResult.KILL;
		}
		else {
			return InteractionResult.NONE;
		}
		
	}

}
