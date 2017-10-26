	
import java.util.Scanner;
public class value {
 public static void main(String args[])
 {
  
  int x;
  int y;
  int choice = 0;
  Scanner in = new Scanner(System.in);
  System.out.println("This program will find the greatest number, out of two numbers.");
  
  //Acquiring the value of x via user input
  System.out.println("Please enter the first integer.");
  x = in.nextInt();
  
  //Acquiring the value of y via user input
  System.out.println("Please enter the other integer");
  y = in.nextInt();
  
  if(x>y)
  {
   choice = 1;
  }
  if(x==y)
  {
   choice = 2;
  }
  if(y>x)
  {
   choice = 3;
  }
  switch (choice)
  {
  case 1:
   System.out.print(x);
   System.out.print(" is greater than ");
   System.out.print(y);
   break;
  case 2:
   System.out.print(x);
   System.out.print(" is equal to ");
   System.out.print(y);
   break;
  case 3:
   System.out.print(y);
   System.out.print(" is greater than ");
   System.out.print(x);
   break;
  }
  
  }
 }