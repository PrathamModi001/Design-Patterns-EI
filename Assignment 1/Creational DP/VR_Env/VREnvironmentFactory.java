package VR_Env;


// Factory interface for creating environment components
interface VREnvironmentFactory {
    Terrain createTerrain(); // Factory method for terrain
    Atmosphere createAtmosphere(); // Factory method for atmosphere
    Inhabitants createInhabitants(); // Factory method for inhabitants
}

// Factory for creating desert environment
class DesertEnvironmentFactory implements VREnvironmentFactory {
    @Override
    public Terrain createTerrain() {
        return new DesertTerrain(); // Create desert terrain
    }

    @Override
    public Atmosphere createAtmosphere() {
        return new AridAtmosphere(); // Create arid atmosphere
    }

    @Override
    public Inhabitants createInhabitants() {
        return new DesertCreatures(); // Create desert inhabitants
    }
}

// Factory for creating ocean environment
class OceanEnvironmentFactory implements VREnvironmentFactory {
    @Override
    public Terrain createTerrain() {
        return new OceanTerrain(); // Create ocean terrain
    }

    @Override
    public Atmosphere createAtmosphere() {
        return new UnderwaterAtmosphere(); // Create underwater atmosphere
    }

    @Override
    public Inhabitants createInhabitants() {
        return new MarineLife(); // Create ocean inhabitants
    }
}
