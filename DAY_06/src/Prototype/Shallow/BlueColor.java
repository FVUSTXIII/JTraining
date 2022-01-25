package Prototype.Shallow;

public class BlueColor extends Color{
    public BlueColor() {
        this.color_name = "Blue";
    }
    @Override
    public void addColor() {
        System.out.println("Blue color added");
    }
}
