/**
 * Laboratório de Programação 2 - Lab 1
 * 
 * @author Letícia Farias - 121110394
 */

//package lp2.lab01;
// OCDEtAO1FhON
import java.util.Scanner;

public class atv4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String sinal = sc.nextLine();

        if (sinal.equals("+") || sinal.equals("-") || sinal.equals("*") || sinal.equals("/") ){ // algo na lógoca está errado
        } else{
            System.out.println("ENTRADA INVALIDA");
            System.exit(1);
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
            if (resul != 0){
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
            if (resul == 0){
                System.out.println("ERRO");  
            }else {
                System.out.println("RESULTADO: " + resul);
            }
        }

        
        
        
    } 
}
// que código terrivel
