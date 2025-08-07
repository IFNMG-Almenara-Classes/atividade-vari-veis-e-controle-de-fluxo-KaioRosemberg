package questao04;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int senha = 1234;

        System.out.print("Digite uma senha: ");
        senha = entrada.nextInt();

        if(senha == 1234){
            System.out.println("Acesso permitido!");
        }else{
            System.out.println("Acesso negado. Tente novamente!");
        }
        entrada.close();
    }
}
