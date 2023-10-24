class KonversiSuhu {
    double celciusToFahrenheit(double celciusValue) {
        double fahrenheitValue = (9 * celciusValue / 5) + 32;
        System.out.println("Hasil konversi dari " + celciusValue + "C adalah " + fahrenheitValue + "F");
        
        return fahrenheitValue;
    }

    double celciusToReamur(double celciusValue) {
        double reamurValue = 4 * celciusValue / 5;
        System.out.println("Hasil konversi dari " + celciusValue + "C adalah " + reamurValue + "R");

        return reamurValue;
    }
}