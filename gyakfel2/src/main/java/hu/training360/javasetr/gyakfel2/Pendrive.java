package hu.training360.javasetr.gyakfel2;

public class Pendrive {
    private String name;
    private int capacity;
    private int price;

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getPrice() {
        return price;
    }

    public void risePrice(int percent)
    {
        price += price*percent/100;
    }

    public Pendrive(String name, int capacity, int price) {
        this.name = name;
        this.capacity = capacity;
        this.price = price;
    }

    public int comparePricePerCapacity(Pendrive otherPendrive)
    {
        if(otherPendrive.getPrice()>this.getPrice())
        {
            return 1;
        }
        else
        {
            if(otherPendrive.getPrice()<this.getPrice())
                return -1;
        }
        return 0;
    }

    public boolean cheaperThan(Pendrive otherPendrive)
    {
        return this.getPrice()<otherPendrive.getPrice();
    }


    @Override
    public String toString() {
        return "Pendrive{" +
                "name='" + name + '\'' +
                ", capacity=" + capacity +
                ", price=" + price +
                '}';
    }
}
