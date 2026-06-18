import java.util.Scanner;

public class Atividade4 {

    // Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo,
    // sabendo que o mesmo pode começar em um dia e terminar em outro,
    // tendo uma duração mínima de 1 hora e máxima de 24 horas.

    // Exemplos:
    // (entrada de dados) a partida começou que horas: 16
    // (entrada de dados) que horas a partida terminou: 2
    // (na saída) o jogo durou 10 horas

    public static void main(String[] args) {
        // Leitura do teclado
        Scanner input = new Scanner(System.in);

        // Variaveis
        int inicioPartida;
        int fimPartida;
        int duracaoPartida;

        // entrada de dados
        System.out.print("Que horas começou a partida: ");
        inicioPartida = input.nextInt();
        input.nextLine();

        // pula linha
        System.out.println();

        System.out.print("Que horas terminou a partida: ");
        fimPartida = input.nextInt();

        // processamento de dados
        if (inicioPartida < fimPartida) {
            duracaoPartida = fimPartida - inicioPartida;
        } else {
            duracaoPartida = 24 - inicioPartida + fimPartida;
        }

        // Saída de dados
        System.out.println("A partida durou: " +  duracaoPartida);
        input.close();

    }
}
