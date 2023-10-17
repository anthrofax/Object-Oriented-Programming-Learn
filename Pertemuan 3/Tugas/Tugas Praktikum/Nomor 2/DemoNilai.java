public class DemoNilai {
    public static void main(String[] args) {
        Nilai mahasiswa1 = new Nilai();

        mahasiswa1.nim = 2210631170002L;
        mahasiswa1.nama = "Afridho Ikhsan";
        mahasiswa1.nilaiAbsen = 100;
        mahasiswa1.nilaiTugas = 98;
        mahasiswa1.nilaiUTS = 95;
        mahasiswa1.nilaiUAS = 98;

        mahasiswa1.Nilai();
        mahasiswa1.CetakNilai();
    }
}
