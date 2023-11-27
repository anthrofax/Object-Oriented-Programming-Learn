public class ReturnArray1D {
    static int[] get() {
        return new int[] { 10, 20, 70, 30, 50 };
    }

    public static void main(String[] args) {
        int arr[] = get();

        for (int i : arr) {
            System.out.println(i + " ");
        }
    }
}