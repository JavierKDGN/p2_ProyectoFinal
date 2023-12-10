Proyecto Programación

°Integrantes: Javier Alberto Cadagan Parra - Javier Arnoldo Torres Ortiz

°Tema: Sistema de reserva de asientos de autobús

°UML:

°Diagrama de casos de uso:

°Patrones ocupados:
  *Factory: Sabemos que el patrón Factory se utiliza para crear objetos de una jerarquía de clases sin especificar la clase concreta que se va a instanciar. Decidimos ocupar este ya que el cliente no necesita 
            conocer los detalles específicos de cómo se crean los objetos Asiento, simplemente utiliza el Factory para obtener la instancia adecuada según ciertos parámetros (tipo de asiento y número) ademas de 
            que toda la lógica relacionada con la creación de objetos Asiento se centraliza con el factory, lo que facilita el mantenimiento y evita la duplicación de código.
  *Mediator: Sabemos que este se utiliza para centralizar la comunicación y las interacciones entre varios objetos, evitando que estos objetos se comuniquen directamente entre sí. Ocupamos este para se comuniquen 
            ciertos objetos(ventanas) de manera desacoplada a través de un objeto mediador central VentanasMediator.

°Ss de la interfaz:

°Algo que nos ayudo mucho en el camino fue tener el diseño base muy temprano. nos preocupamos de tener todo pensado desde un inicio de como queriamos que se viera y que queriamos que hiciera cada interaccion y cada ventana y esto hizo que luego trabajar en el codigo se nos facilitara mucho ya que teniamos bastante claritud de lo que buscabamos y a lo que teniamos que llegar.
 Empezamos creando los enum y ciudades y horarios, dedicamos harto tiempo a elegir como queriamos definir los recorridos y como iban a funcionar el tema de los asientos y las tarifas y tambien creamos las clases basicas bus y asientos porque encontramos muy importante definir de un inicio la cantidad de asientos de cada tipo para que tipo de bus. 
 En los momentos mas tempranos cuando recien descubrimos el tema que se nos dio pensamos que cada recorrido podria tener un bus seleccionado dependiendo de la ciudad pero luego llegamos a que seria mas comodo y mas entretenido hacer que cada vez que se corra la main se creen 10 recorridos random con origenes,destinos,horarios y un bus al azar así no siempre los busses de un origen "x" a un destino "y" solo tengan un tipo de bus predefinido.
 En la ventana de asientos es donde se ocupado mayor cantidad de tiempo de trabajo, claramente la parte más importante y la mas visual y dificil de implementar. En un inicio se penso en dibujos de figuras con numeros para representar los asientos pero luego optamos por botones para facilitar todo ya que solo habia que hacerles click en los que deseamos seleccionar, los atributos de seleccion y disposicion de cada asiento tambien es un tema importante en los que tuvimos que cambiar partes de codigo.
 Hacer que toda esta ventana luego tuviera representaciones visuales gracias a colores representandos el estado del asiento en cada momento tambien fue de los temas importantes.
 Ya por ultimo una ventana para representar el pago de los asientos seleccionados, la verdad una parte de codigo bastante mas liviana comparada con la recien comentada, cambiando el atributo del asiento de libre a ocupado y cerrando las otras ventanas volviendo a la de recorridos para volver a empezar el proceso de venta de viajes.

°Conclusión: Finalizando este trabajo obtuvimos mayor conocimiento de los patrones gracias a la implementaacion misma de estos, se nos dificulto un poco un poco su uso al ser algo nuevo para nosotros ya que no fue usado anteriormente en las otras tareas. Tambien como una gran dificultadad claramente fue darle una representacion visual a los asientos de los buses y trabajar con tantas clases a diferencia de trabajaos pasados.
             Cosas que nos hubiese gustado mejorar en nuestro proyecto son mejorar la visual del mismo y hacer las ventanas más "agradables" a la vista, con mas decoracion y no tan simples. Tambien nos hubiese gustado colocar un timer en la ventana de confirmacion que luego de un pequeño tiempo si no se pagaban los asientos se volviera a la ventana de recorridos y se deseleccionaran los asientos pero no pudimos por temas de tiempo.
             A pesar de todo estamos satisfechos de nuestro trabajo creemos que funciona correcto, claramente no es perfecto pero es parte de la programacion la diversidad de hacer las cosas y nos divertimos mucho trabajando en el y lo mucho que nos ayudo a mejorar en tema de diseñar codigo, implementacion grafica y avanzar en el mundo de la programacion orientada a objetos.
