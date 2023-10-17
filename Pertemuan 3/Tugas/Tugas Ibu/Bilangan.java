public class Bilangan {
    static int pencacah = 0;
    int nilai;

    public Bilangan(int nilai) {
        this.nilai = nilai;
        this.pencacah++;
    }
        
    public void info() {
        System.out.println("Nilai:" + this.nilai);
        System.out.println("Pencacah:"+this.pencacah);
        System.out.println("");
    }
}

// Perbedaan antara property pencacah nonstatic dengan static terletak pada perubahan nilai nya pada setiap pendeklarasian instance baru mengggunakan class Bilangan.

// Kalau nonstatic, setelah dilakukan deklarasi 3 instance, yaitu bl, bl2, & bl3. hasilnya sama yaitu 1. Sedangakan static, berbeda", yang dimana bernilai 1 setelah deklarasi bl, bernilai 2 setelah pendeklarasian instance bl2, dan bernilai 3 setelah deklarasi instance bl3.

// Itu dikarenakan static membuat property pencacah menjadi milik class, sehingga property pencacah yang dilakukan increment pada constructor function Bilangan itu merupakan variable/property yang sama

// Sedangkan kalau nonstatic, property pencacah menjadi milik dari masing" instance, sehingga saat dilakukan deklarasi 3 instance tadi, increment property pencacah yang dilakukan terjadi pada variable/property yang berbeda.
