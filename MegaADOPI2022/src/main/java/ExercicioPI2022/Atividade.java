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
            System.out.println("1.Créditos\n"
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
                            + "Amaurilio Silva\n"
                            + "Amaury Silva\n"
                            + "Catiane Souza\n"
                            + "Cintia Gentil\n"
                            + "Erik Sousa\n "
                            + "Leonardo Sousa.\n");
                    break;
                case 2:
                    System.out.println("*--Vamos ir Para o Guarujá--*\n \n");
                    int graus,
                     orcamento = 0;
                    String chovendo;
                    System.out.println("Desenvolver programa para decidir se podemos ir para o Guarujá no final de semana");

                    System.out.println("Quantos graus está fazendo hoje?");
                    graus = input.nextInt();

                    if (graus <= 25) {
                        System.out.println("A temperatura não está ideal.");

                    } else {
                        System.out.println("Está chovendo?");
                        chovendo = input.next();

                        if (chovendo.equals("sim") || chovendo.equals("Sim")) {
                            System.out.println("Não vai dar para ir para a praia esse final de semana.");

                        } else if (chovendo.equals("Não") || chovendo.equals("não")) {
                            System.out.println("Ótimo! falta uma etapa.");
                            System.out.println("Quanto você pretende levar para a praia?");
                            orcamento = input.nextInt();

                        }
                        if (orcamento < 2000) {
                            System.out.println("Você não tem dinheiro suficiente. \n");

                        } else if (orcamento > 2000) {
                            System.out.println("Você pode viajar! \n");
                        }
                    }
                    break;

                case 3:
                    System.out.println("*--Calcular valor dos produtos--*\n \n");
                    System.out.println("Desenvolver um programa para calcular 10% de desconto no preço total de um produto ao comprar 10 ou mais unidades ou o preço total cheio se tiver menos de 10 unidades");

                    int produto;
                    double valor,
                     total,
                     totald,
                     desconto;

                    System.out.println("Quantos itens você está comprando?");
                    produto = input.nextInt();

                    System.out.println("Quantas custa?");
                    valor = input.nextDouble();

                    total = (produto * valor);
                    desconto = (total * 10) / 100;

                    if (produto >= 10) {

                        totald = total - desconto;
                        System.out.println("Você irá pagar: " + totald);

                    } else {
                        System.out.println("Você irá pagar: " + total);
                    }

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
                                + " corporal indica que você está abaixo do peso :( \n");

                    } else if (imc >= 18.5 && imc < 24.9) {
                        System.out.println("De acordo com o cálculo, seu índice de massa"
                                + " corporal indica que seu peso está normal, Parabéns :)\n");

                    } else if (imc >= 24.9 && imc < 30) {
                        System.out.println("De acordo com o cálculo, seu índice de massa"
                                + "corporal indica que você está com sobrepeso :(\n");

                    } else {
                        System.out.println("De acordo com o cálculo, seu índice de massa"
                                + "corporal indica que você está com obesidade :(\n ");
                    }
                    break;
                case 5:
                    System.out.println("*--Calcular KWh--*\n \n");
                    double energia,
                     tusd;
                    float fatura;
                    energia = 0.28738;
                    tusd = 0.30711;
                    int consumok;

                    System.out.println("Informe o seu comsumo de kWh");
                    consumok = input.nextInt();

                    fatura = (float) ((consumok * energia) + (consumok * tusd));

                    System.out.printf("Sua fatura é de %.2f Reais.\n", fatura);
                    break;
                case 6:
                    System.out.println("*--Calcular tarifa Àgua e Esgoto--*\n ");

                    float agua;
                    float taxa = (float) 29.00;
                    System.out.println("Digite o Consumo da agua em metro cubicos: ");
                    agua = input.nextFloat();

                    if (agua <= 10) {
                        System.out.println("Total a pagar: " + (taxa * 2) + "R$");
                    } else if ( agua <= 20) {
                        System.out.println("Total a pagar: " + 2 * (taxa + (agua - 20) * 4.54) + "R$");

                    } else if ( agua <= 50) {
                        System.out.println("Total a pagar: " + 2 * (taxa + 10 * 4.54 + (agua - 20) * 11.33));

                    } else {
                        System.out.printf("Total a pagar: %.2f%n ", 2 * (taxa + 10 * 4.54 + 30 * 11.33 + (agua - 50) * 12.48));
                    }

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
