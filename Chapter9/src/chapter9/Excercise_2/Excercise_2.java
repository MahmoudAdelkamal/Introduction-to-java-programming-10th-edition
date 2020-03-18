package chapter9.Excercise_2;
public class Excercise_2
{
    public static void main(String[] args) {
        Stock s=new Stock("symbol","name");
        s.setCurrentPrice(5);
        s.setCurrentPrice(10);
        System.out.println("The Stock name is " + s.getName());
        System.out.println("The stock symbol is " + s.getSymbol());
        System.out.println("The previous price is " + s.getPreviousClosingPrice());
        System.out.println("The Current price is " + s.getCurrentPrice());
        System.out.println(s.getChangePercent()+"%");
    }        
}
