public class SwitchCaseExample {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int angkaYangDicek = -1;
        int number = (angkaYangDicek == 0) ? 1 : (angkaYangDicek > 0) ? 2 : 3;


        switch (number) {
            case (1):
                System.out.println("The number is zero");
                break;
            case 2: 
                System.out.println("The number is positive");
                break;
            case 3: 
                System.out.println("The number is negative");
                break;
            default:
                System.out.println("Number is invalid");
                break;
        }
    }
}