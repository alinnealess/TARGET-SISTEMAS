//Fibonacci

package questão02;

import java.util.Scanner;

class questão2 {
  public static void main(String[] args) {
    System.out.println("Digite um número: ");
    Scanner scanner = new Scanner(System.in);
    int numero = scanner.nextInt();

    // Verificar se o número é negativo
    if (numero < 0) {
      // Se for negativo, informar que o número é inválido
      System.out.println("Número inválido");
    } else {
      int a = 0;
      int b = 1;
      int c = 0;
      // Enquanto `c` for menor que o número informado, calcula o próximo número da sequência
      while (c < numero) {
        // Inicia as variáveis para os dois primeiros números da sequência de Fibonacci
        c = a + b;
        ;//
        a = b;
        b = c;
      }
      // Após sair do loop, verifica se o número informado é igual ao último número calculado
      if (c == numero) {
        System.out.println("O número " + numero + " pertence à sequência de Fibonacci.");
      } else {
        System.out.println("O número " + numero + " não pertence à sequência de Fibonacci.");
      }
    }

    scanner.close();
  }
}
