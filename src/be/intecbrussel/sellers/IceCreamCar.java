package be.intecbrussel.sellers;

import be.intecbrussel.eatables.*;
import be.intecbrussel.exeptions.NoMoreIceCreamException;

public class IceCreamCar implements IceCreamSeller {
    private PriceList priceList;
    public Stock stock;
    private double profit;


    public IceCreamCar(PriceList priceList, Stock stock, double profit){
        this.priceList = priceList;
        this.stock = stock;
        this.profit = profit;
    }

    public Cone orderCone(Cone.Flavor[] flavors) {
        profit += flavors.length * priceList.getBallPrice();
        return prepareCone(flavors);
    }

    private Cone prepareCone(Cone.Flavor[] flavors) {
        int cone = stock.getBalls();
        if(cone <= 0){
            System.out.println("No more cone");
            throw new NoMoreIceCreamException();
        }else{
            stock.setCones((--cone));
            return  new Cone(flavors);
        }

    }

    @Override
    public IceRocket orderIceRocket() {
        profit += priceList.getRocketPrice();
        return prepareRocket();
    }

    private IceRocket prepareRocket () {
        int rockets = stock.getIceRockets();
        if (rockets <= 0) {
            System.out.println("No more rockets");
            throw new NoMoreIceCreamException();
        } else {
            stock.setIceRockets(--rockets);
            return new IceRocket();
        }

    }

    public Magnum orderMagnum(Magnum.MagnumType magnumType) {
        profit += priceList.getMagnumPrice(magnumType);
        return prepareMagnum(magnumType);
    }

    private Magnum prepareMagnum(Magnum.MagnumType magnumType) {
        int magnum = stock.getMagni();
        if (magnum <= 0) {
            System.out.println("No more magnum");
            throw new NoMoreIceCreamException();
        } else {
            stock.setMagni(--magnum);
            return new Magnum(magnumType);
        }
    }
        @Override
    public double getProfit () {

        return profit;
    }
}


