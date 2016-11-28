// Team DoReMi (Kenny Chen, Lisa Eng, Yedoh Kang)
// APCS1 -- pd5
// HW#35 -- Ye Olde Role Playing Game, Realized
// 2016-11-28

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

    public String about() {
        String aboutMonster = "Ye Olde Monster has high hp. varying strength from low to high, low defense, and high attack rating.";
        return aboutMonster;
    }
}
