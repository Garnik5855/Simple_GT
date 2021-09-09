package info.lesson.heroes;

public class ArcherGnome extends Gnome implements Warriors, Swimmable {
    private final int bowStrength;

    public ArcherGnome(String gender, int strength, String name, boolean hasWeapon, int bowStrength) {
        super(gender, strength, name, hasWeapon);
        this.bowStrength = bowStrength;
    }

    @Override
    public void swim() {
        System.out.println("I am gnome " + this.getName() + " and I can swim like an gnome!");
    }

    @Override
    public void getAttack() {
        System.out.println("I am gnome and I am attack with bow " + this.strength * this.bowStrength + " points");
    }

    @Override
    public void getProtect() {
        System.out.println("I am gnome and I am protect with bow " + super.getProtectStrength() * this.bowStrength + " points.");

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
        return "ArcherGnome " +this.getName()+
                ". I can swim!!!";
    }
}
