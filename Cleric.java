// Team DoReMi (Kenny Chen, Lisa Eng, Yedoh Kang)
// APCS1 -- pd5
// HW#35 -- Ye Olde Role Playing Game, Realized
// 2016-11-28

public class Cleric extends Protagonist{

    // instance variables

    // constructor
    public Cleric (String newName) {
        name = newName;
        hp = 155;
        strength = 90;
        defense = 40;
        attackRating = 0.4;
    }

    // methods

    public String about() {
        String aboutCleric = "The Cleric has high hp, low strength, high defense, and low attack rating.";
        return aboutCleric;
    }
}
