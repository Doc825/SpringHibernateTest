package com.davidkhachatrian.springhibernate;

import com.davidkhachatrian.springhibernate.entity.Student;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.sql.Date;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure("application.properties")
                .addAnnotatedClass(Student.class).buildSessionFactory();
    }
}
