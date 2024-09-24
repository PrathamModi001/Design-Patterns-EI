package StructuralDP.GameCharacter;

// Abstract class representing a Game Character
abstract class Character {
    protected Ability ability; // Bridge to the Ability implementation

    protected Character(Ability ability) {
        this.ability = ability; // Associate an Ability with the Character
    }

    public abstract void performAbility(); // Abstract method to perform ability
}