package I;

public class Office
{
    private Computer[] stack;
    private int capacity;

    public Office(Computer[] stack)
    {
        capacity = stack.length;;
        this.stack = stack;
    }

    private void setStack(Computer[] stack)
    {
        this.stack = stack;
    }

    public void add(Computer object)
    {
        Computer[]stack = new Computer[capacity + 1];
        for (int i = 0; i < capacity; i++)
        {
            stack[i] = this.stack[i];
        }
        stack[capacity] = object;
        setStack(stack);
        capacity++;
    }
    public void pop(int index)
    {
        if(index < capacity) {
            Computer[] stack = new Computer[capacity - 1];
            for (int i = 0, j = 0; i < capacity; i++) {
                if (i != index) {
                    stack[j] = this.stack[i];
                    j++;
                }
            }
            setStack(stack);
            capacity--;
        }
        else
        {
            System.err.println("Неверный индекс");
        }
    }

    public void showAllDesktopCharacteristics()
    {
        for(int i = 0; i < capacity; i++)
            if(stack[i] instanceof Desktop)
                stack[i].print();
    }
    public void showAllLaptopCharacteristics()
    {
        for(int i = 0; i < capacity; i++)
            if(stack[i] instanceof Laptop)
                stack[i].print();
    }
    public void showAllTabletCharacteristics()
    {
        for(int i = 0; i < capacity; i++)
            if(stack[i] instanceof Tablet)
                stack[i].print();
    }
}
