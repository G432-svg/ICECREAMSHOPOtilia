package be.intecbrussel.sellers;

import be.intecbrussel.eatables.*;

public interface IceCreamSeller extends Profitable{


    public default void orderCone(Cone[] Flavor) {

    }

    @Override
    default double getProfit() {
        return Profitable.super.getProfit();
    }

    default void orderIceRocket() throws NoMoreIceCreamException {
        orderIceRocket();
    }

    public default void orderIceRocket(IceRocket iceRocket) throws NoMoreIceCreamException {


        try {
            /* Possible throw of NoMoreIceCreamException */
        } catch (NoMoreIceCreamException nmice) {
            System.out.println(nmice.getMessage());
            throw nmice;

        }
    }

    public default void orderMagnum(MagnumType magnumType) {

    }

}
