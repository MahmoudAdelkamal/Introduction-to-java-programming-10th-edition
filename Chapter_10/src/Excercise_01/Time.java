package Excercise_01;

public class Time
{
    private long Hour;
    private long Minute;
    private long Second;
    public Time()
    {
        long TotalSeconds = System.currentTimeMillis()/1000;
        long TotalMinutes = TotalSeconds/60;
        long TotalHours = TotalMinutes/60;
        this.Hour = TotalHours%24;
        this.Minute = TotalMinutes%60;
        this.Second = TotalSeconds%60;

    }

    public Time(long Hour,long Minute,long Second)
    {
        this.Hour = Hour;
        this.Minute = Minute;
        this.Second = Second;
    }

    public Time(long ElapseTime)
    {
        long totalSeconds = ElapseTime / 1000;
        long totalMinutes = totalSeconds / 60;
        long totalHours = totalMinutes / 60;
        this.Hour = totalHours % 24;
        this.Minute = totalMinutes % 60;
        this.Second = totalSeconds % 60;
    }
    public long GetHour()
    {
        return Hour;
    }

    public long GetMinute()
    {
        return Minute;
    }

    public long GetSecond()
    {
        return Second;
    }
}
