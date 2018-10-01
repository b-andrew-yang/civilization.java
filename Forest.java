package civilization;

public class Forest implements terrain{
	private final int production;
	private final int resource;
	private final String type;
	private boolean farmed;
	private boolean milled;
	private final int[] location;
	// {x, y}

	public Forest(int x, int y){
		type = "Forest";
		resource = 1;
		production = 1;
		location = new int[2] {x,y};
		milled = false;
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

	public void mill(){
		if(farmed){
			System.out.println("Removing Farm...");
			removeFarm();
		}
		production++;
		type += "(Milled)";
		milled = true;
	}

	public void removeMill(){
		resource = 1;
		production = 2;
		type = "Forest";
		mined = false;
	}

	public void farm(){
		if(milled){
			System.out.println("Removing Milled...");
			removeMill();
		}
		resource = 2;
		production = 2;
		type += "(Farmed)";
		farmed = true;
	}

	public void removeFarm(){
		resource = 1;
		production = 2;
		type = "Forest";
		farmed = false;
	}

	public String toString(){
		return type;
	}
}