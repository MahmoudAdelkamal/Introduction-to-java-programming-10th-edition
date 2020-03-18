package chapter9.Excercise_1;
public class Rectangle
{
    private double width;
    private double height;
    public Rectangle()
    {
        width=1;
        height=1;
    }
    public Rectangle(double width,double height)
    {
        this.width=width;
        this.height=height;
    }
    public double GetWidth()
    {
        return width;
    }
    public double GetHeight()
    {
        return height;
    }
    public double GetArea()
    {
        return width*height;
    }
    public double GetPerimeter()
    {
        return (width+height)*2;
    }
}
