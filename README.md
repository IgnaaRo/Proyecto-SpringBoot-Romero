# Proyecto-SpringBoot-Romero

Base de Datos

CREATE TABLE ejemplo2.usuario ( id BIGINT NOT NULL AUTO_INCREMENT , nombre VARCHAR(40) NULL DEFAULT NULL , apellido VARCHAR(40) NULL DEFAULT NULL , telefono VARCHAR(40) NULL DEFAULT NULL , email VARCHAR(255) NULL DEFAULT NULL , contraseña VARCHAR(40) NULL DEFAULT NULL , PRIMARY KEY (id)) ENGINE = InnoDB;
CREATE TABLE empleados.empleado ( id BIGINT NOT NULL AUTO_INCREMENT , nombre VARCHAR(40) NULL DEFAULT NULL , apellido VARCHAR(40) NULL DEFAULT NULL , telefono VARCHAR(40) NULL DEFAULT NULL , email VARCHAR(255) NULL DEFAULT NULL , contraseña VARCHAR(40) NULL DEFAULT NULL, turno VARCHAR(40) NULL DEFAULT NULL , PRIMARY KEY (id)) ENGINE = InnoDB;
