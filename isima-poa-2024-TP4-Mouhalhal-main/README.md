# Application de Prévisions Météorologiques

Cette application Java récupère et affiche des données météorologiques pour une ville donnée. Elle utilise l'API de prévisions météorologiques pour obtenir des informations sur la température, l'humidité et d'autres paramètres météorologiques.

## Table des matières

- [Caractéristiques](#caractéristiques)
- [Prérequis](#prérequis)
- [Installation](#installation)
- [Utilisation](#utilisation)



## Caractéristiques

- Affichage de la température actuelle, de la température minimale et maximale.
- Affichage de l'humidité.
- Utilisation de JUnit pour les tests unitaires.

## Prérequis

Assurez-vous d'avoir installé les éléments suivants :

- Java 8 ou version supérieure
- Maven
- IntelliJ IDEA ou un autre IDE de votre choix

## Installation

1. Clonez le dépôt :

   ```bash
   git clone https://github.com/ol-v-er/isima-poa-2024-TP4-Mouhalhal.git
   cd isima-poa-2024-TP4-Mouhalhal
Construisez le projet avec Maven :

bash

    mvn clean install

## Utilisation

1. Exécutez l'application principale :

   ```bash

    mvn exec:java -Dexec.mainClass="com.meteo.MainApp"

Lorsque vous y êtes invité, entrez le nom de la ville pour laquelle vous souhaitez obtenir les prévisions météorologiques.

