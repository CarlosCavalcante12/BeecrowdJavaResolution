import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       
        Scanner read = new Scanner(System.in);
        Double r = read.nextDouble();
        Double pi = 3.14159;

        Double R = (Math.pow(r,3));

        Double volume = (R*pi*4)/3;

        System.out.printf("VOLUME = %.3f\n",volume);
        
    }
}
