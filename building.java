package civilization;

interface Building extends Icon{
	public int getHealth();
	public String getType();
	public int getProduction();
	public void setProduction();
	public int getResourceCost();
	public void setResourceCost();
}