public class week
{
 public static void main(String[] args)
 {
  System.out.println("test");
  for(weekd=7; weekd>0; weekd--) 
  {
   switch (weekd)
   {
   case 1:
    System.out.println("Monday");
    break;
   case 2:
    System.out.println("Tuesday");
    break;
   case 3:
    System.out.println("Wensday");
    break;
   case 4:
    System.out.println("Thursday");
    break;
   case 5:
    System.out.println("Friday");
    break;
   case 6:
    System.out.println("Saturday");
    break;
   case 7:
    System.out.println("Sunday");
    break;
   default:
    System.out.println("This input is not assigned to a day of the week.");
    break;
   }
  }
  
 }
 
}