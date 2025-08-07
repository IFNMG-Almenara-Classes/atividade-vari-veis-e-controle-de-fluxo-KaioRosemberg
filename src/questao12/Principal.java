package questao12;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num;
        int pares = 0;
        int quantidade = 0;
        int soma = 0;
        while(true){
        System.out.printf("Informe um número e se quiser encerrar, digite zero: ");
        num = entrada.nextInt();
        if(num==0){
            break;
        }
        soma+=num;
        quantidade++;
        
         if(num%2==0){
            pares++;
        }
    }

        float media = (float) soma/quantidade;
        System.out.println("A quantidade de números pares é: "+pares);
        System.out.printf("O valor da média é: %.2f", media);
        
        entrada.close();
    }
}
