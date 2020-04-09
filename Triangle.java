/* Program Name:    Triangle.java
   By:              CSCI 405 Class
   Date-Written:    4/7/2020
                                 */


public class Triangle {

	int sideOne = 0;
	int sideTwo = 0;
	
	public float getAreaBob(    )  {
		
	}

	
	public void setSideOne(int sOne)
	{
		sideOne = sOne;
	}
	
	public int getSideOne ()
	{
		
		return sideOne;
	}
	
	public void setSideTwo(int sTwo)
	{
		sideTwo = sTwo;
	}
	
	public void setSideThree(int sThree)
	{
		sideThree = sThree;
	}
	
	public String getType()
	{
		if (sideOne == sideTwo)
		{
			if (sideTwo == sideThree)
			{
				return "You have an Equilateral Triangle";
			}
			else
			{
				return "You have an Isoceles Triangle";
			}
		}
		else
		{
			if (sideOne == sideThree)
			{
				return "You have an Isoceles Triangle";
			}
			if (sideTwo == sideThree)
			{
				return "You have an Isoceles Triangle";
			}
			else
			{
			return "You have a Scalene Triangle";
			}
		}
	}
}
