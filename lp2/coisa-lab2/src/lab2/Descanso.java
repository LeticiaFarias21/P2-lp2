/**
 * Laboratório de Programação 2 - Lab 2
 * 
 * @author Letícia Farias Costa - 0121110394
 */
package lab2;
/**
* Representação do descanso de um estudante.
* Todo estudante precisa colocar o número de semanas e horas.
* 
*/
public class Descanso {
	
	private int horas; //Guarda as horas de trabalho
	private int semanas; //Guarda as semanas
    
	/**
     * Constrói as horas de descanso semanas.
     * @param horas totais em int.
     * @param semanas em int.
     */

	public Descanso() {
    	semanas = 1;
    	horas = 0;
    }
    /**
     * Define as horas de descanso.
     * 
     * @param horas totais em int.
     */
    public void defineHorasDescanso(int horas){
        this.horas = horas;
    }
    /**
     * Define o número de semanas.
     * 
     * @param semanas totais em int.
     */
    public void defineNumeroSemanas(int semanas){
        this.semanas = semanas;
    }
    
    /**
     * Processa as horas e semanas para retornas o status do aluno.
     * 
     * @return o status de cansado ou descansado.
     */
    public String getStatusGeral(){ 
        
        String status = "cansado";
        int horasXsemana = horas / semanas;
        if (horasXsemana >= 26){
        status = "descansado";
        }
        
        return status;
    } 
}
