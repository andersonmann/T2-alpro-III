package t2;

public class ConversionBetweenBases {

	/**
	 * Converte decimal para base 6. A regra � dividir o valor por 6, pegar o
	 * resto de cada divis�o e inserir o valor da direita para a esquerda na
	 * variavel String de retorno. Se o resultado da divis�o for maior que 5, o
	 * m�todo � chamado recursivamente. O algoritmo � executado at� que o valor
	 * que foi sucessivamente dividido se torne 0. Obs.: assume que o valor
	 * passado � inteiro positivo.
	 * 
	 * @param value
	 *            n�mero decimal a ser convertido
	 * @return String contendo o valor em base 6
	 */
	
	public static String convert(int value) {
		int rest = -1;
		StringBuilder sb = new StringBuilder();
		if (value == 0) {
			return "0";
		}
		/*
		 * enquanto o resultado da divis�o por 6 for maior que 0 adiciona o
		 * resto ao in�cio da String de retorno.
		 */
		while (value > 0) {
			rest = value % 6;
			value = value / 6;
			sb.insert(0, rest);
		}
		return sb.toString();
	}
}
