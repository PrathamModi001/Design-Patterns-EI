package StructuralDP.GameCharacter;

class Warrior extends Character {
    public Warrior(Ability ability) {
        super(ability); // Initialize the character with a specific ability
    }

    public void performAbility() {
        System.out.print("Warrior uses ability: ");
        ability.execute(); // Delegate ability execution to the Ability object
    }
}