package fr.efrei.cartp1.model;

import javax.persistence.*;


@Entity
public class Van extends Vehicule {

    private float maxWeight;


    public float getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(float maxWeight) {
        this.maxWeight = maxWeight;
    }

    public Van(String plateNumber, float maxWeight) {
        super();
        this.maxWeight = maxWeight;
    }
    public Van() {

    }

}
