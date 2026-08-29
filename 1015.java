import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       
        Scanner read = new Scanner(System.in);
        
        Float x1 = read.nextFloat();
        Float y1 = read.nextFloat();
        Float x2 = read.nextFloat();
        Float y2 = read.nextFloat();
        
        double dist = Math.sqrt(
            Math.pow(x2-x1, 2) + Math.pow(y2 - y1, 2)
        );

        System.out.printf("%.4f\n",dist);
    }
}
