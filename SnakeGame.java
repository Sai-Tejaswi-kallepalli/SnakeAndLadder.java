import java.util.Scanner;
public class SnakeGame{
	public static void main(String args[])throws Exception{
		System.out.println("                                          WELCOME TO SNAKE-LADDER GAME ");
		Thread.sleep(1000);
		for(int i=3;i>=1;i--){
		   System.out.printf("                                               Game Start in %d\r",i);
		   Thread.sleep(1000);
	    }
        Thread.sleep(500);
		System.out.println("\n\n\n                                               Game Started ");
		Thread.sleep(500);
		try{
			Thread.sleep(1000);
			}catch(Exception e){
		}
		SnakeGameBoard board = new SnakeGameBoard();
		Player player1 = new Player();
		Player player2 = new Player();
		Dice dice = new Dice();
		boolean fistPlayerTurn = true;
		while((player1.boardPosition<=100) && (player2.boardPosition<=100)){
		String str =". . . ";
		Scanner scan = new Scanner(System.in);
		if(fistPlayerTurn){
		System.out.println("\nPlayer 1 turn \n  ");
		System.out.print(" Player 1 (A) :>  Press y to roll the dice   : ");
		char ch = scan.next().toUpperCase().charAt(0);
		System.out.println("");
		if(ch=='Y'){
			for(int i=0;i<=5;i++){
			try{Thread.sleep(200);} catch(Exception e){}
			System.out.print("dice rolling "+str.substring(0,i)+"\r");
		 }try{Thread.sleep(200);} catch(Exception e){}
		 player1.getPosition(dice);
		 board.showBoardWithPlayers(player1,player2);
		 if(player1.boardPosition==100){
			System.out.println(" \n            Player-1 is winner \n            GAME OVER");
			Player.pressEnterToExit();
			try{Thread.sleep(800);} catch(Exception e){}
			break;
		 }
		 }else {
			System.out.println("\n***Press valid key***");
			continue;
		    }
		fistPlayerTurn =(!fistPlayerTurn);	
		}
		else{
		System.out.println("\nPlayer 2 turn \n  ");
		System.out.print(" Player 2 (B) :>  Press y to roll the dice  : ");
		char ch = scan.next().toUpperCase().charAt(0);
		if(ch=='Y'){
		for(int i=0;i<=5;i++){
			try{Thread.sleep(200);} catch(Exception e){}
			System.out.print("dice rolling "+str.substring(0,i)+"\r");
		 }try{Thread.sleep(200);} catch(Exception e){}
		 player2.getPosition(dice);
		 board.showBoardWithPlayers(player1,player2);
		 if(player2.boardPosition==100){
			System.out.println(" \n           Player-2 is winner \n\n\n            GAME OVER");
			Player.pressEnterToExit();
			try{Thread.sleep(800);} catch(Exception e){}
			break;
		 }
		 }else {
			System.out.println("Press valid key");
			continue;
		 } 
		fistPlayerTurn =(!fistPlayerTurn); 
		}
	}
}
}


