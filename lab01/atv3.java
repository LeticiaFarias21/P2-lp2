/**
 * Laboratório de Programação 2 - Lab 1
 * 
 * @author Letícia Farias - 121110394
 */

//package lp2.lab01;
// OCDEtAO1FhON
import java.util.Scanner;

public class atv3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        float num1 = sc.nextFloat();
        float num2 = sc.nextFloat();
        float num3 = sc.nextFloat();
        float num4 = sc.nextFloat();

        if (num1 < num2 && num2 < num3 && num3 < num4){
            System.out.println("POSSIVELMENTE ESTRITAMENTE CRESCENTE");
        }else if (num1 > num2 && num2 > num3 && num3 > num4){
            System.out.println("POSSIVELMENTE ESTRITAMENTE DECRESCENTE");
        }else {
            System.out.println("FUNCAO NAO ESTRITAMENTE CRES/DECR");
        }

        
        
        
    }
}
