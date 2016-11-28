// Team DoReMi (Kenny Chen, Lisa Eng, Yedoh Kang)
// APCS1 -- pd5
// HW#35 -- Ye Olde Role Playing Game, Realized
// 2016-11-28

public class Scavenger extends Protagonist{

    // instance variables

    // constructor
    public Scavenger (String newName) {
        name = newName;
        hp = 115;
        strength = 95;
        defense = 35;
        attackRating = 0.5;
    }

    // methods

    public String about() {
        String aboutScavenger = "The Scavenger is midway between the Warrior and the Rogue.";
        return aboutScavenger;
    }
}
