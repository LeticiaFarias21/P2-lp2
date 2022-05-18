/**
 * Laboratório de Programação 2 - Lab 1
 * 
 * @author Letícia Farias Costa - 0121110394
 */
// python dirlididi.py submit id_questão OCDEtAO1FhON Programa.java
//OCDEtAO1FhON
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class truncada {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        boolean ver = true;
        int count = 0;
        String dados = "";
       
        while (ver){
            String entrada = sc.nextLine();
            String[] processamentoEntrada = entrada.split(" ");
            
            if(entrada.equals("-")){
                ver = false;
                //return;
            }else{
                dados += processamentoEntrada[1]+ " ";
                count += 1;
            }
        }

        String[] strNota = dados.split(" ");
        int size = strNota.length;
        Integer[] intNota = new Integer [size];
        int soma = 0;
    
        for (int i = 0; i < size; i++){
            intNota[i] = Integer.parseInt(strNota[i]);
            soma += intNota[i];
        }
        
        int maior = Collections.max(Arrays.asList(intNota));
        int menor = Collections.min(Arrays.asList(intNota));
        int media = soma / size;
        int acima = 0;
        int abaixo = 0;
        
        for (int i = 0; i < size; i++){
            if (intNota[i] >= 700){
                acima++;
            }else if (intNota[i] < 700){
                abaixo++;
            }
        }

        System.out.println("maior: " + maior);
        System.out.println("menor: " + menor);
        System.out.println("media: " + media);
        System.out.println("acima: " + acima);
        System.out.println("abaixo: " + abaixo);
        // System.out.println(intNota[0]);
        // System.out.println(intNota[1]);
        // System.out.println(intNota[2]);
        // System.out.println(intNota[3]);
    }    
}
