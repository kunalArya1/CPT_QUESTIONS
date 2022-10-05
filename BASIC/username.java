import java.util.Scanner;

/*
    Accept the User's name, age and print in following manner 
    Ex - Hello Shery, you are 12 years old.  

*/



public class username {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Name: ");
        String name=sc.nextLine();
        System.out.println("Enter your age: ");
        int age=sc.nextInt();
        System.out.println("Hello "+name+", You are "+age+" years old.");
    }
    
}
