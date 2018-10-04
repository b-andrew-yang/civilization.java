package civilization;

import java.util.Random;

public class altitudeMap{
	private static final int[][] altitudeMap;
	private static final int x;
	private static final int y;

	public altitudeMap(int x, int y){
		this.x = x;
		this.y = y;
		altitudeMap = new int[x][y];

		fillAltitudeMap();
	}

	public void fillAltitudeMap(){
		/*
		*	fillAltitudeMap: Uses diamond-square algorithm to 
		*					 create a random altitude map.
		*	https://en.wikipedia.org/wiki/Diamond-square_algorithm
		*/
		Random rand = new Random();

		for(int i = 0; i< 4; i++){
			if(i == 0){
				altitudeMap[0][0] = rand.nextInt(100);
			}else if(i == 1){
				altitudeMap[0][y - 1] = rand.nextInt(100);
			}else if(i == 2){
				altitudeMap[x - 1][0] = rand.nextInt(100);
			}else if(i == 3){
				altitudeMap[x - 1][y - 1] = rand.nextInt(100);
			}
		}

		
	}
}