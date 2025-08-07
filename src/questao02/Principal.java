package questao02;

import java.util.Scanner;

public class Principal {
    
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        float peso, altura;

        System.out.printf("Informe sua altura: ");
        altura = entrada.nextFloat();
        System.out.printf("Informe seu peso: ");
        peso = entrada.nextFloat();

        float imc = peso/(altura*altura);
        System.out.printf("O seu imc é: %.2f\n", imc);

        boolean magreza = imc < 18.5;
        boolean saudável = imc >= 18.5 && imc <= 24.9;
        boolean sobrepeso = imc >= 25.0 && imc <= 29.9;
        boolean obesidadeI = imc >= 30.0 && imc <= 34.9;
        boolean obesidadeII = imc >= 35.0 && imc <= 39.9;
        boolean obesidadeIII = imc >= 40.0;

        if(magreza){
            System.out.println("Você está muito magro(a)!");
        }else if(saudável){
            System.out.println("Você está saudável!");
        }else if(sobrepeso){
            System.out.println("Você está um pouco acima do peso.Cuidado com a saúde!");
        }else if(obesidadeI){
            System.out.println("Você está com obesidade grau I, vamos tomar uma providência...");
        }else if(obesidadeII){
            System.out.println("Você está com obesidade grau II. Pratique atividade fisíca e regule a alimentação!");
        }else if(obesidadeIII){
            System.out.println("Você está com obesidade grau III. Lhe indico procurar um médico.");
        }
        entrada.close();
    }
}
