package Excercise_05;

public class StackOfIntegers 
{
    private int[]elements;
    private int size;
    public StackOfIntegers(int capacity)
    {
        elements = new int[capacity];
    }
    public StackOfIntegers()
    {
        this(16);
    }
    public void push(int value)
    {
        if(size>= elements.length)
        {
            int[] temp = new int[elements.length * 2];
            System.arraycopy(elements,0,temp,0,elements.length);
            elements = temp;
        }
        elements[size++] = value;
    }
    public void pop() 
    {
        if(size==0)
            return;
        size--;
    }
    public int peek()
    {
        return elements[size - 1];
    }
    public boolean empty()
    {
        return size == 0;
    }
    public int getSize()
    {
        return size;
    }
}
