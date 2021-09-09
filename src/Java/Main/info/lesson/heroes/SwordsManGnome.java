package info.lesson.heroes;

public class SwordsManGnome extends Gnome implements Warriors {
    private final int swordStrength;

    public SwordsManGnome(String gender, int strength, String name, boolean hasWeapon, int swordStrength) {
        super(gender, strength, name, hasWeapon);
        this.swordStrength = swordStrength;
    }

    @Override
    public void swim() {
        System.out.println("I am gnome" + this.getName() + " and I swim like an gnome!");
    }


    @Override
    public void getAttack() {
        System.out.println("I am gnome and I am attack with sword " + this.strength * this.swordStrength + " points");
    }

    @Override
    public void getProtect() {
        System.out.println("I am gnome and I am protect with sword " + super.getProtectStrength() * this.swordStrength + " points.");

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
        return "SwordsManGnome " + this.getName() +
                ". I can swim!";
    }
}
