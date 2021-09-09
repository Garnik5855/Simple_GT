package info.lesson.heroes;

public class Gnome implements Warriors, Swimmable {

    private int height;
    private int age;
    private String gender;
    protected int strength;
    private String name;
    protected boolean hasWeapon;
    private int protectStrength = 15;


    public Gnome(String gender, int strength, String name, boolean hasWeapon) {
        this.gender = gender;
        this.strength = strength;
        this.name = name;
        this.hasWeapon = hasWeapon;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
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

    public void run() {
        System.out.println("I run like an gnome!");
    }

    public void eat() {
        System.out.println("I eat like an gnome!");
    }

    public void sayGreetings() {
        System.out.println("Hello, I am " + name);
    }


    public void hit() {
        System.out.println("I am hit with " + this.strength + " points");
    }

    public int getProtectStrength() {
        return protectStrength;
    }

    public void setProtectStrength(int protectStrength) {
        this.protectStrength = protectStrength;
    }

    @Override
    public void getAttack() {
        System.out.println("I am gnome and I am attack with " + this.strength + " points.");

    }

    @Override
    public void getProtect() {
        System.out.println("I am gnome and I am protect with " + this.protectStrength * this.strength + " points.");
    }

    @Override
    public void swim() {
        System.out.println("I am gnome" + this.name + " and I can swim!!!");
    }


    @Override
    public String toString() {
        return "Gnome{" +
                "height=" + height +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", strength=" + strength +
                ", name='" + name + '\'' +
                ", hasWeapon=" + hasWeapon +
                '}';
    }
}