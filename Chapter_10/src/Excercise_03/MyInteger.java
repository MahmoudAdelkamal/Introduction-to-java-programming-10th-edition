package Excercise_03;
public class MyInteger 
{
    private int Value;
    public MyInteger(int Value)
    {
        this.Value=Value;
    }
    public int GetValue()
    {
        return Value;
    }
    public boolean IsEven()
    {
        return Value%2==0;
    }
    public boolean IsOdd()
    {
        return (Value%2!=0);
    }
    public boolean IsPrime()
    {
        for(int i=2;i*i<=Value;i++)
        {
            if(Value%i==0)
                return false;
        }
        return true;
    }
    public static boolean IsEven(MyInteger integer)
    {
        return (integer.GetValue()%2==0);
    }
    public static boolean IsOdd(MyInteger integer)
    {
        return (integer.GetValue()%2!=0);
    }
    public static boolean IsPrime(MyInteger integer)
    {
        for(int i=2;i*i<=integer.GetValue();i++)
        {
            if(integer.GetValue()%i==0)
                return false;
        }
        return true;
    }
    public boolean equals(int Value)
    {
        return this.Value==Value;
    }
    public static long ParseInt(char [] arr)
    {
        long result=0;
        long power=arr.length-1;
        for(char number:arr)
        {
            result+=Math.pow(10,power--)*(number-'0');
        }
        return result;
    }
}
