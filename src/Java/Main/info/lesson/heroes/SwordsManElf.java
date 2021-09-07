package info.lesson.heroes;

public class SwordsManElf extends Elf implements Warriors, Swimmable {
    private final int swordStrength;

    public SwordsManElf(String gender, int strength, String name, boolean hasWeapon, int swordStrength) {
        super(gender, strength, name, hasWeapon);
        this.swordStrength = swordStrength;
    }


    @Override
    public void getAttack() {
        System.out.println("I am Elf and I am attack with sword " + super.strength * this.swordStrength + " points");
    }

    @Override
    public void getProtect() {
        System.out.println("I am Elf and I am protect with sword " + this.getProtectStrength() * this.swordStrength + " points.");

    }

    @Override
    public int getProtectStrength() {
        return super.getProtectStrength();
    }

    @Override
    public void fly() {
        System.out.println("I am Elf" + this.getName() + " and I can fly like an elf!");
    }

    @Override
    public void swim() {
        System.out.println("I am Elf" + this.getName() + " and I swim like an elf!");
    }

    @Override
    public void hit() {
        System.out.println("I am Elf and I am hit with sword " + this.strength * this.swordStrength + " points");
    }

    @Override
    public String toString() {
        return "SwordsManElf " + this.getName() +
                ". I can fly and swim!";
    }
}
