/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema01_dowhile;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author jdgua
 */
public class Problema01_DoWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        // declaración de variables
        String nombre;
        String posicion;
        int edad;
        double estatura;
        int contador = 0;
        int suma_edad = 0;
        double suma_estatura = 0;
        double promedio_edad;
        double promedio_estatura;
        String salida;
        // la cadena acumula listado de jugadores
        String cadenaA = "Listado de jugadores\n";
        // la cadena acumula listado de edades
        String cadenaB = "Listado de edades\n";
        boolean bandera = true;

        // inicia el ciclo
        do {
            System.out.println("Ingrese el nombre del Jugador: ");
            nombre = entrada.nextLine();
            System.out.println("Ingrese la posición en el campo: ");
            posicion = entrada.nextLine();
            System.out.println("Ingrese la edad del Jugador: ");
            edad = entrada.nextInt();
            System.out.println("Ingrese la estatura del Jugador: ");
            estatura = entrada.nextDouble();
            // limpieza de buffer
            entrada.nextLine();
            // sumo la edad 
            suma_edad = suma_edad + edad;
            // sumo la estatura
            suma_estatura = suma_estatura + estatura;
            // se le suma 1 al contador
            contador = contador + 1;
            // la cadena acumula el contador, nombre, posición, edad y estatura
            cadenaA = String.format("%s%d. %s -%s-, edad %d, estatura "
                    + "%.2f\n",
                    cadenaA,
                    contador,
                    nombre,
                    posicion,
                    edad,
                    estatura);
            // la cadena acumula la edad ingresada
            cadenaB = String.format("%s%d\n",
                    cadenaB,
                    edad);
            System.out.println("Ingrese (si) para terminar de ingresar datos"
            );
            salida = entrada.nextLine();
            // si se ingresa si se sale del ciclo, caso contrario se repite
            if (salida.equals("si")) {
                bandera = false;
            }

        } while (bandera); //(bandera == true)

        promedio_edad = (double) suma_edad / contador;
        promedio_estatura = suma_estatura / contador;
        System.out.printf("%s%sPromedio de edades: %.1f\nPromedio de "
                + "estaturas: %.2f\n",
                cadenaA,
                cadenaB,
                promedio_edad,
                promedio_estatura);
    }

}
