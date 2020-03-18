package chapter9.Excercise_2;
public class Stock
{
    private String symbol;
    private String name;
    private double previousClosingPrice;
    private double currentPrice;
    public Stock(String symbol,String name)
    {
        this.symbol = symbol;
        this.name = name;
    }
    public String getName()
    {
        return name;
    }
    public String getSymbol() 
    {
        return symbol;
    }
    public void setCurrentPrice(double currentPrice) 
    {
        this.previousClosingPrice =this.currentPrice;
        this.currentPrice=currentPrice;
    }
    public double getCurrentPrice()
    {
        return currentPrice;
    }
    public double getPreviousClosingPrice()
    {
         return previousClosingPrice;
    }
    public double getChangePercent()
    {
        return ((currentPrice - previousClosingPrice) / previousClosingPrice)*100;
    }
}
