class Circle extends Shape {
    public Circle(double a) {
        this.a = a;
    }

    public double area() {
        return (22 * a * a) / 7;
    }
}