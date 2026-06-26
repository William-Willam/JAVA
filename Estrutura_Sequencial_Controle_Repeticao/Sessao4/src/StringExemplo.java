public class StringExemplo {

    /*
     * ==================================================
     *                FUNÇÕES PARA STRING
     * ==================================================
     *
     * String é uma sequência de caracteres.
     *
     * Java disponibiliza diversos métodos para
     * manipulação de textos.
     *
     *
     * ==================================================
     *                  FORMATAÇÃO
     * ==================================================
     *
     * toLowerCase()
     * --------------------------------------------------
     * Converte todos os caracteres para minúsculo.
     *
     * Exemplo:
     *   "Maria".toLowerCase()
     *   Resultado: "maria"
     *
     *
     * toUpperCase()
     * --------------------------------------------------
     * Converte todos os caracteres para maiúsculo.
     *
     * Exemplo:
     *   "Maria".toUpperCase()
     *   Resultado: "MARIA"
     *
     *
     * trim()
     * --------------------------------------------------
     * Remove espaços em branco no início e no fim.
     *
     * Exemplo:
     *   "   Maria   ".trim()
     *   Resultado: "Maria"
     *
     *
     * ==================================================
     *                    RECORTE
     * ==================================================
     *
     * substring(inicio)
     * --------------------------------------------------
     * Retorna a String a partir da posição informada.
     *
     * Exemplo:
     *   "Maria".substring(2)
     *   Resultado: "ria"
     *
     *
     * substring(inicio, fim)
     * --------------------------------------------------
     * Retorna parte da String.
     *
     * Exemplo:
     *   "Maria".substring(1, 4)
     *   Resultado: "ari"
     *
     *
     * ==================================================
     *                  SUBSTITUIÇÃO
     * ==================================================
     *
     * replace(char, char)
     * --------------------------------------------------
     * Substitui um caractere por outro.
     *
     * Exemplo:
     *   "Maria".replace('a', 'x')
     *   Resultado: "Mxrix"
     *
     *
     * replace(String, String)
     * --------------------------------------------------
     * Substitui um texto por outro.
     *
     * Exemplo:
     *   "Maria".replace("ria", "cos")
     *   Resultado: "Macos"
     *
     *
     * ==================================================
     *                    BUSCA
     * ==================================================
     *
     * indexOf()
     * --------------------------------------------------
     * Retorna a primeira ocorrência.
     *
     * Exemplo:
     *   "Maria".indexOf("a")
     *   Resultado: 1
     *
     *
     * lastIndexOf()
     * --------------------------------------------------
     * Retorna a última ocorrência.
     *
     * Exemplo:
     *   "Maria".lastIndexOf("a")
     *   Resultado: 4
     *
     *
     * ==================================================
     *                    SPLIT
     * ==================================================
     *
     * split(" ")
     * --------------------------------------------------
     * Divide uma String em várias partes.
     *
     * Exemplo:
     *   "Maria Silva".split(" ")
     *
     * Resultado:
     *   vetor[0] = "Maria"
     *   vetor[1] = "Silva"
     *
     */

    public static void main(String[] args) {

        String original = "   abcde FGHIJ ABC abc DEFG   ";

        String s01 = original.toLowerCase();
        String s02 = original.toUpperCase();
        String s03 = original.trim();

        String s04 = original.substring(2);
        String s05 = original.substring(2, 9);

        String s06 = original.replace('a', 'x');
        String s07 = original.replace("abc", "xy");

        int i = original.indexOf("bc");
        int j = original.lastIndexOf("bc");

        String texto = "batata maca limao";

        String[] vetor = texto.split(" ");

        System.out.println("Original: -" + original + "-");
        System.out.println("toLowerCase: -" + s01 + "-");
        System.out.println("toUpperCase: -" + s02 + "-");
        System.out.println("trim: -" + s03 + "-");

        System.out.println("substring(2): " + s04);
        System.out.println("substring(2,9): " + s05);

        System.out.println("replace('a','x'): " + s06);
        System.out.println("replace(\"abc\",\"xy\"): " + s07);

        System.out.println("indexOf(\"bc\"): " + i);
        System.out.println("lastIndexOf(\"bc\"): " + j);

        System.out.println("vetor[0]: " + vetor[0]);
        System.out.println("vetor[1]: " + vetor[1]);
        System.out.println("vetor[2]: " + vetor[2]);
    }
}