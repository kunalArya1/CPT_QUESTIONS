import java.util.Scanner;

/*
    Write a program to accept temperature in Fahrenheit & convert into Celsius. (Look for the formula on internet) 
    
*/
public class temp {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter temperature in fahrenheit : ");
        float temp=sc.nextFloat();
        System.out.println("temprature in celsius is : "+((temp-32)/(9f/5)));
    }
    
}
