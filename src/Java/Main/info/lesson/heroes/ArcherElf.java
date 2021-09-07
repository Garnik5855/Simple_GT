package info.lesson.heroes;

public class ArcherElf extends Elf implements Warriors, Swimmable {
    private final int bowStrength;

    public ArcherElf(String gender, int strength, String name, boolean hasWeapon, int bowStrength) {
        super(gender, strength, name, hasWeapon);
        this.bowStrength = bowStrength;
    }

    @Override
    public void swim() {
        System.out.println("I am Elf" + this.getName() + " and I can swim like an elf!");
    }

    @Override
    public void fly() {
        System.out.println("I am Elf" + this.getName() + " and I can fly like an elf!");
    }

    @Override
    public void getAttack() {
        System.out.println("I am Elf and I am attack with bow " + this.strength * this.bowStrength + " points");
    }

    @Override
    public void getProtect() {
        System.out.println("I am Elf and I am protect with " + super.getProtectStrength() * this.bowStrength + " points.");

    }

    @Override
    public int getProtectStrength() {
        return super.getProtectStrength();
    }

    @Override
    public void hit() {
        System.out.println("I am hit with bow " + this.strength * this.bowStrength + " points");
    }

    @Override
    public String toString() {
        return "ArcherElf " + this.getName() +
                ". I can fly and swim!";
    }

}
