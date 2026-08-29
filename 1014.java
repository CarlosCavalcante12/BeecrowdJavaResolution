import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       
        Scanner read = new Scanner(System.in);
        
        int X = read.nextInt();
        Float Y = read.nextFloat();
        Float Z = (X/Y);

        System.out.printf("%.3f km/l\n",Z);
        
    }
}
