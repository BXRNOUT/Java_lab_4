package III;
import static java.lang.Math.sqrt;
import static java.lang.Math.pow;
import static java.lang.Math.abs;

public class Point
{
    protected int x = 0;
    protected int y = 0;

    //конструктор
    public Point(){}
    public Point(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    //гетеры и сетеры
    public int getX()
    {
        return x;
    }
    public int getY()
    {
        return y;
    }
    public void setLocation(int x, int y)
    {
            this.x = x;
            this.y = y;
    }

    //методы
    public double distanceFromOrigin()
    {
        return (double) sqrt(pow(x, 2) + pow(y, 2));
    }
    protected double distanceFromSecondPoint(int x, int y)
    {
        return (double) sqrt(pow((this.x - x), 2) + pow((this.y - y), 2));
    }
    public boolean isInRectangle(Point topLeft, Point bottomRight)
    {
        return (topLeft.getX() <= x && x <= bottomRight.getX() && topLeft.getY() >= y && y >= bottomRight.getY());
    }
    public boolean isInCircle(Point center, double radius)
    {
        return (distanceFromSecondPoint(center.getX(), center.getY()) < radius);
    }
    @Override
    public String toString()
    {
        return "X: " + x + "\tY: " + y;
    }
    public double distanceFromPointToLine(int A, int B, int C, Point ptr)
    {
        System.out.println("\nФункция вида: " + A + "x + " + B + "y + " + C);
        return ((double) abs(A * ptr.getX() + B * ptr.getY() + C) / sqrt(pow(A, 2) + pow(B, 2)));
    }
}
