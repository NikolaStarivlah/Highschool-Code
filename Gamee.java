//Fighter/Adventure game
//You(C) are on an island and you have to fight the other Pokemon(P) to complete the game 
//Nikola Starivlah
//17/06/2016



import java.util.Random;
import java.util.Scanner;

public class Game
{

	public static char map [][]  =   {{'~','~','~','~','~','~','~','~','~','~','~','~','~','~','~','~','~','~','~','~','~','~','~','~','~','~',},
                                      {'~','C','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','~',},
		                              {'~','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','~',},
		                              {'~','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','~',},
		                              {'~','*','*','*','P','*','*','*','*','*','*','*','P','*','*','*','*','*','*','*','*','*','*','*','*','~',},
		                              {'~','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','~',},
		                              {'~','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','~',},
		                              {'~','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','~',},
		                              {'~','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','P','*','*','*','~',},
		                              {'~','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','~',},
		                              {'~','*','*','*','*','~','*','*','*','*','*','*','~','~','~','~','*','*','*','*','*','*','*','*','*','~',},
		                              {'~','*','*','*','*','~','*','*','*','*','*','*','~','~','~','~','*','*','*','*','*','*','*','*','*','~',},
		                              {'~','~','~','~','~','~','~','~','~','~','~','~','~','~','~','~','~','~','~','~','~','~','~','~','~','~',}};
	
