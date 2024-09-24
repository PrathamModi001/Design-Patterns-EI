package StructuralDP.GameCharacter;

class GameCharacterExample {
    public static void main(String[] args) {
        Character warriorWithFireball = new Warrior(new Fireball()); // Warrior with Fireball ability
        warriorWithFireball.performAbility(); // Warrior performs Fireball ability

        Character mageWithHealing = new Mage(new Healing()); // Mage with Healing ability
        mageWithHealing.performAbility(); // Mage performs Healing ability
    }
}