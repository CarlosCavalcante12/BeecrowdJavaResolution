import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner read = new Scanner(System.in);

       Double A = 3.5;
       Double B = 7.5;

       Double n1 = read.nextDouble();
       Double n2 = read.nextDouble();

       Double MEDIA = ((n1*A)+(n2*B))/11;

       System.out.printf("MEDIA = %.5f\n",MEDIA);

    }
}
