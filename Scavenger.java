// Team DoReMi (Kenny Chen, Lisa Eng, Yedoh Kang)
// APCS1 -- pd5
// HW#34 -- Ye Olde Role Playing Game, Unchained
// 2016-11-23

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
