package Excercise_01;

public class Main
{
    public static void main(String[] args)
    {
        Time time =new Time(555550000);
        System.out.println("The Elapsed Time is ");
        System.out.println(time.GetHour() + " Hours");
        System.out.println(time.GetMinute() + " Minutes");
        System.out.println(time.GetSecond() + " Seconds");
    }
}
