package Myfirstproject.src;

public class employee_scheme {
    public static void main(String[] args) {
        Employee emp =new Employee(101,20,25000,"Ritik","Programmer","Male");

        emp.printEmployeeDetails();
        // emp.setEmp_id(101);
        // emp.setName("Ritik");
        // emp.setAge(30);
        // emp.setSalary(30000);
        // emp.setGender("Male");
        // emp.setInsaurance("scheme A");
        // //emp.setDesignation("engineer");

        System.out.println(emp);

        int sal=emp.getSalary();
        String s=emp.getDesignation();
        //String insauranceScheme="";

        if ((sal>5000)&&(sal<20000))
        {   if(s=="System Associate")
            {
            String insauranceScheme= "Scheme C";
            System.out.println("YOu are covered under Scheme C");}
        }

        else if ((sal>=20000)&&(sal<=40000))
        {   if (s=="Programmer"){
            String insauranceScheme= "Scheme B"; 
            System.out.println("YOu are covered under Scheme B");}
        }

        else if ((sal>=40000))
        {   if (s=="Manager"){
            String insauranceScheme= "Scheme A";
            System.out.println("YOu are covered under Scheme A");}
        }
        else if ((sal<5000))
        {   if (s=="cleark"){
            String insauranceScheme= "NO Scheme";
            System.out.println("YOu are covered under No Scheme"); }
        }
        
    }
}
