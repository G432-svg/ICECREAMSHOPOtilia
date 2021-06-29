package be.intecbrussel.eatables;

public enum MagnumType {
    //list of magnumType(price):
    // Milkchocolate:1.5,Whitechocolate:1.5
    // Blackchocolate:1.5,Alpinenuts:1.5*1.5,Romanticsrawberries:1.5

    MILKCHOCOLATE(1.5),WHITECHOCOLATE(1.5),
    BLACKCHOCOLATE(1.5),ALPINENUTS(1.5*1.5),ROMANTICSRAWBERRIES(1.5);
    private double price;

    MagnumType(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "MagnumType{" +
                "price=" + price +
                "} " + super.toString();
    }
}
