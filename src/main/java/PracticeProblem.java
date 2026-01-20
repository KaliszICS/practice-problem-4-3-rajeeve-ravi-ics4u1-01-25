/**
 * The type Practice problem.
 */
public class PracticeProblem {

    /**
     * Main.
     *
     * @param args the args
     */
    public static void main(String args[]) {
        // Main method for testing
    }

}

/**
 * The type Rectangle.
 */
class Rectangle {
    private double length;
    private double width;

    /**
     * Instantiates a new Rectangle.
     */
// No-arg constructor: sets length to 4 and width to 8
    public Rectangle() {
        this.length = 4.0;
        this.width = 8.0;
    }

    /**
     * Instantiates a new Rectangle.
     *
     * @param length the length
     */
// Single-arg constructor: sets length to provided value and width to 8
    public Rectangle(double length) {
        this.length = length;
        this.width = 8.0;
    }

    /**
     * Instantiates a new Rectangle.
     *
     * @param length the length
     * @param width  the width
     */
// Two-arg constructor: sets both length and width
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    /**
     * Gets length.
     *
     * @return the length
     */
    public double getLength() {
        return length;
    }

    /**
     * Gets width.
     *
     * @return the width
     */
    public double getWidth() {
        return width;
    }
}

/**
 * The type Chair.
 */
class Chair {
    private int legs;
    private String material;

    /**
     * Instantiates a new Chair.
     */
// No-arg constructor: sets legs to 4 and material to "wood"
    public Chair() {
        this.legs = 4;
        this.material = "wood";
    }

    /**
     * Instantiates a new Chair.
     *
     * @param legs the legs
     */
// Single-arg constructor: sets legs to provided value and material to "wood"
    public Chair(int legs) {
        this.legs = legs;
        this.material = "wood";
    }

    /**
     * Instantiates a new Chair.
     *
     * @param legs     the legs
     * @param material the material
     */
// Two-arg constructor: sets both legs and material
    public Chair(int legs, String material) {
        this.legs = legs;
        this.material = material;
    }

    /**
     * Gets legs.
     *
     * @return the legs
     */
    public int getLegs() {
        return legs;
    }

    /**
     * Gets material.
     *
     * @return the material
     */
    public String getMaterial() {
        return material;
    }
}
