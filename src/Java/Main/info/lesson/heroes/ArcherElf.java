package info.lesson.heroes;

public class ArcherElf extends Warriors {
    private int bowStrength = 10;

    public ArcherElf(String gender, int strength, String name, boolean hasWeapon, int bowStrength) {
        super(gender, strength, name, hasWeapon);
        this.bowStrength = bowStrength;
    }

    @Override
    public void eat() {
        System.out.println("I eat like an Gnome!");
    }

    @Override
    public void run() {
        System.out.println("I run like an elf!");
    }

    @Override
    public void getAttack() {
        System.out.println("I am attack with bow " + this.strength * this.bowStrength + " points");
    }

    @Override
    public void getProtect() {
        System.out.println("I am protect with " + super.getProtectStrength() * this.bowStrength + " points.");

    }

    @Override
    public void sayGreetings() {
        System.out.println("Hello, I am " + this.name);
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
        return "ArcherElf{" +
                "bowStrength=" + bowStrength +
                '}';
    }
}
