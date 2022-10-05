/*
    Solve Increment & decrement operator questions on 
    https://javaconceptoftheday.com/quiz-on-increment-and-decrement-operators/  
*/

public class incrDecr {
 public static void main(String[] args) {
     
 }   
}
/*
    1) What will be the output of the following program?

    public class IncrementDecrementQuiz 
    {
         public static void main(String[] args) 
            {
                 int i = 11;
         
                i = i++ + ++i;
         
                 System.out.println(i);
            }
    } 

//output: 24

2) Guess the output of the following program?

    public class IncrementDecrementQuiz 
{
    public static void main(String[] args) 
    {
        int a=11, b=22, c;
         
        c = a + b + a++ + b++ + ++a + ++b;
         
        System.out.println("a="+a);
        System.out.println("b="+b);
        System.out.println("c="+c);
    }
}

//output: a=13
          b=24
          c=103

3) What will be the output of the below program?

    public class IncrementDecrementQuiz 
{
    public static void main(String[] args) 
    {
        int i=0;
         
        i = i++ - --i + ++i - i--;
         
        System.out.println(i);
         
    }
}

//output=0

4) Is the below program written correctly?

    public class IncrementDecrementQuiz 
{
    public static void main(String[] args) 
    {
        boolean b = true;
         
        b++;
         
        System.out.println(b);
    }
}

Answer : No. ++ or -- can’t be applied to boolean types.
*/