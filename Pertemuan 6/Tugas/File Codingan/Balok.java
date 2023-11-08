public class Balok {
    protected int panjang, lebar, tinggi, sisi;

    public Balok(int panjang, int lebar, int tinggi, int sisi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
        this.sisi = sisi;
    }

    public Balok(int panjang, int lebar, int tinggi) {
        this(panjang, lebar, tinggi, 0);
    }

    private int hitungLuasPermukaan() {
        return 2 * (this.panjang * this.lebar + this.panjang * this.tinggi + this.lebar * this.tinggi);
    }

    private int hitungVolume() {
        return this.panjang * this.lebar * this.tinggi;
    }

    public void tampilDataBangunRuang() {
        System.out.println("Panjang Balok: " + this.panjang + "\nLebar Balok: " + this.lebar + "\nTinggi Balok: " + this.tinggi);
        System.out.println("Luas Permukaan Balok: " + this.hitungLuasPermukaan() + "\nVolume Balok : " + this.hitungVolume());
    }

}