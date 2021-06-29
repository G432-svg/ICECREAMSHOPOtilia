package be.intecbrussel.sellers;

public class Stock extends IceCreamCar{
    int iceRockets = 20;
    int cones = 50;
    int balls = 0;
    int magni = 20;

    public Stock(PriceList priceList) {
        super(priceList);
    }

    public Stock(PriceList priceList, int iceRockets, int cones, int balls, int magni) {
        super(priceList);
        this.iceRockets = iceRockets;
        this.cones = cones;
        this.balls = balls;
        this.magni = magni;
    }

    public int getIceRockets() {
        return iceRockets;
    }

    public void setIceRockets(int iceRockets) {
        this.iceRockets = iceRockets;
    }

    public int getCones() {

        return cones;
    }

    public void setCones(int cones) {
        this.cones = cones;
    }

    public int getBalls() {
        return balls;
    }

    public void setBalls(int balls) {

        this.balls = balls;
    }

    public int getMagni() {
        return magni;
    }

    public void setMagni(int magni) {
        this.magni = magni;
    }
}
