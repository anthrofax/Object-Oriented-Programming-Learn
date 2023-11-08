class Rectangle extends Shape {
    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double area() {
        return a * b;
    }
}