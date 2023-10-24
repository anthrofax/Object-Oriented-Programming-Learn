public class Manager extends Employee {
    private String dept;

    public Manager(String name, double salary, String dept) {
        super(name, salary);
        this.dept = dept;
    }

    public String getDept() {
        return dept;
    }

  public String getDetails(){ 
   return super.getDetails()+"\nDepartment : "+getDept(); 
  }

  public void cetak(){ 
   System.out.println(" Percobaan di  Class Manager"); 
  }
}