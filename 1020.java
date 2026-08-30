import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int idade = read.nextInt();

        int anos = idade / 365;
        idade = idade % 365;

        int mes = idade / 30;
        int dias = idade % 30;

        System.out.printf("%d ano(s)\n",anos);
        System.out.printf("%d mes(es)\n",mes);
        System.out.printf("%d dia(s)\n",dias);
    }
}
