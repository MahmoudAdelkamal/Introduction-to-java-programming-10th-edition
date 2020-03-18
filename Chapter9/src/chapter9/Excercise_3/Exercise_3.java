package chapter9.Excercise_3;
import java.util.Date;
public class Exercise_3
{
    
    public static void main(String[] args) {
        long time=1000;
        for(int i=0;i<8;i++,time*=10)
        {
            Date date = new Date(time);
            System.out.println(date.toString());
        }
    }  
}
