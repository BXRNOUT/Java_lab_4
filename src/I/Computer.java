package I;

public class Computer
{
    protected int processorPower;

    public Computer(int processorPower)
    {
        if (processorPower > 0 && processorPower < 9000)
            this.processorPower = processorPower;
    }

    public int getProcessorPower()
    {
        return processorPower;
    }
    public void print()
    {
        System.out.println();
    }
}