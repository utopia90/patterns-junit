package com.patterns.structural.decorator;

/**
 * Componente abstracta
 * Componente concreto
 *
 * Decorador:
 *      Decorador concreto 1
 *      Decorador concreto 2
 */
public class Main {

    public static void main(String[] args) {


        Shape rectangulo = new Rectangle();
        rectangulo.draw();

        System.out.println("===========================");
        Shape rectanguloDecorado = new BorderStyleDecorator(rectangulo, "solid");
        rectanguloDecorado.draw();


        System.out.println("===========================");
        Shape rectanguloDecoradoDecorado = new BorderThicknessDecorator(rectanguloDecorado, "2px");
        rectanguloDecoradoDecorado.draw();



    }
}
