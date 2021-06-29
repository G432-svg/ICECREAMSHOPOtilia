package be.intecbrussel.eatables;

public class Cone implements Eatable{
    protected Flavor[] balls;

    public Cone() {
        super();
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
        Eatable.super.eat();
    }

    public void setBalls(int vanilla, int pistache, int lemon) {
    }
}
