package br.com.fecaf.model;

import java.util.Scanner;

public class Retangulo {
    // Isso é um atributo
    public double lado1, lado2, area, perimetro;

    // Instancia Scanner
    Scanner scanner = new Scanner(System.in);

    public boolean cadastrarRetangulo () {
        System.out.println("/***********************/");
        System.out.println("/* Cadastro Retangulo  */");
        System.out.println("/***********************/");
        System.out.print("Informe o lado 1: ");
        lado1 = scanner.nextDouble();
        System.out.print("Informe o lado 2: ");
        lado2 = scanner.nextDouble();
        System.out.println("/***********************/");
        return true;
    }

    public void exibirRetangulo() {
        System.out.println("/*** Exibir Retangulo  ***/");
        System.out.println("O lado 1 é: " + lado1);
        System.out.println("O lado 2 é: " + lado2);
        System.out.println("A area é: " + area);
        System.out.println("O perimetro é: " + perimetro);
        System.out.println("/****************************/");
    }

    public void calcularArea () {
        System.out.println("/*  Calculando Area  */");
        area = lado1 * lado2;
        System.out.println("A area do Retangulo é: " + area);
    }

    public void calcularPerimetro () {
        System.out.println("/*  Calculando Perimetro  */");
        perimetro = 2 * lado1 + 2 * lado2;
        System.out.println("O perimetro do retangulo é: " + perimetro);
    }

    public boolean validarQuadrado () {
        System.out.println("/* Definindo se é Quadrado */");

        if (lado1 == lado2) {
            System.out.println("Isso é um Quadrado...");
            return true;
        }

        return false;


    }




}
