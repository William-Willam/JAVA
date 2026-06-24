# Exercício: Controle de Estoque de Produtos

## Objetivo

Desenvolver um programa em Java para gerenciar o estoque de um produto.

O programa deverá ler os dados de um produto e permitir operações de entrada e saída de estoque, exibindo as informações atualizadas após cada operação.

---

## Requisitos

O sistema deve ler os seguintes dados de um produto:

- Nome
- Preço
- Quantidade em estoque

Após a leitura dos dados, o programa deverá:

1. Exibir os dados do produto:
   - Nome
   - Preço
   - Quantidade em estoque
   - Valor total em estoque

2. Realizar uma entrada no estoque e exibir novamente os dados atualizados.

3. Realizar uma saída no estoque e exibir novamente os dados atualizados.

---

## Diagrama da Classe

```text
+----------------------------------+
|             Product              |
+----------------------------------+
| - name : String                  |
| - price : double                 |
| - quantity : int                 |
+----------------------------------+
| + totalValueInStock() : double   |
| + addProducts(qtd:int) : void    |
| + removeProducts(qtd:int) : void |
+----------------------------------+
```

---

## Estrutura da Classe

### Atributos

| Atributo | Tipo | Descrição |
|-----------|------|-----------|
| name | String | Nome do produto |
| price | double | Preço unitário do produto |
| quantity | int | Quantidade disponível em estoque |

### Métodos

| Método | Retorno | Descrição |
|----------|----------|-----------|
| totalValueInStock() | double | Retorna o valor total do estoque |
| addProducts(int quantity) | void | Adiciona unidades ao estoque |
| removeProducts(int quantity) | void | Remove unidades do estoque |

---

## Fórmula do Valor Total em Estoque

```java
valorTotal = price * quantity;
```

---

## Exemplo de Execução

```text
Enter product data:
Name: TV
Price: 900.00
Quantity in stock: 10

Product data:
TV, $900.00, 10 units, Total: $9000.00

Enter the number of products to be added in stock:
5

Updated data:
TV, $900.00, 15 units, Total: $13500.00

Enter the number of products to be removed from stock:
3

Updated data:
TV, $900.00, 12 units, Total: $10800.00
```

---

## Conceitos Trabalhados

- Classes e Objetos
- Atributos
- Métodos
- Encapsulamento básico
- Manipulação de estoque
- Entrada e saída de dados
- Programação Orientada a Objetos (POO)

---

## Desafio Extra

Implemente o método `toString()` para exibir os dados do produto de forma automática ao utilizar:

```java
System.out.println(product);
```