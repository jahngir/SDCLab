package lab11;

import java.util.Scanner;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({})
public class AllTests {
	public static void main(String[] args)
	   {
	      Scanner input = new Scanner(System.in);
	      System.out.print("Enter an integer >> ");
	      int num = input.nextInt();

	      double divisibleByTwo = num % 2;

	      if(divisibleByTwo == 0)
	         System.out.println("The integer entered is even.");
	      else
	         System.out.println("The integer entered is odd.");   
	   }
	}	
}
