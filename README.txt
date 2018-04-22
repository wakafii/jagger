Equipe:
Alexandre Boyenval
Thomas Reinert

Rendu:
Le projet est fonctionnel jusqu'à l'implémentation des String.

Nous avons rencontré des problèmes pour le Let In End, au moment de l'instanciation de la classe LetInEnd Jagger.jj ne reconnaissait pas les fonctions de cette classe, pour remédier à ce problème nous avons tenter d'instancier les Vector qui sont les attributs de notre classe préalablement dans le Jagger.jj mais cela n'a pas résolu notre problème. Nous avons laissé en commentaire ce que nous avons fait pour cette partie.

Concernant le reste du projet nous n'avons rencontré de problèmes qu'à l'implémentation des comparaisons pour les String, qui était dû au fait que nous prenions les "\"" comme des String dans le Jagger.jj.

Nous n'avons pas trouvé comment générer des erreurs lors de la lecture du fichier de test, nous avons essayé en rajoutant un niveau de priorité "erreur" dans le Jagger.jj si celui-ci n'arrive pas à lire la ligne, mais cela ne faisait que prendre tous les lignes de notre fichier test comme des erreurs. Nous avions pensé à faire plusieurs fichiers de test finissant par une erreur afin de ne pas bloquer le programme à la première erreur détéctée.
