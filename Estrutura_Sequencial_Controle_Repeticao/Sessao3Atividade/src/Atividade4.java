import java.util.Scanner;

public class Atividade4 {

    /*
     * Leia um valor inteiro X (1 <= X <= 1000).
     * Em seguida mostre os ímpares de 1 até X,
     * um valor por linha, inclusive o X, se for o caso.
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int X;

        System.out.print("Digite um número: ");
        X = input.nextInt();

        for (int i = 1; i <= X; i++) {

            if (i % 2 != 0) {
                System.out.println(i);
            }
        }

        input.close();
    }
}