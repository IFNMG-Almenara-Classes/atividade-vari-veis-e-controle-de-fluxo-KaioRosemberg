package questao05;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double precoUnitario;
        int quantidade;

        System.out.printf("Informe a quantidade que você quer comprar: ");
        quantidade = entrada.nextInt();

        if(quantidade < 12){
            precoUnitario = 0.50;
            System.out.println("Menos que uma dúzia, a unidade é 50 centavos.");
        }else{
            precoUnitario = 0.30;
            System.out.println("Mais que uma dúzia, a unidade é 30 centavos.");
        }
        double total = quantidade*precoUnitario;

        System.out.println("O valor da compra é "+total);

        entrada.close();
    }
}
