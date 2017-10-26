/**********************************************************
 * 
 * Filename:  Binary_Search.java
 * Author: Evan Darnell
 * Class:  Programming:  Visual Basic.NET and Java
 * Semester:  2
 * Assignment Number:  3.06 - Array Unit Project
 * Description:  A Java program to find the value 45.3 from this list ={-3,10,5,24,45.3,10.5} using the binary search method.  
 *
 */
public class Binary_Search 
{
	public static final int notfound = -1;
	public static int binarySearch(int[] a, int x) 
	// Can't tell what's wrong here, save this for last pls. we could talk over a game of Magic! 
	{
		int low =0;
		int high= a.length;
		int mid;
		while(low <= high)
		{
			mid = (low+high) /2;
			if(a[mid].compareTo(x) < 0)
				low = mid +1;
			else if(a[mid].compareTo(x) > 0)
				high = mid -1;
			else
				return mid;
		}
		return notfound;
	}
	public static void main(String[]args) 
	{
		int size =8;
		int[] a = new int[size];
		for(int i = 0; i < size; i++)
			a[i] = new Integer(i*2) ;
		for(int i = 0; i<size * 2; i++)
			System.out.println("Found " +i+"at "+ binarySearch(a,new Integer(i)));
	}
}
 