class Triangle {
    int out;
    public Triangle(int out) {
        this.out = out;
    }

    public void PrintTriangle() {
        for (int i = 1; i <= out; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println(); //new line
        }
    }
}