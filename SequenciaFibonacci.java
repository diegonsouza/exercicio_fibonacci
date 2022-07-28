import java.util.Scanner;

public class SequenciaFibonacci {

    public static void main(String[] args) {

        int a = 0;
        int b = 1;
        int c;

        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite um valor numérico: ");
        int d = entrada.nextInt();

        for (int i = 0; i < 30; i++) {
            c = a;
            a = a + b;
            b = c;
            if (d == a) {
                break;
            }
        }
        if (d == a) {
            System.out.println("Número pertence a sequência Fibonacci!");
        } else {
            System.out.println("Número não pertence a sequência Fibonacci!");
        }
        entrada.close(); 
    }
}
