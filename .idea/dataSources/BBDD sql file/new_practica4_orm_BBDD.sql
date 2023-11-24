drop database if exists new_practica4_orm;
create database new_practica4_orm;
use new_practica4_orm;

-- Crear la tabla 'tipos'
CREATE TABLE `tipos` (
                         `TipoId` int NOT NULL AUTO_INCREMENT,
                         `Nombre_tipo` varchar(50) NOT NULL,
                         `Descripcion_tipo` text,
                         PRIMARY KEY (`TipoId`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- Crear la tabla 'poderes'
CREATE TABLE `poderes` (
                           `PoderId` int NOT NULL AUTO_INCREMENT,
                           `Nombre_poder` varchar(255) NOT NULL,
                           `Descripcion_poder` text,
                           `Tipo_poder_id` int DEFAULT NULL,
                           `Asignado` tinyint(1) DEFAULT '0',
                           `Tipo_entidad` varchar(7) DEFAULT NULL,
                           PRIMARY KEY (`PoderId`),
                           KEY `Tipo_poder_id` (`Tipo_poder_id`),
                           CONSTRAINT `poderes_ibfk_1` FOREIGN KEY (`Tipo_poder_id`) REFERENCES `tipos` (`TipoId`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- Crear la tabla 'escenarios'
CREATE TABLE `escenarios` (
                              `EscenariosId` int NOT NULL AUTO_INCREMENT,
                              `Nombre_escenario` varchar(255) NOT NULL,
                              `Descripcion_escenario` text,
                              PRIMARY KEY (`EscenariosId`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- Crear la tabla 'heroes'
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
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- Crear la tabla 'villanos'
CREATE TABLE `villanos` (
                            `VillanoId` int NOT NULL AUTO_INCREMENT,
                            `Nombre_villano` varchar(255) NOT NULL,
                            `Poder_villano_id` int DEFAULT NULL,
                            `EscenarioFavorito_villano_id` int DEFAULT NULL,
                            `Ataque` double DEFAULT NULL,
                            `Defensa` double DEFAULT NULL,
                            `Vida` double DEFAULT NULL,
                            `Nivel` int DEFAULT NULL,
                            `Fortalezas` varchar(255) DEFAULT NULL,
                            `Debilidades` varchar(255) DEFAULT NULL,
                            `Alias` varchar(255) DEFAULT NULL,
                            PRIMARY KEY (`VillanoId`),
                            KEY `Poder_villano_id` (`Poder_villano_id`),
                            KEY `EscenarioFavorito_villano_id` (`EscenarioFavorito_villano_id`),
                            CONSTRAINT `villanos_ibfk_1` FOREIGN KEY (`Poder_villano_id`) REFERENCES `poderes` (`PoderId`),
                            CONSTRAINT `villanos_ibfk_2` FOREIGN KEY (`EscenarioFavorito_villano_id`) REFERENCES `escenarios` (`EscenariosId`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- Insertar datos en la tabla 'tipos'
INSERT INTO tipos (Nombre_tipo, Descripcion_tipo) VALUES
                                                      ('Logia', 'Aumenta el ataque +5'),
                                                      ('Zoan', 'Aumenta la defensa +5'),
                                                      ('Paramecia', 'Aumenta la vida +5');
-- Insertar datos en la tabla 'poderes'
INSERT INTO poderes (Nombre_poder, Descripcion_poder, Tipo_poder_id) VALUES
                                                                         ('Poder1', 'Descripción del Poder 1', 1),
                                                                         ('Poder2', 'Descripción del Poder 2', 2),
                                                                         ('Poder3', 'Descripción del Poder 3', 3),
                                                                         ('Poder4', 'Descripción del Poder 4', 1);
-- Insertar datos en la tabla 'escenarios'
INSERT INTO escenarios (Nombre_escenario, Descripcion_escenario) VALUES
                                                                     ('Escenario1', 'Descripción del Escenario 1'),
                                                                     ('Escenario2', 'Descripción del Escenario 2'),
                                                                     ('Escenario3', 'Descripción del Escenario 3'),
                                                                     ('Escenario4', 'Descripción del Escenario 4');
-- Insertar datos en la tabla 'heroes'
INSERT INTO heroes (Nombre_heroe, Poder_heroe_id, EscenarioFavorito_heroe_id, Ataque, Defensa, Vida, Nivel, Fortalezas, Debilidades, Alias) VALUES
                                                                                                                                                ('Heroe1', 1, 1, 100, 50, 200, 10, 'Velocidad', 'Agua', 'Alias1'),
                                                                                                                                                ('Heroe2', 2, 2, 120, 60, 180, 12, 'Fuerza', 'Fuego', 'Alias2'),
                                                                                                                                                ('Heroe3', 3, 3, 80, 40, 220, 8, 'Invisibilidad', 'Electricidad', 'Alias3'),
                                                                                                                                                ('Heroe4', 4, 4, 150, 70, 250, 15, 'Vuelo', 'Hielo', 'Alias4');
-- Insertar datos en la tabla 'villanos'
INSERT INTO villanos (Nombre_villano, Poder_villano_id, EscenarioFavorito_villano_id, Ataque, Defensa, Vida, Nivel, Fortalezas, Debilidades, Alias) VALUES
                                                                                                                                                        ('Villano1', 1, 1, 90, 40, 180, 8, 'Control mental', 'Luz solar', 'AliasV1'),
                                                                                                                                                        ('Villano2', 2, 2, 110, 55, 200, 11, 'Transformación', 'Oscuridad', 'AliasV2'),
                                                                                                                                                        ('Villano3', 3, 3, 70, 30, 160, 7, 'Teletransporte', 'Ácido', 'AliasV3'),
                                                                                                                                                        ('Villano4', 4, 4, 130, 65, 220, 14, 'Manipulación temporal', 'Sombra', 'AliasV4');

