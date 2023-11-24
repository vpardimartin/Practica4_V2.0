package org.practica4;
// package con el nombre que tengas, buscar en App

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
    static SessionFactory sessionFactory = null;
    public static SessionFactory createSessionFactory() {
        if(sessionFactory == null){
            sessionFactory = new Configuration().configure().buildSessionFactory();
        }
        return sessionFactory;
    }
    public static Session openSession() throws Exception{
        sessionFactory = createSessionFactory();
        Session session = sessionFactory.openSession();
        if(session == null) throw new Exception("Error abriendo sesión.");
        return session;
    }


}
