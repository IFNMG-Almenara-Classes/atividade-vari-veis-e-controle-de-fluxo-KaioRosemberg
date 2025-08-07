package questao13;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num1, num2;
        int opcao;

        System.out.printf("Digite o primeiro número: ");
        num1 = entrada.nextInt();
        System.out.printf("Digite o segundo número: ");
        num2 = entrada.nextInt();
        do{
            System.out.println("1 - Somar");
            System.out.println("2 - Subtrair");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            System.out.println("5 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = entrada.nextInt();

            switch (opcao) {
            case 1:
                System.out.println("O valor da soma é: "+(num1+num2));
                break;
            case 2:
                System.out.println("O valor da subtração é: "+(num1-num2));
                break;
            case 3:
                System.out.println("O valor da multiplicação é: "+(num1*num2));
                break;
            case 4:
                if(num2!=0){
                System.out.println("O valor da divisão é: "+((float)num1/num2));
                }else{
                    System.out.println("Erro!");
                }
                break;
            case 5:
                System.out.println("Saindo...");
                break;
            default:
                System.out.println("Opção inválida. Tente novamente!");
                break;
            }
    }while(opcao!=5);
entrada.close();
}
}