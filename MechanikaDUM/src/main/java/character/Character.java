package character;

public class Character {

    private String name;

    // characteristic
    private int intellect;
    private int intuition;
    private int reflexes;

    // feature
    private int durability;
    private int coordination;

    // factor
    private int strength;
    private int vitality;

    // abilities
    private int attack;
    private int defence;

    public Character(String name, int intellect, int intuition, int reflexes, int durability, int coordination, int strength, int vitality, int attack, int defence) {
        this.name = name;
        this.intellect = intellect;
        this.intuition = intuition;
        this.reflexes = reflexes;
        this.durability = durability;
        this.coordination = coordination;
        this.strength = strength;
        this.vitality = vitality;
        this.attack = attack;
        this.defence = defence;
    }

    public Character() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIntellect() {
        return intellect;
    }

    public void setIntellect(int intellect) {
        this.intellect = intellect;
    }

    public int getIntuition() {
        return intuition;
    }

    public void setIntuition(int intuition) {
        this.intuition = intuition;
    }

    public int getReflexes() {
        return reflexes;
    }

    public void setReflexes(int reflexes) {
        this.reflexes = reflexes;
    }

    public int getDurability() {
        return durability;
    }

    public void setDurability(int durability) {
        this.durability = durability;
    }

    public int getCoordination() {
        return coordination;
    }

    public void setCoordination(int coordination) {
        this.coordination = coordination;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getVitality() {
        return vitality;
    }

    public void setVitality(int vitality) {
        this.vitality = vitality;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefence() {
        return defence;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }

    @Override
    public String toString() {
        return "" + name + ": " +
                " Intellekt: " + intellect +
                ", Intuitcja: " + intuition +
                ", Odruchy: " + reflexes +
                ", Wytrzymałość: " + durability +
                ", Koordynacja: " + coordination +
                ", Siła: " + strength +
                ", Żywotność: " + vitality +
                ", Atak: " + attack +
                ", Obrona: " + defence +
                '}';
    }
}
