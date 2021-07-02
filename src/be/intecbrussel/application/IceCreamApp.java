package be.intecbrussel.application;
import be.intecbrussel.eatables.*;
import be.intecbrussel.sellers.IceCreamSalon;
import be.intecbrussel.sellers.IceCreamSeller;
import be.intecbrussel.sellers.PriceList;

public class IceCreamApp {
    public static void main(String[] args) {
        PriceList priceList = new PriceList(1,1.2,1.5);

        IceCreamSeller iceCreamSalon = new IceCreamSalon(priceList,0);

        Cone.Flavor[]balls = {Cone.Flavor.VANILLA, Cone.Flavor.PISTACHE, Cone.Flavor.LEMON};


        Cone cone = iceCreamSalon.orderCone(balls);


        Magnum magnum = iceCreamSalon.orderMagnum(Magnum.MagnumType.BLACKCHOCOLATE);


        IceRocket iceRocket = iceCreamSalon.orderIceRocket();


        Eatable[] eatables = {cone,magnum,iceRocket};
        for(Eatable e:eatables){
            e.eat();
        }
        System.out.println(iceCreamSalon.getProfit());

    }

}
