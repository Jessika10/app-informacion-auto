# app-informacion-auto
Proyecto Java para ingresar y visualizar datos de vehículos de manera simple y eficiente sin uso de un IDE.

## Documentacion del Proceso:
```markdown
# Elaboración del código fuente:

- Decidí crear un programa en Java para gestionar información sobre autos.
- Escribí el código fuente en un archivo con extensión .java.
- Definí una clase principal llamada Main que contiene el método main, el punto de entrada del programa.
- También creé una clase llamada Auto para representar los autos y definir sus atributos y métodos.
- En el código, establecí la estructura básica del programa, incluyendo la declaración de variables, métodos y la interacción con el usuario a través de la entrada y salida estándar.

# Compilación del código fuente:

- Una vez completado el código fuente, lo guardé en un archivo y ejecuté un compilador de Java (como javac) para convertirlo en bytecode, el cual es ejecutable por la máquina virtual de Java (JVM).
- Durante la compilación, el compilador realizó varias verificaciones, como la sintaxis y la resolución de nombres, para garantizar que el código fuera válido.

# Creación de archivos de clase:

- Después de la compilación, se generaron archivos de clase (.class) para cada clase definida en el código fuente. Estos archivos contienen el bytecode que la JVM puede ejecutar.

# Ejecución del programa:

- Una vez que se generaron los archivos de clase, ejecuté el programa Java invocando la máquina virtual de Java (JVM) y pasando el nombre de la clase principal (Main) como argumento.
- La JVM cargó las clases necesarias en memoria y comenzó a ejecutar el método main de la clase Main.
- Durante la ejecución, el programa solicitó al usuario que ingresara información sobre un auto, la cual se almacenó en una instancia de la clase Auto.
- Después de ingresar la información, el programa mostró los datos ingresados por el usuario en la consola.

# Interacción con el programa:

- Durante la ejecución, el programa solicitó al usuario que ingresara la marca, modelo, cilindrada, tipo de combustible y capacidad de pasajeros del auto.
- El usuario ingresó estos datos uno por uno a través del teclado.
- El programa los almacenó en una instancia de la clase Auto utilizando los métodos set definidos en la clase.
- Luego, el programa recuperó estos datos utilizando los métodos get y los mostró en la consola.

# Finalización del programa:

- Una vez que se mostraron los datos del auto ingresados por el usuario, el programa terminó su ejecución.
- La JVM liberó los recursos utilizados por el programa, como la memoria asignada a las instancias de objetos.
```

## Listado de requerimiento:
```markdown
# Requisitos Funcionales:

1. Ingreso de Datos del Auto:
   - El programa debe permitir al usuario ingresar información detallada sobre un auto, incluyendo marca, modelo, cilindrada, tipo de combustible y capacidad de pasajeros.

2. Visualización de Datos del Auto:
   - El programa debe mostrar los datos ingresados por el usuario de forma clara y legible en la consola.

3. Interacción Intuitiva:
   - El programa debe ser fácil de usar, con instrucciones claras para guiar al usuario a través del proceso de ingreso de datos.

# Requisitos No Funcionales:

1. Eficiencia:
   - El programa debe ser eficiente en términos de consumo de recursos y tiempo de ejecución.

2. Portabilidad:
   - El programa debe ser compatible con diferentes sistemas operativos y entornos de ejecución de Java.

3. Mantenibilidad:
   - El código fuente debe estar bien estructurado y documentado para facilitar futuras actualizaciones y modificaciones.

4. Usabilidad:
   - La interfaz de usuario debe ser amigable y fácil de entender, incluso para usuarios sin experiencia técnica en Java.
```
