 package TEST;

import java.util.Scanner;

class digit {
 public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int num=sc.nextInt();
    String digit="";
    while (num>0) {
        num=num%10;
        digit+=num;
        num=num/10;

    }
    System.out.println(digit);


 }
    
}