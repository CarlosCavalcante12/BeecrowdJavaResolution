import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       
       /* 
       Faça um programa que leia o nome de um vendedor, o seu salário fixo e o total de vendas efetuadas por ele no mês (em dinheiro). 
       Sabendo que este vendedor ganha 15% de comissão sobre suas vendas efetuadas, informar o total a receber no final do mês, com duas casas decimais.
       */
       
        Scanner read = new Scanner(System.in);

       String nome = read.nextLine();
       Double salFixo = read.nextDouble();
       Double vendas = read.nextDouble();

       Double total = (vendas * 0.15);
       Double sal = (salFixo + total);

       System.out.printf("TOTAL = R$ %.2f\n",sal);

    }
}
