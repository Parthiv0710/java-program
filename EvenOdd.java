import java.util.Scanner;

public class EvenOdd
{
   public static void main(String arg[])
     {
         System.out.println("Enter the number:");
	 Scanner reader = new Scanner(System.in);
	 int num = reader.nextInt();
	 reader.close();
	 if(num%2 == 0)
	   {
             System.out.println("Entered number " + num + " is an Even number");
           }
         else
           {
             System.out.println("Entered number " + num + " is an Odd number");
           }
     }
}