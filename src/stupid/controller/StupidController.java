package stupid.controller;

import java.util.Scanner;
/**
 * 
 * @author Zach Stout
 *
 */
public class StupidController
{
	public void start()
	{	
		System.out.println("I love to play soccer and eat food");
	}
{
	
}
	private void testScanner()
    {
	   Scanner firstScanner;
	   Scanner scanner = firstScanner = new Scanner(System.in);
	   System.out.println("what is your favorite food?");
	   String answer = firstScanner.nextLine();
	   System.out.println("Oh cool, you like" + answer);
}
}