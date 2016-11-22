// Team DoReMi (Kenny Chen, Lisa Eng, Yedoh Kang)
// APCS1 -- pd5
// HW#34 -- Ye Olde Role Playing Game, Unchained
// 2016-11-23

public class Monster extends Character {

    // constructor
    public Monster() {
    	hp = 150;
    	// random num from [20, 65)
    	strength = (int)(Math.random() * 45) + 20;
    	defense = 20;
    	attackRating = 1;
    }
	
    // methods
	
    public String getName() {
    	return "Sully";
    }
	
    // prepares the Warrior to perform a normal attack; rests values
    public void normalize() {
        defense = 40;
        attackRating = .4;
    }

    // prepares the Warrior to perform a special attack
    public void specialize() {
        int decreaseDefense = 10; 
        double increaseAttack = .2;
        defense -= decreaseDefense;
        attackRating += increaseAttack;
    }

}
