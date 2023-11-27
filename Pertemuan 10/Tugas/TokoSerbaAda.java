import java.util.Scanner;

public class TokoSerbaAda {
    static public void main(String[] args) {
        Scanner masukkan = new Scanner(System.in);

        Item[] daftarBarang = { new Item("a001", "Buku", 3000), new Item("a002", "Pensil", 4000),
                new Item("a003", "Pulpen", 5000) };

        String[] kodeYangDipilih = new String[3];
        int[] jumlahBeliPerBarang = new int[3];
        int totalBayar = 0;

        System.out.println("Toko Serba Ada");
        System.out.println("******************");

        System.out.print("Masukkan Item Barang: ");
        int jumlahBarangYangDibeli = masukkan.nextInt();

        for (int i = 0; i < jumlahBarangYangDibeli; i++) {
            System.out.println("Data ke " + (i + 1));

            System.out.print("Masukkan kode: ");
            masukkan.nextLine();
            kodeYangDipilih[i] = masukkan.nextLine();

            System.out.print("Masukkan jumlah beli: ");
            jumlahBeliPerBarang[i] = masukkan.nextInt();
        }

        System.out.println("Toko Serba Ada");
        System.out.println("******************");

        System.out.println("No\tKode Barang\tNama Barang\tHarga\tJumlah Beli\tJumlah Bayar");
        System.out.println("====================================================================================");
        for (int j = 0; j < jumlahBarangYangDibeli; j++) {
            int indexBarang = 0;
            for (int k = 0; k < daftarBarang.length; k++) {
                if (daftarBarang[k].kodeBarang.equals(kodeYangDipilih[j])) {
                    indexBarang = k;
                    break;
                }
            }

            int totalBayarPerBarang = (jumlahBeliPerBarang[j] * daftarBarang[indexBarang].hargaBarang);

            System.out.println((j + 1) + ".\t" + kodeYangDipilih[j] + "\t\t" + daftarBarang[indexBarang].namaBarang
                    + "\t\t" + daftarBarang[indexBarang].hargaBarang + "\t" + jumlahBeliPerBarang[j] + "\t\t"
                    + totalBayarPerBarang);

            totalBayar += totalBayarPerBarang;
        }

        System.out.println("====================================================================================");
        System.out.println("Total Bayar\t\t" + totalBayar);
        System.out.println("====================================================================================");

    }
}