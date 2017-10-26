import java.util.Scanner;
/*Grade "Excellent": Marks>75
Grade "Satisfactory": 75>Marks>50
Grade "Needs Improvement": 50>Marks>40
Grade "Failing": Marks<40*/
public class Qu10 {
 public static void main(String args[])
 {
 Scanner in = new Scanner(System.in);
 int grade;
 int outcome;
 outcome = 0;
 System.out.println("What was your grade?");
 grade = in.nextInt();
 if(grade<40)
 {
  outcome = 1;
 }
 if(grade>40 && 50>grade)
 {
  outcome = 2;
 }
 if(grade>50 && 75>grade)
 {
  outcome = 3;
 }
 if(grade>75)
 {
  outcome = 4;
 }
 switch (outcome) 
 {
 case 1:
  System.out.println(grade + " is a failing grade.");
  break;
 case 2:
  System.out.println("Needs Improvement.");
  break;
 case 3:
  System.out.println("Satisfactory grade.");
  break;
 case 4:
  System.out.println("This is an excellent grade!");
  break;
 }
 }
}