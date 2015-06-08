package t2;

import java.io.IOException;

public class App {

	@SuppressWarnings("static-access")
	public static <E> void main(String[] args) throws IOException {
		ConversionBetweenBases c = new ConversionBetweenBases();
		//System.out.println("Converter numero 7 em decimal para base 6: " + ConversionBetweenBases.convert(7));
		Reader<E> r = new Reader<E>();
		r.loadTestCase();
		System.out.println("Tamanho: " + r.list.size());
		System.out.println("Get posição 1: " + r.list.get(1));
		System.out.println("Converter numero 107 em decimal para base 6: " + c.convert(107));

	}

}
