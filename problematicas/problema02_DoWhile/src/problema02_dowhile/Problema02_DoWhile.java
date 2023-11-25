/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema02_dowhile;

/**
 *
 * @author jdgua
 */
public class Problema02_DoWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int contador = 4;
        int suma = 2;
        
        do {
            System.out.printf("%d\n",
                    suma);
            suma = suma + contador;
            contador = contador + 2;
            
        } while (suma <= 110);   
    }
    
}
