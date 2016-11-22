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
    
    public static String about() {
        String aboutWarrior = "The Warrior has medium hp, medium strength, high defense, and low attack rating.";
        String aboutRogue = "The Rogue has low hp, low strength, medium defense, and high attack rating.";
        String aboutScavenger = "The Scavenger is midway between the Warrior and the Rogue.";
        String aboutCleric = "The Cleric has high hp, low strength, high defense, and low attack rating.";
        String aboutMage = "The Mage has low hp, high strength, low defense, and medium attack rating.";
            
        String[] abouts = {aboutWarrior, aboutRogue, aboutScavenger, aboutCleric, aboutMage};

        String retStr = "";
        for (String s : abouts) {
            retStr += s + "\n";
        }
        return retStr;
    }
}
