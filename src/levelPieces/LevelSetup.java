package levelPieces;

import gameEngine.Drawable;

public class LevelSetup {
	
	
	private Drawable[] board;
	
	public void createLevel(int levelNum){
		
		if (levelNum == 1) {level1();}
		
		else if(levelNum == 2) {level2();}
		
		else {
			System.out.println("Recieved Level not 1 or 2");
		}
	
	}
	
	private void level1(){
		board = new Drawable[BOARD_SIZE];
	}
	
	private void level2(){
		
	}


}
