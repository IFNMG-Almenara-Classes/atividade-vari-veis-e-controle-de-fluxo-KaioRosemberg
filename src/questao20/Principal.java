package questao20;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num;

        System.out.print("Digite um número inteiro: ");
        num = entrada.nextInt();

        boolean divisivelPor3 = (num % 3 == 0);
        boolean divisivelPor5 = (num % 5 == 0);

        if((divisivelPor3 || divisivelPor5) && !(divisivelPor3 && divisivelPor5)){
            System.out.println("O número " + num + " é divisível por 3 ou por 5, mas não pelos dois.");
        } else {
            System.out.println("O número " + num + " é divisível pelo os dois, não atende aos requisitos.");
        }

        entrada.close();
    }
}
