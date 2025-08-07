package questao21;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int idade, tempoServiço;

        System.out.print("Informe a idade: ");
        idade = entrada.nextInt();
        System.out.print("Informe o tempo de serviço: ");
        tempoServiço = entrada.nextInt();

        boolean x = idade >= 65;
        boolean y = tempoServiço >= 30;
        boolean z = idade >= 60 && tempoServiço >= 25;

        if(x){
            System.out.println("Você pode aposentar!");
        }else if(y){
            System.out.println("Você pode aposentar!");
        }else if(z){
            System.out.println("Você pode aposentar!");
        }else{
            System.out.println("Você não pode aposentar!");
        }
        entrada.close();
    }
}
