package I;

final public class Tablet extends Computer
{
    private String matrixType;

    public Tablet(String matrixType, int proccesorPower)
    {
        super(proccesorPower);
        this.matrixType = matrixType;
    }

    public String getMatrixType()
    {
        return matrixType;
    }
    public void setMatrixType(String matrixType)
    {
        this.matrixType = matrixType;
    }

    @Override
    public void print()
    {
        System.out.println("Тип матрицы планшета: " + matrixType + "\tМощность процессора: " + super.getProcessorPower() + "HHz");
    }
}
