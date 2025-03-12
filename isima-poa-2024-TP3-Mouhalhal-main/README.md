
# Projet de Gestion des Arrêts de Métro

## Description

Ce projet permet de charger, afficher et trier une liste d'arrêts de métro depuis un fichier texte. Chaque arrêt de métro contient un identifiant, des coordonnées géographiques (longitude et latitude), un nom, un arrondissement, et un type (par exemple, "métro").

Le programme offre un menu interactif simple qui permet de :
- Charger les arrêts de métro depuis un fichier texte.
- Afficher la liste des arrêts de métro.
- Trier les arrêts par identifiant.
- Quitter l'application.

## Prérequis

- **Java 8** ou une version supérieure.
- Un fichier texte formaté correctement pour charger les arrêts de métro.

### Exemple de format de fichier d'entrée

Le fichier texte doit suivre le format suivant pour chaque ligne :

```
id#longitude#latitude#nom#arrondissement#type
```

Exemple :

```
1#2.3387128#48.8844176#Abbesses#PARIS-18EME#metro
2#2.3522219#48.856614#Châtelet#PARIS-1ER#metro
```

## Installation

1. **Cloner le projet** :

   ```bash
   git clone git@github.com:ol-v-er/isima-poa-2024-TP3-Mouhalhal.git
   cd isima-poa-2024-TP3-Mouhalhal
   ```

2. **Compiler les fichiers Java** :

   Assurez-vous de compiler les classes avant d'exécuter le programme :

   ```bash
   javac -d out src/isima/*.java
   ```

3. **Exécuter le programme** :

   Exécutez le programme à partir du répertoire `out` :

   ```bash
   java -cp out isima.Main
   ```

## Utilisation

Une fois le programme lancé, vous verrez un menu interactif avec les options suivantes :

```
=== Menu ===
1. Charger les arrêts de métro depuis un fichier
2. Afficher les arrêts de métro
3. Trier les arrêts de métro par ID
4. Quitter
Choisissez une option:
```

### Explication des options

1. **Charger les arrêts de métro** : Entrez le chemin vers le fichier texte contenant les informations sur les arrêts de métro. Le programme chargera les arrêts dans une liste.
2. **Afficher les arrêts de métro** : Affiche tous les arrêts de métro actuellement chargés dans le programme.
3. **Trier les arrêts de métro par ID** : Trie les arrêts selon leur identifiant.
4. **Quitter** : Termine l'exécution du programme.

### Exemple d'utilisation

1. Choisissez l'option `1` pour charger un fichier d'arrêts de métro :

   ```
   Entrez le chemin du fichier: "tmp/ratp_arret.csv"
   ```

2. Choisissez l'option `2` pour afficher les arrêts :

   ```
   Liste des arrêts de métro :
   MetroStop{id=1, nom='Abbesses', arrondissement='PARIS-18EME', type='metro', longitude=2.3387128, latitude=48.8844176}
   MetroStop{id=2, nom='Châtelet', arrondissement='PARIS-1ER', type='metro', longitude=2.3522219, latitude=48.856614}
   ```

3. Choisissez l'option `3` pour trier les arrêts par identifiant.

## Tests Unitaires

Les tests unitaires sont réalisés avec **JUnit 5**. Ils valident le bon fonctionnement du parser et la gestion des exceptions.

Pour exécuter les tests unitaires :

1. Compilez et exécutez les tests avec Gradle ou Maven si configuré.
2. Si vous utilisez Gradle, vous pouvez exécuter :

   ```bash
   gradle test
   ```

Les tests valident :
- La création correcte d'un objet `MetroStop`.
- La gestion d'un fichier avec un format de ligne invalide.
- La gestion d'un fichier avec des erreurs de formatage numérique.
- Le tri correct des arrêts de métro par identifiant.

## Structure du Projet

```

├── src
│   ├── main
│   │   └── java
│   │       └── isima
│   │           ├── MetroStop.java
│   │           └── Parser.java
│   └── test
│       └── java
│           └── isima
│               └── MetroStopTest.java
|               └── ParserTest.java
└── build.gradle

└── README.md                 // Documentation du projet
```

## Auteur

- **MOUHALHAL Abdelmonaim** - *ISIMA F5* 



