import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       
        Scanner read = new Scanner(System.in);
        
        Double A = read.nextDouble();
        Double B = read.nextDouble();
        Double C = read.nextDouble();

        Double aTri = (A*C)/2;
        Double aCirc = (3.14159 * (Math.pow(C,2)));
        Double aTrap = ((A+B)*C)/2;
        Double aQuad = Math.pow(B,2);
        Double aRet = (A*B);

        System.out.printf("TRIANGULO: %.3f\n",aTri);
        System.out.printf("CIRCULO: %.3f\n",aCirc);
        System.out.printf("TRAPEZIO: %.3f\n",aTrap);
        System.out.printf("QUADRADO: %.3f\n",aQuad);
        System.out.printf("RETANGULO: %.3f\n",aRet);
    }
}
