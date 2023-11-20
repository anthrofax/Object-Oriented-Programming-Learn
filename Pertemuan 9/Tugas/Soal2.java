import java.util.Scanner;

public class Soal2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta pengguna untuk memasukkan nilai n
        System.out.print("Masukkan nilai n (lebih kecil atau sama dengan 10): ");
        int n = scanner.nextInt();

        // Memeriksa apakah nilai n sesuai dengan batasan
        if (n <= 0 || n > 10) {
            System.out.println("Nilai n tidak valid. Harap masukkan nilai n antara 1 dan 10.");
        } else {
            // Menampilkan tabel perkalian n x n
            System.out.println("Tabel Perkalian " + n + " x " + n + ":");
            for (int i = 0; i <= n; i++) {
                if (i == 0)
                    System.out.print("n  ");
                else
                    System.out.printf("%4d", i); // Format agar angka rata kanan
            }

            System.out.println();

            for (int i = 0; i <= n; i++) {
                if (i == 0)
                    System.out.print("  ");
                else
                    System.out.printf("%4c", '-'); // Format agar angka rata kanan
            }

            System.out.println();

            for (int i = 1; i <= n; i++) {
                System.out.print(i + "| ");
                for (int j = 1; j <= n; j++) {
                    System.out.printf("%4d", i * j); // Format agar angka rata kanan
                }
                System.out.println(); // Pindah ke baris berikutnya setelah satu baris selesai
            }
        }
    }
}
