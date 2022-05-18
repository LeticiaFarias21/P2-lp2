/**
 * Laboratório de Programação 2 - Lab 1
 * 
 * @author Letícia Farias - 121110394
 */

//package lp2.lab01;
import java.util.Scanner;

public class dobro{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int dobro = num * 2;
        int triplo = num * 3;
        System.out.println("dobro: " + dobro + ", triplo: " + triplo);
    }
}