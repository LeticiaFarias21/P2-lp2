/**
 * Laboratório de Programação 2 - Lab 1
 * 
 * @author Letícia Farias - 121110394
 */

//package lp2.lab01;
// OCDEtAO1FhON

import java.util.Scanner;

public class calculadora {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String sinal = sc.nextLine();
        boolean valido = (sinal.equals("+") || sinal.equals("-") || sinal.equals("*") || sinal.equals("/"));

        if (valido == true){
        } else{
            System.out.println("ENTRADA INVALIDA");
            System.exit(1);
        }

        Double num1 = sc.nextDouble();
        Double num2 = sc.nextDouble();
        Double soma;
        if (sinal.equals("+")){
            soma = num1 + num2;
            System.out.println("RESULTADO: " + soma );
        }else if(sinal.equals("-")){
            soma = num1 - num2;
            System.out.println("RESULTADO: " + soma );
        }else if(sinal.equals("*")){
            soma = num1 * num2;
            System.out.println("RESULTADO: " + soma );
        }else if(sinal.equals("/")){
            if (num2.equals("0")){
                System.out.println("ENTRADA INVALIDA");
            } else{
                soma = num1 / num2;
                System.out.println("RESULTADO: " + soma );
            }
        
        }

    }
}