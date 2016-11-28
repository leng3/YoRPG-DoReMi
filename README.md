# YoRPG_DoReMi

### APCS1 Period 5
### Team DoReMi
#### Members: Kenny Chen, Lisa Eng, Yedoh Kang

#### Feature Additions
1. ASCII Art (Dragons)
2. Health Points
  * HP is printed after every turn
  * A little bit of HP (a max of 25 HP) is added after each turn, amount varies (RNG)
3. Leveling Up
  * Current level is printed after every turn
  * Level up when the user does more damage than the monster does
4. User-input of max encounters
  * User can choose the maximum number of monsters to look for

#### Coding Restructuring
1. Added a new subclass called Protagonist that extends from superclass Character to avoid code repetition; Warrior, Scavenger, Cleric, Mage, and Rogue extend class Protagonist.
2. normalize() and specialize() were removed from Character and put into Protagonist (Not needed for monster).
3. Added chooseClass() and introduceGame() methods in YoRPG.java for organization and code-readability.
4. Made max_encounters private (non-final and non-static) to allow the user to modify it.

#### How to Play!
1. Type in the terminal: java YoRPG
2. Select a difficulty.
  * 1 - Easy
  * 2 - Not so easy
  * 3 - Bring it on (aka hard)
3. Input your name! (or whatever you want your character to be called)
4. Input in how many monsters you want to search for.
5. After reading the descriptions, choose a character.
  * 0. Warrior
  * 1. Scavenger
  * 2. Cleric
  * 3. Mage
  * 4. Rogue
6. Searching for monsters will begin. When you encounter one, you can choose if you feel lucky or not!
  * 1. Nay
  * 2. Yay
7. How many points lost by both the monster and you will be displayed, as well as how many HP you gained and your current HP and level.
8. Turns will continue until either the Monster or you die.
9. Searching will continue until the number of searches you wanted to do is reached.
10. To play again, start from step 1.


