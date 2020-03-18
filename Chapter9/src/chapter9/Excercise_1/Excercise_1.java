package chapter9.Excercise_1;

public class Excercise_1
{
    public static void main(String[] args) {
        Rectangle rectangle1=new Rectangle(4,40);
        Rectangle rectangle2=new Rectangle(3.5,35.9);
        System.out.println("The width of The first rectangle is " + rectangle1.GetWidth());
        System.out.println("The height of The first rectangle is " + rectangle1.GetHeight());
        System.out.println("The area of The first rectangle is " + rectangle1.GetArea());
        System.out.println("The Perimeter of The first rectangle is " + rectangle1.GetPerimeter());
        
        System.out.println("The width of The second rectangle is " + rectangle2.GetWidth());
        System.out.println("The height of The second rectangle is " + rectangle2.GetHeight());
        System.out.println("The area of The second rectangle is " + rectangle2.GetArea());
        System.out.println("The Perimeter of The Second rectangle is " + rectangle2.GetPerimeter());
        
    }
}
