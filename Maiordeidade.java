/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package maiordeidade;
import java.util.Scanner;
/**
 *
 * @author PEDROHENRIQUEBRITODE
 */
public class Maiordeidade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Digite sua idade: ");
        int x = sc.nextInt();
        if (x >=18){
         System.out.println("Maior de idade");
        }else {
            System.out.println("Menor de idade");
        }
        sc.close();
        // TODO code application logic here
    }
    
}
