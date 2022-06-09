/**
* Representação do Registro de tempo online de uma diciplina.
* Deve ser informado o nome da diciplina e seu tempo online esperado.
* 
* @author Letícia Farias Costa - 0121110394
*/

package lab2;

public class RegistroTempoOnline {
	
	private String nomeDisciplina;         /** Registra o nome da diciplina.*/
	private int tempoOnlineEsperado = 120; /** Registra o tempo online esperado.*/
	private int tempoTotal;                /** Registra o tempo Total.*/
	/**
	 * Contrói o Registro de tempo a partir do nome da disciplina e seu tempo
	 * online esperado. Se o tempo online não for informado é tido como 120.
	 * @param 
	 */
	
	public RegistroTempoOnline(String nomeDisciplina, int tempoOnlineEsperado) {
		this.nomeDisciplina = nomeDisciplina;
		this.tempoOnlineEsperado = tempoOnlineEsperado;
	}
	
	/**
	 * Define o nome da diciplina .
	 * 
	 * @param nomeDisciplina no formato String.
	 */
	public RegistroTempoOnline(String nomeDisciplina) {
		this.nomeDisciplina = nomeDisciplina;
		
	}
	/**
	 * Adiciona o tempo online.
	 * 
	 * @param tempoInicial em formato int.
	 */
	public void adicionaTempoOnline(int tempoInicial) {
		tempoTotal += tempoInicial;
	}
	
	/**
	 * Verifica se atingiu a meta de tempo online.
	 * 
	 * @return True se atingiu.
	 * @return False se não atingiu.
	 */
	boolean atingiuMetaTempoOnline(){
		if (tempoOnlineEsperado <= tempoTotal) {
			return true;
		}else {
			return false;
		}
	}
	/**
	 * Retorna uma string que representa o nome da diciplina e uma
	 * comparação entre o tempo total e o esperado.
	 * 
	 * @return a string com a representação das informações coletadas.
	 */
	public String toString(){
		
		return nomeDisciplina + " " + tempoTotal + "/" + tempoOnlineEsperado;
	}
}
