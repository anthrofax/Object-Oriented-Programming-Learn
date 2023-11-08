class Anjing extends Hewan {
    protected String jenisSuara = "Guk Guk";

    public void bersuara() {
        System.out.println("Anjing: " + this.jenisSuara); //Polymorphism Override
    }
}