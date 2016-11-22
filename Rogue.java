// Team DoReMi (Kenny Chen, Lisa Eng, Yedoh Kang)
// APCS1 -- pd5
// HW#34 -- Ye Olde Role Playing Game, Unchained
// 2016-11-23

public class Rogue extends Character{

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
