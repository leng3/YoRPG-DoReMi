// Team DoReMi (Kenny Chen, Lisa Eng, Yedoh Kang)
// APCS1 -- pd5
// HW#35 -- Ye Olde Role Playing Game, Realized
// 2016-11-28

public class Warrior extends Protagonist{

    // instance variables

    // constructor
    public Warrior (String newName) {
        name = newName;
        hp = 125;
        strength = 100;
        defense = 40;
        attackRating = 0.4;
    }

    // methods    
	
    public String about() {
        String aboutWarrior = "The Warrior has medium hp, medium strength, high defense, and low attack rating.";
        return aboutWarrior;
    }
}
