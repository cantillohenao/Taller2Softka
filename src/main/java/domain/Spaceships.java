package domain;

/**
 * Abstract class of the Spaceships
 * @author Juan Camilo Cantillo
 */
public abstract class Spaceships implements ISpaceShips {
    /**
     * Class attributes
     */
    private String type;
    private String name;
    private long speed;
    private float height;
    private float weight;
    private String typeFuel;

    /**
     * constructor initializing with the following parameters
     * @param type the type of the spaceships
     * @param name the name of the spaceships
     * @param speed the speed of the spaceships
     * @param height the speed of the spaceships
     * @param weight weight of the spaceships
     * @param typeFuel typeFuel of the spaceships
     */
    public Spaceships(String type, String name, long speed, float height, float weight, String typeFuel) {
        this.type = type;
        this.name = name;
        this.speed = speed;
        this.height = height;
        this.weight = weight;
        this.typeFuel = typeFuel;
    }

    /**
     * methods setters and getters
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getSpeed() {
        return speed;
    }

    public void setSpeed(long speed) {
        this.speed = speed;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public String getTypeFuel() {
        return typeFuel;
    }

    public void setTypeFuel(String typeFuel) {
        this.typeFuel = typeFuel;
    }

    /**
     * about write the method toString
     * @return return string for each of the variables.
     */
    @Override
    public String toString() {
        return "Spaceships{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", speed=" + speed +
                ", height=" + height +
                ", weight=" + weight +
                ", typeFuel='" + typeFuel + '\'' +
                '}';
    }
}
