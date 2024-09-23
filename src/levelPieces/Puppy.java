package levelPieces;

import gameEngine.Drawable;
import gameEngine.InteractionResult;

public class Puppy extends GamePiece implements Drawable {
	
	public Puppy(int location) {
		super('p', "Puppy", location);
	}
	// Pet the puppy (step on same square) to advance levels.
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
