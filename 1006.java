import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner read = new Scanner(System.in);

       int A = 2;
       int B = 3;
       int C = 5;

       Double n1 = read.nextDouble();
       Double n2 = read.nextDouble();
       Double n3 = read.nextDouble(); 

       Double MEDIA = ((n1*A)+(n2*B)+(n3*C))/10;

       System.out.printf("MEDIA = %.1f\n",MEDIA);

    }
}
