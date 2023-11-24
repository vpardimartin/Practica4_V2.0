package org.practica4;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

public class CargaDeDatos {
    public static void dropAndCreateTableEL_DATO(String EL_DATO) {
        switch (EL_DATO){
            case "Héroe":
                try (Session session = HibernateUtil.openSession()) {
                    Transaction transaction = session.beginTransaction();

                    // Drop foreign key constraints
                    // session.createSQLQuery("ALTER TABLE escenarios DROP FOREIGN KEY  heroeId").executeUpdate();
                    // Add more statements if other tables reference 'heroes'

                    // Realizar el drop table
                    session.createSQLQuery("DROP TABLE IF EXISTS heroes").executeUpdate();

                    // Realizar el create table
                    session.createSQLQuery("""
                            CREATE TABLE `heroes` (
                                                      `HeroesId` int NOT NULL AUTO_INCREMENT,
                                                      `Nombre_heroe` varchar(255) NOT NULL,
                                                      `Poder_heroe_id` int DEFAULT NULL,
                                                      `EscenarioFavorito_heroe_id` int DEFAULT NULL,
                                                      `Ataque` double DEFAULT NULL,
                                                      `Defensa` double DEFAULT NULL,
                                                      `Vida` double DEFAULT NULL,
                                                      `Nivel` int DEFAULT NULL,
                                                      `Fortalezas` varchar(255) DEFAULT NULL,
                                                      `Debilidades` varchar(255) DEFAULT NULL,
                                                      `Alias` varchar(255) DEFAULT NULL,
                                                      PRIMARY KEY (`HeroesId`),
                                                      KEY `Poder_heroe_id` (`Poder_heroe_id`),
                                                      KEY `EscenarioFavorito_heroe_id` (`EscenarioFavorito_heroe_id`),
                                                      CONSTRAINT `heroes_ibfk_1` FOREIGN KEY (`Poder_heroe_id`) REFERENCES `poderes` (`PoderId`),
                                                      CONSTRAINT `heroes_ibfk_2` FOREIGN KEY (`EscenarioFavorito_heroe_id`) REFERENCES `escenarios` (`EscenariosId`)
                            ) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;""").executeUpdate();

                    transaction.commit();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
        }

    }

    public static void cargarEL_DATO(String EL_DATO) {
        dropAndCreateTableEL_DATO(EL_DATO);
        Transaction t = null;
        try (Session session = HibernateUtil.openSession()) {
            t = session.beginTransaction();

            // Eliminar los datos existentes
            Query deleteQuery = session.createQuery("DELETE FROM HeroesClass ");
            deleteQuery.executeUpdate();

            // Insertar nuevos datos
            HeroesClass heroe1 = new HeroesClass();
            heroe1.setAlias("Spider-Man");
            heroe1.setAtaque(18.5);
            heroe1.setDefensa(7.5);
            heroe1.setVida(60.0);
            heroe1.setNivel(1);
            heroe1.setFortalezas("Sentido aracnido");
            heroe1.setDebilidades("Ninguna");
            heroe1.setNombreHeroe("Peter Parker");

            HeroesClass heroe2 = new HeroesClass();
            heroe2.setAlias("Batman");
            heroe2.setAtaque(18.5);
            heroe2.setDefensa(7.5);
            heroe2.setVida(60.0);
            heroe2.setNivel(1);
            heroe2.setFortalezas("Otro");
            heroe2.setDebilidades("Otro");
            heroe2.setNombreHeroe("Bruce Wayne");

            session.save(heroe1);
            session.save(heroe2);

            t.commit();
        } catch (Exception e) {
            e.printStackTrace(System.err);
            if (t != null) {
                t.rollback();
            }
        }
    }

}
