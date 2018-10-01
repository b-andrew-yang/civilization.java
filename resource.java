package civilization;

interface Resource extends Icon{
	public int getValue();
	// no setValue because resource limit can't be changed

	public String getType();
}