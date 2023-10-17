public class Car {
    int Byear;
    String Model;
    int NoP;
    String name;

    void detail() {
        System.out.println("Mobil "+this.name);
        System.out.println("Tahun pembuatan: "+ this.Byear);
        System.out.println("Model: "+ this.Model);
        System.out.println("Jumlah penumpang: "+ this.NoP);
    }

    void stop() {
        System.out.println("Mobil memiliki sistem pengereman untuk berhenti.");
    }
}