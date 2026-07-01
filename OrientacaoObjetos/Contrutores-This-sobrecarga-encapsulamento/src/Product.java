/*
 * ==================================================
 *                  CONSTRUTORES
 * ==================================================
 *
 * Conceito:
 *
 * Construtor é uma operação especial da classe
 * executada automaticamente no momento da criação
 * (instanciação) de um objeto.
 *
 *
 * ==================================================
 *                PRINCIPAIS UTILIZAÇÕES
 * ==================================================
 *
 * • Inicializar os valores dos atributos.
 *
 * • Permitir ou obrigar que o objeto receba
 *   dados no momento de sua criação
 *   (injeção de dependência).
 *
 *
 * ==================================================
 *              CONSTRUTOR PADRÃO
 * ==================================================
 *
 * Se nenhum construtor for declarado,
 * o Java cria automaticamente um
 * construtor padrão (sem parâmetros).
 *
 * Exemplo:
 *
 * Produto p = new Produto();
 *
 *
 * ==================================================
 *            CONSTRUTOR CUSTOMIZADO
 * ==================================================
 *
 * Podemos criar um construtor para
 * inicializar os atributos do objeto.
 *
 * Exemplo:
 *
 * public Produto(String nome,
 *                double preco,
 *                int quantidade){
 *
 *     this.nome = nome;
 *     this.preco = preco;
 *     this.quantidade = quantidade;
 * }
 *
 *
 * ==================================================
 *                  SOBRECARGA
 * ==================================================
 *
 * Uma mesma classe pode possuir
 * vários construtores.
 *
 * Cada construtor deve possuir uma
 * lista de parâmetros diferente.
 *
 *
 * Exemplo:
 *
 * Produto()
 *
 * Produto(String nome)
 *
 * Produto(String nome,
 *          double preco,
 *          int quantidade)
 *
 *
 * ==================================================
 *                 EXEMPLO PRÁTICO
 * ==================================================
 *
 * Classe:
 *
 * public class Produto {
 *
 *     public String nome;
 *     public double preco;
 *     public int quantidade;
 *
 *     public Produto(String nome,
 *                    double preco,
 *                    int quantidade){
 *
 *         this.nome = nome;
 *         this.preco = preco;
 *         this.quantidade = quantidade;
 *     }
 * }
 *
 *
 * Instanciando um objeto:
 *
 * Produto p =
 *     new Produto("Notebook", 3500.00, 5);
 *
 * O construtor será executado automaticamente
 * e inicializará os atributos do objeto.
 *
 */




/*
 * ==================================================
 *               PALAVRA-CHAVE this
 * ==================================================
 *
 * Conceito:
 *
 * A palavra-chave "this" é uma referência
 * para o próprio objeto que está sendo criado
 * ou utilizado.
 *
 * Ela é muito utilizada dentro dos construtores
 * e métodos da classe.
 *
 *
 * ==================================================
 *            PRINCIPAIS UTILIZAÇÕES
 * ==================================================
 *
 * 1 - Diferenciar atributos dos parâmetros.
 *
 * Exemplo:
 *
 * public Produto(String nome,
 *                double preco,
 *                int quantidade) {
 *
 *     this.nome = nome;
 *     this.preco = preco;
 *     this.quantidade = quantidade;
 * }
 *
 * Neste exemplo:
 *
 * this.nome        -> atributo da classe
 * nome             -> parâmetro do construtor
 *
 *
 * ==================================================
 *         REFERENCIAR O PRÓPRIO OBJETO
 * ==================================================
 *
 * O "this" representa o objeto atual.
 *
 * Exemplo:
 *
 * Produto p = new Produto("Mouse", 80.00, 10);
 *
 * Durante a execução do construtor,
 * "this" faz referência ao objeto "p".
 *
 *
 * ==================================================
 *      CHAMAR OUTRO CONSTRUTOR DA CLASSE
 * ==================================================
 *
 * Também é possível utilizar o "this()"
 * para chamar outro construtor.
 *
 * Exemplo:
 *
 * public Produto() {
 *     this("Sem nome", 0.0, 0);
 * }
 *
 * public Produto(String nome,
 *                double preco,
 *                int quantidade) {
 *
 *     this.nome = nome;
 *     this.preco = preco;
 *     this.quantidade = quantidade;
 * }
 *
 *
 * ==================================================
 *                    RESUMO
 * ==================================================
 *
 * this.atributo
 *      -> acessa um atributo do objeto.
 *
 * this.metodo()
 *      -> chama outro método do objeto.
 *
 * this(...)
 *      -> chama outro construtor da mesma classe.
 *
 */

public class Product {
    // atributo
    public String name;
    public double price;
    public int quantity;

    // construtor
    public Product (String name, double price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    // metodos
    public double totalValueInStock() {
        return price * quantity;
    }

    public void addProducts(int quantity) {
        this.quantity += quantity;
    }

    public void removeProducts(int quantity) {
        this.quantity -= quantity;
    }

    // converter objeto em string
    public String toString() {
        return name
                + ", $"
                + String.format("%.2f", price)
                + ", "
                + quantity
                + " units, Total: $"
                + String.format("%.2f", totalValueInStock());
    }
}