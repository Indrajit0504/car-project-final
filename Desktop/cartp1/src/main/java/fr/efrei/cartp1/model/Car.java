package fr.efrei.cartp1.model;

import javax.persistence.*;

@Entity
public class Car extends Vehicule {

    private int numberOfSeats;

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public Car(String plateNumber, int numberOfSeats) {
        super();
        this.numberOfSeats = numberOfSeats;
    }
}
