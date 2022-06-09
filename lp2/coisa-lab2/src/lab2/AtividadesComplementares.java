/**
 * Laboratório de Programação 2 - Lab 2
 * 
 * @author Letícia Farias Costa - 0121110394
 */

package lab2;
/**
 * Representa as atividades complementares, ela registra as atividades complementares
 * e retorna um relátorio dela junto ao créditos totais.
 *
 */

public class AtividadesComplementares {
	
	private int horasTotaisEstagios;
	private int mesesTotaisProjetos;
	private double horasTotaisCursos;
	private int countEstagios;
	private int countProjetos;
	int[] arrayMesesProjetos = new int[16];
	/**
	 * Constrói atividades complementares.
	 */
	public AtividadesComplementares() {
		horasTotaisEstagios = 0;
		mesesTotaisProjetos = 0;
		horasTotaisCursos = 0;
	}
	/**
	 * Armazena as horas e conta o número de estágios;
	 * 
	 * @param horasDeEstagio horas de estágio em int.
	 */
	public void adicionarEstagio(int horasDeEstagio) {
		horasTotaisEstagios += horasDeEstagio;
		countEstagios += 1;
	}
	/**
	 * Armazena os meses e conta o números de projetos.
	 * Verifica se o número de Projetos é menor que 17.
	 * 
	 * @param meses meses de Projeto em int.
	 */
	public void adicionarProjeto(int meses) {
		mesesTotaisProjetos += meses;
		countProjetos += 1;
		if (countProjetos < 17) {
			arrayMesesProjetos[countProjetos - 1] = meses;
		}
		
		
	}
	/**
	 * Adiciona horas de curso.
	 * 
	 * @param horasDeCurso horas de curso em double.
	 */
	public void adicionarCurso(double horasDeCurso) {
		horasTotaisCursos += horasDeCurso;
	}
	/**
	 * Conta os créditos dos estágios. Por meio das informações
	 * obtidas em adicionarEstagio.
	 * 
	 * @return créditos do estágio em int.
	 */
	private int contaCreditosEstagios() {
		int creditosEstagios = 0;
		if (horasTotaisEstagios > 299 && countEstagios < 10) {
			int coeficiente = horasTotaisEstagios / 300;
			creditosEstagios = coeficiente * 5;
		}
		
		return creditosEstagios;
	}
	/**
	 * Conta os créditos dos Projetos. Por meio das informações
	 * obtidas em adicionarProjetos.
	 * 
	 * @return creditos do Projeto em int.
	 */
	private int contaCreditosProjetos() {
		int creditosProjetos = 0;
		if (mesesTotaisProjetos > 2 && countProjetos < 17) {
			int coeficiente = mesesTotaisProjetos / 3;
			creditosProjetos = coeficiente * 2;
		}
		
		return creditosProjetos;
	}
	/**
	 * Conta os créditos dos Cursos. Por meio das informações
	 * obtidas em adicionarCurso.
	 * 
	 * @return créditos dos cursos em int.
	 */
	private int contaCreditosCursos() {
		int creditosCursos = 0;
		if (horasTotaisCursos > 29) {
			int coeficiente = (int) (horasTotaisCursos / 30);
			creditosCursos = coeficiente * 1;
			}
		
		return creditosCursos;
		}
	/**
	 * Conta os créditos totais de estágio, cursos e projetos.
	 * 
	 * @return créditos totais em int.
	 */
	public int contaCreditos() {
		int contaCreditos = contaCreditosEstagios() + contaCreditosProjetos() + contaCreditosCursos();
		return contaCreditos;
	}
	/**
	 * Pega as atividades e organiza numa array.
	 * 
	 * @return retorna uma array um relatório detalhado das atividades complementares em String.
	 */
	public String[] pegaAtividades() {
		int n = 5 + countProjetos;
		int p = 0;
		String[] pegaAtividades = new String[n];
		
		pegaAtividades[0] = "Estagio " + horasTotaisEstagios;
	
		for (int i = 1; i < n - 4; i++) {
				pegaAtividades[i] = "Projeto " + arrayMesesProjetos[p];
				p++;
		}
		
		pegaAtividades[n - 4] = "Cursos "  + horasTotaisCursos;
		pegaAtividades[n - 3] = "Creditos_Estagio " + contaCreditosEstagios();
		pegaAtividades[n - 2] = "Creditos_Projeto " + contaCreditosProjetos();
		pegaAtividades[n - 1] = "Creditos_Cursos " + contaCreditosCursos();
		
		
		return pegaAtividades;
		
		
		
	}

}
