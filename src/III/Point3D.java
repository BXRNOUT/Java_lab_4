package III;

import static java.lang.Math.*;

public class Point3D extends Point
{
    private int z;

    //конструктор
    public Point3D(){}
    public Point3D(int x, int y, int z)
    {
        super.x = x;
        super.y = y;
        this.z = z;
    }

    //гетеры и сетеры
    public int getZ()
    {
        return z;
    }
    public void setLocation(int x, int y, int z)
    {
        super.setLocation(x, y);
        this.z = z;
    }
    @Override
    public void setLocation(int x, int y)
    {
        super.setLocation(x, y);
        z = 0;
    }

    //методы
    public boolean isInBox(Point3D corner1, Point3D corner2)
    {
        return (getX() >= Math.min(corner1.getX(), corner2.getX()) && getX() <= Math.max(corner1.getX(), corner2.getX())) &&
                (getY() >= Math.min(corner1.getY(), corner2.getY()) && getY() <= Math.max(corner1.getY(), corner2.getY())) &&
                (z >= Math.min(corner1.getZ(), corner2.getZ()) && z <= Math.max(corner1.getZ(), corner2.getZ()));
    }
    public boolean isInSphere(Point3D center, double radius)
    {
        double distance = sqrt(Math.pow(getX() - center.getX(), 2) + pow(getY() - center.getY(), 2) + pow(z - center.getZ(), 2));
        return distance <= radius;
    }
    @Override
    public double distanceFromOrigin()
    {
        return (double) sqrt(pow(sqrt(pow(x, 2) + pow(y, 2)), 2) + pow(z,2));
    }
    @Override
    public String toString()
    {
        return "X: " + x + "\tY: " + y + "\tZ: " + z;
    }
    public double distanceFromPointToPlane(int A, int B, int C, int D, Point3D ptr)
    {
        System.out.println("\nФункция вида: " + A + "x + " + B + "y + " + C + "z + " + D);
        return ((double) abs((A * ptr.getX()) + (B * ptr.getY()) + (C * ptr.getZ()) + D) / sqrt(pow(A, 2) + pow(B, 2) + pow(C, 2)));
    }
}
