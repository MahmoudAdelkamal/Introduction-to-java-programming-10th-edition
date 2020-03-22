package Chapter9.Excercise_8;

public class Main
{

	public static void main(String[] args)
	{
		// a fan with on mode
       Fan Onfan=new Fan(2,true,5,"Red");
       System.out.println(Onfan.ToString());
       // a fan with off mode
       Fan Offfan=new Fan();
       System.out.println(Offfan.ToString());
	}
}
