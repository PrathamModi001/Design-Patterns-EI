package BehaviouralDP.CropRotation;

public class CropRotationContext {
    private CropRotationStrategy strategy; // Reference to a crop rotation strategy

    public CropRotationContext(CropRotationStrategy strategy) {
        this.strategy = strategy; // Set the initial strategy
    }

    public void setStrategy(CropRotationStrategy strategy) {
        this.strategy = strategy; // Change strategy at runtime
    }

    public void performCropRotation() {
        strategy.rotateCrops(); // Execute the rotation strategy
    }
}
