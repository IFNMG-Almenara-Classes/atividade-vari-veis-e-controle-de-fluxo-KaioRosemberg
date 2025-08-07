package questao16;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
    
        int num;

        System.out.print("Digite um número inteiro positivo: ");
        num = entrada.nextInt();

        System.out.println("-------------Tabuada da multiplicação-----------");
        for(int i = 1; i<=10; i++){
            System.out.printf("%d x %d = %d\n",num,i,num*i);
        }
        System.out.println("-------------Tabuada da divisão-----------");
        for(int i = 1; i<=10; i++){
            System.out.printf("%d %% %d = %.2f\n",num,i,(double)num/i);
        }
        entrada.close();
    }
}
