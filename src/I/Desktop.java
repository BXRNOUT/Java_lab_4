package I;

final public class Desktop extends Computer
{
    private int graphicsCard;

    public Desktop(int graphicsCard, int processorPower)
    {
        super(processorPower);
        if (graphicsCard <= 4090 && graphicsCard > 0)
            this.graphicsCard = graphicsCard;
    }
    public int getGraphicsCard()
    {
        return graphicsCard;
    }
    public void setGraphicsCard(int graphics_card)
    {
        if (graphicsCard <= 4090 && graphicsCard > 0)
            this.graphicsCard = graphicsCard;
    }

    @Override
    public void print()
    {
        System.out.println("Графическая карта компьютера: " + graphicsCard + "\tМощность процессора: " + super.getProcessorPower() + "HHz");
    }
}
