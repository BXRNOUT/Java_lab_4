package II;

public class ComplexNumber
{
    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary)
    {
        this.real = real;
        this.imaginary = imaginary;
    }

    public boolean equals (ComplexNumber other)
    {
        if (other==null)
            return false;
        return this.real == other.real && this.imaginary == imaginary;
    }
}
