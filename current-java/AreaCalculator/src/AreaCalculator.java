public class AreaCalculator {

    public static double area(double radius) {
        if (radius < 0) {
            return -1.0;
        }

        return Math.PI * radius * radius;
    }//end of the area Method with one parameter
    /**
     * area Method - calculates the area of rectangle
     * @param x - a double representing one side of the rectangle
     * @param y - a double representing another side of the rectangle
     * @return double - returns a double as the area of a rectangle
     */
    public static double area(double x, double y) {
        if ((x < 0) || (y < 0)) {
            return -1.0;
        }

        return x * y;
    }
}
