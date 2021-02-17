# PARCIAL CORTE 1

Aplicacion para consultar el clima de la ciudad que desee segun el reporte de la API gratuita de https://openweathermap.org/ de **Current Weather Data**

[![Deploy](https://www.herokucdn.com/deploy/button.svg)](https://parcial1arep.herokuapp.com/clima?lugar=london)

## Procedimiento para usarlo




```
mvn package
```

Si todo esta en orden debera verse de la siguiente manera


![empaquetado](./imagenes/empaquetado.png)

una vez realizado este paso debera ejecutar el siguiente comando para asi poder hacer uso de la aplicacion

```
java -cp target/App-1.0-SNAPSHOT.jar edu.escuelaing.arep.Lab1.app.App "Ruta archivo a leer"
```

en este caso se utilizo el archivo **prueba.txt**
y se llevo acabo de la siguiente forma:


imagenes de la prueba


### Pre requisitos 

Es necesario contar con los siguientes programas para poder compilar, ejecutar y testar el proyecto:
+ Maven 3.6.3
+ Java 1.8.0
+ Git 2.25.0windows.1
+ jdl1.8.0_251


De esta forma es posible verificarla version de mvn y asi es como debe verse:

```

$ mvn -version

Apache Maven 3.6.3 (cecedd343002696d0abb50b32b541b8a6ba2883f)
Maven home: C:\Program Files\Java\apache-maven-3.6.3-bin\apache-maven-3.6.3
Java version: 14.0.2, vendor: Oracle Corporation, runtime: C:\Program Files\Java\jdk-14.0.2
Default locale: es_CO, platform encoding: Cp1252
OS name: "windows 10", version: "10.0", arch: "amd64", family: "windows"

```

Para verificar a version de Java se verifica de la siguiente manera:
```

$java -version

java version "1.8.0_261"
Java(TM) SE Runtime Environment (build 1.8.0_261-b12)
Java HotSpot(TM) 64-Bit Server VM (build 25.261-b12, mixed mode)

```


## Justuficacion y marco teorico del proyecto

Este documento sustenta la justificacion del proyecto, ademas de dar un contexto con enfasis en los conceptos, para los cuales se realizo la aplicacion

[Laboratorio 1](https://github.com/DonSantiagoS/LAB1AREP.git/Laboratorio1.pdf)

por: [Santiago Buitrago](https://github.com/DonSantiagoS)

## Pruebas

Se realizaron una serie de pruebas con el conjunto de numeros ubicado en [Pruebas.txt](https://github.com/DonSantiagoS/LAB1AREP.git/Pruebas.txt)

arrojando los siguientes resultados

usando este codigo como proyeccion de las pruebas que se realizaron:

```
```


## Construccion

* [Maven](https://maven.apache.org/) - Dependency Management
* [Git](https://git-scm.com/) - Used to execute, test and compile as console
* [Heroku] (https://heroku.com) - Used to deploy

## Control de versiones

por: [Santiago Buitrago](https://github.com/DonSantiagoS) 

Version: 1.0
Fecha: 17 de febrero 2021

## Autor

* **Santiago Buitrago** - *Laboratorio N°1* - [DonSantiagoS](https://github.com/DonSantiagoS)

See also the list of [contributors](https://github.com/your/project/contributors) who participated in this project.

## Licencia 

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details

## Agradecimientos

* Persistencia en lograr el objetivo

