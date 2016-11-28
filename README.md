# YoRPG_DoReMi

### APCS1 Period 5
### Team DoReMi
#### Members: Kenny Chen, Lisa Eng, Yedoh Kang

#### Feature Additions
1. ASCII Art (Dragons)
2. Health Points
  * HP is printed after every match
  * A little bit of HP (a max of 25 HP) is added after each match, amount varies usng random generator
3. Leveling Up
  * Current Level is printed after every match
  * Level up when user loses less HP than those of the monster
  

#### Coding Restructuring
1. Added a new subclass called Protagonist that extends from superclass Character to avoid code repetition. Methods normalize() and specialize() were written in classes Warrior, Scavenger, Cleric, Mage, and Rogue. Putting normalize() and specialize() methods in class Protagonist and have subclasses Warrior, Scavenger, Cleric, Mage, and Rogue extend class Protagonist would allow the subclasses of Protagonist inherit specialize() and normalize() methods, avoiding code repetition.

#### How to Play!
1. Type in the terminal: java YoRPG
2. Select a difficulty.
  * 1 - Easy
  * 2 - Not so easy
  * 3 - Bring it on (aka hard)
3. Input your name! (or whatever you want your character to be called)
4. Input in how many monsters you want to fight.
5. After reading the descriptions, choose a character.
  * 0. Warrior
  * 1. Scavenger
  * 2. Cleric
  * 3. Mage
  * 4. Rogue
6. Matches will begin, and choose if you feel lucky or not!
  * 1. Nay
  * 2. Yay
7. How many points lost by both the monster and you will be displayed, as well as how many HP you gained and your current HP and level.
8. Matches will continue until either the Monster kills you or vice versa.
9. To play again, start from step 1.





