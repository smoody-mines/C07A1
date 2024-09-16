package levelPieces;

import gameEngine.Drawable;
import gameEngine.InteractionResult;

public class Sitter extends GamePiece implements Drawable {
	
	public Sitter(int location) {
		super('S', "Sitter", location);
	}
	// first class object made for testing. Currently advances to the next level.
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
