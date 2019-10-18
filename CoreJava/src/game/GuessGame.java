package game;

public class GuessGame {
  //create three player objects..
	Player p1;
    Player p2;
    Player p3;
    
    //start the game...
    public void startGame() {
    	p1=new Player();
    	p2=new Player();
    	p3=new Player();
    	
    //three variables to hold the guesses of the three players
    	int guessp1=0;
    	int guessp2=0;
    	int guessp3=0;
    	
    //three boolean variables to hold the result of the guesses
        boolean p1IsRight = false;
        boolean p2IsRight = false;
        boolean p3IsRight = false;
        
     //make a target number which the players have to be given to guess
        int targetNumber = (int)(Math.random()*10);
        System.out.println("I a thinking of a number between 0 ...9");
        
        while(true) {
        	System.out.println("Number to guess is "+targetNumber);
        	p1.guess();
        	p2.guess();
        	p3.guess();
        	
        	guessp1=p1.number;
        	System.out.println("Player one guessed "+guessp1);
        	
        	guessp2=p2.number;
        	System.out.println("Player two guessed "+guessp2);
        	
        	guessp3=p3.number;
        	System.out.println("Player three guessed "+guessp3);
        	
        //check each player is right or not...
        	
        	if(guessp1==targetNumber) {
        		p1IsRight=true;
        	}
        	if(guessp2==targetNumber) {
        		p2IsRight=true;
        	}
        	if(guessp3==targetNumber) {
        		p3IsRight=true;
        	}
        	
        //if anyone of the players is right...
        	if(p1IsRight||p2IsRight||p3IsRight) {
        		System.out.println("We have a Winner!");
        		System.out.println("Player one got it right "+ p1IsRight);
        		System.out.println("Player two got it right "+ p2IsRight);
        		System.out.println("Player three got it right "+ p3IsRight);
        		System.out.println("Game is over!");
        		break;
        	}
        	else {
        		System.out.println("Players will have to try again!");
        	}
        	
        }
        
    	
    	
    	
    }
}
