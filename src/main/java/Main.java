
public class Main {
  public static void main(String[] args) {
    int INDICE = 13, SOMA = 0, K = 0;

        while (K < INDICE) {
            K = K + 1;
            SOMA = SOMA + K;
        }

        System.out.println("Valor da variável SOMA na Questão 1: " + SOMA);

        // Questão 2
        int numero = 21; // Número a ser verificado na sequência de Fibonacci
        if (verificarFibonacci(numero)) {
            System.out.println(numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println(numero + " não pertence à sequência de Fibonacci.");
        }

        // Questão 3
        System.out.println("Próximo elemento na sequência:");
        System.out.println("a) 1, 3, 5, 7, __ : 9");
        System.out.println("b) 2, 4, 8, 16, 32, 64, __ : 128");
        System.out.println("c) 0, 1, 4, 9, 16, 25, 36, __ : 49");
        System.out.println("d) 4, 16, 36, 64, __ : 100");
        System.out.println("e) 1, 1, 2, 3, 5, 8, __ : 13");
        System.out.println("f) 2, 10, 12, 16, 17, 18, 19, __ : 20");

        // Questão 4
        System.out.println("Para a Questão 4:");
        System.out.println("1. Ligue o primeiro interruptor e deixe-o ligado por alguns minutos.");
        System.out.println("2. Desligue o primeiro interruptor e ligue o segundo interruptor.");
        System.out.println("3. Entre na sala.");

        System.out.println("Se a lâmpada estiver acesa, o segundo interruptor controla essa lâmpada.");
        System.out.println("Se a lâmpada estiver desligada e estiver fria, o primeiro interruptor controla essa lâmpada.");
        System.out.println("Se a lâmpada estiver desligada, mas estiver quente, o terceiro interruptor controla essa lâmpada.");

        // Questão 5
        String input = "Hello World!";
        String reversedString = reverseString(input);
        System.out.println("String invertida: " + reversedString);
    }

    // Função para verificar se um número pertence à sequência de Fibonacci
    public static boolean verificarFibonacci(int numero) {
        int a = 0;
        int b = 1;

        while (b < numero) {
            int temp = b;
            b = a + b;
            a = temp;
        }

        return b == numero;
    }

    // Função para inverter uma string
    public static String reverseString(String str) {
        char[] charArray = str.toCharArray();
        int left = 0;
        int right = charArray.length - 1;

        while (left < right) {
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;
            left++;
            right--;
        }

        return new String(charArray);
  }

}