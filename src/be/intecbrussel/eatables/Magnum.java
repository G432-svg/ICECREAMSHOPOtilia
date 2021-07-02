package be.intecbrussel.eatables;

public class Magnum implements Eatable {
    private MagnumType type;

    public Magnum() {

    }

    public Magnum(MagnumType type) {
        this.type = type;
    }


    public MagnumType getType() {
        return type;
    }

    @Override
    public void eat() {
        System.out.println("I am eating a Magnum:" + type);
    }

    public enum MagnumType {
        //list of magnumType(price):
        // Milkchocolate:1.5,Whitechocolate:1.5
        // Blackchocolate:1.5,Alpinenuts:1.5*1.5,Romanticsrawberries:1.5

        MILKCHOCOLATE(1.5), WHITECHOCOLATE(1.2),
        BLACKCHOCOLATE(2.5), ALPINENUTS(1.5 + 1.5), ROMANTICSRAWBERRIES(1.8);
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



    }

}
