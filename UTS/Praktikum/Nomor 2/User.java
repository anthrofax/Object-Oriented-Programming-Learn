public class User extends Pengguna {
    public String tipePengguna = "Pengguna";

    public User (String tipePengguna) { //Overloading Polymorphism
        this.tipePengguna = tipePengguna;
        this.adminID = 0;
    }

    void menambahkanBuku(Buku[] rakBuku, Buku bukuBaru) {
       System.out.println("Anda tidak memiliki akses untuk menambahkan buku. (Hanya admin)");
    }

    void menghapusBuku(Buku[] rakBuku, String bukuYangDihapus) {
       System.out.println("Anda tidak memiliki akses untuk menghapus buku. (Hanya admin)");
    }
}