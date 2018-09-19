import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
public class Validating
	{

		public static void main(String[] args) 
		{
			userPath1();
			userPath2();	
			// Lets user choose path
			
		}
			
		public static void userPath1()
		{
			
			// Lets User Choose a Path 
			Scanner userPath = new Scanner(System.in);
			System.out.println("Please choose either ");
			System.out.println("1: I would like to input my credit card number.");
			System.out.println("or");
			System.out.println("2: I would like to input random numbers.");
			int userChoice = userPath.nextInt();
			
						Long[] userNumberArray = new Long[16];
						Long[] userNumberArray2 = new Long[16];
			// Path 1
			
			if(userChoice == 1)
				{
			// Stores Credit Card # In Array 
					
					System.out.println("Please input your credit card number");
					Scanner userInput = new Scanner(System.in);
					Long userNumber = userInput.nextLong();
					for(int i = 15; i >= 0; i--)
						{
							Long digitStripping = userNumber%10;
							userNumberArray[i] = digitStripping;
							userNumber = userNumber/10;
						}
					
				// Doubles every other digit 
				
					for (int i = 0; i < 16; i = i+2)
						{
							userNumberArray[i] = userNumberArray[i]*2;
						}
					
				// Adds double digit numbers 	
					for (int i = 0; i < 16; i++)
						{
							if (i % 2 == 0)
								{
									if(userNumberArray[i] > 9)
										{
											long secondDigit = userNumberArray[i] % 10;
											long firstDigit = userNumberArray[i] / 10;
											long addDigits = secondDigit + firstDigit;
											userNumberArray[i] = addDigits;
										}
								}
						}
				
					// Adds all digits 
					long sum = 0;
					for (int i = 0; i < 16; i++)
						{
							sum = sum + userNumberArray[i];
						}
					
					// Tells if card is valid or not 
					if (sum % 10 == 0)
						{
							System.out.println("Your credit card is valid");
						}
					else 
						{
							System.out.println("Your credit card is not valid");
						}
						
			}
			
		}
			
		
		public static void userPath2()
		{
		if (userChoice == 2)
				{
					Scanner file1 = new Scanner (new File ("creditCardNumbers.txt"));

					while (file1.hasNext()) 
					{
						System.out.println(file1.next());
					}
					
				}
		}
		
	}
