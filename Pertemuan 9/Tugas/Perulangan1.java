public class Perulangan1 {

    public static void main(String[] args) {
        // a. Menghitung Deret bilangan prima dan bukan dari 0 – 20
        boolean bukanPrima = false;
        System.out.println("a. Deret bilangan prima dan bukan dari 0 – 20:");
        int i = 0;
        do {
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
            i++;
        } while (i <= 20);

        // b. Menghitung Deret bilangan ganjil dan genap dari 0 – 20
        System.out.println("\nb. Deret bilangan ganjil dan genap dari 0 – 20:");
        int angka[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };

        for (int num : angka) {
            if (num % 2 == 0) {
                System.out.println(num + " adalah bjlangan genap");
            } else {
                System.out.println(num + " adalah bilangan ganjil");
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

        int n = 5;
        for (int k = n; k > 0; k--) {
            System.out.println("TEK KOTEK..KOTEK KOTEK");
            System.out.println("ANAK AYAM TURUN BERKOTEK");
            System.out.println("TEK KOTEK..KOTEK KOTEK");
            System.out.println("ANAK AYAM TURUN BERKOTEK\n");

            System.out.println("ANAK AYAM TURUNLAH " + k);

            if (k > 2) {
                System.out.println("MATI SATU TINGGALAH " + (k - 1) + ",");
                System.out.println("ANAK AYAM TURUNLAH " + (k - 1));
                System.out.println("MATI SATU TINGGALAH " + (k - 2));
            } else if (k == 2) {
                System.out.println("MATI SATU TINGGALAH " + (k - 1) + ",");
                System.out.println("ANAK AYAM TURUNLAH " + (k - 1));
                System.out.println("MATI SATU TINGGAL INDUKNYA");
                break;
            }

            System.out.println();
        }
    }
}
