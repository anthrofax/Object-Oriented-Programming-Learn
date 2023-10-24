class KonversiSuhu2 extends KonversiSuhu {
    double fahrenheitToReamur(double fahrenheitValue) {
        double reamurValue = (fahrenheitValue - 32) * 4 / 9;
        System.out.println("Hasil konversi dari " + fahrenheitValue + "F adalah " + reamurValue + "R");

        return reamurValue;
    }
}