import java.util.Scanner;

public class numprimo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero, i;
        
        System.out.println("Digite um número inteiro (0 para encerrar):");
        numero = teclado.nextInt();

        while(numero != 0) {

            int primo = 1;

            for (i = 2; i < numero; i++) {
                if (numero % i == 0) {
                    primo = 0;
                    break;
                }
            }

            if (numero <= 1) {
                primo = 0;
            }

            if (primo == 1) {
                System.out.println();
                System.out.printf(numero + " é um número primo.");
            } else {
                 System.out.println();
                System.out.printf(numero + " não é um número primo.");
            }
            System.out.println();
            System.out.println();
            System.out.printf("Digite outro número(0 para encerrar o programa): ");
            numero = teclado.nextInt();
        }

        teclado.close();
    }
}