// Isaac Hartzell
// January 26, 2017
// This program demonstrates a more user friendly calculator with looping.


import java.util.Scanner;
public class Week3AssignmentV3 
{
	public static void main(String[] args) 
	{
	double firstNum;
	double secondNum;
	double lowerLim;
	double upperLim;
	int counter = 0;
	int numberChoice;										// Don't ever declare variables in loops!
	Scanner input = new Scanner(System.in);
	
		do
		{
			System.out.println("Menu");						// Menu prints once then counter is zero.
			System.out.println("1. Add");					
			System.out.println("2. Subtract");
			System.out.println("3. Multiply");
			System.out.println("4. Divide");
			System.out.println("5. Generate Random Number ");
			System.out.println("6. Quit \n");
			System.out.print("What would you like to do? Pick a number 1-6:");
			numberChoice = input.nextInt();
			
			while ((numberChoice < 1 || numberChoice > 6) && counter < 2)	
			{
				// Starts at 0, once counter = 2, it goes down to the bottom if statement on line 99.
				// The menu will print once for counter = zero then once for counter = 1;
				// counter is set < 2 because the menu is already printed once there-for, it just
				// needs to account for incorrect input two more times.
				counter++;
				
				System.out.println("I'm sorry," + numberChoice + " wasn't one of the options.\n");
				System.out.println("Menu");
				System.out.println("1. Add");
				System.out.println("2. Subtract");
				System.out.println("3. Multiply");
				System.out.println("4. Divide");
				System.out.println("5. Generate Random Number ");
				System.out.println("6. Quit \n");
				System.out.print("What would you like to do? Pick a number 1-6:");
				numberChoice = input.nextInt();
			}
			if (numberChoice == 1)
			{
				System.out.print("What is the first number?");
				firstNum = input.nextDouble();
				System.out.print("What is the second number?");
				secondNum = input.nextDouble();
				System.out.println("Answer:" + (firstNum + secondNum) +"\n");
			}
			else if (numberChoice == 2)
			{
				System.out.print("What is the first number?");
				firstNum = input.nextDouble();
				System.out.print("What is the second number?");
				secondNum = input.nextDouble();
				System.out.println("Answer:" + (firstNum - secondNum) +"\n");		
			}
			else if (numberChoice == 3)
			{
				System.out.print("What is the first number?");
				firstNum = input.nextDouble();
				System.out.print("What is the second number?");
				secondNum = input.nextDouble();
				System.out.println("Answer:" + (firstNum * secondNum) +"\n");
			}
			else if (numberChoice == 4)
			{
				System.out.print("What is the first number?");
				firstNum = input.nextDouble();
				System.out.print("What is the second number");
				secondNum = input.nextDouble();
				
					while (secondNum == 0)
					{
						System.out.print("Devision by zero isn't allowed, please enter a second number:");
						secondNum = input.nextDouble();
						
					}
					System.out.println("Answer:" + (firstNum / secondNum) + "\n");
			}
			else if (numberChoice == 5)
			{
				System.out.print("What is the lower limit?");
				lowerLim = input.nextDouble();
				System.out.print("What is the upper limit?");
				upperLim = input.nextDouble();
				System.out.println("Answer:" + (Math.random() * (upperLim - lowerLim) + (lowerLim)) +"\n");
			}
			else if (numberChoice == 6)
			{
				System.out.println("Goodbye! Thank you for using Isaac's calculator.");
				counter = 0;	// Counter reset so that output doesn't say line 79 and line 93.
			}
			if (counter == 2)	// Conclusion to counter, after three attempts user drops out.
			{
				System.out.println("I'm sorry please try again later.");
			}
		}while((numberChoice >=1 && numberChoice <= 5) && counter !=2);
	}

}
