// Team DoReMi (Kenny Chen, Lisa Eng, Yedoh Kang)
// APCS1 -- pd5
// HW#34 -- Ye Olde Role Playing Game, Unchained
// 2016-11-23

public abstract class Character{

    protected String name;
    protected int hp; // number of health points
    protected int strength;
    protected int defense;
    protected double attackRating;

    public boolean isAlive() {
        return hp > 0;
    }
    
    public String getName() {
        return name;
    }

    public int getDefense() {
        return defense;
    }

    public void lowerHP (int amount) {
        hp -= amount;
    }
	
    // attacks and calculates damage
    public int attack (Character character) {
        int damage = (int)(strength * attackRating) - character.getDefense();
        if (damage < 0) {
            damage = 0;
        }
        character.lowerHP(damage);
        return damage;
    }

    // prepares the Warrior to perform a normal attack; rests values
    public abstract void normalize();

    // prepares the Warrior to perform a special attack
    public abstract void specialize();
    
    public abstract String about();
}
