/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sumadosnumeros;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Sumadosnumeros {

    public static void main(String[] args) {
       // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese el primer número
        System.out.print("Ingrese el primer número: ");
        double numero1 = scanner.nextDouble();

        // Solicitar al usuario que ingrese el segundo número
        System.out.print("Ingrese el segundo número: ");
        double numero2 = scanner.nextDouble();

        // Cerrar el objeto Scanner después de su uso
        scanner.close();

        // Calcular la suma de los dos números
        double suma = numero1 + numero2;

        // Mostrar el resultado
        System.out.println("La suma de " + numero1 + " y " + numero2 + " es: " + suma);
    }
}
