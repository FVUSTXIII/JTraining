package Prototype.Deep;

public class PineTree extends Tree {

    public PineTree(double mass, double height) {
        super(mass, height);
    }

    @Override
    public Tree Copy() {
        PineTree pineTreeClone = new PineTree(this.getMass(), this.getHeight());
        pineTreeClone.setPosition(this.getPosition());
        return pineTreeClone;
    }
}
