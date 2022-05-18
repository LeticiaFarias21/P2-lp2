/**
 * Laboratório de Programação 2 - Lab 1
 * 
 * @author Letícia Farias Costa - 0121110394
 */
// python dirlididi.py submit id_questão OCDEtAO1FhON Programa.java
//OCDEtAO1FhON
//Q36VouKXo
import java.util.Scanner;

public class Voo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int alturaIdeal = sc.nextInt();
        boolean ver = true;
        int leitura1 = sc.nextInt();
        int leitura2 = sc.nextInt();
        
        while (ver){
            int dif = alturaIdeal - leitura1;
            if(alturaIdeal == leitura2){
                System.out.println("OK");
                ver = false;
                return;
            }else if ( leitura2 > leitura1 && leitura2 < alturaIdeal + 99 + dif ){
                System.out.println("ADEQUADO");   
            }else {
                System.out.println("PERIGO");
                leitura2 = 0;
            }
            leitura1 = leitura2;
            leitura2 = sc.nextInt();   
            
        }

    }
}