	//^This is the map that all the methods have access to and the map that will be used by the player
	public static void main(String[] args)
	{
		//^main method
	
	
	    mep(map);
		//^ calls method to print map
	
		System.out.println("You have landed on an island");
	
		int vertical = 1;
		int horizontal = 1;
		int moveChoice;
		//^Your 2d array position is 1,1 
		moveOptions();
		//^Move options mehtod prints below map
		
		//The code below will run while you are not on 'P'
		while(map[vertical][horizontal] != 'P')
		{
			//Store keyboard input, move choice is related to 1,2,3,4 or 0 
			Scanner keyboard = new Scanner(System.in);
			moveChoice = keyboard.nextInt();
			
			
			//In order to move left it will say if the move choice is 4 run the code below then it will ask
			//If you move one left and its '~' then you can't move since its water, It will then print the map 
			//and the options. Then it will ask else if the
			//position left 1 of 'C' is * then that position will now be 'C' and the part 'C' was previously on
			//will be '*'. Then once '*' is replaced with 'C' it will generate a random number and if it equals 13
			//it runs pettiMon(); which is the easter egg but now its spoiled, then it prints the map again.
			//then it will ask else if you land on P while moving one left then it will print battle and will be replaced
			//with a '*' and call the battle method. I get rid of 'P' so you cant go on twice when you return to the main method
			//or else the game would never end 
			if(moveChoice == 4)
			{
				if(map[vertical][horizontal-1] == '~')
			    {
					System.out.println("You cant go there, thats water!");
					mep(map);
					moveOptions();
			    }
			    else if(map[vertical][horizontal-1] == '*')
			    {
			    	map[vertical][horizontal-1]	 = 'C';
			    	map[vertical][horizontal] = '*';
			    	horizontal -= 1;
			    	
			    	Random rand = new Random();
					Random rand7 = new Random();
				    int z=rand.nextInt(50) +1;
				    if(z==13)
				    {
				    	pettiMon();
				    }
			    	mep(map);
			    	moveOptions();
			    }
			    
			    else if(map[vertical][horizontal-1] == 'P'){
	                System.out.println("\nBattle");
	                map[vertical][horizontal-1] = '*';
	                mep(map);
					battletime();
			    }
			 }
			
			//In order to move right it will say if the move choice is 1 then run the code below. then it will ask
			//If you move one left and its '~' then you can't move since its water, It will then print the map 
			//and the options. Then it will ask else if the
			//position right 1 of 'C' is * then that position will now be 'C' and the part 'C' was previously on
			//will be '*'. Then once '*' is replaced with 'C' it will generate a random number and if it equals 13
			//it runs pettiMon(); which is the easter egg but now its spoiled again, then it prints the map once more.
			//then it will ask else if you land on P while moving right one then it will print battle and will be replaced
			//with a '*' and call the battle method. I get rid of 'P' so you cant go on it twice when you return to the main method
			//or else the game would never end 
			if(moveChoice == 1)
			{
				if(map[vertical][horizontal+1] == '~')
				{
					System.out.println("You cant go there, thats water!");
					mep(map);
					moveOptions();
				}
				else if(map[vertical][horizontal+1] == '*')
				{
					map[vertical][horizontal+1]	 = 'C';
					map[vertical][horizontal] = '*';
					horizontal += 1;
					
					Random rand = new Random();
					Random rand7 = new Random();
				    int z=rand.nextInt(50) +1;
				    if(z==13)
				    {
				    	pettiMon();
				    }
					mep(map);
					moveOptions();
				}
				
				else if(map[vertical][horizontal+1] == 'P'){
	                System.out.println("\nBattle");
	                map[vertical][horizontal+1] = '*';
	                mep(map);
					battletime();
				}
			}	
			
			
			
	
			//In order to move up it will ask if the move choice is 3 then run the code below. then it will ask
			//If you move one left and its '~' then you can't move since its water, It will then print the map 
			//and the options. Then it will ask else if the
			//position up 1 of 'C' is * then that position will now be 'C' and the part 'C' was previously on
			//will be '*'. Then once '*' is replaced with 'C' it will generate a random number and if it equals 13
			//it runs pettiMon(); which is the easter egg but now its spoiled (againx3), then it prints the map once more.
			//then it will ask else if you land on P while moving up one then it will print battle and will be replaced
			//with a '*' and call the battle method. I get rid of 'P' so you cant go on it twice when you return to the main method
			//or else the game would never end 
			if(moveChoice == 3)
			{
				if(map[vertical-1][horizontal] == '~')
				{
					moveOptions();
					System.out.println("You cant go there, thats water!");
					mep(map);
					
				}
				else if(map[vertical-1][horizontal] == '*')
				{
					map[vertical-1][horizontal]	 = 'C';
					map[vertical][horizontal] = '*';
					vertical -= 1;
					
					Random rand = new Random();
					Random rand7 = new Random();
				    int z=rand.nextInt(50) +1;
				    if(0 <= z && z <= 2)
				    {
				    	pettiMon();
				    }
					moveOptions();
					mep(map);
				}
				
				else if(map[vertical-1][horizontal] == 'P'){
					
	                System.out.println("\nBattle");
	                map[vertical-1][horizontal] = '*';
	                mep(map);
					battletime();
				}
			}	
					
			
			//In order to move down it will ask if the move choice is 2 then run the code below. then it will ask
			//If you move one down and its '~' then you can't move since its water, It will then print the map 
			//and the options. Then it will ask else if the
			//position 1 down of 'C' is * then that position will now be 'C' and the part 'C' was previously on
			//will be '*'. Then once '*' is replaced with 'C' it will generate a random number and if it equals 13
			//it runs pettiMon(); which is the easter egg but now its spoiled (againx3), then it prints the map once more.
			//then it will ask else if you land on P while moving down one then it will print battle and will be replaced
			//with a '*' and call the battle method. I get rid of 'P' so you cant go on it twice when you return to the main method
			//or else the game would never end 
			if(moveChoice == 2)
			{
				if(map[vertical+1][horizontal] == '~')
				{
					
					System.out.println("You cant go there, thats water!");
					moveOptions();
					mep(map);
					
				}
				else if(map[vertical+1][horizontal] == '*')
				{
					map[vertical+1][horizontal]	 = 'C';
					map[vertical][horizontal] = '*';
					vertical += 1;
					
					Random rand = new Random();
					Random rand7 = new Random();
				    int z=rand.nextInt(50) +1;
				    if(0 <= z && z <= 2)
				    {
				    	pettiMon();
				    }
					moveOptions();
					mep(map);
				}
				 else if(map[vertical + 1][horizontal] == 'P'){
		                System.out.println("\nBattle");
		                map[vertical+1][horizontal] = '*';
		                
						battletime();
				 }
			}
	     
			
			//If the move choice is 0 then it will quit the game
				if(moveChoice == 0)
				{
					System.exit(0);
						
				}
		//Below is the code to check if there are any 'P' left on the map. I created a remainingPettimon variable 
	    //so if when the nested for loop checks for any 'P' on the map and it dosent come up with any then it will
		//stop the game and let you know you completed it. The nested for loop works like the loop that reprints the map
		//it will check all the horizontal postions (x) and vertical (y) in a row and collumn scanner style and if 
		// and of the horizontal or verical positions 'P' then it will add x to remaining pettimon.
		int remainingPettimon = 0;
		for(int x = 0; x < map.length; x++){
			for(int y = 0; y < map[x].length; y++){
				if(map[x][y] == 'P')
					remainingPettimon++;
			}
		}
		
		if(remainingPettimon == 0)
		{
			System.out.println("You have completed the game");
			System.exit(0);
		}
	}
}			
public static void iceMonster()
{
	//^Method for ice monster
	  
	  int heathPlayer=100, heathEnemy=100, attackPlayer, attackEnemy;
	  
	  int glacier = 0, iceStorm=0;

	  //^These are all the variable used in the method 
		
	  Random rand = new Random();
		 
//Random numbers will be generated so we need something to store them 
	while(heathEnemy != 0 && heathPlayer != 0)
		//All the code below ill run as long as the enemy heath is not 0 and the player heath is not 0
	{
	
 Scanner keyboard = new Scanner(System.in);
	//^collect user input
		attackPlayer = keyboard.nextInt();
		//Attack player is linked with the numbers you can press to initiate an attack
		if(attackPlayer == 1 || attackPlayer == 2)
		{
			//if the player attack is one or two run the code below
			//Random rand1 = new Random();
		    int a=rand.nextInt(50) +1;
	    	//generates random number between 0 and 50
	    	if(0 <= a && a <= 25)
	    	{
	    		heathEnemy -= 35;
	    		System.out.println("You deal 25 damage to the icemonster. The enemy now has " + heathEnemy + " left");
	    	}
	    	//if its between 0 and 25 the enemy heath is 35 less than what it was at the time 
	    	else if(26 <= a && a <= 50)
	    	{
	    		heathEnemy -= 45;
	    		System.out.println("You deal 35 damage to the icemonster. The enemy now has " + heathEnemy + " left");
	    	}
	    	//if its between 26 and 50 the enemy heath is 45 less than what it was at time
		}
		
		//this part blow is for the enemy attack. we generate a new random number for its variables to change things
		//or else they would be the same as the player
		int b=rand.nextInt(50) +1;
	    	
	    if(0 <= b && b <= 25)	
	    {
	    	//if b (random number) is over 0 and less than 25 the player's health will be 25 less than what it was
	    	//then it will let the player know what happened and prompt it to use an attack
	    	attackEnemy = 25;  		
	        attackEnemy = glacier;
	        heathPlayer -= 25;
	        System.out.println("The enemy used glacier! You have" + heathPlayer  + "health left" );
	        System.out.println("Use an attack");
		}
		
	    else if(26 <= b && b <= 50)
	    {
	    	//if b (random number) is over 26 and less than 50 the player's health will be 35 less than what it was
	    	//then it will let the player know what happened and prompt it to use an attack
	    	attackEnemy = 35;  		
	        attackEnemy = iceStorm;
	        heathPlayer -= 35;
	        System.out.println("The enemy used icestorm! You have" + heathPlayer + "health left");	
	        System.out.println("Use an attack");
	    }
	    
	    if(attackPlayer == 3)
	    {
	    	//If the attack player is 3
	    	int c=rand.nextInt(50) +1;
	    	//generate a new random number
	    	if(0 <= c && c <= 25)
	    	{
	    		//if its over 0 and less than 25 the players heath will on be 10 less beacuse most of the damage was blocked 
	    		attackEnemy = 10;
	    		heathPlayer -= 10;
	    		System.out.println("You have blocked the attack, the enemy has only dealt " + attackEnemy + "You now have " + heathPlayer);
	    	}
	    }
	  	
	    if(heathPlayer < 0)
	    {
	    	System.out.println("Game over");
	    	System.exit(0);
	    }
	       //^ if the players health is less than 0 the game ends	
	    if(heathEnemy < 0)	
	    {
	    	mep(map);
	    	System.out.println("You won!");
	    	moveOptions();
	    	return;
	    	// if the enemy heath is less than 0 it will tell the user it won and return to the main method
	    }
	    if(heathEnemy  < 0 && heathPlayer < 0)
	    {
	    	System.out.println("Game over");
	    	System.exit(0);
	    	// if both players end up will heath less than 0 then it will end the game and let the user know
	    	
	    }
	}


}
	public static void mep(char x [][])
	
		
		
