package CreationalDP.VR_Env;

public class VRWorldGenerator {
    private VREnvironmentFactory factory; // Environment factory reference

    public VRWorldGenerator(VREnvironmentFactory factory) {
        this.factory = factory; // Set factory during initialization
    }

    public void generateWorld() {
        Terrain terrain = factory.createTerrain(); // Create terrain
        Atmosphere atmosphere = factory.createAtmosphere(); // Create atmosphere
        Inhabitants inhabitants = factory.createInhabitants(); // Create inhabitants

        terrain.generate(); // Generate terrain
        atmosphere.apply(); // Apply atmosphere
        inhabitants.populate(); // Populate environment
    }
}
