

# Rapport de sécurité

## Principe 1 : Valider les entrées utilisateur
### Description
Valider les entrées utilisateur pour éviter les fichiers malveillants ou non accessibles.

### Code original
```java
filePath = scanner.nextLine();

if (filePath.equals("!")){
    filePath = "src/ratp_arret.csv";
}
```

### Code corrigé
```java
filePath = scanner.nextLine().trim();  // Retirer les espaces superflus

if (filePath.equals("!")) {
    filePath = "src/ratp_arret.csv";
} else if (!filePath.matches("^[\\w./-]+$")) {  // Vérifier si le chemin du fichier est valide
    System.out.println("Chemin de fichier invalide !");
    return;
}
```

---

## Principe 2 : Utiliser des exceptions spécifiques
### Description
L’utilisation d’un bloc `catch` trop général peut masquer des erreurs spécifiques et rendre le débogage difficile.

### Code original
```java
} catch (Exception e) {
    System.out.println(e.getMessage());
    e.printStackTrace();
}
```

### Code corrigé
```java
} catch (FileNotFoundException e) {
    System.out.println("Erreur : Fichier introuvable.");
} catch (IOException e) {
    System.out.println("Erreur : Problème de lecture/écriture du fichier.");
} catch (NumberFormatException e) {
    System.out.println("Erreur : Format de données invalide.");
}
```

---

## Principe 3 : Minimiser la portée des variables
### Description
Les variables doivent avoir la portée la plus restreinte possible pour éviter les interférences ou accès involontaires.

### Code original
```java
String choix;

do {
    ...
    int id = scanner.nextInt();
    ...
} while (!choix.equals("q!"));
```

### Code corrigé
```java
do {
    String choix = scanner.nextLine();  // Déclarer la variable 'choix' dans la portée la plus restreinte possible
    switch (choix) {
        case "rec_id":
            System.out.print("=> ");
            int id = scanner.nextInt();
            scanner.nextLine();  // Consommer le retour à la ligne
            ...
            break;
    }
} while (!choix.equals("q!"));
```

---

## Principe 4 : Ne jamais exposer les détails internes
### Description
Les attributs de la classe `MetroStop` étaient publics, ce qui permet un accès direct non sécurisé. En les rendant privés et en fournissant des getters et setters, on améliore l'encapsulation et la sécurité.

### Code original
```java
public int id;
public double longitude;
public double latitude;
public String nom;
public String arrondissement;
public String type;
```

### Code corrigé
```java
private int id;
private double longitude;
private double latitude;
private String nom;
private String arrondissement;
private String type;

public int getId() {
    return id;
}

public void setId(int id) {
    this.id = id;
}

// Ajouter les getters et setters pour les autres attributs
```

---

## Principe 5 : Éviter les dépendances non sécurisées
### Description
L’utilisation de `BufferedReader` devrait inclure un mécanisme de fermeture sécurisé pour éviter les fuites de ressources.

### Code original
```java
Reader reader = new FileReader(path);
BufferedReader br = new BufferedReader(reader);
...
br.close();
```

### Code corrigé
```java
try (BufferedReader br = new BufferedReader(new FileReader(path))) {  // Utiliser try-with-resources pour fermer automatiquement le BufferedReader
    String line;
    while ((line = br.readLine()) != null) {
        ...
    }
} catch (IOException e) {
    System.out.println("Erreur : Problème lors de la lecture du fichier.");
}
```

---

## Principe 6 : Restreindre les permissions d'exécution
### Description
Aucun contrôle n'est exercé pour vérifier les autorisations d'accès aux fichiers.

### Code original
Aucun mécanisme spécifique.

### Code corrigé
```java
File file = new File(filePath);
if (!file.exists() || !file.canRead()) {  // Vérifier si le fichier existe et est lisible
    System.out.println("Erreur : Le fichier n'est pas accessible.");
    return;
}
```

---

### Conclusion
Les modifications proposées visent à renforcer la sécurité du programme en :
1. **Validant** les entrées utilisateur pour éviter des comportements inattendus.
2. **Utilisant des exceptions spécifiques** pour mieux gérer les erreurs et améliorer la lisibilité du code.
3. **Réduisant la portée des variables** pour limiter les accès non souhaités.
4. **Encapsulant les données** de la classe `MetroStop` afin de protéger ses attributs.
5. **Améliorant la gestion des ressources** en utilisant `try-with-resources`.
6. **Restreignant les permissions d'accès aux fichiers** pour éviter les erreurs liées à l'accès non sécurisé.

Ces principes de sécurité améliorent la robustesse, la lisibilité et la maintenabilité du code tout en garantissant qu'il respecte les bonnes pratiques de sécurité.
```
