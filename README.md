[![Build Status](https://travis-ci.org/lfx1001/poolobject.svg?branch=master)](https://travis-ci.org/lfx1001/poolobject)
[![codecov](https://codecov.io/gh/lfx1001/poolobject/branch/master/graph/badge.svg)](https://codecov.io/gh/lfx1001/poolobject)
# Proceso de prueba y cobertura
## Objetivos de la práctica
* Comprender los objetivos de medición relacionados con la caracterización y la evaluación de
productos, procesos y recursos software
* Comprender, aplicar y analizar técnicas de medición sobre entidades de productos software
relacionados con conjuntos de pruebas de software
* Comprender, aplicar y analizar medidas relacionadas sobre entidades de proceso y recursos de
prueba del software

## Enunciado
En la práctica se va simular un pequeño desarrollo de un producto software para realizar mediciones sobre él.
El objetivo es establecer un caso de estudio que sirva para caracterizar y evaluar tanto el producto
desarrollado como el proceso seguido
### Descripción del producto
Dado un código de ejemplo del patrón diseño creacional Pool Object, se debe crear una batería de pruebas tal
que las coberturas de sus clases sean del 100%. El código de las clases se puede obtener en el 
[repositorio](https://github.com/clopezno/poolobject).
La batería de pruebas JUnit debe estar contenida en la clase
ubu.gii.dass.test.c01.ReuseblePoolTest.java.
### Descripción del proceso
El proceso de desarrollo de la batería de pruebas se va a gestionar utilizando el control de versiones del
sistema Git proporcionado por el repositorio de proyectos GitHub (https://github.com).
Los pasos para gestionar el procesos son los siguientes:
1. Cada miembro del equipo tiene que estar registrado en GitHub, Travis CI y Codecov.io.
2. Uno de los miembros tiene que realizar un fork del repositorio donde se encuentra el código que se
quiere probar https://github.com/clopezno/poolobject. El nuevo repositorio tiene que ser público.
3. Invitar al resto de miembros del equipo para que puedan participar en el desarrollo de las pruebas.
4. Vincular el proyecto con Travis CI y Codecov.io.
5. Cada nuevo test realizado ejecutar un commit/push al repositorio del grupo. El texto del commit tiene
que describir el caso de prueba añadido.
6. Verificar el resultado de las pruebas en el pipeline de integración continua y cómo la calidad del
producto va mejorando con las sucesivas integraciones.

## Respuestas a preguntas relativas a la realizacion de la práctica

### ¿Se ha realizado trabajo en equipo?

El trabajo se ha realizado de forma individual

### ¿Tiene calidad el conjunto de pruebas disponibles?

La cobertura de test alcanzada sobre la clase PoolObject ha sido de 100%, cubriendo 
todos los caminos lógicos del código. Este hecho nos indica que la cobertura es buena.
![Cobertura Final](/images/3_releaseReusableTest.png)
Se proponen dos mejoras sobre las mismas:
* Añadir pruebas de comportamiento del método releaseReusable cuando recibe un parámetro nulo
* Dividir alguno de los métodos de prueba para realizar pruebas exclusivas de lanzamiento
de excepciones utilizando el atributo (expected)[https://junit.org/junit4/faq.html#atests_7] .  

###¿Cuál es el esfuerzo invertido en realizar la actividad?

Aproximadamente, he invertido 4-5 horas

###¿Cuál es el número de fallos encontrados en el código?

No se han localizado errores al ejecutar la batería de test implementada.
Se ha realizado una inspección manual del código de la clase PoolObject y
de ella se recomendaría añadir el control de parámetros nulos en el método 
releaseReusable de cara a tener un comportamiento más específico.
 