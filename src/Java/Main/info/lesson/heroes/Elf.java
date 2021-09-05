package info.lesson.heroes;

public class Elf extends Warriors {

    private int height;
    private int age;

    public Elf(String gender, int strength, String name, boolean hasWeapon) {
        super(gender, strength, name, hasWeapon);
    }
//    private String gender;
//    protected int strength;
//    private String name;
//    protected boolean hasWeapon;


//    public Elf(String gender, int strength, String name, boolean hasWeapon) {
//        this.gender = gender;
//        this.strength = strength;
//        this.name = name;
//        this.hasWeapon = hasWeapon;
//    }






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

//    public String getGender() {
//        return gender;
//    }
//
//    public void setGender(String gender) {
//        this.gender = gender;
//    }
//
//    public int getStrength() {
//        return strength;
//    }
//
//    public void setStrength(int strength) {
//        this.strength = strength;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public boolean isHasWeapon() {
//        return hasWeapon;
//    }
//
//    public void setHasWeapon(boolean hasWeapon) {
//        this.hasWeapon = hasWeapon;
//    }

    public void run() {

    }

    public void eat() {


    }

    public void sayGreetings() {
        System.out.println("Hello, I am " + this.name);
    }

    public void hit() {
        System.out.println("I am hit with " + this.strength + " points");
    }

    @Override
    public void setProtectStrength(int protectStrength) {
        super.setProtectStrength(protectStrength);
    }

    @Override
    public void getAttack() {
        System.out.println("I am attack with " + this.strength + " points.");

    }

    @Override
    public void getProtect() {
        System.out.println("I am protect with " + super.getProtectStrength() * this.strength + " points.");
    }

    @Override
    public String toString() {
        return "Elf{" +
                "height=" + height +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", strength=" + strength +
                ", name='" + name + '\'' +
                ", hasWeapon=" + hasWeapon +
                '}';
    }
}
