public abstract class Pengguna {
    public String tipePengguna;
    public int adminID;

    public void melihatBuku(Buku[] rakBuku, String buku) {
        for (int i = 0; i < rakBuku.length; i++) {
            if (rakBuku[i].judulBuku.toLowerCase().contains(buku.toLowerCase())) {
                System.out.println("Buku ditemukan ");
                System.out.println("Judul buku: " + rakBuku[i].judulBuku);
                System.out.println("Tahun terbit: " + rakBuku[i].tahunTerbit);
                System.out.println("Penulis: " + rakBuku[i].penulis);
                System.out.println("Halaman buku: " + rakBuku[i].halamanBuku);
                System.out.println("Genre buku: " + rakBuku[i].genreBuku);
                return;
            }
        }

        System.out.println("Buku yang dicari tidak ditemukan.");
        return;
    }

    public void melihatDaftarBuku(Buku[] rakBuku, String genreDitampilkan) {
        if (rakBuku[0] == null) {
            System.out.println("Daftar buku kosong.");
            return;
        }

        if (genreDitampilkan == null) {
            System.out.println("Daftar buku yang tersedia");
            for (int i = 0; i < rakBuku.length; i++) {
                System.out.println((i + 1) + ". " + rakBuku[i].judulBuku);

                if (rakBuku[i + 1] == null)
                    return;
            }
        } else {
            System.out.println("Daftar buku dengan genre '" + genreDitampilkan + "':");

            // Buat variabel untuk melacak apakah ada buku yang sesuai dengan genre
            boolean adaBuku = false;

            // Iterasi melalui rakBuku dan tampilkan buku dengan genre yang sesuai
            for (Buku buku : rakBuku) {
                if (buku != null && buku.genreBuku.toLowerCase().equals(genreDitampilkan.toLowerCase())) {
                    System.out.println("Judul: " + buku.judulBuku);
                    System.out.println("Penulis: " + buku.penulis);
                    System.out.println("Genre: " + buku.genreBuku);
                    System.out.println("Tahun Terbit: " + buku.tahunTerbit);
                    System.out.println("Halaman Buku: " + buku.halamanBuku);
                    System.out.println("---------------");
                    adaBuku = true; // Setel adaBuku menjadi true jika ada buku yang sesuai dengan genre
                }
            }

            // Tampilkan pesan jika tidak ada buku yang sesuai dengan genre
            if (!adaBuku) {
                System.out.println("Tidak ada buku dengan genre '" + genreDitampilkan + "'.");
            }
        }

    }

    abstract void menambahkanBuku(Buku[] rakBuku, Buku bukuBaru);

    abstract void menghapusBuku(Buku[] rakBuku, String bukuYangDihapus);
}