import java.util.Scanner;

public class imc {

    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        int peso,altura;
        double imc, altura_metros;
        System.out.println("Digite seu peso(em kg): ");
        peso = teclado.nextInt();

        System.out.println("Digite sua altura(em cm): ");
        altura = teclado.nextInt();

        altura_metros = altura / 100.0;
        imc = (double) peso / (altura_metros * altura_metros);

        if(imc < 18.5){
            System.out.printf("Seu IMC é: %.2f, você está abaixo do peso.", imc);
        }
        else if(imc >= 18.5 && imc < 25){
            System.out.printf("Seu IMC é: %.2f, você está com peso normal.", imc);
        }
        else if(imc >= 25 && imc < 30){
            System.out.printf("Seu IMC é: %.2f, você está com sobrepeso.", imc);
        }
        else if(imc >= 30 && imc < 35){
            System.out.printf("Seu IMC é: %.2f, você está com obesidade grau I.", imc);
        }
        else if(imc >= 35 && imc < 40){
            System.out.printf("Seu IMC é: %.2f, você está com obesidade grau II.", imc);
        }
        else{
            System.out.printf("Seu IMC é: %.2f, você está com obesidade grau III.", imc);
        }

        teclado.close();
    }
}

