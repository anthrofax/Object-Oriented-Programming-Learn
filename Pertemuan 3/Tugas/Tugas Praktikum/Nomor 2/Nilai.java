public class Nilai {
    long nim;
    String nama;
    int nilaiAbsen;
    int nilaiTugas;
    int nilaiUTS;
    int nilaiUAS;
    double nilaiAkhir;

    void Nilai() {
        this.nilaiAkhir = this.nilaiAbsen * 0.1 + this.nilaiTugas * 0.2 + this.nilaiUTS * 0.3 + this.nilaiUAS * 0.4;
    }

    void CetakNilai() {
        System.out.println("NIM: " + this.nim + "\nNama: " + this.nama + "\nNilai Absen [10%]: " + this.nilaiAbsen + "\nNilai Tugas [20%]: " + this.nilaiTugas + "\nNilai UTS [30%]: " + this.nilaiUTS + "\nNilai UAS [40%]: " + this.nilaiUAS + "\nNilai Akhir: " + this.nilaiAkhir);
    }
}
