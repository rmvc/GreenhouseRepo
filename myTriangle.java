import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class myTriangle {
	
	InputStreamReader inputRead = new InputStreamReader(System.in);
	BufferedReader buffRead = new BufferedReader(inputRead);
	
	Triangle thisTriangle = new Triangle();
	
  public static void main(String[] args) throws IOException {
	
	  new myTriangle();
  }
	
  public myTriangle() {
		sideOne();
		sideTwo();
		sideThree();
		System.out.println(thisTriangle.getType());
  }
	
	
	
	private void sideOne()
	{
		System.out.println("Enter the First Side: ");
		try 
		{
			int value = Integer.parseInt(buffRead.readLine());
			if (value1 > 0)
			{
				thisTriangle.setSideOne(value);
			}
			else 
			{
				System.out.println("Please enter a value greater than 0");
				sideOne();
			}
		}
		catch (Exception exp)
		{
			System.out.println("Please Enter a numeric value: ");
			sideOne();
		}
	}
	
	private void sideTwo()
	{
		System.out.println("Enter the Second Side: ");
		try 
		{
			int value = Integer.parseInt(buffRead.readLine());
			if (value > 0)
			{
				thisTriangle.setSideTwo(value);
			}
			else 
			{
				System.out.println("Please enter a value greater than 0");
				sideTwo();
			}
		}
		catch (Exception exp)
		{
			System.out.println("Please Enter a numeric value in range: ");
			sideTwo();
		}
	}
	
	private void sideThree()
	{
		System.out.println("Enter the Thrird Side: ");
		try 
		{
			int value = Integer.parseInt(buffRead.readLine());
			if (value > 0)
			{
				thisTriangle.setSideThree(value);
			}
			else 
			{
				System.out.println("Please enter a value greater than 0");
				sideThree();
			}
		}
		catch (Exception exp)
		{
			System.out.println("Please Enter a numeric value: ");
			sideThree();
		}
	}

}
