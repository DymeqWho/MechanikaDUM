package menu;

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
//            showMenu();
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

        } else
            showAllHeroes();
    }
}

