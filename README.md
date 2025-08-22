# Article-JPA

##  Description
**Article-JPA** est une application Java utilisant **JPA** (Java Persistence API) pour gérer un catalogue d'articles.  
Elle permet d'effectuer des opérations CRUD (Créer, Lire, Mettre à jour, Supprimer) sur une base de données relationnelle, offrant ainsi une interface simple pour interagir avec les données.

## Fonctionnalités principales
- **Gestion des articles** : ajouter, modifier, supprimer et consulter les informations des articles.
- **Connexion à la base de données** : utilisation de JPA pour interagir avec une base relationnelle.
- **Interface console** : interaction via une interface en ligne de commande simple.
- **CRUD complet** : implémentation des opérations de gestion des données.
- **Fiabilité** : validation de l'entrée utilisateur pour éviter les erreurs de base de données.

## Architecture & Technologies
- **Langage** : Java (100 %)
- **JPA** : Java Persistence API pour la gestion des entités et des transactions.
- **Structure** :
  - `src/` → code source principal
  - `pom.xml` → fichier de configuration Maven
  - `.gitignore` → fichiers à ignorer pour le versionnement

## Installation
1. Clonez ou téléchargez le projet :
    ```bash
    git clone https://github.com/khayatti1/Article-JPA.git
    ```
2. Accédez au répertoire du projet :
    ```bash
    cd Article-JPA
    ```
3. Compilez le projet avec Maven :
    ```bash
    mvn clean install
    ```
4. Configurez votre base de données en exécutant le script SQL fourni pour créer les tables nécessaires.
5. Modifiez les paramètres de connexion à la base de données dans le code source si nécessaire.
6. Lancez l'application :
    ```bash
    mvn exec:java
    ```

## Utilisation
- Lancez l'application depuis votre IDE ou via Maven.
- Interagissez avec le menu console pour effectuer des opérations sur les articles.
- Ajoutez, modifiez ou supprimez des articles selon vos besoins.
- Les modifications sont directement appliquées à la base de données.


