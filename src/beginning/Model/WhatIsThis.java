package beginning.Model;

public class WhatIsThis
{
	public String getDescription()
	{
		return description;
	}

	public void setDescription(String description)
	{
		this.description = description;
	}

	public int getClassCounter()
	{
		return classCounter;
	}

	public void setClassCounter(int classCounter)
	{
		this.classCounter = classCounter;
	}

	private String description;
	private int classCounter;
	
	public WhatIsThis()
	{
		this.description = "";
		this.classCounter = -10;
	}

}