	{
		for(int collumn = 0; collumn < x.length; collumn++)
		{
	            for(int  row = 0; row < x[collumn].length; row++)
	            {
	            	
	                System.out.print(x[collumn][row] + " ");
	                   
	            }
	            System.out.println();
	            //^This is the method that reprints the map. It will go through the length of the horizontal and vertical
	            //space by space and once it reaches the end of it it will print all of it with a indent. the final println
	            //is used to go to he next line once one line is complete. this is so it dosent print the map in a starit line
	            
	        }
	}

    static void moveOptions()
    {
    	// move options method so the user knows what to press to move
    	System.out.println("\t To move right press 1");
    	System.out.println("\t To move down press 2");
    	System.out.println("\t To move up press 3");
    	System.out.println("\t To move left press 4");
    	System.out.println("\t To move quit press 0");
    }
    
    
    
    public static void battletime()
    {
    	
		  int heathPlayer=100, heathEnemy=100, attackPlayer, attackEnemy;
		  
		  int fireStorm = 0, burn = 0;
		  //this is the method called when a user lands on 'P' at the bottom there is a else statement that say's
		  //if the random number generated is between 26 and 50 then run the iceMonster method
   
		  System.out.println("You have run into a Trainer");
    	
		Random rand = new Random();
	    int n=rand.nextInt(50) +1;
		  //Generate a random number
		  if(0 <= n && n <= 25)
	    	{
	    		System.out.println("You are now fighting a fire monster!");
	    		System.out.println("You must pick a move: ThunderBolt = 1 , Scratch = 2, Sheild = 3");
	    	//if this number is between 0 and 25 it will run the firemonster code if not then it will skip
	        //to the else if statement at the bottom of this method and run the icemonster method
	    		
	    		
    	while(heathEnemy != 0 && heathPlayer != 0)	
    	{
    		//All the code below ill run as long as the enemy heath is not 0 and the player heath is not 0
        Scanner keyboard = new Scanner(System.in);
    	
    		attackPlayer = keyboard.nextInt();
    		//keybaord input^
    		if(attackPlayer == 1 || attackPlayer == 2)
    		{
    			
    		    int a=rand.nextInt(50) +1;
    	    	
    	    	if(0 <= a && a <= 25)
    	    	{
    	    		heathEnemy -= 35;
    	    		System.out.println("You deal 35 damage to the fireMonster. The enemy now has " + heathEnemy + " left");
    	    	}
    	    	else if(26 <= a && a <= 50)
    	    	{
    	    		heathEnemy -= 45;
    	    		System.out.println("You deal 45 damage to the fireMonster. The enemy now has " + heathEnemy + " left");
    	    	}
    		}
    		
    		//^ If the player presses 1 or 2 generate a random # if its 0-25 subtract 35 from health and if its 26-50 subract
    		// 45 from enemy health
	    	int b=rand.nextInt(50) +1;
    	    	
    	    if(0 <= b && b <= 25)	
    	    {
    	    	
    	    	attackEnemy = 25;  		
    	        attackEnemy = burn;
    	        heathPlayer -= 25;
    	        System.out.println("The enemy used burn! You have" + heathPlayer  + "health left" );	
    	        System.out.println("Use an attack");
    		}
    		
    	    else if(26 <= b && b <= 50)
    	    {
    	    	attackEnemy = 35;  		
    	        attackEnemy = fireStorm;
    	        heathPlayer -= 35;
    	        System.out.println("The enemy used firestrom! You have" + heathPlayer + "health left");	
    	        System.out.println("Use an attack");
    	    	
    	    }
    	  //^the enemy will deal 35 damage or 25 damage based off the random # generated
    	    if(attackPlayer == 3)
    	    {
    	    	
    	    	int c=rand.nextInt(50) +1;
    	    	
    	    	if(0 <= c && c <= 25)
    	    	{
    	    		attackEnemy = 10;
    	    		heathPlayer -= 10;
    	    		System.out.println("You have blocked the attack, the enemy has only dealt " + attackEnemy + "You now have " + heathPlayer);
    	    		System.out.println("Use an attack");
    	    	}
    	    }
    	  	//the player will only have 10 heath taken off
    	    if(heathPlayer < 0)
    	    {
    	    	System.out.println("Game over");
    	    	System.exit(0);
    	    }
    	       	
    	    if(heathEnemy < 0)	
    	    {
    	    	mep(map);
    	    	System.out.println("You won!");
    	    	moveOptions();
    	    	return;
    	    	
    	    }
    	    if(heathEnemy  < 0 && heathPlayer < 0)
    	    {
    	    	System.out.println("Game over");
    	    	System.exit(0);
    	    }	
    	}
    	// if heath of player and enemy is less than 0 exit game, if just player heath is less than 0 exit game , 
    	//if enemy heath is less than 0 retuen to main method to continue moving
	    	}
    	else if(26 <= n && n <= 50)
		{
			System.out.println("You are now fighting a iceMonster");
			System.out.println("You must pick a move: ThunderBolt = 1 , Scratch = 2, Sheild = 3");
			iceMonster();
		
			//run ice monster method.. explained how at the start of this one
    	
    }
    }
    	
