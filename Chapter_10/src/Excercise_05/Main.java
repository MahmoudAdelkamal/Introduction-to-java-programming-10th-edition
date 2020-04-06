package Excercise_05;
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n=input.nextInt();
        StackOfIntegers stack = new StackOfIntegers(20);
        int factor = 2;
        while(factor<=n)
        {
            if (n%factor==0)
            {
                stack.push(factor);
                n/= factor;
            } 
            else 
                factor++;
        }
        while(!stack.empty())
        {
           System.out.println(stack.peek());
           stack.pop();
        }
    }  
}
