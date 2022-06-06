package lab11;

import java.util.Scanner;

public class factorial {
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


