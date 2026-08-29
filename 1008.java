import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner read = new Scanner(System.in);

       int numFuncionario = read.nextInt();
       int horaT = read.nextInt();
       float valor = read.nextFloat();

       float Salario = (horaT*valor);

       System.out.printf("NUMBER = %d\n",numFuncionario);
       System.out.printf("SALARY = U$ %.2f\n",Salario);

    }
}
