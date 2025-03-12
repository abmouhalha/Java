
# Rapport de Sécurité - TP de Sécurisation de Code Java

## Description
Ce projet consiste à améliorer la sécurité d'un programme Java de mon camarade de classe le TP3-Khedhaouria en suivant des principes de sécurité éprouvés. Les modifications portent principalement sur la validation des entrées utilisateurs, la gestion des exceptions, l'encapsulation des données et la gestion des permissions d'accès aux fichiers. 

Le programme est conçu pour effectuer des opérations sur des fichiers CSV contenant des informations relatives aux arrêts de métro, tout en appliquant des pratiques de programmation sécurisées.

## Objectifs
1. **Valider les entrées utilisateur** pour éviter les fichiers malveillants ou non accessibles.
2. **Utiliser des exceptions spécifiques** afin de mieux gérer les erreurs et améliorer la lisibilité du code.
3. **Minimiser la portée des variables** pour éviter les interférences ou accès involontaires.
4. **Ne jamais exposer les détails internes** des classes pour garantir une meilleure sécurité des données.
5. **Éviter les dépendances non sécurisées** en fermant correctement les ressources comme les fichiers.
6. **Restreindre les permissions d'exécution** en vérifiant l'accès aux fichiers.

## Prérequis
- Java 8 ou supérieur.
- Un éditeur de texte ou un IDE pour écrire et exécuter du code Java (par exemple, IntelliJ IDEA, Eclipse, VSCode).
- Le fichier CSV `ratp_arret.csv` doit être présent dans le répertoire `src`.

## Installation
1. Clonez ce repository ou téléchargez les fichiers du projet.
2. Ouvrez le projet dans votre IDE préféré.
3. Assurez-vous que le fichier `ratp_arret.csv` est situé dans le répertoire `src` du projet, ou modifiez le chemin du fichier dans le code si nécessaire.
4. Compilez et exécutez le projet.

## Utilisation
### Fonctionnement du programme
Le programme demande à l'utilisateur de saisir un chemin de fichier. Si l'utilisateur entre `!`, le programme utilisera un fichier par défaut (`src/ratp_arret.csv`). Le chemin de fichier est ensuite validé pour s'assurer qu'il ne contient que des caractères sûrs (lettres, chiffres, point, barre oblique et tiret).

Si le fichier spécifié n'est pas accessible, le programme indique une erreur. En cas d'exception, des messages d'erreur précis sont affichés, selon le type d'exception (par exemple, `FileNotFoundException`, `IOException`, etc.).

### Exemple d'exécution
```bash
Veuillez entrer le chemin du fichier (ou `!` pour utiliser le fichier par défaut) :
!  
Fichier : src/ratp_arret.csv
Lecture du fichier en cours...
```

### Contrôles de sécurité
1. **Validation du chemin de fichier** : Les entrées utilisateur sont nettoyées et vérifiées.
2. **Exceptions spécifiques** : Chaque type d'exception est géré de manière détaillée.
3. **Permissions d'accès aux fichiers** : Un contrôle est effectué pour s'assurer que le fichier existe et est lisible avant de tenter de l'ouvrir.

## Sécurité
Les bonnes pratiques de sécurité appliquées incluent :
- **Encapsulation** des attributs de la classe `MetroStop` pour éviter un accès direct aux données sensibles.
- Utilisation du mécanisme `try-with-resources` pour garantir la fermeture automatique des ressources (comme les `BufferedReader`).
- Vérification des permissions d'exécution pour garantir que les fichiers sont accessibles.

## Conclusion
Ce projet permet de démontrer l'application des principes de sécurité dans un programme Java simple. L'implémentation des bonnes pratiques de programmation sécurisée permet d'améliorer la robustesse, la lisibilité et la maintenabilité du code tout en minimisant les risques liés aux failles de sécurité.

