package questao07;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double ld1, ld2, ld3;

        System.out.printf("Informe o tamanho do primeiro lado: ");
        ld1 = entrada.nextDouble();
        System.out.printf("Informe o tamanho do segundo lado: ");
        ld2 = entrada.nextDouble();
        System.out.printf("Informe o tamanho do terceiro lado: ");
        ld3 = entrada.nextDouble();

        if(ld1==ld2 && ld2==ld3){
            System.out.println("É um triângulo equilátero!");
        }else if(ld1==ld2 || ld1==ld3 || ld2==ld3){
            System.out.println("É um triângulo isóceles!");
        }else{
            System.out.println("É um triângulo escaleno!");
        }
        entrada.close();
    }
}
