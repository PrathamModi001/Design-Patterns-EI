package CreationalDP.digitalavatars; // Concrete Prototype implementation

public class DigitalAvatar implements Avatar {
    private String name; // Avatar name
    private String appearance; // Visual attributes
    private String personality; // Character traits
    private String skill; // Unique abilities

    public DigitalAvatar(String name, String appearance, String personality, String skill) {
        this.name = name;
        this.appearance = appearance;
        this.personality = personality;
        this.skill = skill; // Constructor for initializing attributes
    }

    @Override
    public DigitalAvatar clone() throws CloneNotSupportedException {
        return (DigitalAvatar) super.clone(); // Cloning method
    }

    public void setAppearance(String appearance) {
        this.appearance = appearance; // Modify appearance
    }

    public void setPersonality(String personality) {
        this.personality = personality; // Modify personality
    }

    public void setSkill(String skill) {
        this.skill = skill; // Modify skill
    }

    public void showDetails() {
        // Display avatar details
        System.out.println("Avatar: " + name);
        System.out.println("Appearance: " + appearance);
        System.out.println("Personality: " + personality);
        System.out.println("Skill: " + skill);
        System.out.println();
    }
}
