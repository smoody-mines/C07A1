package levelPieces;

import gameEngine.Drawable;
import gameEngine.InteractionResult;

public class Wizard extends GamePiece implements Drawable {
	
	public Wizard(int location) {
		super('W', "Wizard", location);
	}
	
	// The Wizard will hit the player if the player is within 2 spaces.
	@Override
	public InteractionResult interact(Drawable[] gameBoard, int playerLocation) {
		// TODO Auto-generated method stub
		if( Math.abs(playerLocation - this.getLocation()) <= 2) {
			return InteractionResult.HIT;
		}
		return InteractionResult.NONE;
		
	}

}