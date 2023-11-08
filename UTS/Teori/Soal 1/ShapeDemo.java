class ShapeDemo {
    static public void main(String[] args) {
        Triangle segitiga = new Triangle(10, 5);
        Rectangle persegiPanjang = new Rectangle(10, 5);
        Circle lingkaran = new Circle(5);

        System.out.println("Luas Segitiga: " + segitiga.area());
        System.out.println("Luas Persegi Panjang: " + persegiPanjang.area());
        System.out.println("Luas Lingkaran: " + lingkaran.area());
    }
}