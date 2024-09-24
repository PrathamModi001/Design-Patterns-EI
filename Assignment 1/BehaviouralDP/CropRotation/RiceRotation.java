package BehaviouralDP.CropRotation;

class RiceRotation implements CropRotationStrategy {
    @Override
    public void rotateCrops() {
        System.out.println("Rotating crops: Rice -> Barley -> Legumes");
    }
}
