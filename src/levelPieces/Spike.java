package levelPieces;

import gameEngine.Drawable;
import gameEngine.InteractionResult;

public class Spike extends GamePiece implements Drawable {
	
	public Spike(int location) {
		super('^', "Spike", location);
	}
	@Override
	public InteractionResult interact(Drawable[] gameBoard, int playerLocation) {
		// TODO Auto-generated method stub
		if (playerLocation == this.getLocation()) {
			return InteractionResult.ADVANCE;
		}
		else {
			return InteractionResult.NONE;
		}
		
	}

}
