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
            System.out.println("1.Ir para o Guarujá\n"
                    + "2.Calcular quantidade de produtos\n"
                    + "3.Calcular IMC\n"
                    + "4.Calcular KWh\n"
                    + "5.Calcular tarifa Àgua e Esgoto\n"
                    + "6.Integrantes do Grupo\n"
                    + "7.Sair\n");
            System.out.println("Digite uma Opção:");
            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("*--Vamos ir Para o Guarujá--*\n \n");
                    int graus, orcamento = 0;
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

            }if (orcamento < 2000) {
                System.out.println("Você não tem dinheiro suficiente \n");

            } else if (orcamento > 2000) {
                System.out.println("Você pode viajar! \n");
            }
        }
                
                    break;
                    
                case 2:
                    System.out.println("*--Calcular quantidade de produtos--*\n \n");
                    break;
                case 3:
                    System.out.println("*--Calcular IMC--*\n \n");
                    break;
                case 4:
                    System.out.println("*--Calcular KWh--*\n \n");
                    break;
                case 5:
                    System.out.println("*--Calcular tarifa Àgua e Esgoto--*\n \n");
                    break;
                case 6:
                    System.out.println("*--Integrantes do Grupo--*\n \n");
                    break;
                case 7:
                    System.out.println("Saindo");
                    break;
                default:
                    System.out.println("Número Invalido");
            }
        }while (opcao != 7);
    }
    
}
