import java.util.Scanner;

import org.omg.Messaging.SyncScopeHelper;
public class SeatsAssignment {

	public static void main(String[] args) 
	{
		
		
		
		int choice=0;
		int [][] seats = { { 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 },
				{ 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 },
				{ 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 },
				{ 10, 10, 20, 20, 20, 20, 20, 20, 10, 10 },
				{ 10, 10, 20, 20, 20, 20, 20, 20, 10, 10 },
				{ 10, 10, 20, 20, 20, 20, 20, 20, 10, 10 },
				{ 20, 20, 30, 30, 40, 40, 30, 30, 20, 20 },
				{ 20, 30, 30, 40, 50, 50, 40, 30, 30, 20 },
				{ 30, 40, 50, 50, 50, 50, 50, 50, 40, 30 } };
		
		System.out.println("         SEATS");
		System.out.print(" A  B  C  D  E  F  G  H  I  J");
		System.out.println();
		
		
	
		
		for (int i = 9; i >= 1; i--) 
		{
			System.out.println("Row " + i);
		}	
		
		
		for (int row = 0; row < seats.length; row++) 
		{
		for (int column = 0; column < seats[row].length; column++) 
		{
			System.out.print("   " + seats[row][column]);
		}
		}
		
			
		System.out.println();
		System.out.println("The above is a birds eye veiw of all the seating avilible at corpus christi theater for the arts. ");
		System.out.println("Row one is the closest to the stage while row 9 represents the back of the theater. You can either choose");
		System.out.println("A seat by entering thr row and seat letter, or you can choose a seat by entering the price");
		System.out.println();
		System.out.println("Enter 1 to choose by seat or 2 to choose by price");
		Scanner keyboard = new Scanner(System.in);
		choice  = keyboard.nextInt();
		if(choice == 1)
		{
			System.out.println("55555555");
		}
		if(choice == 2)
		{
			System.out.println("66666666");
		}
		
		while(choice != 1 || choice != 2)
		{
			System.out.println("That is not a valid number, please enter either 1 or 2");
			choice = keyboard.nextInt();
		}
		}
	//enter 1 to choose by seat or price
	//making aure user enetrs 1 or 2
	//if user enters 1 it should prompt user for row number 
	//user can only enter number from 1-9 for row numbers(if not inform them)
	//program asks user for seat letter once user enters valid row number
	//
			
	}




