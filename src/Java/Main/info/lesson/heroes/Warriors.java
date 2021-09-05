package info.lesson.heroes;

public abstract class Warriors {


    private int protectStrength = 15;

    public abstract void getAttack();
    public abstract void getProtect();

    public int getProtectStrength() {
        return protectStrength;
    }

    public void setProtectStrength(int protectStrength) {
        this.protectStrength = protectStrength;
    }




}
