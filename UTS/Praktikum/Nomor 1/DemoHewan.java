import java.util.Scanner;

class DemoHewan {
    static public void main (String[] args) {
        Scanner masukkan = new Scanner(System.in);


        System.out.println("Pilihan Hewan");
        System.out.println("1.  Kucing");
        System.out.println("2.  Anjing");
        System.out.print("Masukkan jenis hewan : ");

        int jenisHewan = masukkan.nextInt();

        if (jenisHewan == 1) {
            Kucing kucing = new Kucing(); 
            kucing.bersuara(); //Inheritence (Penggunaan method milik Class Hewan dari class Kucing)
            System.out.println("Kucing adalah Mamalia.");
        } else if (jenisHewan == 2) {
            Anjing anjing =new Anjing();
            anjing.bersuara();  //Inheritence (Penggunaan method milik Class Hewan dari class Anjing)
            System.out.println( "Anjing juga Mamalia.");
        } else {
            System.out.println("Inputan anda salah.");
        }
        
    }
}