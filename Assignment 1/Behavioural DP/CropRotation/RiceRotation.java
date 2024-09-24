package croprotation; // Concrete strategy for rice rotation

class RiceRotation implements CropRotationStrategy {
    @Override
    public void rotateCrops() {
        System.out.println("Rotating crops: Rice -> Barley -> Legumes");
    }
}
