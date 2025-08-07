package questao14;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int tipoCliente;
        double valorCompra;
        double desconto = 0.0;
        String tipoClienteNome ="";

        System.out.printf("Informe o valor da pizza: ");
        valorCompra = entrada.nextDouble();

        System.out.println("Informe o código do cliente:");
        System.out.println("1 - Comum");
        System.out.println("2 - Vip");
        System.out.println("3 - Funcionário");
        System.out.print("Escolha um tipo de cliente: ");
        tipoCliente = entrada.nextInt();

        if(tipoCliente==1){
            desconto = 0.0;
            tipoClienteNome ="comum";
        }else if(tipoCliente==2){
            desconto = 0.05;
            tipoClienteNome ="vip";
        }else if(tipoCliente==3){
            desconto = 0.10;
            tipoClienteNome ="funcionário";
        }else{
            System.out.println("Nenhum tipo de cliente escolhido.Vamos considerar o cliente comum!");
            desconto = 0.0f;
        }
        double valorTotal = valorCompra - (valorCompra*desconto);
        System.out.printf("O valor final da compra é %.2f, pois você é um cliente %s", valorTotal, tipoClienteNome);
        entrada.close();
    }
}
