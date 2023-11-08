import java.util.Scanner;

class IndeksMassaTubuh {
    static public void main(String[] args) {
        Scanner masukkan = new Scanner(System.in);

        System.out.print("Masukkan berat badan: ");
        double beratBadan = masukkan.nextDouble();
        System.out.print("Tinggi badan: ");
        double tinggiBadan = masukkan.nextDouble();

        double imt = beratBadan / (tinggiBadan * tinggiBadan);
        String kriteria = "";

        if (imt >= 40) kriteria = "Sangat Gemuk";
        else if (imt >= 30 && imt < 40) kriteria = "Gemuk";
        else if (imt >= 25 && imt < 30) kriteria = "Berat Badan Lebih";
        else if (imt >= 18.5 && imt < 25) kriteria = "Berat Badan Ideal";
        else kriteria = "Berat Badan Kurang";

        System.out.println("IMT anda sebesar " + imt + ". Jadi, kriteria berat badan anda adalah " + kriteria);
    }
}