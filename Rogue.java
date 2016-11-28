// Team DoReMi (Kenny Chen, Lisa Eng, Yedoh Kang)
// APCS1 -- pd5
// HW#35 -- Ye Olde Role Playing Game, Realized
// 2016-11-28

public class Rogue extends Protagonist{

    // instance variables

    // constructor
    public Rogue (String newName) {
        name = newName;
        hp = 105;
        strength = 90;
        defense = 35;
        attackRating = 0.6;
    }

    // methods

    public String about() {
        String aboutRogue = "The Rogue has low hp, low strength, medium defense, and high attack rating.";
        return aboutRogue;
    }
}
