/**
 * Laboratório de Programação 2 - Lab 2
 * 
 * @author Letícia Farias Costa - 0121110394
 */
package lab2;

public class CoisaBonus {
	public static void main(String[] args) {
		disciplina();
		System.out.println("-----");
	}
	
	public static void disciplina() {
		Disciplina prog2 = new Disciplina();
		int[] arrayPesos = {1, 2, 3};
	    prog2.mediaPonderada("Prog 2", 3);  //sem informar os pesos.
		prog2.cadastraNota(1, 5.0);
	    prog2.cadastraNota(2, 6.0);
	    prog2.cadastraNota(3, 7.0);
	    System.out.println(prog2.mediaPonderada());
	    prog2.mediaPonderada("Prog 2", 3, arrayPesos); 
		prog2.cadastraNota(1, 5.0);
	    prog2.cadastraNota(2, 6.0);
	    prog2.cadastraNota(3, 7.0);
	    System.out.println(prog2.mediaPonderada());
	       
	}
}