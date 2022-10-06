import java.util.Scanner;

/*
    Accept the Principle amount, time & rate of interest and calculate the Simple Interest  
    
*/

public class simplei {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter principle : ");
        int p=sc.nextInt();
        System.out.println("Enter rate : ");
        int r= sc.nextInt();
        System.out.println("Enter time : ");
        int t= sc.nextInt();
        System.out.println("Simple intrest is : "+((p*r*t)/100));
    }
    
}
