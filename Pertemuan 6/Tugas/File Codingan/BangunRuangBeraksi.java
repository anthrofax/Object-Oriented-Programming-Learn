class BangunRuangBeraksi  {
    public static void main (String[] args) {
        Balok balok1 = new Balok(6, 3, 5);
        Kubus kubus1 = new Kubus(10);

        balok1.tampilDataBangunRuang();
        System.out.println();
        kubus1.tampilDataBangunRuang();
    }
}