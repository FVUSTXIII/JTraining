package com.faust.army;

public class CircleOfDeath {
    private Soldier first_soldier;
    private Soldier last_soldier_standing;
    private static int survivors = 0;

    public CircleOfDeath() {
        this.first_soldier = null;
        this.last_soldier_standing = null;
    }
    public CircleOfDeath(int army_size) {
        int aux_ = 0;

        if (army_size <= aux_) {
            army_size += aux_ + 1;
        }
        while (aux_ < army_size) {
            AddSolider(aux_+1);
            aux_++;
        }
    }
    public void simulateCollectiveSuicide(int position) {
        int i = 0;
        Soldier sword_holder = getSoldier(position);
        System.out.println("Hello, " + sword_holder.getRank() + " " + sword_holder.getLast_name());
        while (sword_holder.getNext_soldier() != sword_holder) {
            if (i%2 == 0) {
                DeleteNext(sword_holder);
            } else {
                sword_holder = sword_holder.getNext_soldier();
            }
            i++;
            survivors--;
        }
        System.out.println("If you want to survive you might want to swap places with: \n Rank: " + sword_holder.getRank()
                + "\nName: " + sword_holder.getFirst_name() + " " + sword_holder.getLast_name()
                + "\nPosition: " + sword_holder.getPosition());
    }
    public Soldier getSoldier(int position) {
        Soldier aux = first_soldier;
        while (aux.getPosition() != position) {
            aux = aux.getNext_soldier();
        }
        return aux;
    }
    public void DeleteNext(Soldier current_soldier) {
        Soldier soldado_to_kill = current_soldier.getNext_soldier();
        current_soldier.setNext_soldier(soldado_to_kill.getNext_soldier());
        survivors--;
    }

    public void AddSolider(int position) {
        Soldier new_soldier = new Soldier(position);
        if (survivors == 0) {
            this.first_soldier = this.last_soldier_standing = new_soldier;
            this.last_soldier_standing.setNext_soldier(this.first_soldier);
        } else {
            this.last_soldier_standing.setNext_soldier(new_soldier);
            new_soldier.setNext_soldier(this.first_soldier);
            this.last_soldier_standing = new_soldier;
        }
        survivors++;
    }
    public void show() {
        Soldier aux_soldier = first_soldier;
        System.out.println("These are the current survivors and their positions: ");
        do {
            System.out.println("Rank: " + aux_soldier.getRank() +
                    "\nName: " + aux_soldier.getFirst_name() + " " + aux_soldier.getLast_name() +
                    "\nPosition: " + aux_soldier.getPosition() +
             "\n");

            aux_soldier = aux_soldier.getNext_soldier();
        } while (aux_soldier != first_soldier);
    }
    public Soldier getFirst_soldier() {
        return first_soldier;
    }

    public void setFirst_soldier(Soldier first_soldier) {
        this.first_soldier = first_soldier;
    }

    public Soldier getLast_soldier_standing() {
        return last_soldier_standing;
    }

    public void setLast_soldier_standing(Soldier last_soldier_standing) {
        this.last_soldier_standing = last_soldier_standing;
    }

    public int getSurvivors() {
        return survivors;
    }



}
