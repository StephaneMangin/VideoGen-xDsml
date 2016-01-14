# IDM-Project [![Build Status](https://travis-ci.org/StephaneMangin/IDM-Project.svg)](https://travis-ci.org/StephaneMangin/IDM-Project)

Toutes les transformations se trouvent dans les packages ``Utils`` respectifs des différents modèles.

Pour les transformations VideoGen, un projet spécifique a été créé pour abstraire la partie métier de la partie technique du traitement vidéo (Utilise avconv et la librairie humble video), ce qui améliore la maintenabilité des différentes préoccupations.

Pour les transformations model to text depuis le modèle PlayList, chaque type de 'fichier' est généré par une méthode  (toPLS, toM3u, ...).

L'intégration jhipster permet un accès REST au différentes transformations model to text. Le type de fichier de playlist est appelé au travers de l'url `static/playlist.{ext}` ou ext peut-être 'm3u8', 'm3u' ou 'pls'. La playlist sur mesure est appelé par l'url `static/custom.{ext}` en fournissant un contenu de type POST de la forme {'id de video': boolean, ...}

##Synopsis
The goal of this project is to deploy a web video generator based on a plain text specification. Users will be able to see videos randomly generated by the application.

##Motivation
As part of IDM class, we had to do this project to have a better knowledge of model transformation like model-to-text or model-to-model.
We started with some transformations then we added the video manager and finaly we created the website with JHipster.

##Project requirement
*The whole project has been developped with the operating system Ubuntu 14.04 so every installation will be in a command line interface.*

###Installation
To be sure that the project will perfectly run on your computer, we will make you install some tools.

####Eclipse Mars
To run or visualize properly our program you will need a Eclipse environment and to be more easier you should download Eclipse Mars IDE for DSL developpers because it include xtext, xtend, EMF project.

####Npm and Node.js
Npm is the package manager for Node.js.

**Installation command**

>*sudo apt-get install npm nodejs*

####Grunt
Grunt will allow us to be more efficiant by preventing us from repeating tasks.

**Installation command**

>*npm install -g grunt-cli*

####Bower
Bower is a package manager for website. It will help us to manage our packages and make sure they are all up to date.

**Installation command**

>*npm install bower -g*

####Avconv
Avconv is a video and audio converter. It reads an arbitrary number of input "files" and writes to an arbitrary number of output "files".

**Installation command**

>*sudo apt-get install libav-tools*

###Execution
Before launching the project "Application.java" you have to run some commands

*You need to go in the repository 'VideoGen.WebService'*

>*grunt build*  
*bower -f update*

Once you have executed them, you should able to run the application by right-clicking on "src/main/java/org/istic/idm/xtext/webservice/application.java" and chose to run it as a "java application" on an Eclipse environment.

##Sources
[https://www.npmjs.com/](https://www.npmjs.com/)

[http://bower.io/](http://bower.io/)

[http://gruntjs.com/](http://gruntjs.com/)

[https://doc.ubuntu-fr.org/avconv](https://doc.ubuntu-fr.org/avconv)

[https://jhipster.github.io/](https://jhipster.github.io/)
