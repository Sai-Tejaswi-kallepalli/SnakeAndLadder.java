public class SnakeGameBoard{
	int []num=new int[100];
	boolean leftToRightDirection = false;
	public SnakeGameBoard() {
		for(int i=num.length;i>=1;i--){
		num[i-1] = i;
 	}
	 System.out.print("\n\n         ");
	 for(int row=10;row>=1;row--){
		 if(leftToRightDirection==false){
			for(int position=10;position>=1;position--){
				if((10*(row-1)+position)==13){
				System.out.printf("[ #"+"%3d"+" ]   ",num[(10*(row-1)+position)-1]);
			}
			else
			if((10*(row-1)+position)==32){
				System.out.printf("[ $"+"%3d"+" ]   ",num[(10*(row-1)+position)-1]);
			}
			else
			if((10*(row-1)+position)==35){
				System.out.printf("[ #"+"%3d"+" ]   ",num[(10*(row-1)+position)-1]);
			}
			else
			if((10*(row-1)+position)==71){
				System.out.printf("[ #"+"%3d"+" ]   ",num[(10*(row-1)+position)-1]);
			}
			else
			if((10*(row-1)+position)==39){
				System.out.printf("[ $"+"%3d"+" ]   ",num[(10*(row-1)+position)-1]);
			}
			else
			if((10*(row-1)+position)==98){
				System.out.printf("[ $"+"%3d"+" ]   ",num[(10*(row-1)+position)-1]);
			}
			else
			if((10*(row-1)+position)==57){
				System.out.printf("[ $"+"%3d"+" ]   ",num[(10*(row-1)+position)-1]);
			}
			else
			if((10*(row-1)+position)==75){
				System.out.printf("[ $"+"%3d"+" ]   ",num[(10*(row-1)+position)-1]);
			}
			else{
			System.out.printf("["+"%5d"+" ]   ",num[(10*(row-1)+position)-1]);
		}
	}
		  leftToRightDirection= (!leftToRightDirection);
		}
		else{
			for(int position=1;position<=10;position++){
			if((10*(row-1)+position)==25){
				System.out.printf("[ #"+"%3d"+" ]   ",num[(10*(row-1)+position)-1]);
			}
			else
 			if((10*(row-1)+position)==62){
				System.out.printf("[ #"+"%3d"+" ]   ",num[(10*(row-1)+position)-1]);
			}
			else{
				System.out.printf("["+"%5d"+" ]   ",num[(10*(row-1)+position)-1]);
			}
		}
			leftToRightDirection= (!leftToRightDirection);
		}
		System.out.print("\n\n\n         ");
	}
	}
	public  void showBoardWithPlayers(Player a,Player b){
		leftToRightDirection = false;
		int positionOfplayer1 =a.boardPosition;
		int positionOfplayer2 =b.boardPosition;
		System.out.print("\n\n         ");
		 for(int row=10;row>=1;row--){
			 if(leftToRightDirection==false){
				 for(int position=10;position>=1;position--){
					 if((10*(row-1)+position)==13){
						System.out.printf("[ #"+"%3d"+" ]   ",num[(10*(row-1)+position)-1]);
					}
					else
 					if((10*(row-1)+position)==32){
						System.out.printf("[ $"+"%3d"+" ]   ",num[(10*(row-1)+position)-1]);
					}
					else
					if((10*(row-1)+position)==35){
						System.out.printf("[ #"+"%3d"+" ]   ",num[(10*(row-1)+position)-1]);
					}
					else
					if((10*(row-1)+position)==71){
						System.out.printf("[ #"+"%3d"+" ]   ",num[(10*(row-1)+position)-1]);
					}
					else
					if((10*(row-1)+position)==39){
						System.out.printf("[ $"+"%3d"+" ]   ",num[(10*(row-1)+position)-1]);
					}
					else
					if((10*(row-1)+position)==98){
						System.out.printf("[ $"+"%3d"+" ]   ",num[(10*(row-1)+position)-1]);
					}
					else
					if((10*(row-1)+position)==75){
						System.out.printf("[ $"+"%3d"+" ]   ",num[(10*(row-1)+position)-1]);
					}
					else
					if((10*(row-1)+position)==57){
						System.out.printf("[ $"+"%3d"+" ]   ",num[(10*(row-1)+position)-1]);
					}
					else{
					if( (positionOfplayer1 == 10*(row-1)+position) && (positionOfplayer2 != 10*(row-1)+position) ){
						System.out.printf("["+"A"+"%4d"+" ]   ",num[(10*(row-1)+position)-1]);
						continue;
					}
					else 
					if( (positionOfplayer1 != 10*(row-1)+position) && (positionOfplayer2 == 10*(row-1)+position) ){
						System.out.printf("["+"B"+"%4d"+" ]   ",num[(10*(row-1)+position)-1]);
						continue;
					}
					else 
					if( (positionOfplayer1 == 10*(row-1)+position) && (positionOfplayer2 == 10*(row-1)+position) ){
						System.out.printf("["+"AB"+"%3d"+" ]   ",num[(10*(row-1)+position)-1]);
						continue;
					}
					else{
						System.out.printf("["+"%5d"+" ]   ",num[(10*(row-1)+position)-1]);
					}
				}
			}
			leftToRightDirection= (!leftToRightDirection);
		}
		else{
			for(int position=1;position<=10;position++){
				if((10*(row-1)+position)==25){
					System.out.printf("[ #"+"%3d"+" ]   ",num[(10*(row-1)+position)-1]);
				} 
				else
 				if((10*(row-1)+position)==62){
					System.out.printf("[ #"+"%3d"+" ]   ",num[(10*(row-1)+position)-1]);
				}
				else{
					if( (positionOfplayer1 == 10*(row-1)+position) && (positionOfplayer2 != 10*(row-1)+position) ){
					System.out.printf("["+"A"+"%4d"+" ]   ",num[(10*(row-1)+position)-1]);
					continue;
					}
					else 
					if( (positionOfplayer1 != 10*(row-1)+position) && (positionOfplayer2 == 10*(row-1)+position) ){
						System.out.printf("["+"B"+"%4d"+" ]   ",num[(10*(row-1)+position)-1]);
						continue;
					}
					else 
					if( (positionOfplayer1 == 10*(row-1)+position) && (positionOfplayer2 == 10*(row-1)+position) ){
						System.out.printf("["+"AB"+"%3d"+" ]   ",num[(10*(row-1)+position)-1]);
						continue;
					}
					else{
						System.out.printf("["+"%5d"+" ]   ",num[(10*(row-1)+position)-1]);
					}
				}
			}
			leftToRightDirection= (!leftToRightDirection);
		}
		System.out.print("\n\n\n         ");
	}
	System.out.print("A POSITION = "+positionOfplayer1+"\t");	
	 System.out.print("B POSITION = "+positionOfplayer2);	
}
}

