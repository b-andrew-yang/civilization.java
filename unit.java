package civilization;

interface Unit extends Icon{
	public void setLocation(int x, int y);
	public int[] getLocation(int x, int y);
	public void move();
	public int getHealth();
	public int getMoveLimits();
}