import java.util.Arrays;
import java.util.Scanner;
public class Validating
	{

		public static void main(String[] args)
		{
			Scanner userPath = new Scanner(System.in);
			System.out.println("Please choose either ");
			System.out.println("1: I would like to input my credit card number.");
			System.out.println("or");
			System.out.println("2: I would like to input random numbers.");
			int userChoice = userPath.nextInt();
			
			Long[] userNumberArray = new Long[16];
			
			if(userChoice == 1)
				{
					System.out.println("Please input your credit card number");
					Scanner userInput = new Scanner(System.in);
					Long userNumber = userInput.nextLong();
					for(int i = 15; i >= 0; i--)
						{
							Long digitStripping = userNumber%10;
							userNumberArray[i] = digitStripping;
							userNumber = userNumber/10;
							
						}
					for(int i = 0; i < userNumberArray.length; i++)
						{
							System.out.println(userNumberArray[i]);
						}
				}
			
		}
		
	}
