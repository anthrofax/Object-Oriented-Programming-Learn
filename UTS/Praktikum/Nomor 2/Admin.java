public class Admin extends Pengguna {
    public String tipePengguna = "Admin";

    public Admin (String tipePengguna, int adminID) { //Overloading Polymorphism
        this.tipePengguna = tipePengguna;
        this.adminID = adminID;
    }

    void menambahkanBuku(Buku[] rakBuku, Buku bukuBaru) {
        rakBuku[rakBuku.length] = bukuBaru;
    }

    void menghapusBuku(String[] rakBuku, String bukuYangDihapus) {
        String[] rakSementara = new String[rakBuku.length - 1];
        int newIndex = 0;

        for (int i = 0; i < rakBuku.length; i++) {
            if (!rakBuku[i].equals(bukuYangDihapus)) {
                rakSementara[newIndex] = rakBuku[i];
                newIndex++;
            }
        }
        rakBuku = rakSementara;
    }
}