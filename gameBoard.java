package civilization;

import java.util.Random;

public class gameBoard{
	private final Icon[][] terrainBoard;
	private final Icon[][] buildingBoard;
	private final Icon[][] unitBoard;
	private final Icon[][] overflowUnit;

	public gameBoard() {
		terrainBoard = new Icon[20][20];
		buildingBoard = new Icon[20][20];
		unitBoard = new Icon[20][20];
		overflowUnit = new Icon[20][20];
		
		/*
		*	Fill gameBoard with Terrain.
		*/

		fillGameBoard();
	}

	public static enum BoardType{
		TERRAIN, BUILDING, UNIT, OVERFLOW
	}

	public Icon getTile(int x, int y, BoardType boardType){
		if(boardType == null){
			throw new IllegalArgumentException("Please specify board type:");
		}
		
		Icon tileIcon;

		if(boardType == BoardType.TERRAIN){
			tileIcon = terrainBoard[x][y];
		}else if(boardType == BoardType.BUILDING){
			tileIcon = buildingBoard[x][y];
		}else if(boardType == BoardType.UNIT){
			tileIcon = unitBoard[x][y];
		}else if(boardType == BoardType.OVERFLOW){
			tileIcon = overflowUnit[x][y];
		}
		return tileIcon;
	}

	public boolean addToTile(int x, int y, Icon a, BoardType boardtype){
		boolean validAdd;

		switch(boardtype){
			case TERRAIN:
				if(terrainBoard[x][y] == null){
					terrainBoard[x][y] = a;
					validAdd = true;
				}else{
					validAdd = false;
					break;
				}
			case BUILDING:
				if(buildingBoard[x][y] == null){
					buildingBoard[x][y] = a;
					validAdd = true;
				}else{
					validAdd = false;
					break;
				}
			case UNIT:
				if(unitBoard[x][y] == null){
					unitBoard[x][y] = a;
					validAdd = true;
				}else{
					validAdd = false;
					break;
				}
			case OVERFLOW:
				if(overflowUnit[x][y] == null){
					overflowUnit[x][y] = a;

					/*
					*	TO DO: FORCE ONE UNIT TO MOVE BEFORE
					*		   VALID ADD CAN BE TRUE
					*/

					validAdd = true;
				}else{
					validAdd = false;
					break;
				}
		}
		return validAdd;
	}

	public void removeFromTile(int x, int y, BoardType boardType){
		/*
		*	removeFromTile: Removes the designated type from the 
		* 					corresponding board. No terrain remove
		*					because they are final and cannot change.
		*/
		if(boardType == BoardType.BUILDING){
			buildingBoard[x][y] = null;
		}else if(boardType == BoardType.UNIT){
			unitBoard[x][y] = null;
		}else if(boardType == BoardType.OVERFLOW){
			overflowUnit[x][y] == null;
		}
	}

	public void fillGameBoard(){
		Random rand = new Random();

		for(int i = 0; i< 20; i++){
			for(int j = 0; j< 20; j++){
				int terrType = rand.nextInt(4);
				if(terrType == 0){
					// add plains
				}else if(terrType == 1){
					// add hills
				}else if(terrType == 2){
					// add forest
				}else if(terrType == 3){
					// add water
				}
			}
		}
	}
}