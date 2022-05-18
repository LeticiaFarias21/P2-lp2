/**
 * Laboratório de Programação 2 - Lab 1
 * 
 * @author Letícia Farias - 121110394
 */

//package lp2.lab01;
// OCDEtAO1FhON
import java.text.BreakIterator;
import java.util.Scanner;

public class atv4_2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String sinal = sc.nextLine();


        boolean valido = (sinal.equals("+") || sinal.equals("-") || sinal.equals("*") || sinal.equals("/"));
        
        if (valido == false){
        System.out.println("ENTRADA INVALIDA");
        System.exit(0);
        }

        float num1 = sc.nextFloat();
        float num2 = sc.nextFloat();

        if (sinal.equals("+")  ){
            float resul = num1 + num2;
            if (resul != 0){
                System.out.println("RESULTADO: " + resul);
            }else {
                System.out.println("ERRO");
            }   
        }else if (sinal.equals("-") ){
            float resul = num1 - num2;
            if (resul == 0){
                System.out.println("RESULTADO: " + resul);
            }else {
                System.out.println("ERRO");
            }
            
        }else if (sinal.equals("*")){
            float resul = num1 * num2;
            if (resul != 0){
                System.out.println("RESULTADO: " + resul);
            }else {
                System.out.println("ERRO");
            }
            
        }else if (sinal.equals("/") ){
            float resul = num1 / num2;
            if (num1 < 0.1){
                System.out.println("ERRO");  
            }else {
                System.out.println("RESULTADO: " + resul);
            }
        }
    }
}
