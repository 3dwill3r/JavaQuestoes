import java.util.Scanner;

public class idade {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int idade,maior,menor;
        System.out.println("Digite a idade da pessoa(informe -1 para encerrar o programa): ");
        idade = teclado.nextInt();
        maior = idade;
        menor = idade;
        while(idade != -1){
            if(idade > maior){
                maior = idade;
            }
            if(idade < menor){
                menor = idade;
            }
            System.out.println("Digite outra idade: ");
            idade = teclado.nextInt();
        }
        System.out.printf("Maior idade informada: %d%nMenor idade informada: %d%n",maior,menor);
        teclado.close();
    }
}
