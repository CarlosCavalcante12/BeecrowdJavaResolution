import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int tempo = read.nextInt();

        if (tempo < 60 ){
            System.out.printf("0:0:%d\n",tempo);
        } else if (tempo > 60 && tempo < 3600) {
            int min = tempo /60;
            tempo = tempo % 60;

            System.out.printf("0:%d:%d\n",min,tempo);
        } else {
            int horas = tempo / 3600;
            tempo = tempo % 3600;

            int min = tempo /60;
            tempo = tempo % 60;

            System.out.printf("%d:%d:%d\n",horas,min,tempo);
        }

    }
}
