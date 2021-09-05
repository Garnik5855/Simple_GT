package info.lesson.heroes;

public class SwordsManElf extends Warriors {
    private int swordStrength = 20;

    public SwordsManElf(String gender, int strength, String name, boolean hasWeapon, int swordStrength) {
        super(gender, strength, name, hasWeapon);
        this.swordStrength = swordStrength;
    }


    @Override
    public void getAttack() {
        System.out.println("I am attack with sword " + super.strength * this.swordStrength + " points");
    }

    @Override
    public void getProtect() {
        System.out.println("I am protect with sword " + this.getProtectStrength() * this.swordStrength + " points.");

    }

    @Override
    public void sayGreetings() {
        System.out.println("Hello, I am " + this.name);
    }

    @Override
    public void eat() {

    }

    @Override
    public void run() {

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
        return "SwordsManElf{" +
                "swordStrength=" + swordStrength +
                '}';
    }
}
