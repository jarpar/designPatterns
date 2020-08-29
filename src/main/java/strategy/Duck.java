package strategy;

public class Duck {
    private Flying flying;
    private Swimming swimming;
    private Quacking quacking;

    public void goSwim() {
        swimming.swimm();
    }

    public void goFly() {
        flying.fly();

    }

    public Duck(Flying flying, Swimming swimming, Quacking quacking) {
        this.flying = flying;
        this.swimming = swimming;
        this.quacking = quacking;
    }
}
