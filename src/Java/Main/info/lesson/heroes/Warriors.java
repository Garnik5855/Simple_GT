package info.lesson.heroes;

public abstract class Warriors {


    protected String name;
    protected String gender;
    protected int strength;
    protected boolean hasWeapon;

    public Warriors(String gender, int strength, String name, boolean hasWeapon) {
        this.gender = gender;
        this.strength = strength;
        this.name = name;
        this.hasWeapon = hasWeapon;
    }

    private int protectStrength = 15;

    public abstract void getAttack();
    public abstract void getProtect();

    public int getProtectStrength() {
        return protectStrength;
    }

    public void setProtectStrength(int protectStrength) {
        this.protectStrength = protectStrength;
    }


    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isHasWeapon() {
        return hasWeapon;
    }

    public void setHasWeapon(boolean hasWeapon) {
        this.hasWeapon = hasWeapon;
    }

}
