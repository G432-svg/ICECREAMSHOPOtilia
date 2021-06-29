package be.intecbrussel.sellers;

import be.intecbrussel.eatables.*;

public class IceCreamCar implements IceCreamSeller {

    protected PriceList priceList;
    protected Stock stock;
    protected double profit;

    public IceCreamCar(PriceList priceList) {
    }

    public IceCreamCar(PriceList priceList, Stock stock, double profit) {
        this.priceList = priceList;
        this.stock = stock;
        this.profit = profit;
    }

    @Override
    public Cone orderCone(Flavors[] flavors) {

        return flavors;
    }

    public Cone prepareCone(Flavor flavor) {
        return flavor;

    }

    @Override
    public double orderIceRocket(IceRocket iceRocket) {
        return iceRocket;
    }

    public IceRocket prepareRocket(IceRocket iceRocket) {
        return iceRocket;

    }

    @Override
    public double orderMagnum(MagnumType magnumType) throws NoMoreIceCreamException{
        try{
            //Possible throw of NoMoreIceCreamException
        }
        catch (NoMoreIceCreamException nmice){
            System.out.println(nmice.getMessage());
            throw nmice;

        }

        return magnumType;
    }

    public void prepareMagnum(MagnumType magnumType) {
        return magnumType;

    }

    @Override
    public double getProfit() {
        return IceCreamSeller.super.getProfit();
    }

}
