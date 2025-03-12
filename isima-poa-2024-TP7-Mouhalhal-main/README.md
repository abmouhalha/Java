
# TP7 - Producteur/Consommateur en Java

## Introduction

Ce projet implémente le problème classique du Producteur-Consommateur en utilisant des threads en Java. L'objectif est de simuler un environnement où une usine produit des Pères Noël en chocolat, qui sont ensuite stockés dans un magasin. Les producteurs ajoutent des articles au stock, tandis que les consommateurs en retirent. Le stock a une capacité limitée, et lorsque celui-ci est plein, les producteurs sont mis en pause. De même, les consommateurs sont mis en pause lorsque le stock est vide.

## Structure du programme

Le projet se compose de plusieurs classes Java :

- **PereNoel.java** : Représente un Père Noël avec un numéro de série unique.
- **Stock.java** : Gère le stockage des Pères Noël et implémente les méthodes pour ajouter et retirer des Pères Noël du stock.
- **Producteur.java** : Crée des Pères Noël et les ajoute au stock à intervalles réguliers.
- **Consommateur.java** : Retire un nombre aléatoire de Pères Noël du stock chaque seconde.
- **Main.java** : Lance plusieurs threads de producteurs et de consommateurs.

## Prérequis

Avant d'exécuter le programme, assurez-vous d'avoir installé les éléments suivants :

- **JDK 8 ou supérieur** : Le programme est écrit en Java, donc vous devez avoir le JDK installé pour compiler et exécuter le code.
- **IDE Java** (facultatif mais recommandé) : Vous pouvez utiliser un IDE comme IntelliJ IDEA, Eclipse ou NetBeans pour faciliter le développement.

## Compilation et Exécution

### Étapes pour compiler et exécuter le programme depuis la ligne de commande :

1. Ouvrez un terminal ou une invite de commande.
2. Naviguez jusqu'au répertoire où se trouve le fichier `Main.java`.
3. Compilez le programme avec la commande suivante :

```bash
javac *.java
```

4. Exécutez le programme avec la commande suivante :

```bash
java Main
```

## Exemple de sortie

Voici un exemple de sortie possible lors de l'exécution du programme :

```
Producteur a ajouté : PereNoel #1
Consommateur a acheté : PereNoel #1
Producteur a ajouté : PereNoel #2
Consommateur a acheté : PereNoel #2
Producteur a ajouté : PereNoel #3
Consommateur a acheté : PereNoel #3
...
```

Les producteurs ajouteront des Pères Noël au stock toutes les 2 secondes, et les consommateurs retireront entre 1 et 5 Pères Noël toutes les secondes. Les messages affichés permettent de suivre les actions de chaque thread.

## Détails de l'implémentation

### 1. **PereNoel**

La classe `PereNoel` représente un Père Noël avec un numéro de série unique. Chaque objet créé aura un numéro de série incrémenté à chaque fois qu'un nouveau Père Noël est produit.

### 2. **Stock**

La classe `Stock` gère un stock limité à 100 Pères Noël. Elle fournit des méthodes pour ajouter ou retirer des Pères Noël. Le stock est géré de manière synchrone pour éviter des problèmes de concurrence lorsque plusieurs threads accèdent au même stock.

- **ajouterPereNoel(PereNoel pereNoel)** : Ajoute un Père Noël au stock.
- **retirerPereNoel(int quantity)** : Retire un certain nombre de Pères Noël du stock. Si le stock est insuffisant, le consommateur attend.

### 3. **Producteur**

La classe `Producteur` est un thread qui produit des Pères Noël à intervalles réguliers de 2 secondes. Lorsque le stock est plein, le producteur attend que de l'espace se libère.

### 4. **Consommateur**

La classe `Consommateur` est un thread qui consomme entre 1 et 5 Pères Noël toutes les secondes. Si le stock est vide, le consommateur attend qu'un producteur ajoute des Pères Noël.

### 5. **Main**

La classe `Main` démarre plusieurs threads de producteurs et de consommateurs. Elle permet de simuler l'interaction entre plusieurs producteurs et plusieurs consommateurs, avec des logs affichant l'état du programme à chaque étape.

## Test et Validation

### Scénarios de tests :

- **Test avec plus de consommateurs que de producteurs** : Vérifie si le programme gère correctement l'attente des consommateurs lorsque le stock est insuffisant.
- **Test avec plus de producteurs que de consommateurs** : Vérifie si les producteurs attendent correctement lorsque le stock est plein.
- **Test avec un nombre égal de producteurs et consommateurs** : Simule une situation équilibrée pour tester le bon fonctionnement du système.

### Résultats attendus :

- Les producteurs doivent ajouter des Pères Noël au stock, et les consommateurs doivent pouvoir les acheter.
- Le programme doit gérer correctement les situations où le stock est plein (producteurs en attente) ou vide (consommateurs en attente).

## Auteurs

- **Mouhalhal Abdelmonaim**



