package civilization;

public class Plains implements Terrain{
	private final int production;
	private final int resource;
	private final String type;
	private boolean farmed;
	private final int[] location;
	// {x, y}

	public Plains(int x, int y){
		type = "Plains";
		resource = 1;
		production = 1;
		location = new int[2] {x,y};
		farmed = false;
	}

	public String getType(){
		return type;
	}

	public int[] getLocation(){
		return location;
	}

	public int getProduction(){
		return production;
	}

	public int getResource(){
		return resource;
	}

	public void farm(){
		resource = 3;
		production = 1;
		type += "(farmed)";
		farmed = true;
	}

	public void removeFarm(){
		resource = 1;
		production = 1;
		type = "Plains";
		farmed = false;
	}

	public String toString(){
		return type;
	}
}