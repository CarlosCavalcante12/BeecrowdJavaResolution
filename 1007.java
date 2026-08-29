import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner read = new Scanner(System.in);

       int A = read.nextInt();
       int B = read.nextInt();
       int C = read.nextInt();
       int D = read.nextInt();

       int DIFERENCA = ((A*B)-(C*D));

       System.out.printf("DIFERENCA = %d\n",DIFERENCA);
    }
}
