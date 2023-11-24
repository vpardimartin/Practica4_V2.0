package org.example;

import org.hibernate.Session;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Logger.getLogger("org.hibernate").setLevel(Level.OFF);
        try(Session ignored = HibernateUtil.openSession()){
            System.out.println("\nSe inicio la sesión.");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
