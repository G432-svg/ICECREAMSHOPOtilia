package be.intecbrussel.eatables;

import java.util.Arrays;

public class Cone implements Eatable{
    private Flavor[] balls;

    public Cone() {

    }

    public Cone(Flavor[] balls) {
        this.balls = balls;
    }

    public Flavor[] getBalls() {
        return balls;
    }

    public void setBalls(Flavor[] balls) {

        this.balls = balls;
    }

    @Override
    public void eat() {
        System.out.println("I am eating an ice cream cone with:");
        System.out.println(Arrays.toString(balls));
    }
    public enum Flavor {
        //list of  balls flavors(price i):
        //Strawberry:1,Banana:1,Chocolate:1,
        //Vanilla:1,Lemon:1,Straciatella:1,
        //Mokka:1,Pistache:1


        STRAWBERRY(1),BANANA(1),
        CHOCOLATE(1),VANILLA(1),LEMON(1),
        STRACIATELLA(1),MOKKA(1),PISTACHE(1);

        private double price;


        Flavor(double price) {
            this.price = price;

        }



        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }



    }




}
