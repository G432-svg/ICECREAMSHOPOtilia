package be.intecbrussel.sellers;

import be.intecbrussel.eatables.IceRocket;

public class Stock{
    private int iceRockets = 10;
    private int cones = 20;
    private int balls = 10;
    private int magni = 20;


    public int getIceRockets(){
        return iceRockets;
    }

    public void setIceRockets(int iceRockets) {
        this.iceRockets = iceRockets;
    }


    public int getCones() {
        return cones;
    }

    public void setCones(int cones) {
        this.cones = cones;
    }


    public int getBalls() {
        return balls;
    }

    public void setBalls(int balls) {
        this.balls = balls;
    }


    public int getMagni(){
        return magni;
    }

    public void setMagni(int magni) {
        this.magni = magni;
    }
}
