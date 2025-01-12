import java.util.Scanner;

import org.omg.Messaging.SyncScopeHelper;
public class SeatsAssignment {

	public static void main(String[] args) 
	{
		int choice = 0;
		int rowchoice = 0;
		int columnchoice = 0;
		Scanner keyboard = new Scanner(System.in);
		
		do
		{
			
		
		
		
int [][] seats = { { 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 },
				{ 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 },
				{ 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 },
				{ 10, 10, 20, 20, 20, 20, 20, 20, 10, 10 },
				{ 10, 10, 20, 20, 20, 20, 20, 20, 10, 10 },
				{ 10, 10, 20, 20, 20, 20, 20, 20, 10, 10 },
				{ 20, 20, 30, 30, 40, 40, 30, 30, 20, 20 },
				{ 20, 30, 30, 40, 50, 50, 40, 30, 30, 20 },
				{ 30, 40, 50, 50, 50, 50, 50, 50, 40, 30 } };
		
		
		
		
		System.out.println("                        "  + "SEATS");
		System.out.print("         A    B    C    D    E    F    G    H    I    J");
		System.out.println();
		
		
		System.out.print("Row 9");
		for (int i = 0; i < seats[0].length; i++) 
		{
			System.out.print("   " + seats[0][i]);
		}
		System.out.println();
		
		System.out.print("Row 8");
		for (int i = 0; i < seats[1].length; i++) 
		{
			System.out.print("   " + seats[1][i]);
			
		}
		System.out.println();
		
		System.out.print("Row 7");
		for (int i = 0; i < seats[2].length; i++) 
		{
			System.out.print("   " + seats[2][i]);
			
		}
		System.out.println();
		
		System.out.print("Row 6");
		for (int i = 0; i < seats[3].length; i++) 
		{
			System.out.print("   " + seats[3][i]);
			
		}
		
        System.out.println();
		
		System.out.print("Row 5");
		for (int i = 0; i < seats[4].length; i++) 
		{
			System.out.print("   " + seats[4][i]);
			
		}
		
		System.out.println();
		
		System.out.print("Row 4");
		for (int i = 0; i < seats[5].length; i++) 
		{
			System.out.print("   " + seats[5][i]);
			
		}
		
		System.out.println();
		
		System.out.print("Row 3");
		for (int i = 0; i < seats[6].length; i++) 
		{
			System.out.print("   " + seats[6][i]);
			
		}
		
		System.out.println();
		
		System.out.print("Row 2");
		for (int i = 0; i < seats[7].length; i++) 
		{
			System.out.print("   " + seats[7][i]);
			
		}
		
		System.out.println();
		
		System.out.print("Row 1");
		for (int i = 0; i < seats[8].length; i++) 
		{
			System.out.print("   " + seats[8][i]);
			
		}
		


	
	System.out.println();
	System.out.println("The above is a birds eye veiw of all the seating avilible at corpus christi theater for the arts. ");
	System.out.println("Row one is the closest to the stage while row 9 represents the back of the theater. You can either choose");
	System.out.println("A seat by entering thr row and seat letter, or you can choose a seat by entering the price");
	System.out.println();
	System.out.println("Enter 1 to choose by seat or 2 to choose by price");
	//Scanner keyboard = new Scanner(System.in);
	choice  = keyboard.nextInt();
	
	while(choice < 1 || choice > 2)
	{
		System.out.println("That is not valid please enter either 1 or 2");
		choice = keyboard.nextInt();
	}
	
	if(choice == 1)
	{
		
		
		
		System.out.println("Enter row: ");
		rowchoice = keyboard.nextInt();
		rowchoice = rowchoice;
		
		
		while(rowchoice < 1 || rowchoice > 9)
		{
			System.out.println("That is not a valif row,please enter a number from 1-9");
			rowchoice = keyboard.nextInt();
		}
		
		if(rowchoice > 1 || rowchoice < 9)
		{
			
	
		System.out.println("Enter seat: ");
		columnchoice = keyboard.nextInt();
		
		String input;
		input = keyboard.nextLine();
		
		//.toUpperCase();
		
		switch(input.toLowerCase())
		{
		case "a":
			columnchoice = 'a';
			System.out.println("a");
		break;
		case "b":
			columnchoice = 'b';
			System.out.println("b");
		break;
		case "c":
			columnchoice = 'c';
			System.out.println("c");
		break;
		case "d":
			columnchoice = 'd';
			System.out.println("d");
		break;	
		case "e":
			columnchoice = 'e';
			System.out.println("e");
		break;
		case"f":
			columnchoice = 'f';
			System.out.println("f");
		break;
		case"g":
			columnchoice = 'g';
			System.out.println("g");
		break;
		case"h":
			columnchoice = 'h';
			System.out.println("h");
		break;
		case"i":
			columnchoice = 'i';
			System.out.println("i");
		break;
		case"j":
			columnchoice = 'j';
			System.out.println("j");
		break;
		
	    //default:
		//System.out.println("That is not a valid seat, please choose from seat A to J: ");
		//input = keyboard.nextLine();
		//break;
		}
		
		}
			
	}
	
	if(choice == 2)
	{
		System.out.println("66666666");
		choice = keyboard.nextInt();
	}
	
	
	
	
	}while(choice == 1 || choice ==2);
		
	
		}
	}

		
	//enter 1 to choose by seat or price
	//making sure user enters 1 or 2
	//if user enters 1 it should prompt user for row number 
	//user can only enter number from 1-9 for row numbers(if not inform them)
	//program asks user for seat letter once user enters valid row number
//^seat letter has to be from A-J
//program has to print updated seating arrangment showing an xx chosen by the user (in red) also has to rerint the map
//aow the user to put in another seat after one seat has been chosen (re run all code)
//if user enters 2 it will ask to "Enter a price (10, 20, 30, 40 or 50)"
//^ can olny be those numbers if not run a loop that will keep asking for correct number
	
			
	

		



