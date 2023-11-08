class Triangle extends Shape {
    public Triangle (double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double area() {
        return (1 * a * b )/ 2;
    }
}