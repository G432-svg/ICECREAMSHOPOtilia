package be.intecbrussel.sellers;

import be.intecbrussel.eatables.*;

public class IceCreamSalon implements IceCreamSeller {
    PriceList priceList ;

    double totalProfit;


    public IceCreamSalon(PriceList priceList, double totalProfit) {
        this.priceList = priceList;
        this.totalProfit = totalProfit;
    }

    public IceCreamSalon(PriceList priceList) {
    }

    public double getProfit() {
        return IceCreamSeller.super.getProfit();
    }

    @Override
    public Flavor[] orderCone(Flavor[] flavors) {
        Cone cone = new Cone();
        System.out.println(priceList.getBallPrice() + totalProfit);


        return flavors;
    }


    @Override
    public double orderIceRocket() {
        IceRocket iceRocket = new IceRocket(21);
        getProfit();
        return totalProfit;

    }


    @Override
    public double orderMagnum(MagnumType magnumType) {
        Magnum magnum = new Magnum();
        System.out.println(priceList.getMagnumStandardPrice() + totalProfit);
        MagnumType magnumType1 = magnumType;


        return totalProfit;

    }

    @Override
    public String toString() {
        return "IceCreamSalon{" +
                "priceList=" + priceList +
                ", totalProfit=" + totalProfit +
                '}';
    }
}
