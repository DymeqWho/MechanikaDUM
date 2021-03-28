package character;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Heroes {
    private List<Character> characterList = new ArrayList<>();

    public List<Character> getCharacterList() throws NullPointerException{
        return characterList;
    }


    public void createHero() {
        Scanner scanner = new Scanner(System.in);
        Character character = new Character();

        System.out.print("Podaj imię: ");
        character.setName(scanner.nextLine());

        // characteristic
        System.out.print("Zadeklaruj Intelekt: ");
        character.setIntellect(scanner.nextInt());
        System.out.print("zadeklaruj Intuicję: ");
        character.setIntuition(scanner.nextInt());
        System.out.print("zadeklaruj Odruchy: ");
        character.setReflexes(scanner.nextInt());

        // feature
        System.out.print("Zadeklaruj Wytrzymałość: ");
        character.setDurability(scanner.nextInt());
        System.out.print("Zadeklaruj Koordynację: ");
        character.setCoordination(scanner.nextInt());

        // factor
        System.out.print("Zadeklaruj Siłę: ");
        character.setStrength(scanner.nextInt());
        System.out.print("Zadeklaruj żywotność: ");
        character.setVitality(scanner.nextInt());

        // abilities
        System.out.print("Zadeklaruj Atak: ");
        character.setAttack(scanner.nextInt());
        System.out.print("Zadeklaruj Obronę: ");
        character.setDefence(scanner.nextInt());

        characterList.add(character);
    }

    public void printCharacterList(List<Character> list) {
        for(int i = 0; i < list.size(); i++){
            System.out.println(i+1 + ". " + list.get(i));
        }
    }

}
