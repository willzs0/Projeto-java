package br.com.fecaf.controller;

import br.com.fecaf.model.Circulo;
import br.com.fecaf.model.Retangulo;
import br.com.fecaf.model.Triangulo;

import java.util.Scanner;

public class Menu {

    Scanner scanner = new Scanner(System.in);

    public void executarMenu() {

        boolean exit = false;

        while (!exit) {

            System.out.println("/************************/");
            System.out.println("/*      Geometria       */");
            System.out.println("/************************/");
            System.out.println("/* 1 - Circulo          */");
            System.out.println("/* 2 - Retângulo        */ ");
            System.out.println("/* 3 - Triângulo        */");
            System.out.println("/* 4 - Sair             */");
            System.out.println("/************************/");
            System.out.print("Informe a opção desejada:");

            int optionUser = scanner.nextInt();

            switch (optionUser) {
                case 1:

                    Circulo circulo = new Circulo();
                    boolean validaCadastro = false;
                    boolean exitCirculo = false;

                    while (!exitCirculo) {

                        System.out.println("/*************************/");
                        System.out.println("/*        Circulo        */");
                        System.out.println("/*************************/");
                        System.out.println("/* 1 - Cadastrar Circulo */");
                        System.out.println("/* 2 - Calcular Area     */");
                        System.out.println("/* 3 -Calcular Perimetro */");
                        System.out.println("*/ 4 - Sair              */");
                        System.out.println("/*************************/");

                        System.out.print("Escolha uma opção: ");

                        int optionCirculo = scanner.nextInt();


                        switch (optionCirculo) {
                            case 1:
                                System.out.println("Cadastrando Circulo...");
                                validaCadastro = circulo.cadastrarCirculo();
                                break;
                            case 2:
                                if (validaCadastro) {
                                    System.out.println("Calculando Área");
                                    circulo.calcularArea();
                                } else {
                                    System.out.println("Cadastre um Circulo..");
                                }
                                break;
                            case 3:
                                if (validaCadastro) {
                                    System.out.println("Calculando Perimetro...");
                                    circulo.calcularPerimetro();
                                }else {
                                    System.out.println("Cadastre um Circulo..");
                                }
                                break;
                            case 4:
                                System.out.println("Voltando para Menu...");
                                exitCirculo = true;
                                break;
                            default:
                                System.out.println("Opção Inválida...");
                        }

                    }
                    break;
                case 2:
                    boolean exitRetangulo = false;
                    // Cria um objet
                    Retangulo retangulo = new Retangulo();
                    boolean validaRetangulo = false;

                    while (!exitRetangulo) {
                        System.out.println("/***/");
                        System.out.println("/*       Retangulo       */");
                        System.out.println("/***/");
                        System.out.println("/* 1 - Cadastrar Retangulo*/");
                        System.out.println("/* 2 - Calcular Area     */");
                        System.out.println("/* 3 -Calcular Perimetro */");
                        System.out.println("/* 4 - Definir Quadrado  */");
                        System.out.println("*/ 5 - Sair              */");
                        System.out.println("/***/");

                        System.out.print("Escolha uma opção: ");

                        int optionRetangulo = scanner.nextInt();

                        switch (optionRetangulo) {
                            case 1:
                                System.out.println("/****/");
                                System.out.println("/* Cadastrando Retangulo  */");
                                System.out.println("/****/");
                                validaRetangulo = retangulo.cadastrarRetangulo();
                                System.out.println("/****/");
                                break;
                            case 2:
                                if (validaRetangulo) {
                                    System.out.println("Calculando Área");
                                    retangulo.calcularArea();
                                } else {
                                    System.out.println("Cadastre um Retangulo..");
                                }

                                break;
                            case 3:

                                if (validaRetangulo) {
                                    System.out.println("Calculando Perimetro...");
                                    retangulo.calcularPerimetro();
                                }else {
                                    System.out.println("Cadastre um Retangulo..");
                                }

                                break;
                            case 4:
                                System.out.println("/* Definindo Quadrado    */");
                                if(validaRetangulo) {
                                    retangulo.validarQuadrado();
                                }
                                break;
                            case 5:
                                System.out.println("Saindo...");
                                exitRetangulo = true;
                                break;
                            default:
                                System.out.println("Escolha uma opçao valida...");
                        }

                    }



                    break;
                case 3:
                    Triangulo triangulo = new Triangulo();
                    boolean validaTriangulo = false;
                    boolean exitTriangulo = false;

                    while (!exitTriangulo) {

                        System.out.println("/*************************/");
                        System.out.println("/*        Triangulo       */");
                        System.out.println("/*************************/");
                        System.out.println("/* 1 - Cadastrar Triangulo */");
                        System.out.println("/* 2 - Calcular Area     */");
                        System.out.println("/* 3 -Calcular Perimetro */");
                        System.out.println("*/ 4 - Sair              */");
                        System.out.println("/*************************/");

                        System.out.print("Escolha uma opção: ");

                        int optionTriangulo = scanner.nextInt();


                        switch (optionTriangulo) {
                            case 1:
                                System.out.println("Cadastrando Triangulo..");
                                validaTriangulo = triangulo.cadastrarTriangulo();
                                break;
                            case 2:
                                if (validaTriangulo) {
                                    System.out.println("Calculando Área");
                                    triangulo.calcularArea();
                                } else {
                                    System.out.println("Cadastre um Triangulo..");
                                }
                                break;
                            case 3:
                                if (validaTriangulo) {
                                    System.out.println("Calculando Perimetro...");
                                    triangulo.calcularPerimetro();
                                } else {
                                    System.out.println("Cadastre um triangulo..");
                                }
                                break;
                            case 4:
                                System.out.println("Voltando para Menu...");
                                exitTriangulo = true;
                                break;
                            default:
                                System.out.println("Opção Inválida...");
                        }

                    }



                    break;
                case 4:
                    System.out.println("Saindo ....");
                    exit = true;
                    break;
                default:
                    System.out.println("Opção Inválida...");
            }

        }
    }
}
