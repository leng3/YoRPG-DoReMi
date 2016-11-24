// Team DoReMi (Kenny Chen, Lisa Eng, Yedoh Kang)
// APCS1 -- pd5
// HW#35 -- Ye Olde Role Playing Game, Realized
// 2016-11-28

public class Protagonist extends Character {

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
    
    public String about() {
        String aboutWarrior = "The Warrior has medium hp, medium strength, high defense, and low attack rating.";
        String aboutRogue = "The Rogue has low hp, low strength, medium defense, and high attack rating.";
        String aboutScavenger = "The Scavenger is midway between the Warrior and the Rogue.";
        String aboutCleric = "The Cleric has high hp, low strength, high defense, and low attack rating.";
        String aboutMage = "The Mage has low hp, high strength, low defense, and medium attack rating.";
	    String aboutMonster = "Ye Olde Monster has high hp. varying strength from low to high, low defense, and high attack rating.";

        String[] abouts = {aboutWarrior, aboutRogue, aboutScavenger, aboutCleric, aboutMage, aboutMonster};

        String retStr = "";
        for (String s : abouts) {
            retStr += s + "\n";
        }
        return retStr;
    }
}
