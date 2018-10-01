package civilization;

public class Hills implements terrain{
	private final int production;
	private final int resource;
	private final String type;
	private boolean farmed;
	private boolean mined;
	private final int[] location;
	// {x, y}

	public Hills(int x, int y){
		type = "Hills";
		resource = 1;
		production = 2;
		location = new int[2] {x,y};
		mined = false;
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

	public void mine(){
		if(farmed){
			System.out.println("Removing Farm...");
			removeFarm();
		}
		resource = 1;
		production = 3;
		type += "(Mined)";
		mined = true;
	}

	public void removeMine(){
		resource = 1;
		production = 2;
		type = "Hills";
		mined = false;
	}

	public void farm(){
		if(mined){
			System.out.println("Removing Mine...");
			removeMine();
		}
		resource = 2;
		production = 2;
		type += "(Farmed)";
		farmed = true;
	}

	public void removeFarm(){
		resource = 1;
		production = 2;
		type = "Hills";
		farmed = false;
	}

	public String toString(){
		return type;
	}
}