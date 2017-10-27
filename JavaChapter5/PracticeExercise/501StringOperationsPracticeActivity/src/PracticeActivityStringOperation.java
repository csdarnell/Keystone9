
public class PracticeActivityStringOperation 
{
	public static void main(String args[])
	{
		String Name = "Evan Darnell";
		int len= Name.length();
		System.out.println("The amount of characters in "+ Name+ " is " + Name.length());
		for (int i =len -1; i >= 0; i--)
		{
		System.out.print(Name.charAt(i));
		}


	}
}
