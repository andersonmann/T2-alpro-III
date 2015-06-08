package t2;

/**********************************************************
 * 
 * @author Anderson Mann
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
    System.out.println("---------------------------------");
    System.out.println("Decimal " + dec + " para Binário: " + binario);
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
    System.out.println("Binário: " + bin + " para Decimal: " + decBin);
    System.out.println("Binário: " + bin + " para Octal: " + decOct);
    System.out.println("Binário: " + bin + " para Hexadecimal: " + decHex);

    // -------------------------------------------------------

    String oct = "77";
    // string octal para inteiro decimal
    int octalInt = Integer.parseInt(oct, 8);
    // octal para hexadecimal
    String octHex = Integer.toHexString(octalInt);
    // octal para binário
    String octBin = Integer.toBinaryString(octalInt);

    System.out.println("---------------------------------");
    System.out.println("Octal: " + oct + " para Decimal: " + octalInt);
    System.out.println("Octal: " + oct + " para Binário: " + octBin);
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
    System.out.println("Hexadecimal: " + hex + " para Binário: " + hexBin);
    System.out.println("Hexadecimal: " + hex + " para Octal: " + hexOct);
  }

}
