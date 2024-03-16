package questao05;

import java.util.Scanner;

public class questao05 {
  public static void main(String[] args) {
    System.out.println("Digite uma palavra:");
    Scanner scanner = new Scanner(System.in);
    String original = scanner.nextLine();
    String invertida = "";

    // Invertendo a string sem usar a função reverse
    for (int i = original.length() - 1; i >= 0; i--) {
      invertida += original.charAt(i);
    }

    // Imprimindo a string original e a invertida
    System.out.println("Original: " + original);
    System.out.println("Invertida: " + invertida);

    scanner.close();
  }
}
