package questao06;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num1, num2, num3;

        System.out.printf("Informe o primeiro número: ");
        num1 = entrada.nextInt();
         System.out.printf("Informe o segundo número: ");
        num2 = entrada.nextInt();
         System.out.printf("Informe o terceiro número: ");
        num3 = entrada.nextInt();

        int maior = num1;
        if(num2>maior){
            maior = num2;
        }if(num3>maior){
            maior = num3;
        }
        System.out.printf("O maior número é: %d", maior);
        entrada.close();
    }
}
