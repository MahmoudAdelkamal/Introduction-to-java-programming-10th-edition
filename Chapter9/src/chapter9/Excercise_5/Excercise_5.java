package chapter9.Excercise_5;
import java.util.Random;
import java.util.GregorianCalendar;
import java.util.Calendar;
import java.util.Date;
public class Excercise_5 
{
    public static void main(String[] args)
    {
        Date date=new Date();
        System.out.println(date.toString());
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.setTimeInMillis(1234567898765L);
        System.out.println("Year : " +calendar.get(Calendar.YEAR));
        System.out.println("Month : "+calendar.get(Calendar.MONTH));
        System.out.println("Day : " +calendar.get(Calendar.DATE));
    }
}
