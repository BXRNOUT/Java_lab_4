package I;

final public class Laptop extends Computer
{
    private int chargeBattery;

    public Laptop(int chargeBattery, int processorPower)
    {
        super(processorPower);
        if (chargeBattery >= 0 && chargeBattery <= 100)
            this.chargeBattery = chargeBattery;
    }

    public int getChargeBattery()
    {
        return chargeBattery;
    }
    public void setChargeBattery(int chargeBattery)
    {
        if (chargeBattery >= 0 && chargeBattery <= 100)
            this.chargeBattery = chargeBattery;
    }

    @Override
    public void print()
    {
        System.out.println("Заряд батареи ноутбука: " + chargeBattery + "\tМощность процессора: " + super.getProcessorPower() + "HHz");
    }
}
