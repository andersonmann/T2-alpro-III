package t2;

public class ConversionBetweenBases {

	/**
	 * Converte decimal para base 6. A regra é ficar dividindo o valor por 8,
	 * pegar o resto de cada divisão e inserir o valor da direita para a
	 * esquerda na String de retorno. Se o resultado da divisão for maior que 5,
	 * chamo o método através de recursão. O algoritmo é executado até que o
	 * valor que foi sucessivamente dividido se torne 0. Obs.: assume que o
	 * valor passado é inteiro positivo. Exemplo: 1279 1279/8 = 159 -> resto 7
	 * -> Resultado: 7 159/8 = 19 -> resto 7 -> Resultado: 7 19/8 = 2 -> resto 3
	 * -> Resultado: 3 2/8 = 0 -> resto 2 -> Resultado: 2
	 *
	 * Resultado: 2377
	 *
	 * @param valor
	 *            número decimal a ser convertido
	 * @return String contendo o valor em base 6
	 */
	public static String converteDecimalParaBase6(int valor) {
		int resto = -1;
		StringBuilder sb = new StringBuilder();

		if (valor == 0) {
			return "0";
		}
		// enquanto o resultado da divisão por 6 for maior que 0 adiciona o
		// resto ao início da String de retorno
		while (valor > 0) {
			resto = valor % 6;
			valor = valor / 6;
			sb.insert(0, resto);
		}
		return sb.toString();
	}
}
