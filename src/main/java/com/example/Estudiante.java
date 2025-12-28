package com.example;

public class Estudiante {

    private String nombre;
    private double nota_1;
    private double nota_2;
    private double nota_3;

    public Estudiante(String nombre, double nota_1, double nota_2, double nota_3) {
        this.nombre = nombre;
        this.nota_1 = nota_1;
        this.nota_2 = nota_2;
        this.nota_3 = nota_3;
    }

    public String getNombre() {
        return nombre;
    }

    public double calcularPromedio() {
        return (nota_1 + nota_2 + nota_3)/3;
    }

    public String getEstado() {
        return calcularPromedio() >= 3.0 ? "Aprobado" : "Reprobado";
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre +
               " | Promedio: " + String.format("%.2f", calcularPromedio()) +
               " | Estado: " + getEstado();
    }
}
