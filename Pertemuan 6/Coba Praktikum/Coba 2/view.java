public class view {
    public static void main(String[] args) {
        Employee em = new Employee("Dilan", 4000000);
        Manager mn = new Manager("Milea", 5000000, "Marketing");

        System.out.println("Data Employee : \n" + em.getDetails());
        em.cetak();
        System.out.println("\nData Manager  : \n" + mn.getDetails());
        mn.cetak();
    }
}