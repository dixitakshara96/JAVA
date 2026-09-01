package Self_Learning;

public class Employee{
    int id;
    String name;
    int age;
    double salary;

    // here the method whose name is same as that of Class is called Constructor.
    public Employee(int id){ 
        // quite important
        this.id=id ;
    }
 
    // method 
    public void EmpName(String empname){
        name=empname;
    } 
    
    //method
    public void EmpAge(int empage){
        age=empage;
    }

    //method
    public void EmpSalary(double empsalary){
        salary=empsalary;
    }
    
    //method
    public void PrintInfo(){
        System.out.println("ID: "+id);
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Salary: "+salary);
    }

    // now here comes the hero (main method)
    public static void main(String[] args){ 
        // creating an object 
        Employee emp1= new Employee(100);
        emp1.EmpName("ABC");
        emp1.EmpAge(45);
        emp1.EmpSalary(120000.49);
        emp1.PrintInfo();
    }
    }