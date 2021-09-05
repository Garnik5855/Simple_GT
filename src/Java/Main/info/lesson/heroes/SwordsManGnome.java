package info.lesson.heroes;

public class SwordsManGnome extends Warriors {
    private int swordStrength;

    public SwordsManGnome(String gender, int strength, String name, boolean hasWeapon, int swordStrength) {
        super(gender, strength, name, hasWeapon);
        this.swordStrength = swordStrength;
    }


    @Override
    public void getAttack() {
        System.out.println("I am attack with sword " + this.strength * this.swordStrength + " points");
    }

    @Override
    public void getProtect() {
        System.out.println("I am protect with sword " + super.getProtectStrength() * this.swordStrength + " points.");

    }

    @Override
    public void sayGreetings() {
        System.out.println("Hello, I am " + this.name);
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
    public int getProtectStrength() {
        return super.getProtectStrength();
    }

    @Override
    public void hit() {
        System.out.println("I am hit with sword " + this.strength * this.swordStrength + " points");

    }

    @Override
    public String toString() {
        return "SwordsManGnome{" +
                "swordStrength=" + swordStrength +
                '}';
    }
}
