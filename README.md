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

Apres création des tests. Nous les avons  exécutés et tous les tests marchent. Nos methodes marchent.

**partitions d'équivalence de date constructeur**
| Classe |           annne       |        mois      |       jour            |  Resultat attendu                  |
|:------:|:---------------------:|:----------------:|:---------------------:| :---------------------------------:|
|   P0   |    present            | present          |  present              | la date avec les parametres données|
|   P1   |   present             | non present      |  non present          |le premier janvier avec l'année donné|

| Classe |           annne       |        mois      |       jour            |  Resultat                          |
|:------:|:---------------------:|:----------------:|:---------------------:| :---------------------------------:|
|   P0   |     2017              | 2                |   5                   | channee = 2017,chmois = 2, chjour = 5|
|   P1   |     2017              | non present      |  non present          |channée = 2017, chmois = 1, chjour= 1|

Nous avons crées les tests et nous les avons executées. Les tests marchent. Donc le constructeur est opérationnel


