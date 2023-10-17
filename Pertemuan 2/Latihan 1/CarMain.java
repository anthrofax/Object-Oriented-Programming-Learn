public class CarMain {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();

        car1.name = "car1";
        car1.Byear = 2000;
        car1.Model = "sedan";
        car1.NoP = 4;
        car1.detail();

        car1.name = "car2";
        car1.Byear = 2005;
        car1.Model = "MPV";
        car1.NoP = 7;
        car1.detail(); 
        car2.stop();
    }
}
