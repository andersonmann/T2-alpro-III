package t2;

import java.io.IOException;

public class App {

	public static <E> void main(String[] args) throws IOException {
		// ConversionBetweenBases c = new ConversionBetweenBases();
		System.out.println(ConversionBetweenBases.convert(7));
		Reader<E> r = new Reader<E>();
		r.loadTestCase();
		System.out.println("Tamanho: " + r.list.size());
		System.out.println("Get posição 1: " + r.list.get(1));

	}

}
