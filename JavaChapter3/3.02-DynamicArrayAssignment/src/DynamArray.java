/**********************************************************
 * 
 * Author: Evan Darnell
 * Class:  Programming:  Visual Basic.NET and Java
 * Semester:  2
 * Assignment Number:  3.02 - Dynamic Arrays
 * Assignment Instructions:  Revisit your program for generating the 
 * first 20 numbers Fibonacci series. Rewrite your program using dynamic array 
 * as shown in the example on the previous page.
 *
 */

public class DynamArray {
	public static int[] data;
	public static void main(String args[]) 
	{
		data = new int[1];
		System.out.println("Debug");
		int newsize = 20 * data.length;
		int[] newdata = new int[newsize];
		newdata[0] = 0;
		newdata[1] = 1;
		newdata[2] = 1;
		newdata[3] = 2;
		newdata[4] = 3;
		newdata[5] = 5;
		newdata[6] = 8;
		newdata[7] = 13;
		newdata[8] = 21;
		newdata[9] = 34;
		newdata[10] = 55;
		newdata[11] = 89;
		newdata[12] = 144;
		newdata[13] = 233;
		newdata[14] = 377;
		newdata[15] = 610;
		newdata[16] = 987;
		newdata[17] = 1597;
		newdata[18] = 2584;
		newdata[19] = 4181;
		System.arraycopy(data, 0, newdata, 0, data.length);
		data=newdata;
		for(int pos = 0; pos < 20; pos++) {
			System.out.println(data[pos]);
		}
	}
}
