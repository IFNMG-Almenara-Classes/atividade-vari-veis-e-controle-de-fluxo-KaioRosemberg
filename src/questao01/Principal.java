package questao01;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num,num2;
        System.out.printf("Digite o primeiro número: ");
        num = entrada.nextInt();
        System.out.printf("Digite o segundo número: ");
        num2 = entrada.nextInt();

        if(num>num2){
            System.out.println(+num+" é maior que "+num2);
        }else{
            System.out.println(+num2+" é maior que "+num);
        }

        entrada.close();
    }
}