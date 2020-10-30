package fr.efrei.cartp1.model;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
public class Rent {

    @Id
    private int id_Rent;
    private Date beginRent;
    private Date endRent;
    private Vehicule vehicule;
    private Person person;
    
    public int getId_Rent() {
        return id_Rent;
    }

    public Date getBeginRent() {
        return beginRent;
    }

    public Date getEndRent() {
        return endRent;
    }

    public void setId_Rent(int id_Rent) {
        this.id_Rent = id_Rent;
    }

    public void setBeginRent(Date beginRent) {
        this.beginRent = beginRent;
    }

    public void setEndRent(Date endRent) {
        this.endRent = endRent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rent rent = (Rent) o;
        return Objects.equals(id_Rent, rent.id_Rent) &&
                Objects.equals(beginRent, rent.beginRent) &&
                Objects.equals(endRent, rent.endRent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id_Rent, beginRent, endRent);
    }


    @ManyToOne
    public Vehicule getVehicule() {
        return vehicule;
    }

    public void setVehicule(Vehicule vehicule) {
        this.vehicule = vehicule;
    }

    @ManyToOne
    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
