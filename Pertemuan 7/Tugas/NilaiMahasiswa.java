import java.util.Scanner;

class NilaiMahasiswa {
    static public void main(String[] args) {
        Scanner masukan = new Scanner(System.in);

        System.out.print("NPM : ");
        int npm = masukan.nextInt();
        masukan.nextLine();
        System.out.print("Nama Mahasiswa : ");
        String namaMahasiswa = masukan.nextLine();
        System.out.print("Nilai Kehadiran : ");
        double nilaiKehadiran = masukan.nextDouble();
        System.out.print("Nilai Tugas : ");
        double nilaiTugas = masukan.nextDouble();
        System.out.print("Nilai UTS : ");
        double nilaiUTS = masukan.nextDouble();
        System.out.print("Nilai UAS : ");
        double nilaiUAS = masukan.nextDouble();

        // Perhitungan Nilai rata-rata
        double nilaiRataRata = (0.1 * nilaiKehadiran) + (0.2 * nilaiTugas) + (0.3 * nilaiUTS) + (0.4 * nilaiUAS);
        char grade;
        String keterangan;

        if (nilaiRataRata > 75 && nilaiRataRata <= 100) {
            grade = 'A';
            keterangan = "ISTIMEWA";
        } else if (nilaiRataRata > 65 && nilaiRataRata <= 75) {
            grade = 'B';
            keterangan = "BAIK";
        } else if (nilaiRataRata > 55 && nilaiRataRata <= 65) {
            grade = 'C';
            keterangan = "CUKUP";
        } else if (nilaiRataRata > 45 && nilaiRataRata <= 55) {
            grade = 'D';
            keterangan = "KURANG";
        } else  {
            grade = 'E';
            keterangan = "KURANG SEKALI";
        }

        System.out.println("\nNPM Mahasiswa : " + npm);
        System.out.println("Nama Mahasiswa: " + namaMahasiswa);
        System.out.println("Nilai rata-rata : " + nilaiRataRata);
        System.out.println("Grade : " + grade);
        System.out.println("Keterangan : " + keterangan);
    }
}