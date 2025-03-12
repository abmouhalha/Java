# TP6 - Introspection en Java

## Introduction

Ce projet est consacré à l'introspection et à la réflexion en Java. L'objectif est de créer une classe `Personne` avec des attributs et des méthodes de différents niveaux d'accessibilité, puis d'explorer cette classe à l'aide d'une classe `ExplorerClass` et de manipuler ses instances à l'aide d'une classe `ManipulationClass`. Ce TP met en œuvre des concepts avancés de Java, y compris la réflexion et l'introspection.

## Structure du Projet

Le projet se compose de quatre classes principales :

1. **Personne** : Représente une personne avec des attributs tels que le nom, l'âge et l'adresse.
2. **ExplorerClass** : Utilise l'introspection pour inspecter la classe `Personne`, affichant ses attributs et ses méthodes.
3. **ManipulationClass** : Manipule des instances de la classe `Personne` en utilisant la réflexion pour modifier des attributs et appeler des méthodes.
4. **Affichable** : Une interface que la classe `Personne` implémente pour afficher les détails d'une personne.

## Installation

Pour exécuter ce projet, assurez-vous d'avoir Java (version 8 ou supérieure) installé sur votre machine. Vous pouvez télécharger Java [ici](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html).

Clonez ce dépôt sur votre machine :

```bash
git clone git@github.com:ol-v-er/isima-poa-2024-TP6-Mouhalhal.git
cd isima-poa-2024-TP6-Mouhalhal.git

Compilation et Exécution
Compilation

Utilisez la commande suivante pour compiler les classes :

bash

javac *.java

Exécution

    Pour explorer la classe Personne, exécutez :

    bash

java ExplorerClass

Pour manipuler une instance de Personne, exécutez :

bash

    java ManipulationClass

Utilisation

    Classe Personne :
        Créez une instance de Personne avec un nom, un âge et une adresse.
        Utilisez les méthodes pour accéder et modifier les attributs.

    Classe ExplorerClass :
        Affiche le nom de la classe Personne.
        Affiche les attributs (noms et types) de la classe.
        Affiche les méthodes (noms et types de retour) de la classe.

    Classe ManipulationClass :
        Crée une instance de Personne.
        Modifie les attributs en utilisant la réflexion.
        Appelle la méthode afficherDetails pour afficher les informations de la personne.



    
