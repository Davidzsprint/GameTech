# GAMETECH
EQUIPO:

David Beltrán Sánchez 

Rubén Beltrán Sánchez

David Calderon Casarrubios



# Descripción temática de la web:
Esta aplicación consiste dar información relacionada con el juego League of Lenguend. Mostrar caracteristicas de cada héroe, como son la vida, ataque, defensa, maná y posición. Ademas avisar via email sobre nuevos héroes disponibles para el usuario. También se podrá consultar caracteristicas de los heroes, su dificultad, que objetos son los más usados para jugar un determinado roll en esa posición, etc. 
# Entidades:
- Heroes: toda la informacion de cada heroe.

- Usuario: Inforcion sobre el usuario como su alias, contraseña, pais, elo, etc.

- Build (Guia de objetos): Contiene la información de los de los objetos que va utuliza un heroe.

- Liga: liga a la que el usuario pertenece en League of lenguend, (Bronce, Plata, Oro o Diamante)

- Ranking: mostrara el valor de su KDA segun su Pais/servidor.

# Parte Pública:

- Consultar héroe por nombre (nombre, descripción, posicion, vida, ataque, defensa, mana, etc.).

- Mostrar los usuario por nacionalidad

- Consultar Builds por su nombre.

- Consultar héroe segun posición  (ADC, Support, Top, mid, jungla).

- Consultar informacion accerca de un usuario

- Consultar usuarios por nacionalidad  (pais)

- Consultar héroe segun su dificultdad de manejo (nivel de dificultdad).

- Consultar ranking por pais.

# Parte Privada:

- Consultar información privada del usuario, como es su contraseña y email o el numero de ID

- Un usuario podrá crear Builds personalidazas 

- Registrar nuevos heroes (usuarios con rol de admin)

# Servicio interno:
- Enviar una notificación a traves e-mail a los usuarios en caso de lanzarse un nuevo heroe, proporcionando caracteristicas de dicho héroe como su pòsicion, dificultad y todos sus atributos.
# Diagrama E/R
![digrama](https://user-images.githubusercontent.com/61190606/74888391-1914ce00-537e-11ea-9dde-71579f9f30cf.jpg)

# Diagrama UML
![UML](https://user-images.githubusercontent.com/60217867/74888084-457c1a80-537d-11ea-8a9d-83dda8cd7e5b.jpg)
