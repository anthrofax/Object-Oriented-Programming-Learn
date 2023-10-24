public class PrintNumbers {

    int batas;
    public PrintNumbers(int batas) {
        this.batas = batas;
    }
    
    public void NumbersShow() {
        for (int i = 1; i <= batas; i++) {
            System.out.println(i);
        }
    }
 }
 
 