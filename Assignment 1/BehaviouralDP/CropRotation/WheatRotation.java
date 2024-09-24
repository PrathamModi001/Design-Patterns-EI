package BehaviouralDP.CropRotation;

class WheatRotation implements CropRotationStrategy {
    @Override
    public void rotateCrops() {
        System.out.println("Rotating crops: Wheat -> Soybean -> Corn");
    }
}
