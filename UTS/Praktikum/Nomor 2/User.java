public class User extends Pengguna {
    public String tipePengguna = "Pengguna";

    public User (String tipePengguna) { //Overloading Polymorphism
        this.tipePengguna = tipePengguna;
        this.adminID = 0;
    }

    void menambahkanBuku(String[] rakBuku, String bukuBaru) {
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