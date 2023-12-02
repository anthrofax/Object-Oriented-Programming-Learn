import java.util.ArrayList;

public class GetTest {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<String>();
        arr.add("Andrew");
        arr.add("Bob");
        arr.add("Cella");
        arr.add("Denlie");
        arr.add(null);
        arr.add("Emely");
        System.out.println(arr);

        // Get method
        String s = arr.get(1);
        System.out.println("At index 1, number is " + s);
    }
}