package Prototype.Shallow;

import java.util.HashMap;
import java.util.Map;

public class ColorStore {
    public static Map<String, Color> color_map = new HashMap<String, Color>();


    public static Color getColor(String color_name) {
        return (Color) color_map.get(color_name).clone();
    }
}
