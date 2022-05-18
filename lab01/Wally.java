/**
 * Laboratório de Programação 2 - Lab 1
 * 
 * @author Letícia Farias Costa - 0121110394
 */

//OCDEtAO1FhON

import java.util.Scanner;

public class Wally{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        boolean ver = true;

        while (ver){
            String entrada = sc.nextLine();
            String[] lista = entrada.split(" ");
            String nomeFinal = "";
            
            for( int i = 0; i < lista.length; i++){
                if(lista[i].length() == 5){
                    nomeFinal = lista[i];
                }
            }
            
            if (nomeFinal.equals("")){
                nomeFinal = "?";
            }
            if (nomeFinal.equals("wally")){
                ver = false;
                return;
            }
        
        
            
            System.out.println(nomeFinal);
        }
    }

}