import java.util.Scanner;

class SistemUtama {
    static public void main(String[] args) {
        Scanner masukkan = new Scanner(System.in);
        boolean ulangProgram = true;
        Pengguna pengguna;
        Buku[] daftarBuku = { new Buku("Filosofi Teras", 2004, "Henry Manampiring", 204) };

        System.out.println("Login sebagai ");
        System.out.println("1. User");
        System.out.println("2. Admin");
        System.out.print("Pilih: ");
        int loginSebagai = masukkan.nextInt();

        bersihkanTerminal();

        if (loginSebagai == 1) {
            pengguna = new User("Pengguna");
        } else if (loginSebagai == 2) {
            pengguna = new Admin("Admin", 2210);
        } else {
            pengguna = new User("Pengguna");
            System.out.print("Input yang anda masukkan salah.");
        }

        do {
            tampilMenu();
            int pilMenu = masukkan.nextInt();

            switch (pilMenu) {
                case 1:
                    bersihkanTerminal();
                    System.out.println("Daftar buku yang tersedia");
                    pengguna.melihatDaftarBuku(daftarBuku);

                    masukkan.nextLine();
                    masukkan.nextLine();
                    break;
                case 2:
                    bersihkanTerminal();
                    System.out.print("Inputkan judul buku yang ingin anda cari: ");
                    masukkan.nextLine();
                    String bukuDicari = masukkan.nextLine();

                    pengguna.melihatBuku(daftarBuku, bukuDicari);
                    masukkan.nextLine();

                    break;
                case 3:
                    bersihkanTerminal();
                    System.out.println("Masukkan data yang diperlukan");
                    System.out.print("Judul buku: ");
                    masukkan.nextLine();
                    String judulBuku = masukkan.nextLine();
                    System.out.print("Tahun terbit: ");
                    int tahunTerbit = masukkan.nextInt();
                    System.out.print("Penulis: ");
                    String penulis = masukkan.nextLine();
                    System.out.print("Halaman buku: ");
                    int halamanBuku = masukkan.nextInt();

                    pengguna.menambahkanBuku(daftarBuku, new Buku(judulBuku, tahunTerbit, penulis, halamanBuku));

                    System.out.println("Buku berhasil ditambahkan.");

                    masukkan.nextLine();
                    break;
                case 5:
                    bersihkanTerminal();
                    ulangProgram = false;

                    break;
                default:
                    break;
            }
        } while (ulangProgram == true);

    }

     static protected void bersihkanTerminal() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    static protected void tampilMenu() {
        bersihkanTerminal();
        System.out.println("Menu program");
        System.out.println("1. Melihat daftar buku");
        System.out.println("2. Mencari buku");
        System.out.println("3. Menambahkan buku");
        System.out.println("4. Menghapus buku.");
        System.out.println("5. Keluar");
        System.out.print("Masukkan pilihan: ");
    }
}