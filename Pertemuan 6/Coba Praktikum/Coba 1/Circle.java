public class Circle {
    double x, y, r;

    public Circle(double x, double y, double r) {
        this.x = x;
        this.y = y;
        this.r = r;
    }

    public Circle(double x, double y) {
        this.x = x;
        this.y = y;
        r = 1;
    }

    public double keliling() {
        return 2 * 3.14 * r;
    }

    public double luas() {
        return 3.14 * r * r;
    }
}