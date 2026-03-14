import java.util.Scanner;

public class funcoes {

    public static int subtrair(int a, int b) {
        return a - b;
    }
    
     public static int somar(int a, int b) {
        return a + b;
    }

    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        int num1, num2, resultadosoma, resultadosubtracao;
        System.out.println("Informe o primeiro número: ");
        num1 = teclado.nextInt();
        System.out.println("Informe o segundo número: ");
        num2 = teclado.nextInt();
        resultadosoma = somar(num1,num2);
        resultadosubtracao = subtrair(num1,num2);
        System.out.printf("A soma dos números é: %d%nA subtração dos números é: %d%n",resultadosoma,resultadosubtracao);
        teclado.close();
    }
    
}
