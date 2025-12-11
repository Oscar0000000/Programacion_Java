package ejercicios;

import java.util.Scanner;

public class Ejer7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tu edad:");
        int edad = sc.nextInt();
        boolean mayorMenorEdad = edad >= 18;

        System.out.println("¿Eres mayor de edad? " + mayorMenorEdad);
    }
}