package Chapter9.Excercise_6;

public class StopWatch
{
	private long StartTime;
    private long EndTime;
    private long ElapsedPause;
    private int LastSecond;
    private int Seconds;
    private int Minutes;
    private int Hours;
    private boolean On;
    private boolean Paused;
    
    public StopWatch()
    {
        StartTime = System.currentTimeMillis();
        LastSecond=0;
    }
    public long getStartTime() 
    {
        return StartTime;
    }

    public long getEndTime() 
    {
        return EndTime;
    }
    public void start()
    {
        On = true;
        StartTime = System.currentTimeMillis();
    }
    public void pause()
    {
        Paused = true;
        ElapsedPause = System.currentTimeMillis()-StartTime;
    }
    public void resume()
    {
        Paused = false;
        StartTime = System.currentTimeMillis()-ElapsedPause;
    }
    public void stop()
    {
        EndTime = System.currentTimeMillis();
        On = false;
    }
    public long getElapsedTime()
    {
        return EndTime-StartTime;
    }
    
}
