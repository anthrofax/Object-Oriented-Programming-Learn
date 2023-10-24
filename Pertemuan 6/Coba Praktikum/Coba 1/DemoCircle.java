public class DemoCircle {
    public static void main(String[] args) {
        Circle cr = new Circle(2, 3, 5);
        Circle cr1 = new Circle(2, 3);

        System.out.println("Lingkaran Konstruktor 3 Parameter");
        System.out.println("Keliling Lingkaran : " + cr.keliling());
        System.out.println("Luas Lingkaran     : " + cr.luas());

        System.out.println("Lingkaran Konstruktor 2 Parameter");
        System.out.println("Keliling Lingkaran : " + cr1.keliling());
        System.out.println("Luas Lingkaran     : " + cr1.luas());
    }
}