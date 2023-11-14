public class BreakLabelExample {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        for (int i = 0; i < 3; i++) {
            one: {
                two: {
                    three: {
                        System.out.println("i =" + i);
                        if (i == 0)
                            break one;
                        if (i == 1)
                            break two;
                        if (i == 2)
                            break three;
                    }
                    System.out.println("After label three");
                }
                System.out.println("After label two");
            }
            System.out.println("After label one");
        }
    }
}