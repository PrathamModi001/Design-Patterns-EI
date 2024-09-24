package CreationalDP.digitalavatars; // Factory for creating avatars

import java.util.HashMap;
import java.util.Map;

public class AvatarFactory {
    private Map<String, DigitalAvatar> avatarMap = new HashMap<>(); // Storage for prototype avatars

    public AvatarFactory() {
        // Initialize prototype avatars
        avatarMap.put("Warrior", new DigitalAvatar("Warrior", "Tall and Strong", "Brave", "Swordsmanship"));
        avatarMap.put("Mage", new DigitalAvatar("Mage", "Wise and Mysterious", "Intelligent", "Magic"));
        avatarMap.put("Rogue", new DigitalAvatar("Rogue", "Quick and Agile", "Cunning", "Stealth"));
    }

    public DigitalAvatar createAvatar(String type) throws CloneNotSupportedException {
        // Clone the specified avatar type
        if (!avatarMap.containsKey(type)) {
            throw new IllegalArgumentException("Invalid avatar type"); // Validate type
        }
        return avatarMap.get(type).clone(); // Return cloned avatar
    }
}
