import java.util.Scanner;

import javax.swing.plaf.synth.SynthEditorPaneUI;

class SistemUtama {
    static public void main(String[] args) {
        Scanner masukkan = new Scanner(System.in);
        boolean ulangProgram = true;
        Pengguna pengguna;
        Buku[] daftarBuku = new Buku[100];
        daftarBuku[0] = new Buku("Filosofi Teras", 2004, "Henry Manampiring", 204, "Self improvement");

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
                    menuMelihatDaftarBuku(pengguna, daftarBuku);
                    break;
                case 2:
                    bersihkanTerminal();
                    menuMencariBuku(pengguna, daftarBuku);
                    break;
                case 3:
                    bersihkanTerminal();
                    menuMenambahkanBuku(pengguna, daftarBuku);
                    break;
                case 4:
                    bersihkanTerminal();
                    menuMenghapusBuku(pengguna, daftarBuku);
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

    static protected boolean apakahAdmin(Pengguna pengguna) {
        if (pengguna.adminID == 0)
            return false;
        else
            return true;
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

    static protected void menuMelihatDaftarBuku(Pengguna pengguna, Buku[] daftarBuku) {
        int pilMenu;
        Scanner masukkan = new Scanner(System.in);

        System.out.println("Pilih Menu");
        System.out.println("1. Semua buku");
        System.out.println("2. Buku berdasarkan genre");
        System.out.print("Masukkan pilihan: ");
        pilMenu = masukkan.nextInt();

        switch (pilMenu) {
            case 1:
                bersihkanTerminal();
                pengguna.melihatDaftarBuku(daftarBuku, null);
                break;
            case 2:
                bersihkanTerminal();
                String pilGenre;
                System.out.print("Inputkan genre buku yang ingin anda lihat: ");
                masukkan.nextLine();
                pilGenre = masukkan.nextLine();

                pengguna.melihatDaftarBuku(daftarBuku, pilGenre);
                break;
            default:
                break;
        }

        if (pilMenu == 1) masukkan.nextLine();
        masukkan.nextLine();
    }

    static protected void menuMencariBuku(Pengguna pengguna, Buku[] daftarBuku) {
        Scanner masukkan = new Scanner(System.in);
        System.out.print("Inputkan judul buku yang ingin anda cari: ");
        String bukuDicari = masukkan.nextLine();

        pengguna.melihatBuku(daftarBuku, bukuDicari);
        masukkan.nextLine();
    }

    static protected void menuMenambahkanBuku(Pengguna pengguna, Buku[] daftarBuku) {
        Scanner masukkan = new Scanner(System.in);

        if (apakahAdmin(pengguna)) {
            System.out.println("Masukkan data yang diperlukan");
            System.out.print("Judul buku: ");
            String judulBuku = masukkan.nextLine();
            System.out.print("Tahun terbit: ");
            int tahunTerbit = masukkan.nextInt();
            System.out.print("Penulis: ");
            masukkan.nextLine();
            String penulis = masukkan.nextLine();
            System.out.print("Halaman buku: ");
            int halamanBuku = masukkan.nextInt();
            System.out.print("Genre Buku: ");
            masukkan.nextLine();
            String genreBuku = masukkan.nextLine();

            pengguna.menambahkanBuku(daftarBuku,
                    new Buku(judulBuku, tahunTerbit, penulis, halamanBuku, genreBuku));

            System.out.println("Buku berhasil ditambahkan.");
        } else {
            pengguna.menambahkanBuku(null, null);
        }

        masukkan.nextLine();
    }

    static protected void menuMenghapusBuku(Pengguna pengguna, Buku[] daftarBuku) {
        Scanner masukkan = new Scanner(System.in);

        if (apakahAdmin(pengguna)) {
            System.out.print("Inputkan judul buku yang ingin dihapus : ");
            String judulBuku = masukkan.nextLine();

            pengguna.menghapusBuku(daftarBuku, judulBuku);
        } else {
            pengguna.menghapusBuku(null, null);
        }

        masukkan.nextLine();
    }
}