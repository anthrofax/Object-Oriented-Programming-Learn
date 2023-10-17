public class AnimalMain {
    public static void main (String[] args) {
        Animal rabbit = new Animal();

        rabbit.height = 40.5;
        rabbit.weight = 7;
        rabbit.age = 2;

        System.out.println("Tinggi kelinci: "+rabbit.height+" cm.");
        System.out.println("Berat kelinci: "+rabbit.weight+" kg.");
        System.out.println("Usia kelinci: "+rabbit.age+" tahun.");

        rabbit.breath();
    }
}