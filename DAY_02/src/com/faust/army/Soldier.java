package com.faust.army;
import java.util.Random;
public class Soldier {
    private String rank;
    private final static String[] ranks = {"PVT", "PV2", "PFC", "SPC", "CPL", "SGT", "SSG", "SFC", "MSG", "1SG", "SGM", "CSM",
            "SMA", "WO1", "CW2", "CW3", "CW4", "CW5", "2LT", "1LT", "CPT", "MAJ", "LTC", "COL", "BG", "MG", "LTG", "GEN",
            "GA"};
    private final static String[] first_names = {"David", "Faust", "Neil", "Roderick", "Jhon", "Sabin", "Gerardo", "Thomas", "Ryan", "William"};
    private final static String[] last_names = {"Rodriguez", "Johnson", "Davis", "Stewart", "Heinrich", "Ramirez", "Volkov"};
    private String first_name;
    private String last_name;
    private int position;
    private Soldier next_soldier;

    public Soldier(int position) {
        Random rand = new Random();

        this.rank = ranks[rand.nextInt(ranks.length)];

        this.first_name = first_names[rand.nextInt(first_names.length)];

        this.last_name = last_names[rand.nextInt(last_names.length)];
        this.position = position;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public Soldier getNext_soldier() {
        return next_soldier;
    }

    public void setNext_soldier(Soldier next_soldier) {
        this.next_soldier = next_soldier;
    }
}
