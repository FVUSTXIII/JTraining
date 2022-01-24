import java.util.Comparator;

public class Candy {
    private String name;
    private double glucose_level;

    public Candy(String name, double glucose_level) {
        this.name = name;
        this.glucose_level = glucose_level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGlucose_level() {
        return glucose_level;
    }

    public void setGlucose_level(double glucose_level) {
        this.glucose_level = glucose_level;
    }
}
class NameComparator implements Comparator<Candy> {

    @Override
    public int compare(Candy o1, Candy o2) {
        for (int i = 0; i < o1.getName().length() && i < o2.getName().length(); i++) {
            if ((int) o1.getName().charAt(i) == (int) o2.getName().charAt(i)) {
                continue;
            } else {
                return (int) o1.getName().charAt(i) - (int) o2.getName().charAt(i);
            }
        }
        if (o1.getName().length()  < o2.getName().length() || o1.getName().length() > o2.getName().length()) {
            return (o1.getName().length() - o2.getName().length());
        }
        return 0;
    }
}
class GlucoseLevelComparator implements Comparator<Candy> {

    @Override
    public int compare(Candy o1, Candy o2) {
        if (o1.getGlucose_level() < o2.getGlucose_level()) return -1;
        if (o1.getGlucose_level() > o2.getGlucose_level()) return 1;
        else return 0;
    }
}