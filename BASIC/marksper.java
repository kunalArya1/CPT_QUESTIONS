import java.util.Scanner;

/*
    Accept the marks of Robert in three subjects Maths, Computer, English respectively (each out of 100 ), 
    Write a program to calculate his total marks and percentage marks.  
    
*/

public class marksper{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks in maths: ");
        int math=sc.nextInt();
        System.out.println("Enter your marks in Computer: ");
        int comp=sc.nextInt();
        System.out.println("Enter your marks in English: ");
        int eng=sc.nextInt();
        System.out.println("Total marks you have score out of 300 is "+(math+comp+eng));
        System.out.println("And your percentage is : "+((math+comp+eng)/3)+"%");


    }
}