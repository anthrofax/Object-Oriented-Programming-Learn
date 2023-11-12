public class Admin extends Pengguna {
    public String tipePengguna = "Admin";

    public Admin(String tipePengguna, int adminID) { // Overloading Polymorphism
        this.tipePengguna = tipePengguna;
        this.adminID = adminID;
    }

    void menambahkanBuku(Buku[] rakBuku, Buku bukuBaru) {
        // Cari indeks pertama yang memiliki nilai null pada array rakBuku
        int indeksKosong = -1;

        for (int i = 0; i < rakBuku.length; i++) {
            if (rakBuku[i] == null) {
                indeksKosong = i;
                break;
            }
        }

        // Jika ada indeks yang kosong, tambahkan buku baru
        if (indeksKosong != -1) {
            rakBuku[indeksKosong] = bukuBaru;
            System.out.println("Buku '" + bukuBaru.judulBuku + "' telah ditambahkan ke rak buku.");
        } else {
            // Jika tidak ada indeks kosong, keluarkan pesan kesalahan (rak penuh)
            System.out.println("Rak buku penuh. Tidak dapat menambahkan buku baru.");
        }
    }

    void menghapusBuku(Buku[] rakBuku, String bukuYangDihapus) {
        // Inisialisasi indeks buku yang akan dihapus dengan -1 (tidak ditemukan)
        int indeksDihapus = -1;

        // Mencari indeks buku yang akan dihapus
        for (int i = 0; i < rakBuku.length; i++) {
            // Periksa apakah elemen array tidak null sebelum mengakses properti judul
            if (rakBuku[i] != null && rakBuku[i].judulBuku.toLowerCase().equals(bukuYangDihapus.toLowerCase())) {
                indeksDihapus = i;
                break; // Keluar dari loop saat buku ditemukan
            }
        }

        // Jika buku yang akan dihapus ditemukan
        if (indeksDihapus != -1) {
            // Menggeser elemen-elemen setelah indeksDihapus ke kiri
            for (int i = indeksDihapus; i < rakBuku.length - 1; i++) rakBuku[i] = rakBuku[i + 1];

            // Mengurangi panjang array rakBuku
            rakBuku[rakBuku.length - 1] = null;

            // Output pesan bahwa buku telah dihapus
            System.out.println("Buku '" + bukuYangDihapus + "' telah dihapus dari rak buku.");
        } else {
            // Output pesan jika buku tidak ditemukan
            System.out.println("Buku '" + bukuYangDihapus + "' tidak ditemukan di rak buku.");
        }
    }

}