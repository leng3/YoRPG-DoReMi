// Team DoReMi (Kenny Chen, Lisa Eng, Yedoh Kang)
// APCS1 -- pd5
// HW#32 -- Ye Olde Role Playing Game, Expanded
// 2016-11-21

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

}