    	public static void pettiMon()
    	{
    		
 	//easter egg method 
     	
 		  int heathPlayer=100, heathEnemy=100, attackPlayer, attackEnemy;
 		  
 		  int fireStorm = 0, burn = 0;
 		 
    
 		  System.out.println("You run into Mr.Petti!");
     	

 	    		System.out.println("He assigns you a assignment");
 	    		System.out.println("You must pick a move: ThunderBolt = 1 , Scratch = 2, Sheild = 3");
 	    		Random rand = new Random();
     	
 	    		while(heathEnemy != 0 && heathPlayer != 0)
 	    			//All the code below ill run as long as the enemy heath is not 0 and the player heath is not 0
     	{
     	
         Scanner keyboard = new Scanner(System.in);
     	
     		attackPlayer = keyboard.nextInt();
     		
     		if(attackPlayer == 1 || attackPlayer == 2)
     		{
     			//Random rand1 = new Random();
     		    int a=rand.nextInt(50) +1;
     	    	
     	    	if(0 <= a && a <= 25)
     	    	{
     	    		heathEnemy -= 25;
     	    		System.out.println("You deal 25 damage to the Assignment . The enemy now has " + heathEnemy + " left");
     	    		System.out.println("Use an attack");
     	    	}
     	    	else if(26 <= a && a <= 50)
     	    	{
     	    		heathEnemy -= 45;
     	    		System.out.println("You deal 35 damage to the Assignment. The enemy now has " + heathEnemy + " left");
     	    		System.out.println("Use an attack");
     	    	}
     		}
     		//^ If the player presses 1 or 2 generate a random # if its 0-25 subtract 35 from health and if its 26-50 subract
    		// 45 from enemy health
     		
 	    	int b=rand.nextInt(50) +1;
     	    	
     	    if(0 <= b && b <= 25)	
     	    {
     	    	
     	    	attackEnemy = 25;  		
     	        attackEnemy = burn;
     	        heathPlayer -= 25;
     	        System.out.println("The enemy used difficult problem! You have" + heathPlayer  + "health left" );		
     		}
     		
     	    else if(25 <= b && b <= 50)
     	    {
     	    	attackEnemy = 35;  		
     	        attackEnemy = fireStorm;
     	        heathPlayer -= 35;
     	        System.out.println("The assignment used confusion! You have" + heathPlayer + "health left");	
     	    	
     	    }
     	 //^the enemy will deal 35 damage or 25 damage based off the random # generated
     	    if(attackPlayer == 3)
     	    {
     	    	
     	    	int c=rand.nextInt(50) +1;
     	    	
     	    	if(0 <= c && c <= 25)
     	    	{
     	    		attackEnemy = 10;
     	    		heathPlayer -= 10;
     	    		System.out.println("You have blocked the attack, the assignment has only dealt " + attackEnemy + "You now have " + heathPlayer);
     	    	}
     	    }
     	  	//enemy will only deal 10 damage ^
     	    if(heathPlayer < 0)
     	    {
     	    	System.out.println("Game over");
     	    	System.exit(0);
     	    }
     	       	
     	    if(heathEnemy < 0)	
     	    {
     	    	mep(map);
     	    	System.out.println("You won!");
     	    	return;
     	    	
     	    }
     	    if(heathEnemy  < 0 && heathPlayer < 0)
     	    {
     	    	System.out.println("Game over");
     	    	System.exit(0);
     	    }	
    		//if heath of player and enemy is less than 0 exit game, if just player heath is less than 0 exit game , 
        	//if enemy heath is less than 0 return to main method to continue moving
    	}
    	
}
}	 
