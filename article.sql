-- Assurez-vous de sélectionner la base de données appropriée
USE article;

-- Création de la table utilisateurs
CREATE TABLE utilisateurs (
                              id INT AUTO_INCREMENT PRIMARY KEY,
                              nom VARCHAR(255) NOT NULL,
                              email VARCHAR(255) NOT NULL,
                              mot_de_passe VARCHAR(255) NOT NULL
);

-- Création de la table articles
CREATE TABLE articles (
                          id INT AUTO_INCREMENT PRIMARY KEY,
                          titre VARCHAR(255) NOT NULL,
                          contenu TEXT NOT NULL,
                          date_de_publication DATE NOT NULL,
                          auteur_id INT,
                          FOREIGN KEY (auteur_id) REFERENCES utilisateurs(id)
);

-- Création de la table commentaires
CREATE TABLE commentaires (
                              id INT AUTO_INCREMENT PRIMARY KEY,
                              contenu TEXT NOT NULL,
                              date_de_publication DATE NOT NULL,
                              auteur_id INT,
                              article_id INT,
                              FOREIGN KEY (auteur_id) REFERENCES utilisateurs(id),
                              FOREIGN KEY (article_id) REFERENCES articles(id)
);

-- Création de la table catégories
CREATE TABLE categories (
                            id INT AUTO_INCREMENT PRIMARY KEY,
                            nom VARCHAR(100) NOT NULL
);

-- Création de la table articles_categories pour gérer les relations entre articles et catégories
CREATE TABLE articles_categories (
                                     article_id INT,
                                     categorie_id INT,
                                     FOREIGN KEY (article_id) REFERENCES articles(id),
                                     FOREIGN KEY (categorie_id) REFERENCES categories(id)
);

-- Création de la table tags
CREATE TABLE tags (
                      id INT AUTO_INCREMENT PRIMARY KEY,
                      nom VARCHAR(100) NOT NULL
);

-- Création de la table articles_tags pour gérer les relations entre articles et tags
CREATE TABLE articles_tags (
                               article_id INT,
                               tag_id INT,
                               FOREIGN KEY (article_id) REFERENCES articles(id),
                               FOREIGN KEY (tag_id) REFERENCES tags(id)
);

-- Création de la table likes
CREATE TABLE likes (
                       id INT AUTO_INCREMENT PRIMARY KEY,
                       utilisateur_id INT,
                       article_id INT,
                       commentaire_id INT,
                       FOREIGN KEY (utilisateur_id) REFERENCES utilisateurs(id),
                       FOREIGN KEY (article_id) REFERENCES articles(id),
                       FOREIGN KEY (commentaire_id) REFERENCES commentaires(id)
);

-- Fin de la création des tables
