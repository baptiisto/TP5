# TP5
**Ce fichier servira de compte rendu.**
### Etape 1: ON ajoute la classe date
### Etape 2: on crée la partition d'échange avec la methode dernierjour du mois et est bissextile


**partitions d'équivalence est bissextile**

| Classe |    a divisible par    | Résultat attendu |      
|:------:|:---------------------:|:----------------:|
|   P0   | 4:non 100:non 400:non |       Faux       |
|   P1   | 4:oui 100:non 400:non |       Vrai       |
|   P2   | 4:oui 100:oui 400:non |       Faux       |
|   P3   | 4:oui 100:oui 400:oui |       Vrai       |

| Classe |    a                  | Résultat          |
|:------:|:---------------------:|:----------------:|
|   P0   | 2017                  |       Faux       |
|   P1   | 2016                  |       Vrai       |
|   P2   | 2100                  |       Faux       |
|   P3   | 2400                  |       Vrai       |

**partitions d'équivalence dernier jourdumois**

| Classe |    A                  |        M         |        Résultat attendu         |
|:------:|:---------------------:|:----------------:|:--------------------------------:|
|   P0   |a non bissextile       |mois 31 jours     | 31
|   P1   | a non bissextile      |mois 31 jours     | 30
|   P2   | a non bissextile      |       Février    | 28
|   P3   | a bissextile          | mois 31 jours    | 31
|   P4   | a bissextile          |    mois 31 jours | 30
|   P5   | a bissextile          |       février    | 29
|   P6   | a bissextile          | mois interdit    | -1

| Classe |    A                  |        M         |        Résultat       |
|:------:|:---------------------:|:----------------:|:---------------------:|
|   P0   |  2017                 |1                 | 31
|   P1   |   2017                |4                 | 30
|   P2   |   2017                |      2           | 28
|   P3   |   2016                | 1                | 31
|   P4   |   2016                |    4             | 30
|   P5   |   2016                |     2            | 29
|   P6   |   2100                | 13               | -1

### Etape 3
apres création des tests. Nous les avons  exécutés et tous les tests marchent. Nos methodes marchent
