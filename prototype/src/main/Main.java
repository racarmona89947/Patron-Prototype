// Esta línea declara el paquete "prototype" al que pertenece la clase.
package main; 
//Importa la clase Scanner del paquete java.util para la entrada de datos.
import java.util.Scanner;

import model.Circle;
import model.Shape;
import model.Square; 

//Declaración de la clase "FruebaFiguras".
public class Main { 
	// Método principal (main) del programa.
    public static void main(String... args) { 
    	// Crea una instancia de Scanner para la entrada de datos.
        Scanner sc = new Scanner(System.in); 
        // Declaración de variables para almacenar la opción del usuario y las coordenadas X e Y.
        int option, posX, posY; 
        // Crea una instancia de la clase Circulo.
        Circle circle = new Circle(); 
        // Crea una instancia de la clase Cuadrado.
        Square square = new Square(); 
        // Declaración de una variable de tipo Figura que se utilizará para clonar las figuras.
        Shape shape; 

        // Establece el nombre del círculo.
        circle.setName("Mi circulo"); 
        // Mueve el círculo a las coordenadas (12, 34).
        circle.move(12, 34); 
        // Establece el nombre del cuadrado.
        circle.setName("Mi cuadrado"); 
        // Mueve el cuadrado a las coordenadas (200, 200).
        circle.move(200, 200); 

        System.out.println("-----------Estas son las figuras originales------");
        System.out.println("Circulo: " + circle.getName());
        System.out.println("Cuadrado: " + square.getName());
        System.out.println("-----------Estas son las Posiciones originales------");
        circle.getPosition();
        square.getPosition();

        System.out.println("Digite la opcion que desea clonar: ");
        System.out.println("1 = Circulo, 2 = Cuadrado");
        // Lee la opción seleccionada por el usuario desde la entrada estándar.
        option = sc.nextInt(); 

        if (option == 1) {
        	// Clona el círculo si la opción es 1.
            shape = circle.clone(); 
        } else {
        	// Clona el cuadrado si la opción no es 1.
            shape = square.clone(); 
        }

        // Agrega " Clonado" al nombre de la figura clonada.
        shape.setName(shape.getName() + " Clonado"); 
        System.out.println("Digite la nueva posicion en x: ");
        // Lee la nueva posición en X desde la entrada estándar.
        posX = sc.nextInt(); 
        System.out.println("Digite la nueva posicion en y: ");
        // Lee la nueva posición en Y desde la entrada estándar.
        posY = sc.nextInt(); 
        // Mueve la figura clonada a las nuevas coordenadas.
        shape.move(posX, posY); 

        System.out.println("----------Esta es la figura clonada: -----------------------");
        // Muestra el nombre de la figura clonada.
        System.out.println(shape.getName()); 
        System.out.println("Esta es la posición del clon: ");
        // Muestra la posición del clon.
        shape.getPosition(); 

        System.out.println("-----------Estas son las figuras originales------");
        System.out.println("Circulo: " + circle.getName());
        System.out.println("Cuadrado: " + square.getName());
        System.out.println("-----------Estas son las Posiciones originales------");
        circle.getPosition();
        square.getPosition();
    }
}
