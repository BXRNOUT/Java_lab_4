import I.*;
import II.*;
import III.*;

public class Main
{
    public static void main(String[] args)
    {
        Computer desktop1 = new Desktop(4070, 4333);
        Computer desktop2 = new Desktop(3060, 3600);
        Computer laptop1 = new Laptop(99, 3000);
        Computer laptop2 = new Laptop(23, 3600);
        Computer laptop3 = new Laptop(52, 2666);
        Computer tablet = new Tablet("LCD", 2666);
        Computer[] stack = {desktop1, desktop2, laptop1, laptop2, laptop3, tablet};
        Office office = new Office(stack);
        office.showAllLaptopCharacteristics();
        office.showAllDesktopCharacteristics();
        office.showAllTabletCharacteristics();
        ComplexNumber c1 = new ComplexNumber(2.0, 3.0);
        ComplexNumber c2 = new ComplexNumber(3.0, 4.0);
        System.out.println("\nc1 равно c2: " +  c1.equals(c2) + "\n");
        Point ptr = new Point(2, 2);
        Point rectangleTop = new Point(-3, 1);
        Point rectangleBottom = new Point(3, -2);
        Point center = new Point(3, 3);
        System.out.println(ptr.toString() + "\nДистанция от 0 0: " + ptr.distanceFromOrigin() +
                "\nВходит в прямоугольник? " + ptr.isInRectangle(rectangleTop, rectangleBottom) +
                "\nВходит в круг? " + ptr.isInCircle(center, 5));
        Point3D ptr3D = new Point3D(2, 2, 2);
        Point3D rectangle3D1 = new Point3D(-3, 4, 1);
        Point3D rectangle3D2 = new Point3D(3, -4, -5);
        Point3D center3D = new Point3D(3, 3, 3);
        System.out.println(ptr3D.toString() + "\nДистанция от 0 0 0: " + ptr3D.distanceFromOrigin() +
                "\nВходит в прямоугольник? " + ptr3D.isInBox(rectangle3D1, rectangle3D2) +
                "\nВходит в круг? " + ptr3D.isInSphere(center3D, 5));
        System.out.println(ptr.distanceFromPointToLine(9, 8, 7, ptr));
        System.out.println(ptr3D.distanceFromPointToPlane(1, 2, 3, 4, ptr3D));
    }
}