package levelPieces;

import gameEngine.Drawable;
import gameEngine.InteractionResult;

public class Bodybuilder extends GamePiece implements Drawable {
	public Bodybuilder(int location) {
		super('b', "Bodybuilder", location);
	}
	
	// The bodybuilder will start flexing (change symbols) if they notice anyone nearby (3 squares) he is otherwise harmless
	@Override
	public InteractionResult interact(Drawable[] gameBoard, int playerLocation) {
		// TODO Auto-generated method stub
		int playerDistance = Math.abs(playerLocation - this.getLocation());  //distance of player from this piece
		if(playerDistance <= 3 ) {
			this.symbol = 'B';
		}
		else{
			this.symbol = 'b';
		}
		return InteractionResult.NONE;
	}

}
