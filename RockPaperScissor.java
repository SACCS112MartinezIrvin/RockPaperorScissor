/*
 *File Name RockPaperScissor.java
 * Irvin Martinez
 * CS 112 Week 4 HW
 * The program will play Rock Paper Scissors with the user  
 */

import java.util.Random;//Program will use class Random to generate a stream of random numbers 
import java.util.Scanner;

public class RockPaperScissor {

	public static void main(String[] args){
		
		Random random = new Random();//Creates a new random number generator 
		
		Scanner scanner = new Scanner(System.in);//Reads user's input of Rock, Paper, or Scissors
		
		int userChoice;
		int programChoice;
		
		
		System.out.println("Choose!:\nRock = 0\nPaper = 1\nScissor = 2\n");
		userChoice = scanner.nextInt();//Will store input into userChoice variable
		
		//Making sure the only choices are 0,1, or 2
		if(userChoice < 0 || userChoice > 2){
			System.out.println("World Ending! Invalid Choice :( ");
		}
		
		//Generating random programChoice
		
		programChoice = random.nextInt(3);//Using random object. Parameter is set to 3 so that it generates numbers 1-2	
		
		//Who wins? 
		
		if(userChoice == programChoice){
			if(userChoice == 0){
				System.out.println("Both players choose rock! Haha you both lose");
			}
			else if (userChoice == 1){
				System.out.println("Both players choose paper! Haha you both lose");
				
			}
			else{
				System.out.println("Both players choose scissor! Haha you both lose");
			}
		}
		if(userChoice == 0){//User chooses rock 
			if(programChoice == 1){
				System.out.println("You chose Rock! Program Chooses Paper");
				System.out.println("Haha Loser!");
			}
			else{
				System.out.println("You chose Rock! Program Chooses Scissors");
				System.out.println("You got lucky... Winner!");
			}
			
		}
		
		else if (userChoice == 1){// User chooses paper
			if(programChoice == 0){
				System.out.println("You chose Paper! Computer chooses Rock");
				System.out.println("Rock Solid! You Win!");
			}
			else{
				System.out.println("You chose Paper! Computer chooses Scissors!");
				System.out.println("Best luck next time! You lose!");
			}
		}
		else {// user chooses scissors
			if (programChoice == 0){
				System.out.println("You chose Scissors! Computer chooses Rock!");
				System.out.println("Congratulations! You Lose!");
			}
			else{
				System.out.println("You chose Scissors! Computer chooses Paper");
				System.out.println("Ahh man, you win!");
			}
		
		}
			scanner.close();
	}
}
