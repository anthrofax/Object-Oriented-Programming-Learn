public abstract class Pengguna {
    public String tipePengguna;
    public int adminID;

    public void melihatBuku(Buku[] rakBuku, String buku) {
        for (int i = 0; i < rakBuku.length; i++) {
            if (rakBuku[i].judulBuku.toLowerCase().contains(buku.toLowerCase())) {
                System.out.println("Buku ditemukan " );
                System.out.println("Judul buku: " + rakBuku[i].judulBuku);
                System.out.println("Tahun terbit: " + rakBuku[i].tahunTerbit);
                System.out.println("Penulis: " + rakBuku[i].penulis);
                System.out.println("Halaman buku: " + rakBuku[i].halamanBuku);
                return;
            }
        }

        System.out.println("Buku yang dicari tidak ditemukan.");
        return;
    }

    public void melihatDaftarBuku(Buku[] rakBuku) {
        for (int i = 0; i < rakBuku.length; i++) {
            System.out.println((i + 1 )+ ". " + rakBuku[i].judulBuku);
        }
    }

    abstract void menambahkanBuku(Buku[] rakBuku, Buku bukuBaru);
    abstract void menghapusBuku(String[] rakBuku, String buku);
}