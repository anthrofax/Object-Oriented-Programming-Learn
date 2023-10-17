import java.lang.* ;
import java.util.*;
import java.util.Arrays.*;

public class TipeData {
    public static void main (String[] args) {
        // TODO Auto-generated method stub
        System.out.println("TIPE DATA PRIMITIF\n");
        int x = 10;
        int y = x;
        System.out.print("Inisial: ");
        System.out.println("x = " + x + ", y = " + y);

        y = 15;

        System.out.print("Setelah y diubah menjadi 15: ");
        System.out.println("x = " + x + ", y = " + y);

        System.out.println("\n\nTIPE DATA NON-PRIMITIF\n");
        int[] c = {10, 20, 30, 40};
        
        int[] d = c;

        System.out.println("Inisial");
        System.out.println("Array c: " + Arrays.toString(c));
        System.out.println("Array d: "+ Arrays.toString(d));

        System.out.println("\nModifikasi nilai pada indeks ke-1 dalam array d\n");
        d[1] = 50;

        System.out.println("Setelah diubah");
        System.out.println("Array c: "+ Arrays.toString(c));
        System.out.println("Array d: "+ Arrays.toString(d));
    }
}