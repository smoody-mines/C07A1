package levelPieces;

import gameEngine.Drawable;
import gameEngine.InteractionResult;

public class Flower extends GamePiece implements Drawable {
	public Flower(int location) {
		super('F', "Flower", location);
	}
	private boolean crushed;
	// The flower will not do anything except crumble (change symbols) if stepped on.
	@Override
	public InteractionResult interact(Drawable[] gameBoard, int playerLocation) {
		// TODO Auto-generated method stub
		if(!crushed && playerLocation == this.getLocation()) {
			this.symbol = 'f';
			crushed = true;
		}
		return InteractionResult.NONE;
	}

}
