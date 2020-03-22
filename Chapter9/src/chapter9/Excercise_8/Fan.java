package Chapter9.Excercise_8;

public class Fan 
{
	 public static int SLOW=1;
	 public static int MEDIUM=2;
	 public static int FAST=3;
	 private int Speed;
	 private boolean on;
	 private double radius;
	 private String color;
	 public Fan()
	 {
		 Speed=SLOW;
		 on=false;
		 radius=5;
		 color="blue";
	 }
	 public Fan(int Speed,boolean on,double radius,String color)
	 {
		 this.Speed=Speed;
		 this.on=on;
		 this.radius=radius;
		 this.color=color;
	 }
	 public int GetSpeed()
	 {
		 return Speed;
	 }
	 public boolean GetStatus()
	 {
		 return on;
	 }
	 public double radius()
	 {
		 return radius;
	 }
	 public String GetColor()
	 {
		 return color;
	 }
	 public String ToString()
	 {
		 if(on)
		 {
			 return ("Speed is "+Speed+" color is "+color+" radius is "+radius);
		 }
		 else
		 {
			 return ("Fan is off " +"Speed is "+Speed+" color is "+color+" radius is "+radius);
		 }
	 }
}
