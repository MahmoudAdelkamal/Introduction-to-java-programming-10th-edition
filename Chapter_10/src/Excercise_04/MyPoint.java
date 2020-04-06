package Excercise_04;

public class MyPoint 
{
    private double x;
    private double y;
    public MyPoint(double x,double y)
    {
        this.x=x;
        this.y=y;
    }
    public MyPoint()
    {
        this(0,0);
    }
    public void SetX(double x)
    {
        this.x=x;
    }
    public double GetX()
    {
        return x;
    }
    public void SetY(double y)
    {
        this.y=y;
    }
    public double GetY()
    {
        return y;
    }
    public double GetDistance(double x,double y)
    {
        return Math.sqrt((this.x - x) * (this.x - x) + (this.y - y) * (this.y - y));
    }
    
}
