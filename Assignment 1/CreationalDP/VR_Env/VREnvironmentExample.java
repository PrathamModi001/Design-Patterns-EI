package CreationalDP.VR_Env;

public class VREnvironmentExample {
    public static void main(String[] args) {
        // Generate desert world
        VRWorldGenerator desertWorld = new VRWorldGenerator(new DesertEnvironmentFactory());
        desertWorld.generateWorld();

        // Generate ocean world
        VRWorldGenerator oceanWorld = new VRWorldGenerator(new OceanEnvironmentFactory());
        oceanWorld.generateWorld();
    }
}
