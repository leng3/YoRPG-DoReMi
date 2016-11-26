// Team DoReMi (Kenny Chen, Lisa Eng, Yedoh Kang)
// APCS1 -- pd5
// HW#35 -- Ye Olde Role Playing Game, Realized
// 2016-11-28

public abstract class Character{

    protected String name;
    protected int hp; // number of health points
    protected int strength;
    protected int defense;
    protected double attackRating;
    protected int level = 1;
    protected int numToAddHP;

    public boolean isAlive() {
        return hp > 0;
    }
    
    public String getName() {
        return name;
    }

    public int getDefense() {
        return defense;
    }
	
    public int getLevel() {
	return level;
    }

    public void lowerHP (int amount) {
        hp -= amount;
    }
	
    public int levelUp () {
	level += 1;
	return level;
    }

    public int getHP() {
	return hp;
    }

    public void generateHPToAdd(){
	numToAddHP = (int)((Math.random()) * 25);
    }

    public int getNumToAddHP () {
	return numToAddHP;
    }
	
    public void gainHP(int amount) {
	hp+=amount;
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

    public abstract String about();
}
