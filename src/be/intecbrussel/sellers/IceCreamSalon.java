package be.intecbrussel.sellers;

import be.intecbrussel.eatables.*;

public class IceCreamSalon implements IceCreamSeller {
    private PriceList priceList ;
    private double totalProfit;


    public IceCreamSalon(PriceList priceList, double totalProfit) {
        this.priceList = priceList;
        this.totalProfit = totalProfit;
    }


    public double getProfit() {
        return totalProfit;
    }


    public Cone orderCone(Cone.Flavor[] flavors) {
        Cone cone = new Cone(flavors);
        totalProfit += flavors.length*priceList.getBallPrice();
        return cone;
    }


    public IceRocket orderIceRocket() {
        IceRocket iceRocket = new IceRocket();
        totalProfit += priceList.getRocketPrice();
        return iceRocket;

    }

    public Magnum orderMagnum(Magnum.MagnumType magnumType) {
        Magnum magnum = new Magnum(magnumType);
        totalProfit += priceList.getMagnumPrice(magnumType);
        return magnum;

    }

    @Override
    public String toString() {
        return "IceCreamSalon{" +
                "priceList=" + priceList +
                ", totalProfit=" + totalProfit +
                '}';
    }
}
