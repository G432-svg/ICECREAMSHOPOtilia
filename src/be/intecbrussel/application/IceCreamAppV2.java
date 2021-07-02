package be.intecbrussel.application;
import be.intecbrussel.eatables.*;
import be.intecbrussel.exeptions.NoMoreIceCreamException;
import be.intecbrussel.sellers.IceCreamCar;
import be.intecbrussel.sellers.IceCreamSeller;
import be.intecbrussel.sellers.PriceList;
import be.intecbrussel.sellers.Stock;

import java.io.FileOutputStream;

public class IceCreamAppV2 {
    public static void main(String[] args) {

        Stock stock = new Stock();
        double profit = 0;


        PriceList priceList = new PriceList(1,1.2,1.5);

        IceCreamSeller iceCreamCar = new IceCreamCar(priceList, stock, profit);

        Cone.Flavor[]balls = {Cone.Flavor.STRAWBERRY, Cone.Flavor.PISTACHE, Cone.Flavor.LEMON};



        Magnum magnum = iceCreamCar.orderMagnum(Magnum.MagnumType.ALPINENUTS);



        IceRocket iceRocket = iceCreamCar.orderIceRocket();



        Eatable[] eatables = {iceCreamCar.orderCone(balls),magnum,iceRocket};
        for(Eatable e:eatables){
            e.eat();
        }
        System.out.println(iceCreamCar.getProfit());

    }


}










