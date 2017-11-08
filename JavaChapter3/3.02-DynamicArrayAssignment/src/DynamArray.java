/**********************************************************
 * 
 * Filename:  DynamArray.java
 * Author: Evan Darnell
 * Class:  Programming:  Visual Basic.NET and Java
 * Semester:  2
 * Assignment Number:  3.02 - Dynamic Arrays
 * Description:  Use a Dynamic Array to produce a Fibonacci Series
 *
 */

public class DynamArray 
{
	public static int[] data;
	public static void main(String args[]) 
	{
		int pl; //Placement

		data = new int[1]; // Dimming the "data" array
		System.out.println("Debug");
		int newsize = 20 * data.length; // Dimming the size of the new array.
		int[] newdata = new int[newsize];
		newdata(0) = 0;
		newdata(1) = 1;
		newdata(2) = 1;
		for(pl = 3; pl <= 20; pl++)
		{
			 newdata(
			
			newdata(pl) = newdata(pl-1) + newdata(pl-2)); 
		}
		
		System.arraycopy(data, 0, newdata, 0, data.length);
		data=newdata;
		for(int pos = 0; pos < 20; pos++) {
			System.out.println(data[pos]);
		}
	}
}
class Dynam
{

	
}