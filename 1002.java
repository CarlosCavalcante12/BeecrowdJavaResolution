import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner read = new Scanner(System.in);

       Double n = 3.14159;
       Double R = read.nextDouble();

       double A = n * (Math.pow(R,2));

       System.out.printf("A=%.4f\n",A);

    }
}
