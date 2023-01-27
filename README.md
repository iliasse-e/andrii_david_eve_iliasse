# Application star war mission finale

Cette application a été conçue par Andrii, David, Eve & Iliasse

## Technologies :

JAVA (JDK 17), JEE, Spring web, Spring Data, JPA Hibernate, H2

IDE : Eclipse

## Architecture :

Modèle MVC, couche DAO, base de donnée (MySQL)

## Etapes de la construction d'application

### 1 - Creation des entitées

- Création du modèle (Class JAVA)
- Ajout des annotations JPA qui vont permettre l'ORM (la création des entitées à partir des classes)

### 2 - Création de la couche DAO

- Création des Repositories : </br>
Ces interfaces JPA vont permettre de fournir des fonctionnalités de base pour les opérations CRUD (create, read, update, delete) et de tri pour les récupérations de données dans une base de données.
L'interface JpaRepository va donc dispenser le developpeur d'écrire lui même le code SQL pour communiquer avec la base de donnée. </br>
Exemple de méthodes : findAll, findOne, delete, save, findBy<Property>

### 3 - Création de la couche Service