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
