public class RobotMain {
    public static void main(String[] args) {
        Robot robot1 = new Robot();
        Robot robot2 = new Robot();

        robot1.nama = "Upin";
        robot1.warna = "Hijau";
        robot1.berat = 25;

        robot2.nama = "Ipin";
        robot2.warna = "Biru";
        robot2.berat = 25;

        robot1.PerkenalanDiri();
        robot2.PerkenalanDiri();
    }
}