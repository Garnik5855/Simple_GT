package info.lesson.heroes;

public class Elf extends Warriors {

    private int height;
    private int age;

    public Elf(String gender, int strength, String name, boolean hasWeapon) {
        super(gender, strength, name, hasWeapon);
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


    public void run() {
        System.out.println("I run like an elf!");
    }

    public void eat() {
        System.out.println("I eat like an elf!");
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
