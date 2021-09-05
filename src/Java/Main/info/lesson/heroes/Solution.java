package info.lesson.heroes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {


    private static final Elf[] elvesArray = new Elf[10];

    private static final Gnome[] gnomesArray = new Gnome[10];

    public static void main(String[] args) throws IOException {

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

        Solution solutionElf = new Solution();
        solutionElf.setElves(elfOne, elfTwo, archerElfOne, archerElfTwo, archerElfThree, swordsManElfOne, swordsManElfTwo, swordsManElfThree, swordsManElfFour, swordsManElfFive);

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

        Solution solutionGnome = new Solution();
        solutionGnome.setGnomes(gnomeOne, gnomeTwo, archerGnomeOne, archerGnomeTwo, archerGnomeThree, swordsManGnomeOne, swordsManGnomeTwo, swordsManGnomeThree, swordsManGnomeFour, swordsManGnomeFive);


        getSelectAttackOrProtect();

    }

    private static void getSelectAttackOrProtect() throws IOException {

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

        for (Elf elfElement : elvesArray) {

            elfElement.sayGreetings();
            elfElement.getAttack();

            System.out.println();
        }

        for (Gnome gnomeElement : gnomesArray) {

            gnomeElement.sayGreetings();
            gnomeElement.getAttack();

            System.out.println();
        }
    }

    private static void getProtectWithWarriors() {

        for (Elf elfElement : elvesArray) {
            elfElement.sayGreetings();
            elfElement.getProtect();

            System.out.println();
        }

        for (Gnome gnomeElement : gnomesArray) {

            gnomeElement.sayGreetings();
            gnomeElement.getProtect();

            System.out.println();
        }
    }


    private void setElves(Elf... elves) {
        for (int i = 0; i < elves.length; i++) {
            elvesArray[i] = elves[i];
        }

    }

    private void setGnomes(Gnome... gnomes) {
        for (int i = 0; i < gnomes.length; i++) {
            gnomesArray[i] = gnomes[i];
        }
    }

}