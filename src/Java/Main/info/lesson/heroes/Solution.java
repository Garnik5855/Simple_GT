package info.lesson.heroes;

import java.io.BufferedReader;

import java.io.InputStreamReader;

public class Solution {

    private static final Warriors[] warriorsArray = new Warriors[20];

    public static void main(String[] args) {

        Warriors elfOne = new Elf("male", 10, "elfOne", false);
        Warriors elfTwo = new Elf("female", 5, "elfTwo", false);

        Warriors archerElfOne = new ArcherElf("male", 10, "archerElfOne", true, 20);
        Warriors archerElfTwo = new ArcherElf("male", 10, "archerElfTwo", true, 25);
        Warriors archerElfThree = new ArcherElf("male", 10, "archerElfThree", true, 28);

        Warriors swordsManElfOne = new SwordsManElf("female", 10, "swordsManElfOne", true, 31);
        Warriors swordsManElfTwo = new SwordsManElf("female", 10, "swordsManElfTwo", true, 32);
        Warriors swordsManElfThree = new SwordsManElf("female", 10, "swordsManElfThree", true, 33);
        Warriors swordsManElfFour = new SwordsManElf("female", 10, "swordsManElfFour", true, 34);
        Warriors swordsManElfFive = new SwordsManElf("female", 10, "swordsManElfFive", true, 35);


        Warriors gnomeOne = new Gnome("male", 10, "gnomeOne", false);
        Warriors gnomeTwo = new Gnome("female", 5, "gnomeTwo", false);

        Warriors archerGnomeOne = new ArcherGnome("male", 10, "archerGnomeOne", true, 30);
        Warriors archerGnomeTwo = new ArcherGnome("male", 10, "archerGnomeTwo", true, 35);
        Warriors archerGnomeThree = new ArcherGnome("male", 10, "archerGnomeThree", true, 38);

        Warriors swordsManGnomeOne = new SwordsManGnome("female", 10, "swordsManGnomeOne", true, 41);
        Warriors swordsManGnomeTwo = new SwordsManGnome("female", 10, "swordsManGnomeTwo", true, 42);
        Warriors swordsManGnomeThree = new SwordsManGnome("female", 10, "swordsManGnomeThree", true, 43);
        Warriors swordsManGnomeFour = new SwordsManGnome("female", 10, "swordsManGnomeFour", true, 44);
        Warriors swordsManGnomeFive = new SwordsManGnome("female", 10, "swordsManGnomeFive", true, 45);


        Solution solutionWarriors = new Solution();
        solutionWarriors.setWarriors(elfOne, elfTwo, archerElfOne, archerElfTwo, archerElfThree, swordsManElfOne, swordsManElfTwo, swordsManElfThree, swordsManElfFour, swordsManElfFive, gnomeOne, gnomeTwo, archerGnomeOne, archerGnomeTwo, archerGnomeThree, swordsManGnomeOne, swordsManGnomeTwo, swordsManGnomeThree, swordsManGnomeFour, swordsManGnomeFive);


        getSelectAttackOrProtect();

    }

    private static void getSelectAttackOrProtect() {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        while (true) {

            System.out.println("For attack with warriors type on the keyboard 'Attack'");
            System.out.println("For protect with warriors type on the keyboard 'Protect'");

            try {
                String selectedMethod = reader.readLine();
                if (selectedMethod.equalsIgnoreCase("Attack")) {
                    getAttackWithWarriors();
                    break;
                } else if (selectedMethod.equalsIgnoreCase("Protect")) {
                    getProtectWithWarriors();
                    break;
                } else {
                    System.out.println("It's wrong!!!");
                }

            } catch (Exception e) {
                System.out.println("It's wrong!!!");
            }
        }

    }

    private static void getAttackWithWarriors() {

        for (Warriors warriorsElement : warriorsArray) {

            warriorsElement.sayGreetings();
            warriorsElement.getAttack();

            System.out.println();
        }
    }

    private static void getProtectWithWarriors() {

        for (Warriors warriorsElement : warriorsArray) {

            warriorsElement.sayGreetings();
            warriorsElement.getAttack();

            System.out.println();
        }

    }

    private void setWarriors(Warriors... warriors) {
        for (int i = 0; i < warriors.length; i++) {
            warriorsArray[i] = warriors[i];
        }
    }

}