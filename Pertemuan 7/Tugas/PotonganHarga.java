import java.util.Scanner;

class PotonganHarga {
    static public void main( String[] args) {
        Scanner masukkan = new Scanner(System.in);

        System.out.print("Total Pembelian: ");
        double totalPembelian = masukkan.nextDouble();
        double potonganBiaya = 0;

        if (totalPembelian < 50000) potonganBiaya = 0.05 * totalPembelian;
        else if(totalPembelian >= 50000) potonganBiaya = 0.2 * totalPembelian;
        

        double jumlahBayar = totalPembelian - potonganBiaya;

        System.out.println("Besarnya potongan: Rp. " + potonganBiaya);
        System.out.println("Jumlah yang harus dibayarkan: Rp. " + jumlahBayar);
    }
}