/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ExercicioPI2022;

import java.util.Scanner;

/**
 *
 * @author Leonardo
 */
public class Atividade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int opcao;
        do {
            System.out.println("1. Créditos"
                    + "2.Ir para o Guarujá\n"
                    + "3.Calcular quantidade de produtos\n"
                    + "4.Calcular IMC\n"
                    + "5.Calcular KWh\n"
                    + "6.Calcular tarifa Àgua e Esgoto\n"
                    + "7.Sair\n");
            System.out.println("Digite uma Opção:");
            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Trabalho realizado por: "
                            + "Amaurilio Silva"
                            + "Amaury Silva"
                            + "Catiane Souza"
                            + "Cintia Gentil"
                            + "Erik Sousa "
                            + "Leonardo Sousa");
                case 2:
                    System.out.println("*--Vamos ir Para o Guarujá--*\n \n");
                    int graus,
                     orcamento = 0;
                    String chovendo;
                    System.out.println("Desenvolver programa para decidir se podemos ir para o Guarujá no final de semana");

                    System.out.println("Quantos graus está fazendo hoje?");
                    graus = input.nextInt();

                    if (graus <= 25) {
                        System.out.println("A temperatura não está ideal");

                    } else {
                        System.out.println("Está chovendo?");
                        chovendo = input.next();

                        if (chovendo.equals("sim") || chovendo.equals("Sim")) {
                            System.out.println("Não vai dar para ir para a pria esse final de semana.");

                        } else if (chovendo.equals("Não") || chovendo.equals("não")) {
                            System.out.println("Ótimo! falta uma etapa.");
                            System.out.println("Quanto você pretende levar para a praia?");
                            orcamento = input.nextInt();

                        }
                        if (orcamento < 2000) {
                            System.out.println("Você não tem dinheiro suficiente \n");

                        } else if (orcamento > 2000) {
                            System.out.println("Você pode viajar! \n");
                        }
                    }
                    break;

                case 3:
                    System.out.println("*--Calcular quantidade de produtos--*\n \n");
                    break;
                case 4:
                    System.out.println("*--Calcular IMC--*\n \n");
                    float altura,
                     peso,
                     imc;

                    System.out.println("Insira o seu peso: ");
                    peso = input.nextFloat();
                    System.out.println("Insira sua altura: ");
                    altura = input.nextFloat();

                    imc = peso / (altura * altura);

                    if (imc < 18.5) {
                        System.out.println("De acordo com o cálculo, seu índice de massa"
                                + " corporal indica que você está abaixo do peso :( ");

                    } else if (imc >= 18.5 && imc < 24.9) {
                        System.out.println("De acordo com o cálculo, seu índice de massa"
                                + " corporal indica que seu peso está normal, Parabéns :)");

                    } else if (imc >= 24.9 && imc < 30) {
                        System.out.println("De acordo com o cálculo, seu índice de massa"
                                + "corporal indica que você está com sobrepeso :(");

                    } else {
                        System.out.println("De acordo com o cálculo, seu índice de massa"
                                + "corporal indica que você está com obesidade :( ");
                    }
                    break;
                case 5:
                    System.out.println("*--Calcular KWh--*\n \n");
                    break;
                case 6:
                    System.out.println("*--Calcular tarifa Àgua e Esgoto--*\n \n");
                    break;
                
                case 7:
                    System.out.println("Saindo");
                    break;
                default:
                    System.out.println("Número Invalido");
            }
        } while (opcao != 7);
    }

}
