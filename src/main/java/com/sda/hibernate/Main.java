package com.sda.hibernate;

import com.sda.hibernate.entity.Category;
import com.sda.hibernate.entity.Job;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

    private static final SessionFactory sessionFactory;

    static {
        try {
            Configuration configuration = new Configuration();
            configuration.configure();
            sessionFactory = configuration.buildSessionFactory();
        } catch (Throwable ex) {
            throw new ExceptionInInitializerError(ex);
        }
    }

    private static Session getSesion() {
        return sessionFactory.openSession();
    }

    public static void main(String[] args) {

        Category category = new Category("pelen_etat");

        Session session = getSesion();
        Transaction tx = session.getTransaction();


        Job job = new Job("1", "Askal", "kf", "askal.biuro.pl",
                "monter","__","__","345","N","Y",
                "mail@mail.com","__","__","_", null);
        job.setCategory(category);

        tx.begin();

        session.save(job);
        tx.commit();

        session.close();
    }
}
