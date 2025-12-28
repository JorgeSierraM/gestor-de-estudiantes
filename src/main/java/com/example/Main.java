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
        final int BUSCAR = 3;
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
                            System.out.println("Nota invalida, ingrese una nota entre 0,0 y 5,0.");
                        }
                    }
                    while (true) {
                        System.out.print("Nota 3: ");
                        n3= sc.nextDouble();

                        if (n3 >= 0 && n3 <= 5) {
                            break;
                        } else {
                            System.out.println("Nota invalida, ingrese una nota entre 0,0 y 5,0.");
                        }
                    }

                    estudiantes.add(new Estudiante(nombre, n1, n2, n3));
                    System.out.println("Estudiante agregado correctamente.");
                    break;
                
                case LISTAR:
                    System.out.println("Lista De Estudiantes");
                    if (estudiantes.isEmpty()) {
                        System.out.println("No hay estudiantes registrados.");
                    } else {
                        for (Estudiante estudiante : estudiantes) {
                            System.out.println(estudiante);
                        }
                    }
                    break;
                
                case BUSCAR:
                    System.out.print("Ingresa el nombre del estudiante: ");
                    String buscar = sc.nextLine();

                    for (Estudiante estudiante : estudiantes) {
                        if (estudiante.getNombre().equalsIgnoreCase(buscar)) {
                            System.out.println(estudiante);
                        } else {
                            System.out.println("Estudiante no encontrado.");
                        }
                    }
                    
                    break;

                case SALIR:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion invalida.");
                    break;
            }

        } while (opcion != 4);
        sc.close();
    }
}