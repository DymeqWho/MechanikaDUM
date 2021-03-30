package menu;

import character.Character;
import character.Heroes;

import java.util.Scanner;

public class Menu {
    private Heroes heroes = new Heroes();

    public void showMenu() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Co chcesz zrobić? Wybierz numer z listy: ");
        System.out.println();
        System.out.println("1. Stwórz postać!");
        System.out.println("2. Zobacz wszystkie stworzone postacie.");
        System.out.println("3. Edytuj bohatera.");
        System.out.println("0. Zakończ program.");
        System.out.println();
        System.out.print("Twój wybór: ");

        int choice = scanner.nextInt();
        if (choice == 1) {
            createNewHero();
        } else if (choice == 2) {
            showAllHeroes();
            showMenu();
        } else if (choice == 3) {
            editHero();
            showMenu();
        } else if (choice == 0) {
            System.exit(0);
        } else showMenu();

    }

    private void createNewHero() {
        heroes.createHero();
        System.out.println("Stworzyłeś: ");
        System.out.println((heroes.getCharacterList().get(heroes.getCharacterList().size() - 1).toString()));
        showMenu();
    }

    private void showAllHeroes() {
        Scanner scanner = new Scanner(System.in);

        if (heroes.getCharacterList().isEmpty()) {
            System.out.println("Lista jest pusta! Stwórz najpierw bohatera!");
            System.out.println("1. Stwórz bohatera.");
            System.out.println("2. Wróc do Menu.");
            System.out.print("Twój wybór: ");
            int choice = scanner.nextInt();
            if (choice == 1) {
                createNewHero();
            } else {
                System.out.println();
                showMenu();
            }
        } else {
            heroes.printCharacterList(heroes.getCharacterList());
            System.out.println();
        }
    }

    private void editHero() {

        if (!heroes.getCharacterList().isEmpty()) {
            Scanner scanner = new Scanner(System.in);
            showAllHeroes();
            System.out.print("Którego bohatera chcesz edytować? ");
            System.out.println();

            int listRealSize = heroes.getCharacterList().size();
            int choice;

            do {
                choice = scanner.nextInt();
                if (choice <= 0 || choice > listRealSize)
                    System.out.print("Nie ma takiego bohatera! Wybierz innego: ");
                else break;
            } while (true);

            Character character = heroes.getCharacterList().get(choice - 1);
            System.out.println("wybrałeś: " + character.toString());
            editHeroAbilitiesList(character);

        } else
            showAllHeroes();
    }

    private void editHeroAbilitiesList(Character character) {
        Scanner scanner = new Scanner(System.in);

        String name = character.getName();
        int intellect = character.getIntellect();
        int intuition = character.getIntuition();
        int reflexes = character.getReflexes();
        int durability = character.getDurability();
        int coordination = character.getCoordination();
        int strength = character.getStrength();
        int vitality = character.getVitality();
        int attack = character.getAttack();
        int defence = character.getDefence();

        String nameS = "1. Imię";
        String intellectS = "2. Intelekt";
        String intuitionS = "3. Intuicja";
        String reflexesS = "4. Odruchy";
        String durabilityS = "5. Wytrzymałość";
        String coordinationS = "6. Koordynacja";
        String strengthS = "7. Siła";
        String vitalityS = "8. Żywotność";
        String attackS = "9. Atak";
        String defenceS = "10. Obrona";

        System.out.println("Co chcesz edytować? ");
        System.out.println(nameS + ": " + name);
        System.out.println(intellectS + ": " + intellect);
        System.out.println(intuitionS + ": " + intuition);
        System.out.println(reflexesS + ": " + reflexes);
        System.out.println(durabilityS + ": " + durability);
        System.out.println(coordinationS + ": " + coordination);
        System.out.println(strengthS + ": " + strength);
        System.out.println(vitalityS + ": " + vitality);
        System.out.println(attackS + ": " + attack);
        System.out.println(defenceS + ": " + defence);
        System.out.print("Wybierz numer z listy: ");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                character.setName(editHeroName(name));
                break;
            case 2:
                character.setIntellect(
                        editingHeroAbilities(intellectS, intellect));
                break;
            case 3:
                character.setIntuition(
                        editingHeroAbilities(intuitionS, intuition));
                break;
            case 4:
                character.setReflexes(
                        editingHeroAbilities(reflexesS, reflexes));
                break;
            case 5:
                character.setDurability(
                        editingHeroAbilities(durabilityS, durability));
                break;
            case 6:
                character.setCoordination(
                        editingHeroAbilities(coordinationS, coordination));
                break;
            case 7:
                character.setStrength(
                        editingHeroAbilities(strengthS, strength));
                break;
            case 8:
                character.setVitality(
                        editingHeroAbilities(vitalityS, vitality));
                break;
            case 9:
                character.setAttack(
                        editingHeroAbilities(attackS, attack));
                break;
            case 10:
                character.setDefence(
                        editingHeroAbilities(defenceS, defence));
                break;
            default:
                System.out.println("Nie ma takiej opcji!");

        }

    }

    private String editHeroName(String nameOld) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Zmieniasz imię: " + nameOld + ". Wpisz nowe imię: ");
        String name = scanner.nextLine();
        System.out.printf("Zmieniłeś Imię %s na %s", nameOld, name);
        System.out.println();
        System.out.println();
        return name;
    }

    private int editingHeroAbilities(String abilityS, int ability) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(abilityS + ", wpisz nową wartość: ");
        int setAbility = scanner.nextInt();
        System.out.printf(abilityS + " zmieniłeś na: %d z %d", setAbility, ability);
        System.out.println();
        System.out.println();
        return setAbility;
    }
}

