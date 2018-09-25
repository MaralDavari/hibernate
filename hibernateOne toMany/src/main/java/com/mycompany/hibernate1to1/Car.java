package com.mycompany.hibernate1to1;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Car {

    @Id
    private int carId;
    private String model;
    private String year;

    @ManyToOne
    private Person person;

    public int getCarId() {
        return carId;
    }

    public void setCarId(int carId) {
        this.carId = carId;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public String toString() {
        return "Car{" + "carId=" + carId + ", model=" + model + ", year=" + year + ", person=" + person + '}';
    }

}
