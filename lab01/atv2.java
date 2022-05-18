/**
 * Laboratório de Programação 2 - Lab 1
 * 
 * @author Letícia Farias - 121110394
 */

//package lp2.lab01;
// OCDEtAO1FhON
import java.util.Scanner;

public class atv2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float num1 = sc.nextFloat();
        float num2 = sc.nextFloat();
        float media = (num1 + num2) / 2; 
        if (media >= 7){
            System.out.println("pass: True!");
        }else {
            System.out.println("pass: False!");
        }
        
    }
}