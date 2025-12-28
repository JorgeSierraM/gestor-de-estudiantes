package com.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Estudiante> estudiantes = new ArrayList<>();
        int opcion;
        final int AGREGAR = 1;
        final int LISTAR = 2;
        final int Buscar = 3;
        final int SALIR = 4;

        do {
            System.out.println("===== SISTEMA DE ESTUDIANTES =====");
            System.out.println("1. Agregar estudiante");
            System.out.println("2. Listar estudiantes");
            System.out.println("3. Buscar estudiante");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();
            
            switch (opcion) {
                case AGREGAR:
                    
                    double n1;
                    double n2;
                    double n3;
                    System.out.print("Nombre del estudiante: ");
                    String nombre = sc.nextLine();
                    while (true) {
                        System.out.print("Nota 1: ");
                        n1 = sc.nextDouble();

                        if (n1 >= 0 && n1 <= 5) {
                            break;
                        } else {
                            System.out.println("Nota invalida, ingrese una nota entre 0,0 y 5,0");
                        }
                    }
                    while (true) {
                        System.out.print("Nota 2: ");
                        n2 = sc.nextDouble();

                        if (n2 >= 0 && n2 <= 5) {
                            break;
                        } else {
                            System.out.println("Nota invalida, ingrese una nota entre 0,0 y 5,0");
                        }
                    }
                    while (true) {
                        System.out.print("Nota 3: ");
                        n3= sc.nextDouble();

                        if (n3 >= 0 && n3 <= 5) {
                            break;
                        } else {
                            System.out.println("Nota invalida, ingrese una nota entre 0,0 y 5,0");
                        }
                    }

                    estudiantes.add(new Estudiante(nombre, n1, n2, n3));
                    System.out.println("✅ Estudiante agregado correctamente.");
                    break;
            
                default:
                    break;
            }

        } while (opcion != 4);
    }
}