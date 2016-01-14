# IDM-Project [![Build Status](https://travis-ci.org/StephaneMangin/IDM-Project.svg)](https://travis-ci.org/StephaneMangin/IDM-Project)

Toutes les transformations se trouvent dans les packages ``Utils`` respectifs des différents modèles.

Pour les transformations VideoGen, un projet spécifique a été créé pour abstraire la partie métier de la partie technique du traitement vidéo (Utilise avconv et la librairie humble video), ce qui améliore la maintenabilité des différentes préoccupations.

Pour les transformations model to text depuis le modèle PlayList, chaque type de 'fichier' est généré par une méthode  (toPLS, toM3u, ...).

L'intégration jhipster permet un accès REST au différentes transformations model to text. Le type de fichier de playlist est appelé au travers de l'url `static/playlist.{ext}` ou ext peut-être 'm3u8', 'm3u' ou 'pls'. La playlist sur mesure est appelé par l'url `static/custom.{ext}` en fournissant un contenu de type POST de la forme {'id de video': boolean, ...}
