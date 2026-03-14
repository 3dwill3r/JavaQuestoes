import java.util.Scanner;

public class vetor {


    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        int numeros[] = new int[5];
        int copia[] = new int[5];
        int i, j;

        System.out.println("Digite 5 números:");

        for (i=0; i < numeros.length; i++){
            numeros[i] = teclado.nextInt();
        }
        System.out.printf("Vetor crescente: [");
        for (i = 0; i < numeros.length; i++){
            copia[i] = numeros[i];
        }
        for (i = 0; i < numeros.length; i++){
            for (j = 0; j < numeros.length - 1; j++){
                if (numeros[j] > numeros[j + 1]) {
                    int temp = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = temp;
                }
            }

        }
        for (i = 0; i < numeros.length; i++){
            System.out.printf("%d ", numeros[i]);
        }
        System.out.printf("]");
        System.out.println();
        System.out.printf("Vetor original: [");
        for (i = 0; i < copia.length; i++){
            System.out.printf("%d ", copia[i]);
        }
        System.out.printf("]");
        teclado.close();
    }
}
