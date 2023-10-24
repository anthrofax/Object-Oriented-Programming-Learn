public class Employee {
    private String name;
    private double salary;

    protected Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

  protected String getDetails(){ 
   return "Name : "+name+ "\nSalary  : "+salary; 
  }

  public void cetak(){ 
   System.out.println("Percobaan  di Class Employee"); 
  }
}