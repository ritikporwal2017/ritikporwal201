package Myfirstproject.src;

public class Employee {
    private int emp_id;
    private int age;
    private int salary;
    private String name;
    private String designation;
    private String gender;

    public Employee(int emp_id,int age,int salary,String name,String designation,String gender)
    {
        this.name=name;
        this.emp_id=emp_id;
        this.age=age;
        this.gender=gender;
        this.designation=designation;
        this.salary=salary;

    }
    public int getEmp_id(){
        return emp_id;
    }

    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }

    public int getSalary(){
        return salary;
    }

    public void setSalary(int salary){
        this.salary=salary;
    }

    public String getGender(){
        return gender;
    }

    public void setGender(String gender){
        this.gender=gender;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age=age;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

    public String getDesignation(){
        return designation;
    }

    public void setDesignation(String designation){
        this.designation=designation;
    }


    public void printEmployeeDetails(){
        System.out.println("Name :"+name);
        System.out.println("designation :"+designation);
        System.out.println("emp_id :"+emp_id);
        System.out.println("Salary :"+salary);
        System.out.println("Age :"+age);
        System.out.println("Gender :"+gender);

    }

    // public String eString(){
    //     return "[emp_id ="+emp_id+",salary="+salary+",name="+name+",age"+age+",gender="+gender+",designation"+designation+"]";
    // }
    
}
