package t2;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

/**
 * Reader, classe que faz a leitura dos arquivos e salva em um ArrayList.
 * 
 * @version 1.0 1 June 2015
 * @author Anderson_M_Mann
 * 
 */
public class Reader<E> {
	public ArrayList<E> list;

	public Reader() {
		list = new ArrayList<>();
	}

	/**
	 * Method loadTestCase
	 * 
	 * @return - Metodo que faz a leitura do arquivo e salva em uma lista.
	 */

	@SuppressWarnings("unchecked")
	public void loadTestCase() throws IOException {
		Path path = Paths.get("teste0200b");
		try (BufferedReader reader = Files.newBufferedReader(path,
				Charset.defaultCharset())) {
			String line = null;
			while ((line = reader.readLine()) != null) {
				// String dados[] = line.split("/n");
				list.add((E) line);
			}
		} catch (IOException e) {
			System.err.println("Erro de E/S: " + e);
		}
		// Exibe o tamanho da lista
		// System.out.println("Tamanho " + list.count);
	}
}
