package be.intecbrussel.sellers;


import be.intecbrussel.eatables.Magnum;
import be.intecbrussel.eatables.Magnum.MagnumType;

public class PriceList {
    private double ballPrice = 1 ;
    private double rocketPrice = 1.2;
    private double magnumStandardPrice = 1.5;

    public  PriceList(){

    }

    public PriceList(double ballPrice, double rocketPrice, double magnumStandardPrice) {
        this.ballPrice = ballPrice;
        this.rocketPrice = rocketPrice;
        this.magnumStandardPrice = magnumStandardPrice;
    }

    public double getBallPrice() {
        return ballPrice;
    }

    public void setBallPrice(double ballPrice) {
        this.ballPrice = ballPrice;
    }

    public double getRocketPrice() {
        return rocketPrice;
    }

    public void setRocketPrice(double rocketPrice) {
        this.rocketPrice = rocketPrice;
    }

    public double getMagnumPrice(Magnum.MagnumType magnumType) {
        return magnumType.getPrice();
    }

    public void setMagnumStandardPrice(double magnumStandardPrice) {

        this.magnumStandardPrice = magnumStandardPrice;
    }
}
