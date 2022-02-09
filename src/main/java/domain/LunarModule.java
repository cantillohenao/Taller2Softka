package domain;

public class LunarModule extends MannedShips{
    /**
     * constructor initializing with the following parameters
     *
     * @param type     the type of the spaceships
     * @param name     the name of the spaceships
     * @param speed    the speed of the spaceships
     * @param height   the speed of the spaceships
     * @param weight   weight of the spaceships
     * @param typeFuel typeFuel of the spaceships
     */
    public LunarModule(String type, String name, long speed, float height, float weight, String typeFuel) {
        super(type, name, speed, height, weight, typeFuel);
    }
}
