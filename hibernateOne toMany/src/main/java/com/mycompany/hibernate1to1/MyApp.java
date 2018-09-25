package com.mycompany.hibernate1to1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MyApp {

    public static void main(String[] args) {

        Person person = new Person();
        Car car = new Car();
        Car car2 = new Car();
        car.setCarId(1);
        car.setModel("Kia");
        car.setYear("1990");

        car2.setCarId(2);
        car2.setModel("BMW");
        car2.setYear("2018");

        person.setPersonId(201);
        person.setName("Maral");
        person.setLname("Davari");

        person.getCar().add(car);
        person.getCar().add(car2);

        car.setPerson(person);
        car2.setPerson(person);

        Configuration confige = new Configuration().configure();
        confige.addAnnotatedClass(Car.class).addAnnotatedClass(Person.class);

        SessionFactory sessionfactory = confige.buildSessionFactory();

        Session session = sessionfactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(car);
        session.save(car2);
        session.save(person);
        transaction.commit();
        session.close();
        sessionfactory.close();

    }

}
