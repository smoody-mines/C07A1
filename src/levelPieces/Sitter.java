package levelPieces;

import gameEngine.Drawable;
import gameEngine.InteractionResult;

public class Sitter extends GamePiece implements Drawable {
	
	public Sitter(int location) {
		super('S', "Sitter", location);
	}

	@Override
	public InteractionResult interact(Drawable[] gameBoard, int playerLocation) {
		// TODO Auto-generated method stub
		return InteractionResult.ADVANCE;
	}

}
