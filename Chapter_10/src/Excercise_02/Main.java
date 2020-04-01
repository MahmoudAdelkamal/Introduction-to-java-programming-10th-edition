package Excercise_02;

public class Main
{
    public static void main(String[] args)
    {
        BMI bmi = new BMI("Mahmoud",20,183,5,7);
        System.out.println("Your data is :");
        System.out.println("Your name is " + bmi.GetName());
        System.out.println("Your age is " + bmi.GetAge());
        System.out.println("You weight is " + bmi.GetWeight());
        System.out.println("Your height is " + bmi.GetHeight());
        System.out.println("The status of your body is " + bmi.GetResult());
    }
}
