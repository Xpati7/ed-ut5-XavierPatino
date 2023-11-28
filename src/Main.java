import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.print("Introduce un número: ");
        num = sc.nextInt();

        for (int fil = 0; fil < num; fil++)
            for (int col = 0; col <= fil; col++) {
                System.out.println("*");
            }
            System.out.println(); // acabamos fila
        }
    }
