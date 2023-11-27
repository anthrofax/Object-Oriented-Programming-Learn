public class AnonymousArray1D {
    static void max(int arr[]) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }

            System.out.println(max);
        }
    }

    public static void main(String[] args) {
        max(new int[] { 10, 20, 70, 30, 50 });
    }
}