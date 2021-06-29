package be.intecbrussel.eatables;

public enum Flavor {
    //list of  balls flavors(price i):
    //Strawberry:1,Banana:1,Chocolate:1,
    //Vanilla:1,Lemon:1,Straciatella:1,
    //Mokka:1,Pistache:1


    STRAWBERRY(1),BANANA(1),
    CHOCOLATE(1),VANILLA(1),LEMON(1),
    STRACIATELLA(1),MOKKA(1),PISTACHE(1);

    private double price;
    private int numberOfBalls;

    Flavor(double price, int numberOfBalls) {
        this.price = price;
        this.numberOfBalls = numberOfBalls;
    }

    Flavor(int i) {
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getNumberOfBalls() {
        return numberOfBalls;
    }

    public void setNumberOfBalls(int numberOfBalls) {
        this.numberOfBalls = numberOfBalls;
    }
    @Override
    public String toString() {
        return "Flavor{" +
                "price=" + price +
                "} " + super.toString();
    }
}

