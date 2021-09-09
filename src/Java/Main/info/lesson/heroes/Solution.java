package info.lesson.heroes;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    private static List<Warriors> warriorsList = new ArrayList<>();
    //private static final Warriors[] warriorsArray = new Warriors[20];

    public static void main(String[] args) {

        Elf elfOne = new Elf("male", 10, "elfOne", false);
        Elf elfTwo = new Elf("female", 5, "elfTwo", false);

        Elf archerElfOne = new ArcherElf("male", 10, "archerElfOne", true, 20);
        Elf archerElfTwo = new ArcherElf("male", 10, "archerElfTwo", true, 25);
        Elf archerElfThree = new ArcherElf("male", 10, "archerElfThree", true, 28);

        Elf swordsManElfOne = new SwordsManElf("female", 10, "swordsManElfOne", true, 31);
        Elf swordsManElfTwo = new SwordsManElf("female", 10, "swordsManElfTwo", true, 32);
        Elf swordsManElfThree = new SwordsManElf("female", 10, "swordsManElfThree", true, 33);
        Elf swordsManElfFour = new SwordsManElf("female", 10, "swordsManElfFour", true, 34);
        Elf swordsManElfFive = new SwordsManElf("female", 10, "swordsManElfFive", true, 35);

        Gnome gnomeOne = new Gnome("male", 10, "gnomeOne", false);
        Gnome gnomeTwo = new Gnome("female", 5, "gnomeTwo", false);

        Gnome archerGnomeOne = new ArcherGnome("male", 10, "archerGnomeOne", true, 30);
        Gnome archerGnomeTwo = new ArcherGnome("male", 10, "archerGnomeTwo", true, 35);
        Gnome archerGnomeThree = new ArcherGnome("male", 10, "archerGnomeThree", true, 38);

        Gnome swordsManGnomeOne = new SwordsManGnome("female", 10, "swordsManGnomeOne", true, 41);
        Gnome swordsManGnomeTwo = new SwordsManGnome("female", 10, "swordsManGnomeTwo", true, 42);
        Gnome swordsManGnomeThree = new SwordsManGnome("female", 10, "swordsManGnomeThree", true, 43);
        Gnome swordsManGnomeFour = new SwordsManGnome("female", 10, "swordsManGnomeFour", true, 44);
        Gnome swordsManGnomeFive = new SwordsManGnome("female", 10, "swordsManGnomeFive", true, 45);

        collectArmy(gnomeOne, gnomeTwo, archerGnomeOne, archerGnomeTwo, archerGnomeThree, swordsManGnomeOne, swordsManGnomeTwo,
                swordsManGnomeThree, swordsManGnomeFour, swordsManGnomeFive, elfOne, elfTwo, archerElfOne, archerElfTwo, archerElfThree, swordsManElfOne, swordsManElfTwo, swordsManElfThree, swordsManElfFour, swordsManElfFive);


        for (Warriors warriorElement : warriorsList) {
            sendToAttackAndProtect(warriorElement);
        }

        List<Flyable> flyableList = new ArrayList<>();
        List<Swimmable> swimmableList = new ArrayList<>();
        List<Warriors> warriorsList1 = new ArrayList<>();

        for (Warriors element : warriorsList) {
            if (element instanceof Flyable && element instanceof Swimmable) {
                warriorsList1.add(element);
                continue;
            }
            if (element instanceof Flyable) {
                flyableList.add((Flyable) element);
            }
            if (element instanceof Swimmable) {
                swimmableList.add((Swimmable) element);
            }
        }
            System.out.println("Flyable and Swimable : ");

            for (Warriors warior : warriorsList1) {

                System.out.println(warior);

                System.out.println();
            }

            System.out.println("Flyable : ");
            for (Flyable flyable : flyableList) {
                flyable.fly();

                System.out.println();
            }

            System.out.println("Swimable :");
            for (Swimmable swimmable : swimmableList) {
                swimmable.swim();

                System.out.println();
            }
        }


    private static void collectArmy(Warriors... warriors) {
        warriorsList = Arrays.asList(warriors);
    }

    private static void sendToAttackAndProtect(Warriors warriors) {

        warriors.getAttack();
        warriors.getProtect();

        System.out.println();
    }
}