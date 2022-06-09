/**
 * Laboratório de Programação 2 - Lab 2
 * 
 * @author Letícia Farias Costa - 0121110394
 */

package lab2;

import java.util.Arrays;
/**
 * Representação da Disciplina, precisa do nome e nota da mesma.
 * 
 */
public class Disciplina {
	
	private String nomeDisciplina;
	private int numerosNotasDisciplina = 4;
	private int horas;
	private double[] arrayNotas = new double[numerosNotasDisciplina]; // Array para armazenar notas.
	
	/**
	 * Constrói a Disciplina a partir de seu nome.
	 * 
	 * @param nomeDisciplina no formato string.
	 */
	public Disciplina(String nomeDisciplina){
		this.nomeDisciplina = nomeDisciplina;
	}
	
	
	/**
	 * Cadastra as horas de estudo.
	 * 
	 *  @param horas no formato int.
	 */
	public void cadastraHoras(int horas) {
		this.horas = horas;
	}
	/**
	 * Cadrasta a número da prova e sua nota.
	 * 
	 * @param nota no formato int, o número da prova.
	 * @param valorNota a nota da prova.
	 */
	public void cadastraNota(int nota, double valorNota){
		arrayNotas[nota - 1] = valorNota;
		
	}
	/**
	 * Calcula a media das notas inseridas e retorna sua média.
	 * 
	 * @return media no formato double.
	 */
	private double calculaMedia() {
		double totalSum = 0;
		for (int i = 0; i < arrayNotas.length; i++) {
			totalSum += arrayNotas[i];
		}
		double media = totalSum / arrayNotas.length; 
		
		return media;
	
	}
	/**
	 * Verifica e retorna se o aluno foi aprovado.
	 * 
	 * @return true para aprovado.
	 * @return false para reprovado.
	 */
	public boolean aprovado() {
		if (calculaMedia() >= 7) {
			return true;
		}else {
			return false;
		}
	}
	/**
	 * Retorna o a string que representa as informações de Disciplina.
	 * A representação segue o formato "Nome da Disciplina, horas, a media
	 * e o array com todas as notas e ordem 
	 * 
	 * @return a string que representa disciplina.
	 */
	public String toString() {
		
		return nomeDisciplina + " " + horas + " " + calculaMedia() + " " + Arrays.toString(arrayNotas);
	}
	
	// Bônus
	
	private int[] arrayPesos;
	/**
	 * 
	 * Registra o nome da disciplina e das notas.
	 * 
	 * @param nomeDisciplina nome da disciplina em String.
	 * @param numeroNotasDisciplina numero de notas em int.
	 */
	public Disciplina(String nomeDisciplina, int numeroNotasDisciplina) {
		this.nomeDisciplina = nomeDisciplina;
		this.numerosNotasDisciplina = numeroNotasDisciplina;
	}
	/**
	 * 
	 * Registra o nome da disciplina, numero de notas e pesos para calcular média
	 * ponderada.
	 * 
	 * @param nomeDisciplina nome da disciplina em String.
	 * @param numerosNotasDisciplina número de notas em int.
	 * @param pesos pesos das notas, array int.
	 */
	public void mediaPonderada(String nomeDisciplina, int numerosNotasDisciplina, int[] pesos) {
		
		this.nomeDisciplina = nomeDisciplina;
		this.numerosNotasDisciplina = numerosNotasDisciplina;
		this.arrayPesos = pesos;
		
	}
	
	public void mediaPonderada(String nomeDisciplina, int numerosNotasDisciplina) {
		
		this.nomeDisciplina = nomeDisciplina;
		this.numerosNotasDisciplina = numerosNotasDisciplina;
		
	}
	/**
	 * Calcula a média ponderada.
	 * 
	 * @return retorna a média ponderada em String.
	 */
	public String mediaPonderada() {
		double somaNotas = 0;
		double somaPesos = 0;
		
		
		if (arrayPesos == null) {
			for (int i = 0; i < numerosNotasDisciplina; i++) {
				somaNotas += arrayNotas[i] ;
				somaPesos = numerosNotasDisciplina;
			}
			
		}else {
			
			for (int i = 0; i < numerosNotasDisciplina; i++) {
				somaNotas += arrayNotas[i] * arrayPesos[i];
				somaPesos += arrayPesos[i];
			}	
		}
		
		double mediaPonderada = somaNotas /somaPesos;
		
		return "" + mediaPonderada ;
	}
	
	public Disciplina(){
		
	}

}
