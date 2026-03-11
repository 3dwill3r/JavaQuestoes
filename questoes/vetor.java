import java.util.Scanner;

public class vetor {


    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        int numeros[] = new int[5];
        int i;

        System.out.println("Digite 5 números:");

        for (i=0; i < numeros.length; i++){
            numeros[i] = teclado.nextInt();
        }
        System.out.printf("Vetor: [");
        for (i = 0; i < numeros.length; i++){
            System.out.printf(numeros[i] + (i == numeros.length - 1 ? "" : ","));
        }
        System.out.printf("]");

        teclado.close();
    }
}
