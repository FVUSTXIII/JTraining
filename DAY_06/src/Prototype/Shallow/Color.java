package Prototype.Shallow;

public abstract class Color implements Cloneable{
    protected String color_name;
    abstract void addColor();

    public Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}
