import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       
        Scanner read = new Scanner(System.in);
        int codPeca = read.nextInt();
        int qntdPeca = read.nextInt();
        Float valor = read.nextFloat();

        int codPeca2 = read.nextInt();
        int qntdPeca2 = read.nextInt();
        Float valor2 = read.nextFloat();
       
        Float valorDaCompra = ((qntdPeca*valor)+(qntdPeca2*valor2));

        System.out.printf("VALOR A PAGAR: R$ %.2f\n",valorDaCompra);
    }
}
