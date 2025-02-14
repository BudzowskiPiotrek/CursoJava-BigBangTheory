# CursoJava-BigBangTheory
Examen Programación : Aplicación sobre seria "The Big Bang Theory" 
Imagina que te mudas a un complejo de apartamentos en el 2311 de North Los Robles Avenue, Pasadena, California. Tu piso es el 5A y al llegar te encuentras que el ascensor no funciona, subes las escaleras y cuando llegas al apartamento estás totalmente agotado y justo cuando vas a entrar en él suena la llamada en la puerta. El comienzo del ejercicio deberá recrear esta conversación:

(Tu vecino) Vecino. Vecino. Vecino.
(Tú) Eh... hola, ¿puedo ayudarte?
(Tu vecino) ¡Ah, excelente! Me presento: soy el Dr. Sheldon Cooper, físico teórico del Instituto Tecnológico de California. Según las normas del edificio, mi deber es conocer a los nuevos inquilinos. ¿Cuál es tu nombre?
(Tú) Oh... eh... soy [XXXXX].
(Tu vecino) Perfecto, [XXXXX]. Ahora que hemos establecido una relación cordial basada en normas sociales mínimas, creo que es un momento adecuado para ponerte a prueba intelectualmente. Tengo preparados un par de actividades para poner a prueba tus habilidades. ¿Estás listo?
(Tú) Supongo que sí. ¿Qué tienes en mente?
Tras esta conversación se mostrará un menú que se repetirá hasta que se decida salir. El menú debe permitir realizar varias opciones:

Apostar
Adivinar
Jugar
Pelear
Salir
Si elegimos:

Apostar:
Crea un array de números enteros de 10 posiciones y rellénalo con números aleatorios entre 1 y 100.
Sheldon elegirá aleatoriamente una posición del array, y el usuario seleccionará otra.
Compara los números en las posiciones seleccionadas por ambos. Quien tenga el número más alto, gana.
Muestra el resultado (quién ganó o si hubo un empate).
Vuelve al menú principal después de completar el juego.

Adivinar:
Sheldon pensará en un número aleatorio entre 1 y 10.
El usuario tendrá dos oportunidades para adivinarlo.
Después de la primera oportunidad, Sheldon indicará si el número introducido es demasiado bajo o demasiado alto.
Si tras las dos oportunidades no aciertas, Sheldon se reirá de ti con un mensaje humorístico y el programa volverá al menú principal.
Controla que los valores introducidos sean numéricos.
Implementa una excepción personalizada para verificar que el número introducido no sea menor que 1 ni mayor que 10. Si el número no está en este rango, lanza una excepción con un mensaje adecuado.

Jugar:
Sheldon propondrá un juego de "Piedra, Papel o Tijera" al mejor de tres rondas.
El usuario seleccionará una opción (Piedra, Papel o Tijera) y Sheldon generará una opción aleatoria.
Determina el ganador según las reglas del juego clásico (Piedra vence a Tijera, Tijera vence a Papel, Papel vence a Piedra).
Si Sheldon gana, dirá: "No eres rival para mí", y el programa terminará inmediatamente.
Si el usuario gana o hay un empate, regresa al menú principal.

Pelear:
Si el usuario selecciona esta opción, Sheldon responderá:
"¿De verdad esperas que participe en una demostración primitiva de fuerza bruta? Eso sería como pedirle a un premio Nobel que compita en un concurso de comer hot dogs. No, gracias."
Después de este mensaje, el programa finalizará automáticamente.
Salir:
Permite al usuario terminar el programa manualmente y despedirse de Sheldon.

Normas y puntuación
El proyecto que presente errores de compilación y no permita su ejecución NO SE EVALUARÁ.
El proyecto debe estar formateado correctamente evitando espacios innecesarios y texto comentado que no aporte ninguna funcionalidad (-0.5 puntos).
Presentación: En el transcurso de la presentación, el nombre debe ser almacenado en una variable y ser utilizado cuando Sheldon se dirija a nosotros (1 punto).
Menú: Implementación correcta del menú incluida la finalización del programa bajo la opción de salir (2 puntos).
Apostar: Implementación correcta y funcional del método apostar() (2 puntos).
Adivinar: Implementación correcta y funcional del método adivinar() (2 puntos).
Jugar: Implementación correcta y funcional del método jugar() (2 puntos).
Pelear: Implementación correcta y funcional del método pelear() (1 punto).
