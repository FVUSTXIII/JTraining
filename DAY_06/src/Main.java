import Prototype.Deep.PlasticTree;
import Prototype.Shallow.BlackColor;
import Prototype.Shallow.BlueColor;
import Prototype.Shallow.Color;
import Prototype.Shallow.ColorStore;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        //DEEP
        PlasticTree plasticTree = new PlasticTree(134.54, 189.4);
        plasticTree.setPosition("20.740284, -103.347971");

        PlasticTree anotherPlasticTree = (PlasticTree) plasticTree.Copy();
        System.out.println(plasticTree);
        System.out.println(anotherPlasticTree);


        ColorStore.color_map.put("blue", new BlueColor());
        ColorStore.color_map.put("black", new BlackColor());
        Color n_c = ColorStore.getColor("blue");
        Color n_c_1 = (Color) n_c.clone();
        n_c_1.clone();
        //SHALLOW


    }
}
