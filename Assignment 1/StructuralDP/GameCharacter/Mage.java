package StructuralDP.GameCharacter;

class Mage extends Character {
    public Mage(Ability ability) {
        super(ability); // Initialize the character with a specific ability
    }

    public void performAbility() {
        System.out.print("Mage uses ability: ");
        ability.execute(); // Delegate ability execution to the Ability object
    }
}