
import java.util.Scanner;

public class Numerosecreto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero , secreto;

        secreto = 1 + (int) (Math.random() * 100);     // genera un número aleatorio del 1 al 100.

        System.out.print("Introduce un número entre 1 y 100: " );           // pide al usuario que escriba un número del 1 al 100
        numero = sc.nextInt();

        do {

            if (numero>0) {

                if (secreto > numero) {
                    System.out.println("El número secreto es mayor al introducido");   // Cuando el número introducido sea menor que el secreto.
                    System.out.print("Introduce otro número: ");
                    numero = sc.nextInt();
                } else {
                    System.out.println("El número secreto es menor al introducido");   // Cuando el número introducido sea mayor que el secreto.
                    System.out.print("Introduce otro número: ");
                    numero = sc.nextInt();
                }

            } else {
                System.out.println("Mala suerte. No has acertado el número secreto");   // Cuando el número introducido sea menor a 0 te rendirás.
                numero = sc.nextInt();
            }


        } while (secreto != numero);




        System.out.print("Enhorabuena. El número secreto era " + secreto);          // Una vez adivinado el número secreto
    }


}