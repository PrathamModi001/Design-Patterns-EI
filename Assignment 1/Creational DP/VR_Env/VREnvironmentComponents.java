package VR_Env;


// Abstract products for VR environment
interface Terrain {
    void generate(); // Method for terrain generation
}

interface Atmosphere {
    void apply(); // Method to apply atmosphere effects
}

interface Inhabitants {
    void populate(); // Method to populate environment
}

// Concrete product implementations for desert
class DesertTerrain implements Terrain {
    @Override
    public void generate() {
        System.out.println("Generating sandy desert terrain");
    }
}

class AridAtmosphere implements Atmosphere {
    @Override
    public void apply() {
        System.out.println("Applying hot, dry atmosphere");
    }
}

class DesertCreatures implements Inhabitants {
    @Override
    public void populate() {
        System.out.println("Populating with desert creatures");
    }
}

// Concrete product implementations for ocean
class OceanTerrain implements Terrain {
    @Override
    public void generate() {
        System.out.println("Generating deep ocean terrain");
    }
}

class UnderwaterAtmosphere implements Atmosphere {
    @Override
    public void apply() {
        System.out.println("Applying underwater atmosphere effects");
    }
}

class MarineLife implements Inhabitants {
    @Override
    public void populate() {
        System.out.println("Populating with diverse marine life");
    }
}
