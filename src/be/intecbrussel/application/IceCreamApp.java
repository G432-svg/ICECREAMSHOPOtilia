package be.intecbrussel.application;

import be.intecbrussel.eatables.*;
import be.intecbrussel.sellers.IceCreamSalon;
import be.intecbrussel.sellers.PriceList;

public class IceCreamApp {
    public static void main(String[] args) {
        PriceList priceList = new PriceList(1,1.2,1.5);
        IceCreamSalon iceCreamSeller;
        iceCreamSeller = new IceCreamSalon();



        Eatable[] eatables = new IceCream [Cone/MagnumType/IceRocket];


        Cone cone = new Cone(VANILLA,PISTACHE,LEMON);
        cone.eat();
        cone.numberOfBalls = 3;
        System.out.println("I'm eating an cone with:" + cone.getNumberOfBalls());

        Magnum magnum = new Magnum(BLACKCHOCOLATE);
        magnum.eat();
        System.out.println("I'm eating an Magnum:" +"BLACKCHOCOLADE");

        IceRocket iceRocket = new IceRocket(21);
        iceRocket.eat();
        System.out.println("I'm eating an IceRocket:" + "yumi, yumi");

        Cone cone = new Cone(Flavor.values());
        cone.setBalls(VANILLA,PISTACHE,LEMON);

        System.out.println("Cone with: " + cone.setBalls(vanilla,pistache,lemon));



    }


}
