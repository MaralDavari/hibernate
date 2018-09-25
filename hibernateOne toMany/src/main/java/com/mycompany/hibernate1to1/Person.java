package com.mycompany.hibernate1to1;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Person {

    @Id
    private int personId;
    private String name;
    private String lname;

    @OneToMany(mappedBy = "person")
    private List<Car> car = new ArrayList<Car>();

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public List<Car> getCar() {
        return car;
    }

    public void setCar(List<Car> car) {
        this.car = car;
    }

    @Override
    public String toString() {
        return "Person{" + "personId=" + personId + ", name=" + name + ", lname=" + lname + ", car=" + car + '}';
    }

}
