package digitalavatars; // Main application class

import digitalavatars.DigitalAvatar; // Import required classes
import digitalavatars.AvatarFactory;

public class DigitalCloneFactoryApp {
    public static void main(String[] args) {
        AvatarFactory factory = new AvatarFactory(); // Create avatar factory

        try {
            // Cloning and customizing avatars for different users
            DigitalAvatar user1Avatar = factory.createAvatar("Warrior");
            user1Avatar.setAppearance("Armored and Fearless");
            user1Avatar.showDetails(); // Show user 1 avatar details

            DigitalAvatar user2Avatar = factory.createAvatar("Mage");
            user2Avatar.setPersonality("Playful and Mischievous");
            user2Avatar.setSkill("Summoning");
            user2Avatar.showDetails(); // Show user 2 avatar details

            DigitalAvatar user3Avatar = factory.createAvatar("Rogue");
            user3Avatar.setAppearance("Masked and Swift");
            user3Avatar.showDetails(); // Show user 3 avatar details

        } catch (CloneNotSupportedException e) {
            System.out.println("Error while cloning avatar: " + e.getMessage()); // Handle cloning error
        }
    }
}
