// Team DoReMi (Kenny Chen, Lisa Eng, Yedoh Kang)
// APCS1 -- pd5
// HW#34 -- Ye Olde Role Playing Game, Unchained
// 2016-11-23

/*=============================================
  class YoRPG -- Driver file for Ye Olde Role Playing Game.
  Simulates monster encounters of a wandering adventurer.
  Required classes: Cleric, Mage, Rogue, Scavenger, Warrior, Monster
  =============================================*/

import java.io.*;
import java.util.*;

public class YoRPG {
	
    // ~~~~~~~~~~~ INSTANCE VARIABLES ~~~~~~~~~~~

    //change this constant to set number of encounters in a game
    public final static int MAX_ENCOUNTERS = 5;
	//an array of all classes
    private final static String[] CLASSES = {"Warrior", "Scavenger", "Cleric", "Mage", "Rogue"};

    //each round, a Cleric, Mage, Rogue, Scavenger, Warrior, and a Monster will be instantiated...
    private Character pat; // general
    private Monster smaug; //Friendly generic monster name?

    private int moveCount;
    private boolean gameOver;
    private int difficulty;

    private InputStreamReader isr;
    private BufferedReader in;
	
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

    // ~~~~~~~~~~ DEFAULT CONSTRUCTOR ~~~~~~~~~~~
	
    public YoRPG () {
		
        moveCount = 0;
    	gameOver = false;
    	isr = new InputStreamReader( System.in );
        in = new BufferedReader( isr );
    	newGame();
    }
	
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

    // ~~~~~~~~~~~~~~ METHODS ~~~~~~~~~~~~~~~~~~~
	
    /*=============================================
      void newGame() -- gathers info to begin a new game
      pre:  
      post: according to user input, modifies instance vars for difficulty and name
      and instantiates a class
      =============================================*/
    public void newGame () {
		
    	String s;
    	String name = "";
    	s = "~~~ Welcome to Ye Olde RPG! ~~~\n";
        s += "\nChoose your difficulty: \n";
    	s += "\t1: Easy\n";
    	s += "\t2: Not so easy\n";
    	s += "\t3: Beowulf hath nothing on me. Bring it on.\n";
    	s += "Selection: ";
    	System.out.print( s );

        try {
            difficulty = Integer.parseInt( in.readLine() );
    	}
    	catch ( IOException e ) { }
        s = "Intrepid warrior, what doth thy call thyself? (State your name): ";
        System.out.print( s );

        try {
            name = in.readLine();
    	}
    	catch ( IOException e ) { }
		
        chooseClass(name);
    }

    /*=============================================
      void chooseClass(String) -- helper function to newGame; chooses class
      pre:
      post: according to user input, instantiates pat to a class
      =============================================*/
    public void chooseClass(String name) {
        // choose your own class!
        int classSelection = 0;
        
        String y = "";
        y += "Choose your class!\n";
        //System.out.println("\nAbout: \n" + Character.about());
        for (int i = 0; i < CLASSES.length; i++) {
            y += "\t" + i + ": " + CLASSES[i] + "\n";
        }
        System.out.print(y);
		
        try {
            classSelection = Integer.parseInt( in.readLine() );
    	}
    	catch ( IOException e ) { }

        // check if classSelection is valid
        if (classSelection >= CLASSES.length) {
            classSelection = CLASSES.length - 1;
        } else if (classSelection < 0) {
            classSelection = 0;
        }
        
        // check what class a new instance should be made of
        if (classSelection == 0) {
            pat = new Warrior(name); // for use throughout the rest of this class
        }
        else if (classSelection == 1) {
            pat =  new Scavenger(name);
        }
        else if (classSelection == 2) {
            pat = new Cleric(name);
        }
        else if (classSelection == 3) {
            pat = new Mage(name);
        }
        else {
            pat = new Rogue(name);
        }

        System.out.println("Selection: " + CLASSES[classSelection]);
    }
    /*=============================================
      boolean playTurn -- simulates a round of combat
      pre:  Warrior pat has been initialized
      post: Returns true if player wins (monster dies).
      Returns false if monster wins (player dies).
      =============================================*/
    public boolean playTurn () {
		
    	int i = 1;
    	int d1, d2;
		
    	if (Math.random() >= (difficulty / 3.0)) {
            System.out.println("\nNothing to see here. Move along!");
        }
        else {
            System.out.println("\nLo, yonder monster approacheth!");

            smaug = new Monster();

            while( smaug.isAlive() && pat.isAlive() ) {
                // Give user the option of using a special attack:
                // If you land a hit, you incur greater damage,
                // ...but if you get hit, you take more damage.
                try {
                    System.out.println("\nDo you feel lucky?");
                    System.out.println("\t1: Nay.\n\t2: Aye!");
                    i = Integer.parseInt(in.readLine());
                }
                catch (IOException e) {
                }

                if (i == 2) {
                    pat.specialize();  	 		
                }
                else {
                    pat.normalize();
                }

                d1 = pat.attack(smaug);
                d2 = smaug.attack(pat);

                System.out.println("\n" + pat.getName() + " dealt " + d1 + " points of damage.");
                System.out.println( "\n" + "Ye Olde Monster smacked " + pat.getName() + 
                                    " for " + d2 + " points of damage.");
            }//end while

            //option 1: you & the monster perish
            if (!smaug.isAlive() && !pat.isAlive()) {
                System.out.println( "'Twas an epic battle, to be sure... " +
                                    "You cut ye olde monster down, but " + 
                                    "with its dying breath ye olde monster. " +
                                    "laid a fatal blow upon thy skull." );
                return false;
            }
		
            //option 2: you slay the beast
            else if (!smaug.isAlive()) {
                System.out.println( "HuzzaaH! Ye olde monster hath been slain!" );
                return true;
            }
    	
            //option 3: the beast slays you
            else if (!pat.isAlive()) {
                System.out.println( "Ye olde self hath expired. You got dead." );
                return false;
            }
    	}//end else

    	return true;
    }//end playTurn()
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

    public static void main (String[] args) {

    	//loading...
    	YoRPG game = new YoRPG();

    	int encounters = 0;

        while (encounters < MAX_ENCOUNTERS) {
            if (!game.playTurn()) {
                break;
            }
            encounters++;
            System.out.println();
    	}

    	System.out.println("Thy game doth be over.");
    }//end main
	
}//end class YoRPG
