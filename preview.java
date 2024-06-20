package Myfirstproject.src;

import java.util.Scanner;

public class preview {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Type your first name");
        String firstname=sc.nextLine();
        System.out.println("Type your last name");
        String lastname=sc.nextLine();
        System.out.println("Type your gender");
        String gender=sc.nextLine();
        System.out.println("Type your age");
        int age=sc.nextInt();
        System.out.println("Type your weight");
        int weight=sc.nextInt();

        System.out.println("Person Details:");
        System.out.println("___________________");
        System.out.println("First Name : "+firstname);
        System.out.println("Last Name : "+lastname);
        System.out.println("Gender : "+gender);
        System.out.println("Age : "+age);
        System.out.println("Weight : "+weight);

        
    }

    
}
