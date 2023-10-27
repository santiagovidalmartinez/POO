package com.mycompany.interfaces;


public class Main {
    public static void main(String[] args) {
        // Crear instancias de las formas
        Cuadrado miCuadrado = new Cuadrado(5);
        Circulo miCirculo = new Circulo(3);
        Triangulo miTriangulo = new Triangulo(3);

        // Calcular y mostrar áreas y perímetros
        System.out.println("Área del cuadrado: " + miCuadrado.calcularArea());
        System.out.println("Perímetro del cuadrado: " + miCuadrado.calcularPerimetro());

        System.out.println("Área del círculo: " + miCirculo.calcularArea());
        System.out.println("Perímetro del círculo: " + miCirculo.calcularPerimetro());
        
        System.out.println("Área del triangulo: " + miTriangulo.calcularArea());
        System.out.println("Perímetro del triangulo: " + miTriangulo.calcularPerimetro());
        
    }
}

/*
  Este ejemplo ilustra cómo las interfaces en Java pueden ser utilizadas para definir un contrato común
  (en este caso, métodos para calcular área y perímetro) que varias clases pueden implementar de manera específica.
  Este enfoque facilita la extensión del sistema para incluir nuevas formas geométricas sin modificar el código existente.
*/