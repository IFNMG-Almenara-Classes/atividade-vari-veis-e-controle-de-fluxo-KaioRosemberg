package questao18;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num1, num2;
        int totalPrimos = 0;

        System.out.print("Informe o primeiro número: ");
        num1 = entrada.nextInt();
        System.out.print("Informe o segundo número: ");
        num2 = entrada.nextInt();

        if(num1>num2){
            int temp = num1;
            temp = num2;
            num2 = temp;
        }
        for(int i = num1; i<=num2; i++){
            int contPrimos = 0;
            if(i>1){
                for(int j = 1; j<=i;j++){
                    if(i%j==0){
                        contPrimos++;
                    }
                }
                if(contPrimos == 2){
                    System.out.println(i);
                    totalPrimos++;
                }
            }
        }
        System.out.println("A quantidade de primos é: "+totalPrimos);
        entrada.close();
    }
}