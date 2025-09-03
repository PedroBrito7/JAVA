/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package medianota;

import java.util.Scanner;

/**
 *
 * @author PEDROHENRIQUEBRITODE
 */
public class Medianota {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);


        double peso, altura, imc;

       
        System.out.print("Qual seu peso: ");
        peso = sc.nextDouble();

        System.out.print("Qual sua altura: ");
        altura = sc.nextDouble();

        
        imc = peso / (altura * altura);

        
        if (imc < 20) {
            System.out.println("Abaixo do peso");
        } else if (imc < 25) {
            System.out.println("Peso normal");
        } else if (imc < 30) {
            System.out.println("Sobrepeso");
        } else if (imc < 40) {
            System.out.println("Obeso");
        } else {
            System.out.println("Obeso mórbido");
        }

        sc.close();
    }
}