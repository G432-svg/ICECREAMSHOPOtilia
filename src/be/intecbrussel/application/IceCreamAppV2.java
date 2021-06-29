package be.intecbrussel.application;

import be.intecbrussel.eatables.Cone;
import be.intecbrussel.eatables.Flavor;
import be.intecbrussel.eatables.IceRocket;
import be.intecbrussel.sellers.IceCreamCar;
import be.intecbrussel.sellers.IceCreamSalon;
import be.intecbrussel.sellers.PriceList;
import be.intecbrussel.sellers.Stock;

public class IceCreamAppV2 {
    public static void main(String[] args) {

        PriceList priceList = new PriceList(1,1.2,1.5);
        IceCreamCar iceCreamSeller = new IceCreamCar(priceList) ;

        IceRocket iceRocket = new IceRocket(21);



    }

    public IceCreamAppV2() {


    }



}



