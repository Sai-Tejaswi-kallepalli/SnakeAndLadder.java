import java.io.Console;
public class Player{
	int boardPosition ;
	public Player(){
		boardPosition = 0;
	}
	public static void pressEnterToContinue(){
 			Console conObj = System.console();
			System.out.println("          < PRESS  ENTER TO CONTINUE >");
			conObj.readPassword();
	}
	public static void pressEnterToExit(){
 			Console conObj = System.console();
			System.out.println("          < PRESS  ENTER TO  EXIT >");
			conObj.readPassword();
		}
public void getPosition(Dice dice){
		if(boardPosition>=95){
			dice.roll();
		    boardPosition += dice.diceNumber;
		    System.out.println("Dice number is "+dice.diceNumber);
		    Player.pressEnterToContinue();
			if(boardPosition==98){
					boardPosition=22;
					  System.out.println("         ***oh so sad! you are bitten by a very dangerous snake 98 to 22 ***");
 					  Player.pressEnterToContinue();
 			} else
			if(boardPosition>100){
				boardPosition -=   dice.diceNumber;
				System.out.println("You have lost the chance since you cannot cross 100\n Now you  are in the same place");
				Player.pressEnterToContinue();
			}
		}
		else{
		  dice.roll();
		  boardPosition += dice.diceNumber;
		  System.out.println("Dice number is "+dice.diceNumber);
		  Player.pressEnterToContinue();
		  int n=boardPosition;
		  switch(boardPosition){
			case 13 : boardPosition=36;
					  System.out.println("         *** wow ! you got a tiny lucky ladder  13 to 36***");
					  try{Thread.sleep(1000);} catch(Exception e){}
					  Player.pressEnterToContinue();
					  break;
					  
			case 25 : boardPosition=64;
					  System.out.println("         *** wow ! you got a  ultra big lucky ladder 25 to 64 ***");
					  try{Thread.sleep(1000);} catch(Exception e){}
					  Player.pressEnterToContinue();
					  break;
			
			case 35 : boardPosition=54;
					  System.out.println("         *** wow ! you got a tiny lucky ladder 35 to 54 ***");
					  try{Thread.sleep(1000);} catch(Exception e){}
					  Player.pressEnterToContinue();
					  break;
		    
			case 62 : boardPosition=92;
					  System.out.println("         *** wow ! you got a  ultra big lucky ladder 62 to 92 ***");
					  try{Thread.sleep(1000);} catch(Exception e){}
					  Player.pressEnterToContinue();
					  break;
			case 71 : boardPosition=89;
					  System.out.println("         *** wow ! you got a lucky ladder 71 to 89 ***");
					  try{Thread.sleep(1000);} catch(Exception e){}
					  Player.pressEnterToContinue();
					  break;

			
			case 32 : boardPosition=18;
					  System.out.println("         *** oh so sad! you are bitten by a snake 32 to 18 ***");
					  try{Thread.sleep(1000);} catch(Exception e){}
					  Player.pressEnterToContinue();
					  break;
			
			case 39 : boardPosition=8;
					  System.out.println("         ***oh so sad! you are bitten by a dangerous snake 39 to 8 ***");
					  try{Thread.sleep(1000);} catch(Exception e){}
					  Player.pressEnterToContinue();
					  break;
					  
			case 57 : boardPosition=33;
					  System.out.println("         ***oh so sad! you are bitten by a dangerous snake 57 to 33 ***");
					  try{Thread.sleep(1000);} catch(Exception e){}
					  Player.pressEnterToContinue();
					  break;
					  
			case 75 : boardPosition= 22;
					  System.out.println("         ***oh so sad! you are bitten by a dangerous snake 75 to 22 ***");
					  try{Thread.sleep(1000);} catch(Exception e){}
					  Player.pressEnterToContinue();
					  break;
			
			case 98 : boardPosition=22;
					  System.out.println("         ***oh so sad! you are bitten by a very dangerous snake 98 to 22 ***");
					  try{Thread.sleep(1000);} catch(Exception e){}
					  Player.pressEnterToContinue();
					  break;
					  
			default : boardPosition= n;
					  break;
		  }
		}
	}
}
	
