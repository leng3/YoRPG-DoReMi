// Team DoReMi (Kenny Chen, Lisa Eng, Yedoh Kang)
// APCS1 -- pd5
// HW#35 -- Ye Olde Role Playing Game, Realized
// 2016-11-28

public class Mage extends Protagonist{

    // instance variables

    // constructor
    public Mage (String newName) {
        name = newName;
        hp = 100;
        strength = 150;
        defense = 30;
        attackRating = 0.5;
    }

    // methods       
    
    public String about() {
        String aboutMage = "The Mage has low hp, high strength, low defense, and medium attack rating.";
        return aboutMage;
    }
}
