import java.util.Scanner;

/*
    Accept the length and breadth of a rectangle.Calculate & print the area and perimiter.  

*/


public class area {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the Length: ");
        int l=sc.nextInt();
        System.out.println("Enter the Breadth: ");
        int b=sc.nextInt();
        System.out.println("Area of Rectangle is: "+(l*b));
        System.out.println("Perimeter of Rectangle is: "+(2*(l+b)));
    }
    
}
