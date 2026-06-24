package entities;

public class Triangle {

    /*
     * ==================================================
     *                     CLASSE
     * ==================================================
     *
     * Classe é um tipo estruturado que pode conter:
     *
     *   - Atributos (dados/campos)
     *   - Métodos (funções/operações)
     *
     *
     * ==================================================
     *              RECURSOS DAS CLASSES
     * ==================================================
     *
     * Construtores:
     *   Responsáveis por criar objetos.
     *
     * Sobrecarga:
     *   Permite criar métodos com o mesmo nome,
     *   mas com parâmetros diferentes.
     *
     * Encapsulamento:
     *   Protege os dados do objeto.
     *
     * Herança:
     *   Permite que uma classe herde características
     *   de outra classe.
     *
     * Polimorfismo:
     *   Permite que um mesmo método tenha
     *   comportamentos diferentes.
     *
     *
     * ==================================================
     *               EXEMPLOS DE CLASSES
     * ==================================================
     *
     * Entidades:
     *   - Produto
     *   - Cliente
     *   - Triângulo
     *
     * Serviços:
     *   - Serviço de Frete
     *   - Serviço de Pagamento
     *
     * Controladores:
     *   - ProdutoController
     *   - ClienteController
     *
     */

    // Atributos
    public double a;
    public double b;
    public double c;

    // Método para calcular a área
    public double area() {
        double p = (a + b + c) / 2.0;
        return Math.sqrt(
                p * (p - a) * (p - b) * (p - c));
    }
}

 /*
     * ==================================================
     *                 DIAGRAMA DE CLASSE
     * ==================================================
     *
     *                 +----------------+
     *                 |    Triangle    |
     *                 +----------------+
     *                 | + a : double   |
     *                 | + b : double   |
     *                 | + c : double   |
     *                 +----------------+
     *                 | + area() : double
     *                 +----------------+
     *
     *
     * Legenda:
     *
     * +  public
     * -  private
     * #  protected
     *
     *
     * Atributos:
     *
     * a -> lado A do triângulo
     * b -> lado B do triângulo
     * c -> lado C do triângulo
     *
     *
     * Método:
     *
     * area() -> calcula e retorna
     *           a área do triângulo
     *
     */