# GAMETECH
EQUIPO:

David Beltrán Sánchez 

Rubén Beltrán Sánchez

David Calderon Casarrubios



# Descripción temática de la web:
Esta aplicación consiste dar información relacionada con el juego League of Lenguend. Mostrar caracteristicas de cada héroe, como son la vida, ataque, defensa, maná o energia y posición. Cambio de caracteristicas e información de nuevos héroes y clasificación del usuario. Además de tener la posibilidad de inscribirse a un torneo organizado por Gametech

# Entidades:
- Heroes: toda la informacion de cada heroe.

- Usuario: Dispone de alias y contraseña, ademas contiene informacion del usuario e informacion de su juego.

- Build (Conjunto de objetos): Contiene la información de los conjuntos de objetos que se pueden utilizar con cada héroe

- Liga: liga a la que el usuario pertenece en League of lenguend, posicion, nombre de liga, etc.

- Ranking: numero total de partidas ganadas de los usuarios y KDA.

# Parte Pública:

- Mostrar cada héroe (nombre, descripción, posicion, vida, ataque, defensa, mana, energia).

- Mostrar los conjuntos de objetos guardados del héroe seleccionado

- Consultar liga (nombre de liga, posición en la liga (hierro, bronce, plata, oro, diamante, platino))

- Consultar héroe segun posición  (adc, support, top, mid, jungla).

- Consultar héroe segun su dificultdad de manejo (nivel de dificultdad).

- Consultar ranking de victorias totales y KDA.

# Parte Privada:

- Un usuario podrá cambiar de region (Europa norte, Europa sur/ Asia/ Oceanía)

- Un usuario tendrá una lista de 5 héroes que él elija como favoritos o personajes que suele utilizar.

- Area personal: Mostrar información del usuario (nick, servidor, pais, edad, ELO).

- Builds Usuario: Un usuario podrá crear conjuntos de objetos y se mostrara en un historico .

- Existirá un usuario administrador que se encargara de gestionar los héroes (añadir, borrar y mofificar caracteristicas) ademas de gestionar el ranking)
# Servicio interno:
- Enviar una notificación a traves e-mail a los usuarios en caso de lanzarse un nuevo personaje, proporcionando caracteristicas de dicho héroe.
# Diagrama E/R
![digrama](https://user-images.githubusercontent.com/61190606/74888391-1914ce00-537e-11ea-9dde-71579f9f30cf.jpg)

# Diagrama UML
![UML](https://user-images.githubusercontent.com/60217867/74888084-457c1a80-537d-11ea-8a9d-83dda8cd7e5b.jpg)
