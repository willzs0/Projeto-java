package br.com.fecaf.model;

import java.util.Arrays;
import java.util.Scanner;

public class Triangulo {
    // Atributos para calcular o Triângulo
    public double base, altura, lado2, lado3, area, perimetro;

    /* Instancia o Objeto Scanner */
    Scanner scanner = new Scanner(System.in);

    public boolean cadastrarTriangulo () {
        System.out.println("/**********/");
        System.out.println("/*      Cadastro Triângulo    */");
        System.out.println("/**********/");
        System.out.println(" Informe a base");
        base = scanner.nextDouble();
        System.out.println(" Informe o lado2: ");
        lado2 = scanner.nextDouble();
        System.out.println(" Informe o lado3: ");
        lado3 = scanner.nextDouble();
        System.out.println(" Informe a altura: ");
        altura = scanner.nextDouble();

        System.out.println("/**********/");

        return true;
    }

//    public void exibirTriangulo() {
//        System.out.println("/**********/");
//        System.out.println("/*    Resultado do Triângulo  */");
//        System.out.println("/**********/");
//        System.out.println("A Área do triângulo é igual a: " + area);
//        System.out.println("O Perímetro do triângulo é igual a: " + perimetro);
//        System.out.println("/**********/");
//    }

    public void calcularArea() {
        System.out.println("/**********/");
        System.out.println("/*       Calculando Área      */");
        System.out.println("/**********/");

        area = (base * altura) / 2;
        System.out.println("/* A Área do triângulo é igual a: */" + area);
        System.out.println("/*************/");
    }

    public void calcularPerimetro() {
        System.out.println("/**********/");
        System.out.println("/*    Calculando Perimetro    */");
        System.out.println("/**********/");
        perimetro = base + lado2 + lado3;

        System.out.println("/* O Perímetro do triângulo é igual a: */" + perimetro);
        System.out.println("/***************/");

    }

    /* Definir tipos de triângulo */
    /* Equilatero - Escaleno - Isosceles */

    public void definirTipo () {
        System.out.println("/**********/");
        System.out.println("/*       Definindo Tipo       */");
        System.out.println("/**********/");

        if (base == lado2 && base == lado3) {
            System.out.println("Esse triângulo é um Equilátero...");
        } else if (base != lado2 && base != lado3 && lado2 != lado3) {
            System.out.println("Esse triângulo é um Escaleno...");
        } else {
            System.out.println("Esse triângulo é um Isosceles...");
        }

    }

    //DESAFIO
    /*No triângulo retângulo, o lado oposto ao ângulo reto é chamado de hipotenusa
    os demais lados são chamados de catetos. */


    //Defini se é um triangulo Retangulo/
    public void trianguloRetangulo(){
        System.out.println("/***********/");
        System.out.println("/* Definindo Triangulo Retangulo */");
        System.out.println("/***********/");


        if ((base = base * base) + (lado2 = lado2 * lado2) == (lado3 = lado3 * lado3) ){
            System.out.println("Esse é um Triangulo Retangulo");
        }else {
            System.out.println("Não é um Triangulo Retangulo");
        }

    }
    //Verifica se o triangulo faz parte do padrao 3 4 5.

    public void verificacaoTriangulo(){
        System.out.println("/***********/");
        System.out.println("/* Verificar Padrão 3 4 5 */");
        System.out.println("/***********/");

        // Encontra o maior lado hipotenusa
        double hip = base;
        if (lado2 > hip) {
            hip = lado2;
        }
        if (lado3 > hip) {
            hip = lado3;
        }

        // Determina os catetos
        double cat1 = base;
        double cat2 = lado2;
        if (hip == lado3) {
            cat1 = base;
            cat2 = lado2;
        } else if (hip == lado2) {
            cat1 = base;
            cat2 = lado3;
        }
        //Ordena os lados
        double[] lados = {hip, cat1, cat2};
        Arrays.sort(lados);


        // Verifica se faz parte do padrão 3 4 5
        if ( Math.pow(lados[2], 2) + Math.pow(lados[1], 2) == Math.pow(lados[0], 2)){
            System.out.println("Esse Triangulo faz parte do Padrão 3 4 5");
        } else {
            System.out.println("Esse Triangulo não faz parte do Padrão 3 4 5");
        }
    }

}




