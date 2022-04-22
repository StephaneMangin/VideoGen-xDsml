# IDM-Project [![Build Status](https://travis-ci.org/StephaneMangin/IDM-Project.svg)](https://travis-ci.org/StephaneMangin/IDM-Project)

##Synopsis
The goal of this project is to deploy a web video generator based on a plain text specification. Users will be able to see videos randomly generated by the application.

##Motivation
As part of IDM class, we had to do this project to have a better knowledge of model transformations like model-to-text or model-to-model.
We started with some transformations then finaly we created the website with JHipster.

##Model transformations and resources access

All the model's tranformations are located inside the ``utils`` package of each model's project (*VideoGen* and *PlayList*).

For Playlist model to text transformations, each one owns a specific method (toPLS, toM3U, ...).

For VideoGen transformations, a specific project has been created to abstract the core API from the video technical treatments (such as conversions applier, durations and mime types grabber). We used *avconv* to perform such manipulations. This package has the benefit to increase project's sustainability and concerns separation.

Jhipster integration allows a customized REST API to access each entity (see [FlowplayerResource](WebService/src/main/java/org/istic/idm/xtext/webservice/web/rest/FlowplayerResource.java)): 
 - http://localhost:8080/static
    - ``/schema``
      - Json access to the VideoGen instance (Not finished)
      - See [VideoGenSerializer](org.istic.idm.xtext.videogen/src/org/istic/idm/xtext/videogen/utils/VideoGenSerializer.xtend).
    - ``/thumbnails/{name of the sequence}.png``
      - See [VideoGenTransform.createThumbnails](org.istic.idm.xtext.videogen/src/org/istic/idm/xtext/videogen/utils/VideoGenTransform.xtend).
    - ``/videos/{name of the sequence}.ts``
      - See [VideoGenTransform.convertTo](org.istic.idm.xtext.videogen/src/org/istic/idm/xtext/videogen/utils/VideoGenTransform.xtend).
    - ``/random.{extention}``
      - Where extention can be *m3u8*, *pls* or *m3u*, it is regenerated on demand.
      - See [VideoGenTransform.toPlayList](org.istic.idm.xtext.videogen/src/org/istic/idm/xtext/videogen/utils/VideoGenTransform.xtend).
    - ``/custom.{extention}?sequence_name1=false$sequence_name2=true``
      - Where extention can be *m3u8*, *pls* or *m3u*, it is regenerated on demand with GET params to control which sequence has to be choosen.
      - See [VideoGenTransform.toCustomPlayList](org.istic.idm.xtext.videogen/src/org/istic/idm/xtext/videogen/utils/VideoGenTransform.xtend).
      - Explanation on the customization functionality:
         - the __key__ of the GET param is the sequence name
         - __true__ forces an Optional (removed by default) or an alternatives' sequence (the last encountered one takes priority)

## Parallel works

To increase my knowledge on the EMF framework, i decided to create a Eclipse plugin project to generate jhipster JSON models, which has been done quite easily but not fully finished. The project is [here](https://github.com/StephaneMangin/EMFGeneratorPlugins). The point is that I did not found a solution to perform a new project creation to generate a full jhipster stack (ecore core API is difficult to understand), which would be a great approach to EMF code generation. Maybe later !

### Problems

Jhipster JSON model does not implement ENUM properties, which was a mess for this plugins project. I started to add this facility to Jhipster javascript feature model generator.

A try has been done on xtext project mavenization, which was a huge work... Especialy for travis integration. In fact, xtent generation was not a problem BUT xtext generation was a real problematic task. I try masaputa plugin to do so (see Source chapter), which was an interesting option, not sufficient at all so. Pom.xml files have the configuration commented for information purpose.

##Project requirement
*The whole project has been developped with the operating system Ubuntu 14.04*

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

*You need to go in the repository 'WebService'*

>*grunt build*  
*bower -f update*

Once you have executed them, you should able to run the application by right-clicking on "src/main/java/org/istic/idm/xtext/webservice/application.java" and chose to run it as a "java application" on an Eclipse environment.

## Recurrent and blocking error

A recurrent error appears regularly. This error really blocked developement. The stacktrace can be found [here](stacktrace.txt).

No solution were found, flushing .m2 maven repository, reinstalling eclipse and xtext... This error appears to be non-deterministic, which is weird towards project's configuration stability any time it appended. Any help would be great to finish this work, especialy towards feature model addition.

EDIT 20160120 : it seems that this is the fault of swagger (dependencie version conflict with com.google.guava).

##Sources

### Serve static files on a spring controller
[http://docs.spring.io/spring/docs/3.1.x/javadoc-api/org/springframework/web/bind/annotation/RequestMapping.html#headers%28%29](http://docs.spring.io/spring/docs/3.1.x/javadoc-api/org/springframework/web/bind/annotation/RequestMapping.html#headers%28%29)

[http://stackoverflow.com/questions/5673260/downloading-a-file-from-spring-controllers](http://stackoverflow.com/questions/5673260/downloading-a-file-from-spring-controllers)

### Flowplayer for video playing in HLS

[http://flash.flowplayer.org/documentation/installation/index.html](http://flash.flowplayer.org/documentation/installation/index.html)

### Avconv for videos manipulations, thumbnailing and conversion

[https://doc.ubuntu-fr.org/avconv](https://doc.ubuntu-fr.org/avconv)

### Xtext CI

[http://mapasuta.sourceforge.net/maven/site/maven-emfgen-plugin/dependencies.html](http://mapasuta.sourceforge.net/maven/site/maven-emfgen-plugin/dependencies.html)

[https://www.eclipse.org/Xtext/documentation/350_continuous_integration.html](https://www.eclipse.org/Xtext/documentation/350_continuous_integration.html)