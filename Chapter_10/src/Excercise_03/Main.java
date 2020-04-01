package Excercise_03;

public class Main
{
    public static void main(String[] args)
    {
        // Testing an even number
        MyInteger int1=new MyInteger(2);
        System.out.println(int1.IsOdd());
        System.out.println(int1.IsEven());
        System.out.println(int1.IsPrime());
        System.out.println(int1.equals(2300));
        
        System.out.println();
        // Testing an odd number
        MyInteger int2 =new MyInteger(9);
        System.out.println(int2.IsEven());
        System.out.println(int2.IsOdd());
        System.out.println(int2.IsPrime());
        System.out.println(int2.equals(4));
        
    }  
}
