import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número inteiro positivo: ");
        int n = sc.nextInt();

        int a = 0, b = 1, c = 0;
        boolean pertence = false;

        while (c < n) {
            c = a + b;
            a = b;
            b = c;

            if (c == n) {
                pertence = true;
            }
        }

        if (pertence) {
            System.out.println(n + " Pertence à sequência de Fibonacci.");
        } else {
            System.out.println(n + " Não pertence à sequência de Fibonacci.");
        }
    }
}
