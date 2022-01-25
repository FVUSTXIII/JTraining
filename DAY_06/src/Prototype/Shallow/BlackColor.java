package Prototype.Shallow;

public class BlackColor extends Color{
    public BlackColor() {
        this.color_name = "Black";
    }
    @Override
    public void addColor() {
        System.out.println("Black color added");
    }
}
