package Excercise_02;

public class BMI
{
    private String Name;
    private int Age;
    private double Weight;
    private double Height;
    private double Feet;
    private double Inches;
    public BMI(String Name, int Age, double Weight, double Feet, double Inches)
    {
        this.Name=Name;
        this.Age=Age;
        this.Weight=Weight;
        this.Feet=Feet;
        this.Inches=Inches;
        this.Height=Feet*12+Inches;
    }
    
    public double GetBMI()
    {
        double bmi = Weight * Constants.KILOGRAMS_PER_POUND /((Height * Constants.METERS_PER_INCH) * (Height * Constants.METERS_PER_INCH));
        return Math.round(bmi*100)/ 100.0;
    }
    

    public String GetName() 
    {
        return Name;
    }

    public int GetAge() 
    {
        return Age;
    }

    public double GetWeight()
    {
        return Weight;
    }

    public double GetHeight()
    {
        return Height;
    }

    public double GetInches()
    {
        return Inches;
    }

    public void SetInches(double Inches)
    {
        this.Inches = Inches;
    }

    public double GetFeet()
    {
        return Feet;
    }

    public void SetFeet(double Feet)
    {
        this.Feet = Feet;
    }
    public String GetResult()
    {
        double bmi = GetBMI();
        String result = "";
        if (bmi < 18.5)
            result = "Underweight";
        else if (bmi < 25)
            result = "Normal";
        else if (bmi < 30)
            result = "Overweight";
        else if(bmi > 30)
            result = "Obese";
        return result;
    }
}
