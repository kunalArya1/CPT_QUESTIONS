package PATTERN;
import java.util.*;

public class pattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        int b=sc.nextInt();
        int h=0;
        for(int i=1;i<=a || i<=b;i++)
        {
          if(a%i==0 && b%i==0){
            h=i;
          }
    }
    System.out.println(h);
    
}
}
