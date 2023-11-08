class Kucing extends Hewan {
    protected String jenisSuara = "Meong";

    public void bersuara() {
        System.out.println("Kucing: " + this.jenisSuara); //Polymorphism Override
    }
}