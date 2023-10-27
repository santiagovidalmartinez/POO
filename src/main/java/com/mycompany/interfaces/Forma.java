
package com.mycompany.interfaces;

public class Triangulo implements Forma{
    private double lado;

    public Triangulo(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return lado * lado /2 ;
    }

    @Override
    public double calcularPerimetro() {
        return lado + lado + lado ;
    }
}
    
    

