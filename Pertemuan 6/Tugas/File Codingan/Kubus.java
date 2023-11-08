public class Kubus extends Balok {
    public Kubus(int sisi) {
        super(0, 0, 0, sisi);
    }

    private int hitungLuasPermukaan() {
        return 6 * this.sisi;
    }

    private int hitungVolume() {
        return this.sisi * this.sisi * this.sisi;
    }

    public void tampilDataBangunRuang() {
        System.out.println("Sisi kubus: " + this.sisi);
        System.out.println("Luas Permukaan Kubus: " + this.hitungLuasPermukaan() + "\nVolume Kubus : " + this.hitungVolume());
    }
}