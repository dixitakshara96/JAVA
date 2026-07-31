package Self_Learning;

public class Employee{
    int id;
    String name;
    int age;
    double salary;

    public Employee(int id){
        this.id=id ;
    }

    public void EmpName(String empname){
        name=empname;
    } 

    public void EmpAge(int empage){
        age=empage;
    }

    public void EmpSalary(double empsalary){
        salary=empsalary;
    }

    public void PrintInfo(){
        System.out.println("ID: "+id);
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Salary: "+salary);
    }

    public static void main(String[] args){
        Employee emp1= new Employee(100);
        emp1.EmpName("ABC");
        emp1.EmpAge(45);
        emp1.EmpSalary(120000.49);
        emp1.PrintInfo();
    }
    }