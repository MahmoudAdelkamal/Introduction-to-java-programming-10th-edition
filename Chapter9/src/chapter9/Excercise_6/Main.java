package Chapter9.Excercise_6;

public class Main
{
	public static void selectionSort(int[]arr) 
	{

        for (int i = 0; i < arr.length - 1;i++) 
        {
            int currentMin = arr[i];
            int currentIndex = i;
            for (int j = i + 1; j < arr.length; j++)
            {
                if (currentMin > arr[j])
                {
                    currentMin = arr[j];
                    currentIndex = j;
                }
            }
            if(currentIndex != i)
            {
                arr[currentIndex] = arr[i];
                arr[i] = currentMin;
            }
        }
    }
	public static void main(String[] args)
	{
		int[] randomArray = new int[1000];
        for (int i = 0; i < 1000; i++) {
            randomArray[i] = (int) (Math.random() * 100000);
        }
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        selectionSort(randomArray);
        stopWatch.stop();
        System.out.println("Time elapsed: " + stopWatch.getElapsedTime() + " milliseconds");
        for (int i = 0; i < randomArray.length; i++) 
        {
            System.out.println(randomArray[i]);
        }
	}
}
