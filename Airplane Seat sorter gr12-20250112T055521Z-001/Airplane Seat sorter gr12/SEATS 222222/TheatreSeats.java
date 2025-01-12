//Nikola Starivlah
//Theater Seats Assignment
//Tuesday April 3, 2017
//This program simulates the buying of a concert ticket.
//A map of the  theatre's seating options is given the choice to either 
//purchase a ticket by saying the row and seat number, or by the price of the ticket where the program will
//randomly decide which seat in the given price range to assign to the user


//package Activities; //name of the package

import java.util.Scanner; //imports the Scanner class for user input

public class TheatreSeats //class name
{

	public static void main(String[] args) //method name
	{

		Scanner keyboard = new Scanner (System.in);// create a new Scanner using keyboard input and names it keyboard
		
    int[][] seats={ { 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 },
					{ 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 },
					{ 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 },
					{ 10, 10, 20, 20, 20, 20, 20, 20, 10, 10 },
					{ 10, 10, 20, 20, 20, 20, 20, 20, 10, 10 },
					{ 10, 10, 20, 20, 20, 20, 20, 20, 10, 10 },
					{ 20, 20, 30, 30, 40, 40, 30, 30, 20, 20 },
					{ 20, 30, 30, 40, 50, 50, 40, 30, 30, 20 },
					{ 30, 40, 50, 50, 50, 50, 50, 50, 40, 30 } };// 2D array called seats and is used by the program to locate the seat's price and location
    
   int userAnswer;// store's the user's answer of either 1, or 2
   String userSeat = null;// store's the user's choice of seat
   int userPrice;//  store's the price that the user will enter should they choose to enter 2 in the beginning
   int userRow;
   int rowcol01 = 0;
   int rowran01 = 0;
   int rowran02 = 0;
  
   
   
   // variables below are used as counters for the program to check if a seat has already been reserved, 0 = seat is free
   //if it equals 1 = seat reserved, 
   int row1A =0;	 int row2A =0;	 	 int row3A =0;		int row4A =0;		int row5A =0;		int row6A =0;		int row7A =0;		int row8A =0;		int row9A =0;
   int row1B =0;	 int row2B =0;		 int row3B =0;		int row4B =0;		int row5B =0;		int row6B =0;		int row7B =0;		int row8B =0;		int row9B =0;
   int row1C =0;	 int row2C =0;		 int row3C =0;		int row4C =0;		int row5C =0;		int row6C =0;		int row7C =0;		int row8C =0;		int row9C =0;
   int row1D =0;	 int row2D =0;		 int row3D =0;		int row4D =0;		int row5D =0;		int row6D =0;		int row7D =0;		int row8D =0;		int row9D =0;
   int row1E =0;	 int row2E =0;		 int row3E =0;		int row4E =0;		int row5E =0;		int row6E =0;		int row7E =0;		int row8E =0;		int row9E =0;
   int row1F =0;	 int row2F =0;		 int row3F =0;		int row4F =0;		int row5F =0;		int row6F =0;		int row7F =0;		int row8F =0;		int row9F =0;
   int row1G =0;	 int row2G =0;		 int row3G =0;		int row4G =0;		int row5G =0;		int row6G =0;		int row7G =0;		int row8G =0;		int row9G =0;
   int row1H =0;	 int row2H =0;		 int row3H =0;		int row4H =0;		int row5H =0;		int row6H =0;		int row7H =0;		int row8H =0;		int row9H =0;
   int row1I =0;	 int row2I =0; 		 int row3I =0;		int row4I =0;		int row5I =0;		int row6I =0;		int row7I =0;		int row8I =0;		int row9I =0;
   int row1J =0;	 int row2J =0;		 int row3J =0;		int row4J =0;		int row5J =0;		int row6J =0;		int row7J =0;		int row8J =0;		int row9J =0;
   
    System.out.println("			     SEATS");// first line of the map 
    System.out.println("         A    B    C    D    E    F    G    H    I    J");//displays the letters that the seats 
    
    System.out.print("Row 9"); //prints "row 9"
	for (int i = 0; i < seats[0].length; i++) //for loop that goes through the 1st row
	{
		System.out.print("   " + seats[0][i]);// prints out the 1st row
	}
	System.out.println();//creates a blank line
	
	System.out.print("Row 8");
	for (int i = 0; i < seats[1].length; i++) //for loop that goes through the 2nd row
	{
		System.out.print("   " + seats[1][i]);// prints out the 2nd row
		
	}
	System.out.println(); //blank line
	
	System.out.print("Row 7");
	for (int i = 0; i < seats[2].length; i++) //for loop that goes through the 3rd row
	{
		System.out.print("   " + seats[2][i]);// prints out the 3rd row
		
	}
	System.out.println();//blank line
	
	System.out.print("Row 6");
	for (int i = 0; i < seats[3].length; i++) //for loop that goes through the 4th row
	{
		System.out.print("   " + seats[3][i]);// prints out the 4th row
		
	}
	
    System.out.println();//blank line
	
	System.out.print("Row 5");
	for (int i = 0; i < seats[4].length; i++) //for loop that goes through the 5th row
	{
		System.out.print("   " + seats[4][i]);// prints out the 5th row
		
	}
	
	System.out.println();
	
	System.out.print("Row 4");
	for (int i = 0; i < seats[5].length; i++) //for loop that goes through the 6th row
	{
		System.out.print("   " + seats[5][i]);// prints out the 6th row
		
	}
	
	System.out.println();//blank line
	
	System.out.print("Row 3");
	for (int i = 0; i < seats[6].length; i++) //for loop that goes through the 7th row
	{
		System.out.print("   " + seats[6][i]);// prints out the 7th row
		
	}
	
	System.out.println();
	
	System.out.print("Row 2");
	for (int i = 0; i < seats[7].length; i++) //for loop that goes through the 8th row
	{
		System.out.print("   " + seats[7][i]);// prints out the 8th row
		
	}
	
	System.out.println();//blank line
	
	System.out.print("Row 1");
	for (int i = 0; i < seats[8].length; i++) //for loop that goes through the 9th  row
	{
		System.out.print("   " + seats[8][i]);// prints out the 9th row
		
	}
	
    
 System.out.println(); //blank line
    
    	
    
    System.out.println();//blank line
    System.out.println();//blank line
    
    System.out.println("The above is a bird's eye view of all the seating available");//first line of the greeting message
    System.out.println("at Corpus Chrisi theatre for the Arts. Row 1 is closest to");//second line of the greeting message
    System.out.println("the stage while row 9 represents the back of the theatre.");//third line of the greeting message
    System.out.println("You can either choose a seat by entering the row and seat");//fourth line of the greeting message
    System.out.println("letter, or you can choose a seat by entering a price.");//last line of the greeting message
    
    System.out.println();//blank line
    
    System.out.print("Enter 1 to choose by seat or 2 to choose by price: ");
    
	userAnswer = keyboard.nextInt();// input Scanner that stores the value in userAnswer
	
	while (userAnswer !=1 && userAnswer != 2)// while loop, checks if userAnswer is not 1 or 2
	{
		System.out.print("That is not a valid number, please enter either 1 or 2: ");//displays an error message to the user telling them they did not enter a valid number and ask them to try again
		userAnswer= keyboard.nextInt();// input Scanner, stores the value in userAnswer
	}
	
	while (userAnswer == 1)// while loop that runs as long a the user entered 1 for their first choice
	{
		System.out.print("Enter row: ");// "Enter row"
		userRow = keyboard.nextInt();// input Scanner and stores the value in userRow
		
		while (userRow ==0 || userRow >9 || userRow<1)// while loop that checks if userRow is between 1 and 9
		{
			System.out.print("That is not a valid row, Please choose a number from 1 to 9: ");//displays a error message to the user and asks them to enter another number
			userRow = keyboard.nextInt();// input Scanner and stores the value in userRow
		}//end of while loop
		
		System.out.print("Enter seat: ");//shows "Enter seat" 
		userSeat = keyboard.next();//input Scanner stores the value in userSeat
		
		while (!userSeat.equalsIgnoreCase("a") && !userSeat.equalsIgnoreCase("b") && !userSeat.equalsIgnoreCase("c") && !userSeat.equalsIgnoreCase("d") && !userSeat.equalsIgnoreCase("e") && !userSeat.equalsIgnoreCase("f") && !userSeat.equals("g") && !userSeat.equalsIgnoreCase("h") && !userSeat.equalsIgnoreCase("i") && !userSeat.equalsIgnoreCase("j"))
			//^ while loop checks if the user has entered an invalid seat letter
		{
			System.out.print("That is not a valid seat, Please choose a seat from A to J: ");//displays an error message to the user and asks them to enter a valid number
			userSeat = keyboard.next();//creates a input Scanner and stores the value in userSeat
		}//end of while loop
		
		if (userRow ==1)// checks if the user entered "1" for their row
		{
			
			if (userSeat.equalsIgnoreCase("a"))// if statement that looks to see if the user entered "a"
			{
				
				seats[8] [0] = -1;
				//^sets the value for seats at [8] [0] to be -1
				map (seats, userSeat, rowcol01, rowran01);
				//^calls a method named "map" and sends it the seats array and userSeat variable
				row1A++;
				//^adds 1 to the row1A variable
				
				while (row1A >1)
					//^ while loop that checks if row1A is larger than 1
				{
					System.out.print("That seat has already been taken, please enter a different seat: ");
					//^ message that the seat the user selected has already been reserved
					userSeat = keyboard.next();
					//^creates a input Scanner and stores the value in userSeat
					break;
				}//end of while loop
				
			}
			
			if (userSeat.equalsIgnoreCase("b"))//if statement that looks to see if the user entered "b"
			{//start of if statement
				seats[8] [1] = -1;//sets the value for seats at [8] [1] to be -1
				map (seats, userSeat, rowcol01, rowran01);//calls a method named "map" and sends it the seats array and userSeat variable
				row1B ++;//adds 1 to the row1B variable
				
				while (row1B >1)//creates a while loop that checks if row1B is larger than 1
				{
					System.out.print("That seat has already been taken, please enter a different seat: ");//displays a message that the seat the user selected has already been reserved
					userSeat = keyboard.next();//creates a input Scanner and stores the value in userSeat
					break;//ends the while loop
				}//end of while loop
			}
			
			
			
	
			if (userSeat.equalsIgnoreCase("c"))//if statement that looks to see if the user entered "c"
			{//start of if statement
				seats[8] [2] = -1;//sets the value for seats at [8] [2] to be -1
				map (seats, userSeat, rowcol01, rowran01);//calls a method named "map" and sends it the seats array and userSeat variable
				row1C ++;//adds 1 to the row1C variable
				
				while (row1C >1)//creates a while loop that checks if row1C is larger than 1
				{//start of while loop
					System.out.print("That seat has already been taken, please enter a different seat: ");//displays a message that the seat the user selected has already been reserved
					userSeat = keyboard.next();//creates a input Scanner and stores the value in userSeat
					break;//ends the while loop
				}
			}
			
			
			
			
			
			if (userSeat.equalsIgnoreCase("d"))//if statement that looks to see if the user entered "d"
			{//start of if statement
				seats[8] [3] = -1;//sets the value for seats at [8] [3] to be -1
				map (seats, userSeat, rowcol01, rowran01);//calls a method named "map" and sends it the seats array and userSeat variable
				row1D ++;//adds 1 to the row1D variable
				
				while (row1D >1)//creates a while loop that checks if row1D is larger than 1
				{//start of while loop
					System.out.print("That seat has already been taken, please enter a different seat: ");//displays a message that the seat the user selected has already been reserved
					userSeat = keyboard.next();//creates a input Scanner and stores the value in userSeat
					break;//ends while loop
				}//end of while loop
			}//end of if statement
			
			
			
			
			
			
			if (userSeat.equalsIgnoreCase("e"))//if statement that looks to see if the user entered "e"
			{//start of if statement
				seats[8] [4] = -1;//sets the value for seats at [8] [4] to be -1
				map (seats, userSeat, rowcol01, rowran01);//calls a method named "map" and sends it the seats array and userSeat variable
				row1E ++;//adds 1 to the row1E variable
				
				while (row1E >1)//creates a while loop that checks if row1E is larger than 1
				{//start of while loop
					System.out.print("That seat has already been taken, please enter a different seat: ");//displays a message that the seat the user selected has already been reserved
					userSeat = keyboard.next();//creates a input Scanner and stores the value in userSeat
					break;//ends while loop
				}//end of while loop
			}//end of if statement
			
			
			
			
			
			if (userSeat.equalsIgnoreCase("f"))//if statement that looks to see if the user entered "f"
			{//start of if statement
				seats[8] [5] = -1;//sets the value for seats at [8] [5] to be -1
				map (seats, userSeat, rowcol01, rowran01);//calls a method named "map" and sends it the seats array and userSeat variable
				row1F ++;//adds 1 to the row1F variable
				
				while (row1F >1)// while loop that checks if row1F is larger than 1
				{//start of while loop
					System.out.print("That seat has already been taken, please enter a different seat: ");//displays a message that the seat the user selected has already been reserved
					userSeat = keyboard.next();//creates a input Scanner and stores the value in userSeat
					break;//ends while loop
				}
			}
			
			
			
			
			
			if (userSeat.equalsIgnoreCase("g"))// if statement that checks if the user entered "g"
			{//start of if statement
				seats[8] [6] = -1;//sets the value for seats at [8] [6] to be -1
				map (seats, userSeat, rowcol01, rowran01);//calls a method named "map" and sends it the seats array and userSeat variable
				row1G ++;//adds 1 to the row1G variable
				
				while (row1G >1)// while loop that checks if row1G is larger than 1
				{//start of while loop
					System.out.print("That seat has already been taken, please enter a different seat: ");//displays a message that the seat the user selected has already been reserved
					userSeat = keyboard.next();//creates a input Scanner and stores the value in userSeat
					break;//ends while loop
				}
			}
			
			
			
			
			if (userSeat.equalsIgnoreCase("h"))//if statement that looks to see if the user entered "h"
			{//start of if statement
				seats[8] [7] = -1;//sets the value for seats at [8] [7] to be -1
				map (seats, userSeat, rowcol01, rowran01);//calls a method named "map" and sends it the seats array and userSeat variable
				row1H ++;//adds 1 to the row1H variable
				
				while (row1H >1)//creates a while loop that checks if row1H is larger than 1
				{//start of while loop
					System.out.print("That seat has already been taken, please enter a different seat: ");//displays a message that the seat the user selected has already been reserved
					userSeat = keyboard.next();//creates a input Scanner and stores the value in userSeat
					break;//ends while loop
				}
			}
			
			
			
			
			if (userSeat.equalsIgnoreCase("i"))//if statement that looks to see if the user entered "i"
			{//start of if statement
				seats[8] [8] = -1;//sets the value for seats at [8] [8] to be -1
				map (seats, userSeat, rowcol01, rowran01);//calls a method named "map" and sends it the seats array and userSeat variable
				row1I++;//adds 1 to the row1I variable
				
				while (row1I >1)//creates a while loop that checks if row1I is larger than 1
				{//start of while loop
					System.out.print("That seat has already been taken, please enter a different seat: ");//displays a message that the seat the user selected has already been reserved
					userSeat = keyboard.next();//creates a input Scanner and stores the value in userSeat
					break;//ends while loop
				}//end of while loop
			}//end of if statement
			
			
			
			
			if (userSeat.equalsIgnoreCase("j"))//if statement that looks to see if the user entered "j"
			{//start of if statement
				seats[8] [9] = -1;//sets the value for seats at [8] [9] to be -1
				map (seats, userSeat, rowcol01, rowran01);//calls a method named "map" and sends it the seats array and userSeat variable
				row1J ++;//adds 1 to the row1J variable
				
				while (row1J >1)//creates a while loop that checks if row1J is larger than 1
				{//start of while loop
					
					System.out.print("That seat has already been taken, please enter a different seat: ");//displays a message that the seat the user selected has already been reserved
					userSeat = keyboard.next();//creates a input Scanner and stores the value in userSeat
					
					break;//ends while loop
				}//end of while loop
			}//end of if statement
			
			
			
			
			
			
			
		}//end of if statement
		
		//the code below's function is the same as the code above^: it will check what seat the user reserves, then it will display the updated map, followed by a check if the seat has already been reserved
		
		if (userRow == 2)
		{
			if (userSeat.equalsIgnoreCase("a"))
			{
				
				
				seats[7] [0] = -1;
				map (seats, userSeat, rowcol01, rowran01);
				row2A ++;
				
				
				
				while (row2A >1)
				{
					
					System.out.print("That seat has already been taken, please enter a different seat: ");
					userSeat = keyboard.next();
					break;
				}
			}
			
			if (userSeat.equalsIgnoreCase("b"))
			{
				seats [7] [1] = -1;
				map (seats, userSeat, rowcol01, rowran01);
				row2B ++;
				
				while (row2B >1)
				{
					System.out.print("That seat has already been taken, please enter a different seat: ");
					
					userSeat = keyboard.next();
					
					
					break;
				}
			}
			
			if (userSeat.equalsIgnoreCase("c"))
			{
				seats [7] [2] = -1;
				
				map (seats, userSeat, rowcol01, rowran01);
				
				
				row2C ++;
				
				while (row2C >1)
				{
					System.out.print("That seat has already been taken, please enter a different seat: ");
					userSeat = keyboard.next();
					break;
				}
			}
			
			if (userSeat.equalsIgnoreCase("d"))
			{
				seats [7] [3] = -1;
				map (seats, userSeat, rowcol01, rowran01);
				
				row2D ++;
				
				while (row2D >1)
				{
					System.out.print("That seat has already been taken, please enter a different seat: ");
					userSeat = keyboard.next();
					
					break;
					
				}
			}
			
			if (userSeat.equalsIgnoreCase("e"))
			{
				seats [7] [4] = -1;
				
				map (seats, userSeat, rowcol01, rowran01);
				
				row2E ++;
				
				while (row2E >1)
				{
					System.out.print("That seat has already been taken, please enter a different seat: ");
					userSeat = keyboard.next();
					break;
				}
			}
			
			if (userSeat.equalsIgnoreCase("f"))
			{
				seats [7] [5] = -1;
				map (seats, userSeat, rowcol01, rowran01);
				row2F ++;
				
				while (row2F >1)
				{
					System.out.print("That seat has already been taken, please enter a different seat: ");
					userSeat = keyboard.next();
					break;
				}
			}
			
			if (userSeat.equalsIgnoreCase("g"))
			{
				seats [7] [6] = -1;
				map (seats, userSeat, rowcol01, rowran01);
				row2G ++;
				
				
				while (row2G >1)
					
				{
					System.out.print("That seat has already been taken, please enter a different seat: ");
					userSeat = keyboard.next();
					break;
				}
				
			}
			
			if (userSeat.equalsIgnoreCase("h"))
			{
				seats [7] [7] = -1;
				map (seats, userSeat, rowcol01, rowran01);
				row2H ++;
				
				while (row2H >1)
					
				{
					System.out.print("That seat has already been taken, please enter a different seat: ");
					userSeat = keyboard.next();
					break;
				}
			}
			
			if (userSeat.equalsIgnoreCase("i"))
			{
				seats [7] [8] = -1;
				map (seats, userSeat, rowcol01, rowran01);
				row2I ++;
				
				while (row2I >1)
					
				{
					System.out.print("That seat has already been taken, please enter a different seat: ");
					userSeat = keyboard.next();
					break;
				}
			}
			
			if (userSeat.equalsIgnoreCase("j"))
			{
				seats [7] [9] = -1;
				map (seats, userSeat, rowcol01, rowran01);
				
				row2J ++;
				
				while (row2J >1)
				{
					
					System.out.print("That seat has already been taken, please enter a different seat: ");
					userSeat = keyboard.next();
					break;
				}
			}
		}
		
		if (userRow == 3)
		{
			if (userSeat.equalsIgnoreCase("a"))
			{
				seats[6] [0] = -1;
				
				map (seats, userSeat, rowcol01, rowran01);
				
				row3A ++;
				
				while (row3A >1)
				{
					System.out.print("That seat has already been taken, please enter a different seat: ");
					userSeat = keyboard.next();
					
					break;
					
				}
			}
			
			if (userSeat.equalsIgnoreCase("b"))
			{
				seats[6] [1] = -1;
				map (seats, userSeat, rowcol01, rowran01);
				row3B ++;
				
				while (row3B >1)
				{
					System.out.print("That seat has already been taken, please enter a different seat: ");
					
					userSeat = keyboard.next();
					
					break;
				}
			}
			
			if (userSeat.equalsIgnoreCase("c"))
			{
				seats[6] [2] = -1;
				map (seats, userSeat, rowcol01, rowran01);
				row3C ++;
				
				while (row3C >1)
				{
					System.out.print("That seat has already been taken, please enter a different seat: ");
					userSeat = keyboard.next();
					break;
				}
			}
			
			if (userSeat.equalsIgnoreCase("d"))
			{
				seats[6] [3] = -1;
				map (seats, userSeat, rowcol01, rowran01);
				row3D ++;
				
				while (row3D >1)
				{
					System.out.print("That seat has already been taken, please enter a different seat: ");
					userSeat = keyboard.next();
					break;
				}
			}
			
			if (userSeat.equalsIgnoreCase("e"))
			{
				seats[6] [4] = -1;
				map (seats, userSeat, rowcol01, rowran01);
				row3E ++;
				
				while (row3E >1)
				{
					System.out.print("That seat has already been taken, please enter a different seat: ");
					userSeat = keyboard.next();
					break;
				}
			}
			
			if (userSeat.equalsIgnoreCase("f"))
			{
				seats[6] [5] = -1;
				map (seats, userSeat, rowcol01, rowran01);
				row3F ++;
				
				while (row3F >1)
				{
					System.out.print("That seat has already been taken, please enter a different seat: ");
					userSeat = keyboard.next();
					break;
				}
			}
			
			if (userSeat.equalsIgnoreCase("g"))
			{
				seats[6] [6] = -1;
				map (seats, userSeat, rowcol01, rowran01);
				row3G ++;
				
				while (row3G >1)
				{
					System.out.print("That seat has already been taken, please enter a different seat: ");
					userSeat = keyboard.next();
					break;
				}
			}
			
			if (userSeat.equalsIgnoreCase("h"))
			{
				seats[6] [7] = -1;
				map (seats, userSeat, rowcol01, rowran01);
				row3H ++;
				
				while (row3H >1)
				{
					System.out.print("That seat has already been taken, please enter a different seat: ");
					userSeat = keyboard.next();
					break;
				}
			}
			
			if (userSeat.equalsIgnoreCase("i"))
			{
				seats[6] [8] = -1;
				map (seats, userSeat, rowcol01, rowran01);
				row3I ++;
				
				while (row3I >1)
				{
					System.out.print("That seat has already been taken, please enter a different seat: ");
					userSeat = keyboard.next();
					break;
				}
			}
			
			if (userSeat.equalsIgnoreCase("j"))
			{
				seats[6] [9] = -1;
				map (seats, userSeat, rowcol01, rowran01);
				row3J ++;
				
				while (row3J >1)
				{
					System.out.print("That seat has already been taken, please enter a different seat: ");
					userSeat = keyboard.next();
					break;
				}
			}
		}
		
		if (userRow == 4)
		{
			if (userSeat.equalsIgnoreCase("a"))
			{
				seats[5] [0] = -1;
				map (seats, userSeat, rowcol01, rowran01);
				row4A ++;
				
				while (row4A >1)
				{
					System.out.print("That seat has already been taken, please enter a different seat: ");
					userSeat = keyboard.next();
					break;
				}
			}
			
			if (userSeat.equalsIgnoreCase("b"))
			{
				seats[5] [1] = -1;
				map (seats, userSeat, rowcol01, rowran01);
				row4B ++;
				
				while (row4B >1)
				{
					System.out.print("That seat has already been taken, please enter a different seat: ");
					userSeat = keyboard.next();
					break;
				}
			}
			
			if (userSeat.equalsIgnoreCase("c"))
			{
				seats[5] [2] = -1;
				map (seats, userSeat, rowcol01, rowran01);
				row4C ++;
				
				while (row4C >1)
				{
					System.out.print("That seat has already been taken, please enter a different seat: ");
					userSeat = keyboard.next();
					break;
				}
			}
			
			if (userSeat.equalsIgnoreCase("d"))
			{
				seats[5] [3] = -1;
				map (seats, userSeat, rowcol01, rowran01);
				row4D ++;
				
				while (row4D >1)
				{
					System.out.print("That seat has already been taken, please enter a different seat: ");
					userSeat = keyboard.next();
					break;
				}
			}
			
			if (userSeat.equalsIgnoreCase("e"))
			{
				seats[5] [4] = -1;
				map (seats, userSeat, rowcol01, rowran01);
				row4E ++;
				
				
				while (row4E >1)
				{
					System.out.print("That seat has already been taken, please enter a different seat: ");
					userSeat = keyboard.next();
					break;
				}
			}
			
			if (userSeat.equalsIgnoreCase("f"))
			{
				seats[5] [5] = -1;
				map (seats, userSeat, rowcol01, rowran01);
				
				row4F ++;
				
				while (row4F>1)
				{
					System.out.print("That seat has already been taken, please enter a different seat: ");
					userSeat = keyboard.next();
					break;
				}
			}
			
			if (userSeat.equalsIgnoreCase("g"))
			{
				seats[5] [6] = -1;
				map (seats, userSeat, rowcol01, rowran01);
				
				row4G ++;
				
				while (row4G >1)
				{
					System.out.print("That seat has already been taken, please enter a different seat: ");
					userSeat = keyboard.next();
					break;
				}
			}
			
			if (userSeat.equalsIgnoreCase("h"))
			{
				seats[5] [7] = -1;
				map (seats, userSeat, rowcol01, rowran01);
				
				row4H ++;
				
				while (row4H >1)
				{
					System.out.print("That seat has already been taken, please enter a different seat: ");
					userSeat = keyboard.next();
					break;
				}
			}
			
			if (userSeat.equalsIgnoreCase("i"))
			{
				seats[5] [8] = -1;
				map (seats, userSeat, rowcol01, rowran01);
				
				row4I ++;
				
				while (row4I >1)
				{
					System.out.print("That seat has already been taken, please enter a different seat: ");
					userSeat = keyboard.next();
					break;
				}
			}
			
			if (userSeat.equalsIgnoreCase("j"))
			{
				seats[5] [9] = -1;
				map (seats, userSeat, rowcol01, rowran01);
				
				row4J ++;
				
				while (row4J >1)
				{
					System.out.print("That seat has already been taken, please enter a different seat: ");
					userSeat = keyboard.next();
					break;
				}
			}
		}
		
		if (userRow == 5)
		{
			if (userSeat.equalsIgnoreCase("a"))
			{
				seats[4] [0] = -1;
				map (seats, userSeat, rowcol01, rowran01);
				
				row5A ++;
				
				while (row5A >1)
				{
					System.out.print("That seat has already been taken, please enter a different seat: ");
					userSeat = keyboard.next();
					break;
				}
			}
			
			if (userSeat.equalsIgnoreCase("b"))
			{
				seats[4] [1] = -1;
				map (seats, userSeat, rowcol01, rowran01);
				
				row5B ++;
				
				while (row5B >1)
				{
					System.out.print("That seat has already been taken, please enter a different seat: ");
					userSeat = keyboard.next();
					break;
				}
			}
			
			if (userSeat.equalsIgnoreCase("c"))
			{
				seats[4] [2] = -1;
				map (seats, userSeat, rowcol01, rowran01);
				
				row5C ++;
				
				while (row5C >1)
				{
					System.out.print("That seat has already been taken, please enter a different seat: ");
					userSeat = keyboard.next();
					break;
				}
			}
			
			if (userSeat.equalsIgnoreCase("d"))
			{
				seats[4] [3] = -1;
				map (seats, userSeat, rowcol01, rowran01);
				
				row5D ++;
				
				while (row5D >1)
				{
					System.out.print("That seat has already been taken, please enter a different seat: ");
					userSeat = keyboard.next();
					break;
				}
			}
			
			if (userSeat.equalsIgnoreCase("e"))
			{
				seats[4] [4] = -1;
				map (seats, userSeat, rowcol01, rowran01);
				
				row5E ++;
				
				while (row5E >1)
				{
					System.out.print("That seat has already been taken, please enter a different seat: ");
					userSeat = keyboard.next();
					break;
				}
			}
			
			if (userSeat.equalsIgnoreCase("f"))
			{
				seats[4] [5] = -1;
				map (seats, userSeat, rowcol01, rowran01);
				
				row5F ++;
				
				while (row5F >1)
				{
					System.out.print("That seat has already been taken, please enter a different seat: ");
					userSeat = keyboard.next();
					break;
				}
			}
			
			if (userSeat.equalsIgnoreCase("g"))
			{
				seats[4] [6] = -1;
				map (seats, userSeat, rowcol01, rowran01);
				
				row5G ++;
				
				while (row5G >1)
				{
					System.out.print("That seat has already been taken, please enter a different seat: ");
					userSeat = keyboard.next();
					break;
				}
			}
			
			if (userSeat.equalsIgnoreCase("h"))
			{
				seats[4] [7] = -1;
				map (seats, userSeat, rowcol01, rowran01);
				
				row5H ++;
				
				while (row5H >1)
				{
					System.out.print("That seat has already been taken, please enter a different seat: ");
					userSeat = keyboard.next();
					break;
				}
			}
			
			if (userSeat.equalsIgnoreCase("i"))
			{
				seats[4] [8] = -1;
				map (seats, userSeat, rowcol01, rowran01);
				
				row5I ++;
				
				while (row5I >1)
				{
					System.out.print("That seat has already been taken, please enter a different seat: ");
					userSeat = keyboard.next();
					break;
				}
			}
			
			if (userSeat.equalsIgnoreCase("j"))
			{
				seats[4] [9] = -1;
				map (seats, userSeat, rowcol01, rowran01);
				
				row5J ++;
				
				while (row5J >1)
				{
					System.out.print("That seat has already been taken, please enter a different seat: ");
					userSeat = keyboard.next();
					break;
				}
			}
		}
		
		if (userRow == 6)
		{
			if (userSeat.equalsIgnoreCase("a"))
			{
				seats[3] [0] = -1;
				map (seats, userSeat, rowcol01, rowran01);
				row6A ++;
				
				while (row6A >1)
				{
					System.out.print("That seat has already been taken, please enter a different seat: ");
					userSeat = keyboard.next();
					break;
				}
			}
			
			if (userSeat.equalsIgnoreCase("b"))
			{
				seats[3] [1] = -1;
				map (seats, userSeat, rowcol01, rowran01);
				row6B ++;
				
				while (row6B >1)
				{
					System.out.print("That seat has already been taken, please enter a different seat: ");
					userSeat = keyboard.next();
					break;
				}
			}
			
			if (userSeat.equalsIgnoreCase("c"))
			{
				seats[3] [2] = -1;
				map (seats, userSeat, rowcol01, rowran01);
				row6C ++;
				
				while (row6C >1)
				{
					System.out.print("That seat has already been taken, please enter a different seat: ");
					userSeat = keyboard.next();
					break;
				}
			}
			
			if (userSeat.equalsIgnoreCase("d"))
			{
				seats[3] [3] = -1;
				map (seats, userSeat, rowcol01, rowran01);
				row6D ++;
				
				while (row6D >1)
				{
					System.out.print("That seat has already been taken, please enter a different seat: ");
					userSeat = keyboard.next();
					break;
				}
			}
			
			if (userSeat.equalsIgnoreCase("e"))
			{
				seats[3] [4] = -1;
				map (seats, userSeat, rowcol01, rowran01);
				row6E ++;
				
				while (row6E >1)
				{
					System.out.print("That seat has already been taken, please enter a different seat: ");
					userSeat = keyboard.next();
					break;
				}
			}
			
			if (userSeat.equalsIgnoreCase("f"))
			{
				seats[3] [5] = -1;
				map (seats, userSeat, rowcol01, rowran01);
				
				row6F ++;
				
				while (row6F >1)
				{
					System.out.print("That seat has already been taken, please enter a different seat: ");
					userSeat = keyboard.next();
					break;
				}
			}
			
			if (userSeat.equalsIgnoreCase("g"))
			{
				seats[3] [6] = -1;
				map (seats, userSeat, rowcol01, rowran01);
				
				row6G ++;
				
				while (row6G >1)
				{
					System.out.print("That seat has already been taken, please enter a different seat: ");
					userSeat = keyboard.next();
					break;
				}
			}
			
			if (userSeat.equalsIgnoreCase("h"))
			{
				seats[3] [7] = -1;
				map (seats, userSeat, rowcol01, rowran01);
				
				row6H ++;
				
				while (row6H >1)
				{
					System.out.print("That seat has already been taken, please enter a different seat: ");
					userSeat = keyboard.next();
					break;
				}
			}
			
			if (userSeat.equalsIgnoreCase("i"))
			{
				seats[3] [8] = -1;
				map (seats, userSeat, rowcol01, rowran01);
				
				row6I ++;
				
				while (row6I >1)
				{
					System.out.print("That seat has already been taken, please enter a different seat: ");
					userSeat = keyboard.next();
					break;
				}
			}
			
			if (userSeat.equalsIgnoreCase("j"))
			{
				seats[3] [9] = -1;
				map (seats, userSeat, rowcol01, rowran01);
				
				row6J ++;
				
				while (row6J >1)
				{
					System.out.print("That seat has already been taken, please enter a different seat: ");
					userSeat = keyboard.next();
					break;
				}
			}
		}
		
		if (userRow == 7)
		{
			if (userSeat.equalsIgnoreCase("a"))
			{
				seats[2] [0] = -1;
				map (seats, userSeat, rowcol01, rowran01);
				
				row7A ++;
				
				while (row7A >1)
				{
					System.out.print("That seat has already been taken, please enter a different seat: ");
					userSeat = keyboard.next();
					break;
				}
			}
			
			if (userSeat.equalsIgnoreCase("b"))
			{
				seats[2] [1] = -1;
				map (seats, userSeat, rowcol01, rowran01);
				
				row7B ++;
				
				while (row7B >1)
				{
					System.out.print("That seat has already been taken, please enter a different seat: ");
					userSeat = keyboard.next();
					break;
				}
			}
			
			if (userSeat.equalsIgnoreCase("c"))
			{
				seats[2] [2] = -1;
				map (seats, userSeat, rowcol01, rowran01);
				
				row7C ++;
				
				while (row7C >1)
				{
					System.out.print("That seat has already been taken, please enter a different seat: ");
					userSeat = keyboard.next();
					break;
				}
			}
			
			if (userSeat.equalsIgnoreCase("d"))
			{
				seats[2] [3] = -1;
				map (seats, userSeat, rowcol01, rowran01);
				
				row7D ++;
				
				while (row7D >1)
				{
					System.out.print("That seat has already been taken, please enter a different seat: ");
					userSeat = keyboard.next();
					break;
				}
			}
			
			if (userSeat.equalsIgnoreCase("e"))
			{
				seats[2] [4] = -1;
				map (seats, userSeat, rowcol01, rowran01);
				
				row7E ++;
				
				while (row7E >1)
				{
					System.out.print("That seat has already been taken, please enter a different seat: ");
					userSeat = keyboard.next();
					break;
				}
			}
			
			if (userSeat.equalsIgnoreCase("f"))
			{
				seats[2] [5] = -1;
				map (seats, userSeat, rowcol01, rowran01);
				
				row7F ++;
				
				while (row7F >1)
				{
					System.out.print("That seat has already been taken, please enter a different seat: ");
					userSeat = keyboard.next();
					break;
				}
			}
			
			if (userSeat.equalsIgnoreCase("g"))
			{
				seats[2] [6] = -1;
				map (seats, userSeat, rowcol01, rowran01);
				
				row7G ++;
				
				while (row7G >1)
				{
					System.out.print("That seat has already been taken, please enter a different seat: ");
					userSeat = keyboard.next();
					break;
				}
			}
			
			if (userSeat.equalsIgnoreCase("h"))
			{
				seats[2] [7] = -1;
				map (seats, userSeat, rowcol01, rowran01);
				
				row7H ++;
				
				while (row7H >1)
				{
					System.out.print("That seat has already been taken, please enter a different seat: ");
					userSeat = keyboard.next();
					break;
				}
			}
			
			if (userSeat.equalsIgnoreCase("i"))
			{
				seats[2] [8] = -1;
				map (seats, userSeat, rowcol01, rowran01);
				
				row7I ++;
				
				while (row7I >1)
				{
					System.out.print("That seat has already been taken, please enter a different seat: ");
					userSeat = keyboard.next();
					break;
				}
			}
			
			if (userSeat.equalsIgnoreCase("j"))
			{
				seats[2] [9] = -1;
				map (seats, userSeat, rowcol01, rowran01);
				
				row7J ++;
				
				while (row7J >1)
				{
					System.out.print("That seat has already been taken, please enter a different seat: ");
					userSeat = keyboard.next();
					break;
				}
			}
		}
		
		if (userRow == 8)
		{
			if (userSeat.equalsIgnoreCase("a"))
			{
				seats[1] [0] = -1;
				map (seats, userSeat, rowcol01, rowran01);
				
				row8A ++;
				
				while (row8A >1)
				{
					System.out.print("That seat has already been taken, please enter a different seat: ");
					userSeat = keyboard.next();
					break;
				}
			}
			
			if (userSeat.equalsIgnoreCase("b"))
			{
				seats[1] [1] = -1;
				map (seats, userSeat, rowcol01, rowran01);
				
				row8B ++;
				
				while (row8B >1)
				{
					System.out.print("That seat has already been taken, please enter a different seat: ");
					userSeat = keyboard.next();
					break;
				}
			}
			
			if (userSeat.equalsIgnoreCase("c"))
			{
				seats[1] [2] = -1;
				map (seats, userSeat, rowcol01, rowran01);
				
				row8C ++;
				
				while (row8C >1)
				{
					System.out.print("That seat has already been taken, please enter a different seat: ");
					userSeat = keyboard.next();
					break;
				}
			}
			
			if (userSeat.equalsIgnoreCase("d"))
			{
				seats[1] [3] = -1;
				map (seats, userSeat, rowcol01, rowran01);
				
				row8D ++;
				
				while (row8D >1)
				{
					System.out.print("That seat has already been taken, please enter a different seat: ");
					userSeat = keyboard.next();
					break;
				}
			}
			
			if (userSeat.equalsIgnoreCase("e"))
			{
				seats[1] [4] = -1;
				map (seats, userSeat, rowcol01, rowran01);
				
				row8E ++;
				
				while (row8E >1)
				{
					System.out.print("That seat has already been taken, please enter a different seat: ");
					userSeat = keyboard.next();
					break;
				}
			}
			
			if (userSeat.equalsIgnoreCase("f"))
			{
				seats[1] [5] = -1;
				map (seats, userSeat, rowcol01, rowran01);
				row8F ++;
				
				while (row8F >1)
				{
					System.out.print("That seat has already been taken, please enter a different seat: ");
					userSeat = keyboard.next();
					break;
				}
			}
			
			if (userSeat.equalsIgnoreCase("g"))
			{
				seats[1] [6] = -1;
				map (seats, userSeat, rowcol01, rowran01);
				row8G ++;
				
				while (row8G >1)
				{
					System.out.print("That seat has already been taken, please enter a different seat: ");
					userSeat = keyboard.next();
					break;
				}
			}
			
			if (userSeat.equalsIgnoreCase("h"))
			{
				seats[1] [7] = -1;
				map (seats, userSeat, rowcol01, rowran01);
				row8H ++;
				
				while (row8H >1)
				{
					System.out.print("That seat has already been taken, please enter a different seat: ");
					userSeat = keyboard.next();
					break;
				}
			}
			
			if (userSeat.equalsIgnoreCase("i"))
			{
				seats[1] [8] = -1;
				map (seats, userSeat, rowcol01, rowran01);
				row8I ++;
				
				while (row8I >1)
				{
					System.out.print("That seat has already been taken, please enter a different seat: ");
					userSeat = keyboard.next();
					break;
				}
			}
			
			if (userSeat.equalsIgnoreCase("j"))
			{
				seats[1] [9] = -1;
				map (seats, userSeat, rowcol01, rowran01);
				row8J ++;
				
				while (row8J >1)
				{
					System.out.print("That seat has already been taken, please enter a different seat: ");
					userSeat = keyboard.next();
					break;
				}
			}
		}
		
		if (userRow == 9)
		{
			if (userSeat.equalsIgnoreCase("a"))
			{
				seats[0] [0] = -1;
				map (seats, userSeat, rowcol01, rowran01);
				row9A ++;
				
				while (row9A >1)
				{
					System.out.print("That seat has already been taken, please enter a different seat: ");
					userSeat = keyboard.next();
					break;
				}
			}
			
			if (userSeat.equalsIgnoreCase("b"))
			{
				seats[0] [1] = -1;
				map (seats, userSeat, rowcol01, rowran01);
				row9B ++;
				
				while (row9B >1)
				{
					System.out.print("That seat has already been taken, please enter a different seat: ");
					userSeat = keyboard.next();
					break;
				}
			}
			
			if (userSeat.equalsIgnoreCase("c"))
			{
				seats[0] [2] = -1;
				map (seats, userSeat, rowcol01, rowran01);
				row9C ++;
				
				while (row9C >1)
				{
					System.out.print("That seat has already been taken, please enter a different seat: ");
					userSeat = keyboard.next();
					break;
				}
			}
			
			if (userSeat.equalsIgnoreCase("d"))
			{
				seats[0] [3] = -1;
				map (seats, userSeat, rowcol01, rowran01);
				row9D ++;
				
				while (row9D >1)
				{
					System.out.print("That seat has already been taken, please enter a different seat: ");
					userSeat = keyboard.next();
					break;
				}
			}
			
			if (userSeat.equalsIgnoreCase("e"))
			{
				seats[0] [4] = -1;
				map (seats, userSeat, rowcol01, rowran01);
				row9E ++;
				
				while (row9E >1)
				{
					System.out.print("That seat has already been taken, please enter a different seat: ");
					userSeat = keyboard.next();
					break;
				}
			}
			
			if (userSeat.equalsIgnoreCase("f"))
			{
				seats[0] [5] = -1;
				map (seats, userSeat, rowcol01, rowran01);
				row9F ++;
				
				while (row9F >1)
				{
					System.out.print("That seat has already been taken, please enter a different seat: ");
					userSeat = keyboard.next();
					break;
				}
			}
			
			if (userSeat.equalsIgnoreCase("g"))
			{
				seats[0] [6] = -1;
				map (seats, userSeat, rowcol01, rowran01);
				row9G ++;
				
				while (row9G >1)
				{
					System.out.print("That seat has already been taken, please enter a different seat: ");
					userSeat = keyboard.next();
					break;
				}
			}
			
			if (userSeat.equalsIgnoreCase("h"))
			{
				seats[0] [7] = -1;
				map (seats, userSeat, rowcol01, rowran01);
				row9H ++;
				
				while (row9H >1)
				{
					System.out.print("That seat has already been taken, please enter a different seat: ");
					userSeat = keyboard.next();
					break;
				}
			}
			
			if (userSeat.equalsIgnoreCase("i"))
			{
				seats[0] [8] = -1;
				map (seats, userSeat, rowcol01, rowran01);
				row9I ++;
				
				while (row9I >1)
				{
					System.out.print("That seat has already been taken, please enter a different seat: ");
					userSeat = keyboard.next();
					break;
				}
			}
			
			if (userSeat.equalsIgnoreCase("j"))
			{
				seats[0] [9] = -1;
				map (seats, userSeat, rowcol01, rowran01);
				row9J ++;
				
				while (row9J >1)
				{
					System.out.print("That seat has already been taken, please enter a different seat: ");
					userSeat = keyboard.next();
					break;
				}
			}
		}
	//here is where the code has the same function of displaying the updated map and checking if a seat is already reserved ends
		
		System.out.print("Enter 1 to choose by seat or 2 to choose by price: ");//shows message to the user and asks them to enter either 1 or 2 to choose by seat or price
		userAnswer = keyboard.nextInt();// input Scanner and stores the value in userAnswer
		
	}//end of while loop
	
			while (userAnswer == 2)//creates an while loop that checks if the user entered 2
		{
			System.out.print("Enter a price (10, 20, 30, 40, or 50): ");//displays the price ranges that the user can choose from
			userPrice = keyboard.nextInt();////creates a input Scanner and stores the value in userPrice
			
			while (userPrice != 10 && userPrice != 20 && userPrice != 30 && userPrice != 40 && userPrice != 50)//creates a while loop that checks if the user has entered a valid price and runs if they have not
			{
				System.out.print("That is not a valid price, Please enter (10, 20, 30, 40, or 50): ");//displays an error message and asks the user to enter a valid price
				userPrice = keyboard.nextInt();//creates a input Scanner and stores the value in userPrice
			}//end of while loop
			
			if (userPrice == 10)//  checks if the user entered 10
			{
				 rowcol01 = (int) (Math.random()*6);
				 rowran01= (int) (Math.random()*9);
				 
				 if (rowcol01 == 4 || rowcol01 == 5)
				 {
					 rowcol01 = (int) (Math.random()*2);
					 seats [rowcol01] [rowran01] = -1;
					 map (seats, userSeat, rowcol01, rowran01);
				 }
				 
				 else
				 {
					 seats [rowcol01] [rowran01] = -1;
					 map (seats, userSeat, rowcol01, rowran01);
				 }
				 
				 if (rowran01 ==0 && rowcol01 ==0)
				 {
						 
					 System.out.println("Your seat is row 9 seat A");
				 }
				 
				 if (rowran01 ==0 && rowcol01 ==1)
				 {
						 
					 System.out.println("Your seat is row 8 seat A");
				 }
				 
				 if (rowran01 ==0 && rowcol01 ==2)
				 {
						 
					 System.out.println("Your seat is row 7 seat A");
				 }
				 
				 if (rowran01 ==0 && rowcol01==3)
				 {
						 
					 System.out.println("Your seat is row 6 seat A");
				 }
				 
				 if (rowran01 ==0 && rowcol01 ==4)
				 {
						 
					 System.out.println("Your seat is row 5 seat A");
				 }
				 
				 if (rowran01 ==0 && rowcol01 ==5)
				 {
						 
					 System.out.println("Your seat is row 4 seat A");
				 }
				 
				 if (rowran01 ==0 && rowcol01 ==6)
				 {
						 
					 System.out.println("Your seat is row 3 seat A");
				 }
				 
				 if (rowran01 ==0 && rowcol01 ==7)
				 {
						 
					 System.out.println("Your seat is row 2 seat A");
				 }
				 
				 if (rowran01 ==0 && rowcol01 ==8)
				 {
						 
					 System.out.println("Your seat is row 1 seat A");
				 }
				 
				 
				 ////////////////////////////////////////////////////////////////
				 if (rowran01 ==1 && rowcol01 ==0)
				 {
					 System.out.println("Your seat is row 9 seat B");
				 }
				 
				 if (rowran01 ==1 && rowcol01 ==1)
				 {
					 System.out.println("Your seat is row 8 seat B");
				 }
				 
				 if (rowran01 ==1 && rowcol01 ==2)
				 {
					 System.out.println("Your seat is row 7 seat B");
				 }
				 
				 if (rowran01 ==1 && rowcol01 ==3)
				 {
					 System.out.println("Your seat is row 6 seat B");
				 }
				 
				 if (rowran01 ==1 && rowcol01 ==4)
				 {
					 System.out.println("Your seat is row 5 seat B");
				 }
				 
				 if (rowran01 ==1 && rowcol01 ==5)
				 {
					 System.out.println("Your seat is row 4 seat B");
				 }
				 
				 if (rowran01 ==1 && rowcol01 ==6)
				 {
					 System.out.println("Your seat is row 3 seat B");
				 }
				 
				 if (rowran01 ==1 && rowcol01 ==7)
				 {
					 System.out.println("Your seat is row 2 seat B");
				 }
				 
				 if (rowran01 ==1 && rowcol01 ==8)
				 {
					 System.out.println("Your seat is row 1 seat B");
				 }
				 
				 
				 //////////////////////////////////////////////////////////////////
				  if (rowran01 ==2)
				 {
					 System.out.println("Your seat is row " + (rowcol01 +1) + " seat C");
				 }
				 
				 
				 
				 
				 
				 
				 
				 
				 
				 
				 
				 if (rowran01 ==3)
				 {
					 System.out.println("Your seat is row " + (rowcol01 +1) + " seat D");
				 }
				 
				 if (rowran01 ==4)
				 {
					 System.out.println("Your seat is row " + (rowcol01 +1) + " seat E");
				 }
				 
				 if (rowran01 ==5)
				 {
					 System.out.println("Your seat is row " + (rowcol01 +1) + " seat F");
				 }
				 
				 if (rowran01 ==6)
				 {
					 System.out.println("Your seat is row " + (rowcol01 +1) + " seat G");
				 }
				 
				 if (rowran01 ==7)
				 {
					 System.out.println("Your seat is row " + (rowcol01 +1) + " seat H");
				 }
				 
				 if (rowran01 ==8)
				 {
					 System.out.println("Your seat is row " + (rowcol01 +1) + " seat I");
				 }
				 
				 if (rowran01 ==9)
				 {
					 System.out.println("Your seat is row " + (rowcol01 +1) + " seat J");
				 }
				
				 
				 
			}
			
			System.out.print("Enter 1 to choose by seat or 2 to choose by price: ");//displays a message to the user and asks them to enter either 1 or 2 to choose by seat or price
			userAnswer = keyboard.nextInt();//creates a input Scanner and stores the value in userAnswer
			
			
		}
		
	}

	
	public static void map (int [] [] seats, String userSeat, int rowcol01, int rowran01)//creates a new method outside of the main method named "map". used as a shortcut to update the seating map with new information and display it back to the user
	{//start of map method
		
		 System.out.println("			     SEATS");// first line of the map
		 System.out.println("         A    B    C    D    E    F    G    H    I    J");//displays the letters that the seats in each row are categorized under
		    
		for (int j = 0; j <= seats.length; j++)//creates a for loop that will run 10 times
    	{//start of for loop
    		if (j == 0)//creates a if statement that will display "Row 9" once if "j" is equal to 0
    		{
    			 System.out.print("Row 9   ");//displays "Row 9" once
    		}
    		
    		while (seats[0] [j] == -1)//creates a while loop that will run if any spot in row 9 is equal to -1, meaning it has been reserved
    		{//start of while loop
				 System.out.print ( "XX   ");//displays XX where the seat should display because it has been reserved
				 j ++;//adds 1 to the variable "j"
    		}//end of while loop
    		
    		if (j <= seats.length)//creates an if statement that checks if j is less than or equal to the length of the seats array
    		{//start of if statement
    			System.out.print( seats [0] [j] + "   ");//prints all of the seats in the ninth line of the array with "j" moving to the next seat every iteration
    		}//end of if statement
    	}//end of for loop
    
    System.out.println();//creates a blank line so the map displays correctly
    

    	for (int j = 0; j <= seats.length; j++)//creates a for loop that will run 10 times
    	{
    		if (j == 0)//creates an if statement that will display "Row 8" once when "j" is equal to 0
    		{//start of if statement
    			 System.out.print("Row 8   ");//displays "Row 8"
    		}//end of if statement
    		
    		while (seats[1] [j] == -1)////creates a while loop that will run if any spot in row 8 is equal to -1, meaning it has been reserved
    		{
				 System.out.print ( "XX   ");//displays XX where the seat should display because it has been reserved
				 j ++;//adds 1 to the variable "j"
    		}//end of while loop
    		
    		if (j <= seats.length)//creates an if statement that checks if j is less than or equal to the length of the seats array
    		{//start of if statement
    			System.out.print( seats [1] [j] + "   ");//prints all of the seats in the ninth line of the array with "j" moving to the next seat every iteration
    		}//end of if statement
    	}//end of for loop
    
 System.out.println();//creates a blank line so the map displays correctly
    

    	for (int j = 0; j <= seats.length; j++)//creates a for loop that will run 10 times
    	{//start of for loop
    		if (j == 0)//creates an if statement that will display "Row 7" once when "j" is equal to 0
    		{//start of if statement
    			 System.out.print("Row 7   ");//displays "Row 7"
    		}//end of if statement
    		
    		while (seats[2] [j] == -1)////creates a while loop that will run if any spot in row 7 is equal to -1, meaning it has been reserved
    		{//start of while loop
				 System.out.print ( "XX   ");//displays XX where the seat should display because it has been reserved
				 j ++;//adds 1 to the variable "j"
    		}//end of while loop
    		
    		if (j <= seats.length)//creates an if statement that checks if j is less than or equal to the length of the seats array
    		{//start of if statement
    			System.out.print( seats [2] [j] + "   ");//prints all of the seats in the ninth line of the array with "j" moving to the next seat every iteration
    		}//end of if statement
    	}//end of for loop
    
 System.out.println();//creates a blank line so the map displays correctly
    
    	for (int j = 0; j <= seats.length; j++)//creates a for loop that will run 10 times
    	{//start of for loop
    		if (j == 0)//creates an if statement that will display "Row 6" once when "j" is equal to 0
    		{//start of if statement
    			 System.out.print("Row 6   ");//displays "Row 6"
    		}//end of if statement
    		
    		while (seats[3] [j] == -1)////creates a while loop that will run if any spot in row 6 is equal to -1, meaning it has been reserved
    		{
				 System.out.print ( "XX   ");//displays XX where the seat should display because it has been reserved
				 j ++;//adds 1 to the variable "j"
    		}//end of while loop
    		
    		if (j <= seats.length)//creates an if statement that checks if j is less than or equal to the length of the seats array
    		{
    			System.out.print( seats [3] [j] + "   ");//prints all of the seats in the ninth line of the array with "j" moving to the next seat every iteration
    		}
    	}//end of for loop
    
 System.out.println();//creates a blank line so the map displays correctly
    
    	for (int j = 0; j <= seats.length; j++)//creates a for loop that will run 10 times
    	{//start of for loop
    		if (j == 0)//creates an if statement that will display "Row 5" once when "j" is equal to 0
    		{//start of if statement
    			 System.out.print("Row 5   ");//displays "Row 5"
    		}//end of if statement
    		
    		while (seats[4] [j] == -1)////creates a while loop that will run if any spot in row 5 is equal to -1, meaning it has been reserved
    		{//start of while loop
				 System.out.print ( "XX   ");//displays XX where the seat should display because it has been reserved
				 j ++;//adds 1 to the variable "j"
    		}//end of while loop
    		
    		if (j <= seats.length)//creates an if statement that checks if j is less than or equal to the length of the seats array
    		{//start of if statement
    			System.out.print( seats [4] [j] + "   ");//prints all of the seats in the ninth line of the array with "j" moving to the next seat every iteration
    		}//end of if statement
    	}//end of for loop
    
 System.out.println();//creates a blank line so the map displays properly
    
    	for (int j = 0; j <= seats.length; j++)//creates a for loop that will run 10 times
    	{
    		if (j == 0)//creates an if statement that will display "Row 4" once when "j" is equal to 0
    		{//start of if statement
    			 System.out.print("Row 4   ");//displays "Row 4"
    		}//end of if statement
    		
    		while (seats[5] [j] == -1)////creates a while loop that will run if any spot in row 4 is equal to -1, meaning it has been reserved
    		{//start of while loop
				 System.out.print ( "XX   ");//displays XX where the seat should display because it has been reserved
				 j ++;
    		}//end of while loop
    		
    		if (j <= seats.length)//creates an if statement that checks if j is less than or equal to the length of the seats array
    		{//start of if statement
    			System.out.print( seats [5] [j] + "   ");//prints all of the seats in the ninth line of the array with "j" moving to the next seat every iteration
    		}//end of if statement
    	}//end of for loop
    
 System.out.println();//creates a blank line so the map displays correctly
    
    	for (int j = 0; j <= seats.length; j++)//creates a for loop that will run 10 times
    	{//start of for loop
    		if (j == 0)//creates an if statement that will display "Row 3" once when "j" is equal to 0
    		{//stare of if statement
    			 System.out.print("Row 3   ");//displays "Row 3"
    		}//end of if statement
    		
    		while (seats[6] [j] == -1)////creates a while loop that will run if any spot in row 3 is equal to -1, meaning it has been reserved
    		{//start of while loop
				 System.out.print ( "XX   ");//displays XX where the seat should display because it has been reserved
				 j ++;//adds 1 to the variable "j"
    		}//end of while loop
    		
    		if (j <= seats.length)//creates an if statement that checks if j is less than or equal to the length of the seats array
    		{//start of if statement
    			System.out.print( seats [6] [j] + "   ");//prints all of the seats in the ninth line of the array with "j" moving to the next seat every iteration
    		}//end of if statement
    	}//end of for loop
    
 System.out.println();//creates a blank line so the map displays correctly
    
    	for (int j = 0; j <= seats.length; j++)//creates a for loop that will run 10 times
    	{//start of for loop
    		if (j == 0)//creates an if statement that will display "Row 2" once when "j" is equal to 0
    		{//start of if statement
    			 System.out.print("Row 2   ");//displays "Row 2"
    		}//end of if statement
    		
    		while (seats[7] [j] == -1)////creates a while loop that will run if any spot in row 2 is equal to -1, meaning it has been reserved
    		{//start of while loop
				 System.out.print ( "XX   ");//displays XX where the seat should display because it has been reserved
				 j ++;//adds 1 to the variable "j"
    		}//end of while loop
    		
    		if (j <= seats.length)//creates an if statement that checks if j is less than or equal to the length of the seats array
    		{//start of if statement
    			System.out.print( seats [7] [j] + "   ");//prints all of the seats in the ninth line of the array with "j" moving to the next seat every iteration
    		}//end of if statement
    	}//end of for loop
    
 System.out.println();//creates a blank line so the map displays correctly
    

 
 		// the loop below loop corresponds to everything displayed in "Row 1"
    	for (int j = 0; j <= seats.length; j++)//creates a for loop that will run 10 times
    	{//start of for loop
    		if (j == 0)//creates an if statement that will display "Row 1" once when "j" is equal to 0
    		{//start of if statement
    			 System.out.print("Row 1   ");//displays "Row 1"
    		}
    		
    		while (seats[8] [j] == -1 )////creates a while loop that will run if any spot in row 1 is equal to -1, meaning it has been reserved
    		{//start of while loop
				 System.out.print ( "XX   ");//displays XX where the seat should display because it has been reserved
				 j++;//adds 1 to the variable "j"
    		}//end of while loop
    		
    		if (j <= seats.length)//creates an if statement that checks if j is less than or equal to the length of the seats array
    		{//start of if statement
    			System.out.print( seats [8] [j] + "   ");//prints all of the seats in the ninth line of the array with "j" moving to the next seat every iteration
    		}//end of if statement
    		
    	}//end of for loop
    
    System.out.println();// blank line to provide space for the greeting message
    System.out.println();// blank line to provide space for the greeting message
	}
	
}


