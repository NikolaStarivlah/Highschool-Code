//Airline Reservation System

//Nikola Starivlah
//March 23, 2017
//Allows for the user to reserve seats on a flight in either the economy or first class section. Program will ask 
//if they want to book more seats it will ask for y- yes or n- no and if they say yes the loop will continue and if
//no the loop will end and will tell the user to have a nice day 

//package title
import java.util.Scanner;//imports the scanner class to allow the user to enter their choice of seating
public class SeatsArray//class title 
{

	public static void main(String[] args) //title of main method
	{//start of main method

		Scanner keyboard = new Scanner(System.in);//creates a scanner named keyboard for keyboard input
		
		boolean [] firstClassSeats = new boolean [10];//creates a boolean array with 10 indexes to store the seats, each index is  set to false by default
		
		int firstClassCounter=0; // counts the amount of first class seats that are reserved
		int selection; //create a integer value variable to store the users seat selection
		int economyCounter = 5; //creates a variable that counts the amount of economy seats reserved
		int totalSeats = 0; //creates a variable that counts the total amount of seats that have been reserved by the user
		
		String secondChoice; //creates a string that stores the users answer when asked if they want to reserve more seats
		
		System.out.println("Welcome to the online reservation system."); // welcomes user to the program
		System.out.println(); //creates a blank line
		System.out.print("Please type 1 for First Class or type 2 for Economy: "); //tells the user what number they can press to choose either first class or economy
		
		selection = keyboard.nextInt(); //makes an integer keyboard input for the users choice and stores it in selection
		
		while (selection <=0 || selection >=3) // a while loop that will check if the selection is not between 1 and 2, while loop starts here
		{
			
		System.out.print("That is not a valid input. Please choose 1 for first class or 2 for ecconomy: ");//displays to the user that the number they entered is not a valid input
		
		selection = keyboard.nextInt(); //asks the user to re-enter an input to select
		} //while loop ends here
		
		if (selection ==1) //creates an if statement that checks if selection is equal to 1
		{
		
		firstClassCounter++; //1 is added to the firstClassCounter each time the user enters 1
		
		totalSeats++; //adds 1 to the totalSeats variable each time a seat is reserved
		
			if (firstClassCounter > 5) // if statement that will check if the are more than 5 first class seats reserved
			{
				
			System.out.print("First class is full. Would you like a seat in economy (y-Yes or n-No) : "); //tells the user that the first class seats are full and asks them if they would like an economy seat instead
				secondChoice=keyboard.next();//asks the user to enter their selection this is stored into secondChoice
				
				while (!secondChoice.equals ("y") && !secondChoice.equals ("n")) //checks if secondChoice variable is only equal to "y" or "n" if not it will output a invalid option message, while loop starts here
				{
					System.out.print("That is not a valid option. Enter (y-Yes or n-No) "); //displays to the user that what they have inputed is invalid and asks them to try again
					secondChoice = keyboard.next();//allows the user to enter their input again and stores it in secondChoice
				}//end of while loop
				
				if (secondChoice.equals("y")) //creates an if statement that checks if secondChoice is equal to "y"
				{
					economyCounter ++; //1 is added to the economyCounter when secondChoice is equal to "y"
					System.out.println("You have seat " +  economyCounter + " reserved in economy." ); //tells the user which seat they have reserved in the economy class
					firstClassCounter--;//removes 1 from firstClassCounter so it displays 5 instead of 6 seats reserved
				}
				while(secondChoice.equals("n"))// a while loop that checks if selection is equal to "n"
				{
					System.out.print("Thank you for using the online reservation system. Have a nice day."); //thanks the user for using the program and end the console
					System.exit(1);//ends the program without displaying the rest of the code
				}//end of while loop
				
				
			}//end of if statement
		
			if(firstClassCounter <= 5)//creates an if statement that checks if firstClassCounter is less than or equal to 5
			{//start of if statement
				System.out.println("You have seat " + firstClassCounter + " reserved in first class." );//displays the users choice and the seat they reserved
			}//end of if statement
		
		}//end of if statement
		
		if (selection ==2)//creates an if statement that checks if selection is equal to 2
		{//start of if statement
		economyCounter++;//adds 1 to the economy counter each time the user enters 2
		totalSeats++;//adds 1 to totalSeats variable every time a seat is reserved
		
		if (economyCounter > 10)//creates an if statement that checks is economyCounter is less than 5
		{//start of if statement
			System.out.print("Economy is full. Would you like a seat in first class (y-Yes or n-No) : ");//informs the user that the economy seats are full and asks them if they would like an first class seat instead
			secondChoice=keyboard.next();//creates a string keyboard input for the user to enter their choice
			
			while (!secondChoice.equals ("y") && !secondChoice.equals ("n"))//creates a while loop that applies the input validation on secondChoice
			{//start of while loop
				System.out.print("That is not a valid option. Enter (y-Yes or n-No) ");//displays to the user that what they have input is invalid and asks them to try again
				secondChoice = keyboard.next();//creates a string keyboard input for the user to enter their choice
			}//end of while loop
			
			if (secondChoice.equals("y"))//creates an if statement that checks if the secondChoice variable is equal to "y"
			{//start of if statement
				firstClassCounter ++;//adds one to the firstClassCounter when the user enters "y"
				System.out.println("You have seat " +  firstClassCounter + " reserved in economy." );//displays the users choice and the seat they reserved
				economyCounter--;//removes 1 from economyCounter so it displays 10 instead of 11
			}//end of if statement
			
			while(secondChoice.equals("n"))//creates a while loop that checks if secondChoice is equal to "n"
			{//start of while loop
				System.out.print("Thank you for using the online reservation system. Have a nice day.");//thanks the user for using the program and terminates the console
				System.exit(1);//ends the program without displaying the rest of the code
			}//end of while loop
		}//end of if statement
		
		if (economyCounter <=10)//creates a if statement that checks if economyCounter is less than or equal to 5
		{//start of if statement
			System.out.println("You have seat " +  economyCounter + " reserved in economy." );//displays the users choice and which seat they reserved
		}//end of if statement
		
		}//end of if statement
		
		System.out.println();//creates a blank line
		
		if (selection ==1 || selection ==2)////creates an if statement that checks if selection was a valid input
		{//start of if statement
		System.out.print("Would you like to reserve another seat (y-Yes or n-No) : ");//displays text asking if the user would like to reserve another seat and gives instruction on how
		}//end of if statement
		
		secondChoice = keyboard.next();//creates a string keyboard input outside of the if statement and stores it in secondChoice
				
			while (!secondChoice.equals ("y") && !secondChoice.equals ("n"))//creates a while loop that applies input validation on secondChoice
			{//start of while loop
				System.out.print("That is not a valid option. Enter (y-Yes or n-No) ");//displays text telling the user that their input was not valid and asks them to try again
				secondChoice = keyboard.next();//creates a string keyboard input and stores it in secondChoice
			}//end of while loop
			
			while ( secondChoice.equals("y"))//create a while loop that checks if the users answer was "y"
			{//start of while loop
			System.out.print("Please type 1 for First Class or type 2 for Economy: ");//asks the user to select another type of seat
			selection = keyboard.nextInt();//creates another integer keyboard input and stores it in selection
			
			while (selection <=0 || selection >=3)//creates another while loop that checks if selection is not within the proper range
			{//start of while loop
			System.out.print("That is not a valid input. Please choose 1 for first class or 2 for economy: ");//displays to the user that they did not input valid a number
			selection = keyboard.nextInt();//creates another integer keyboard input and stores it in selection
			}//end of while loop
			
			if (selection ==1)//creates a if statement that checks if selection is equal to 1
			{//start of if statement
			firstClassCounter++;//adds 1 to firstClassCounter every time selection is equal to 1
			totalSeats++;//adds 1 to totalSales whenever a seat is reserved
			
			if (firstClassCounter > 5)
			{
				System.out.print("First class is full. Would you like a seat in economy (y-Yes or n-No) : ");
				secondChoice=keyboard.next();
				
				while (!secondChoice.equals ("y") && !secondChoice.equals ("n"))
				{
					System.out.print("That is not a valid option. Enter (y-Yes or n-No) ");
					secondChoice = keyboard.next();
				}
				
				if (secondChoice.equals("y"))
				{
					economyCounter ++;
					System.out.println("You have seat " +  economyCounter + " reserved in economy." );
					firstClassCounter--;
				}
				
				while(secondChoice.equals("n"))
				{
					System.out.print("Thank you for using the online reservation system. Have a nice day.");//thanks the user for using the program and terminates the console
					System.exit(1);
				}
				
			}
				
			if(firstClassCounter <= 5)
			{
				System.out.println("You have seat " + firstClassCounter + " reserved in first class." );//displays the users choice and the seat they reserved
			}

			}//end of if statement
			
			if (selection ==2)//creates an if statement to check if selection is equal to 2
			{//start of if statement
			economyCounter++;//adds 1 to economyCounter each time selection is equal to 2
			totalSeats++;
			
			if (economyCounter > 10)
			{
				System.out.print("Economy is full. Would you like a seat in first class (y-Yes or n-No) : ");
				secondChoice=keyboard.next();
				
				while (!secondChoice.equals ("y") && !secondChoice.equals ("n"))
				{
					System.out.print("That is not a valid option. Enter (y-Yes or n-No) ");
					secondChoice = keyboard.next();
				}
				
				if (secondChoice.equals("y"))
				{
					firstClassCounter ++;
					System.out.println("You have seat " +  firstClassCounter + " reserved in first class." );
					economyCounter--;
				}
				
				while(secondChoice.equals("n"))
				{
					System.out.print("Thank you for using the online reservation system. Have a nice day.");//thanks the user for using the program and terminates the console
					System.exit(1);
				}
				
			}
			
			if (economyCounter <=10)
			{
				System.out.println("You have seat " +  economyCounter + " reserved in economy." );//displays the users choice and which seat is reserved
			}
			
			}//end of if statement
			
			System.out.println();//creates a blank line
			
			if (selection ==1 || selection ==2)//creates an if statement to check if selection is within the range of 1-2
			{//start of if statement
			System.out.print("Would you like to reserve another seat (y-Yes or n-No) : ");//asks the user if they would like to reserve another seat and provides instruction on how to do so
			}//end of if statement
			
			secondChoice = keyboard.next();//creates another string keyboard input and stores it in secondChoice
			
			while (!secondChoice.equals ("y") && !secondChoice.equals ("n"))
			{
				System.out.print("That is not a valid option. Enter (y-Yes or n-No) ");
				secondChoice = keyboard.next();
			}
			
			while (totalSeats ==10)
			{
				System.out.print("The flight is full. ");
				System.out.print("Thank you for using the online reservation system. Have a nice day.");
				System.exit(1);
			}
			
		}//end of while loop
			
		if (secondChoice.equals("n"))//creates an if statement to check if the user entered "n"
		{//start of if statement
		System.out.print("Thank you for using the online reservation system. Have a nice day.");//thanks the user for using the program and terminates the console
		}//end of if statement

		
			
	}//end of main method
	
}//end of class
