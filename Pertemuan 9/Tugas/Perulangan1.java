public class Perulangan1 {

    public static void main(String[] args) {
        // a. Menghitung Deret bilangan prima dan bukan dari 0 – 20
        boolean bukanPrima = false;
        System.out.println("a. Deret bilangan prima dan bukan dari 0 – 20:");
        for (int i = 0; i <= 20; i++) {
            if (i == 0 || i == 1) {
                System.out.println(i + " bukan bilangan prima");
            } else {
                for (int j = 2; j <= i; j++) {
                    if (j != i) {
                        if (i % j == 0) {
                            bukanPrima = true;
                            break;
                        } else
                            bukanPrima = false;
                    }
                }
                if (bukanPrima) {
                    System.out.println(i + " bukan bilangan prima");
                } else
                    System.out.println(i + " adalah bilangan prima");
            }
        }

        // b. Menghitung Deret bilangan ganjil dan genap dari 0 – 20
        System.out.println("\nb. Deret bilangan ganjil dan genap dari 0 – 20:");
        for (int i = 0; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " adalah bilangan genap");
            } else {
                System.out.println(i + " adalah bilangan ganjil");
            }
        }

        // c. Huruf Z – A
        System.out.println("\nc. Huruf Z – A:");
        char ch = 'Z';
        while (ch >= 'A') {
            System.out.print(ch + " ");
            ch--;
        }

        // d. Lagu “Anak Ayam Turun N”
        System.out.println("\n\nd. Lagu “Anak Ayam Turun N”:");
        int n = 10; // Ganti dengan jumlah anak ayam yang diinginkan
        for (int i = n; i >= 1; i--) {
            System.out.println("Anak ayam turun " + i);
        }
    }
}
