package civilization;

import java.util.Random;

public class gameBoard{
	private final ArrayList<Icon>[][] gameBoard;

	public gameBoard{
		gameBoard = new ArrayList<Icon>[20][20];
		
		/*
		*	Fill gameBoard with Terrain.
		*/

		fillGameBoard();
	}

	public ArrayList<Icon> getTile(int x, int y){
		return gameBoard[x][y];
	}

	public void addToTile(int x, int y, Icon a){
		gameBoard[x][y].add(a);
	}

	public void removeFromTile(int x, int y, Icon a){
		Iterator itr = gameBoard[x][y].iterator();
		itr.next();
			/*
			*	Automatically skip first index of ArrayList
			*	because that is the terrain which can't be 
			*	removed or changed.
			*/
		while(itr.hasNext()){
			Icon b = itr.next();
			if(b.equals(a)){
				/*
				*	NEED TO DEFINE EQUALITY FOR ALL ICONS
				*/
				itr.remove();
			}
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