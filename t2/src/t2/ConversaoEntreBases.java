package t2;

/**********************************************************
 * Programa: programa em Java que demonstra a
 *           convers�o de n�meros entre bases diferentes
 *
 * Compila��o: javac ConversaoEntreBases.java
 * Execu��o: java ConversaoEntreBases
 *
 * % java ConversaoEntreBases
 * % ---------------------------------
 * % Decimal 211 para Bin�rio: 11010011
 * % Decimal 211 para Octal: 323
 * % Decimal 211 para Hexadecimal: d3
 * % ---------------------------------
 * % Bin�rio: 11101110 para Decimal: 238
 * % Bin�rio: 11101110 para Octal: 356
 * % Bin�rio: 11101110 para Hexadecimal: ee
 * % ---------------------------------
 * % Octal: 77 para Decimal: 63
 * % Octal: 77 para Bin�rio: 111111
 * % Octal: 77 para Hexadecimal: 3f
 * % ---------------------------------
 * % Hexadecimal: 58 para Decimal: 88
 * % Hexadecimal: 58 para Bin�rio: 1011000
 * % Hexadecimal: 58 para Octal: 130
 *
 * @author Marcos Cesar Kossoski
 *
**********************************************************/
public class ConversaoEntreBases {

  public static void main (String[] args) {

    String dec = "211";
    // string para inteiro decimal
    int decimal = Integer.parseInt(dec, 10);
    // decimal para binario
    String binario = Integer.toBinaryString(decimal);
    // decimal para octal
    String octal = Integer.toOctalString(decimal);
    // decimal para hexadecimal
    String hexadecimal = Integer.toHexString(decimal);
    //decimar para base 6
   // String baseSeis = Integer.to

    System.out.println("---------------------------------");
    System.out.println("Decimal " + dec + " para Bin�rio: " + binario);
    System.out.println("Decimal " + dec + " para Octal: " + octal);
    System.out.println("Decimal " + dec + " para Hexadecimal: " + hexadecimal);

    // -------------------------------------------------------

    String bin = "11101110";
    // string binario para decimal
    int decBin = Integer.parseInt(bin, 2);
    // binario para octal
    String decOct = Integer.toOctalString(decBin);
    // binario para hexadecimal
    String decHex = Integer.toHexString(decBin);

    System.out.println("---------------------------------");
    System.out.println("Bin�rio: " + bin + " para Decimal: " + decBin);
    System.out.println("Bin�rio: " + bin + " para Octal: " + decOct);
    System.out.println("Bin�rio: " + bin + " para Hexadecimal: " + decHex);

    // -------------------------------------------------------

    String oct = "77";
    // string octal para inteiro decimal
    int octalInt = Integer.parseInt(oct, 8);
    // octal para hexadecimal
    String octHex = Integer.toHexString(octalInt);
    // octal para bin�rio
    String octBin = Integer.toBinaryString(octalInt);

    System.out.println("---------------------------------");
    System.out.println("Octal: " + oct + " para Decimal: " + octalInt);
    System.out.println("Octal: " + oct + " para Bin�rio: " + octBin);
    System.out.println("Octal: " + oct + " para Hexadecimal: " + octHex);

    // -------------------------------------------------------

    String hex = "58";
    // string hexadecimal para inteiro decimal
    int hexInt = Integer.parseInt(hex, 16);
    // hexadecimal para octal
    String hexOct = Integer.toOctalString(hexInt);
    // hexadecimal para binario
    String hexBin = Integer.toBinaryString(hexInt);

    System.out.println("---------------------------------");
    System.out.println("Hexadecimal: " + hex + " para Decimal: " + hexInt);
    System.out.println("Hexadecimal: " + hex + " para Bin�rio: " + hexBin);
    System.out.println("Hexadecimal: " + hex + " para Octal: " + hexOct);
  }

}
