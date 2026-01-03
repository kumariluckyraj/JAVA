package OOP;

public class Employee {
   private int salary;
   private String name;

   public Employee(int salary, String name){
       this.salary = salary;
       this.name = name;
   }

    public int getSalary(){
            return salary;
    }

    public String getName(){
       return name;
    }

    public void setName(String newName) {
        this.name = newName;
    }


    public static void main(String[] args){

       Employee emp = new Employee(5000, "Lucky");

        System.out.println("Name:" + emp.getName());
        System.out.println("Salary:" + emp.getSalary());

        emp.setName("Radha");
        System.out.println("new name:" + emp.getName());

    }
}