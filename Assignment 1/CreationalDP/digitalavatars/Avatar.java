package CreationalDP.digitalavatars; // Interface for Prototypes

public interface Avatar extends Cloneable {
    Avatar clone() throws CloneNotSupportedException; // Method for cloning avatars
}
