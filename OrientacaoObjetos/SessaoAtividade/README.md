# Exercício 1: Cálculo de Área, Perímetro e Diagonal de um Retângulo

## Objetivo

Desenvolver um programa em Java que leia os valores da largura e da altura de um retângulo e calcule suas principais propriedades geométricas.

O programa deverá utilizar uma classe `Rectangle` para representar o retângulo e realizar os cálculos.

---

## Requisitos

O sistema deve ler os seguintes dados:

- Largura (Width)
- Altura (Height)

Após a leitura dos valores, o programa deverá exibir:

- Área do retângulo
- Perímetro do retângulo
- Diagonal do retângulo

---

## Diagrama da Classe

```text
+-------------------------------+
|          Rectangle            |
+-------------------------------+
| - width  : double             |
| - height : double             |
+-------------------------------+
| + area()      : double        |
| + perimeter() : double        |
| + diagonal()  : double        |
+-------------------------------+
```

---

## Estrutura da Classe

### Atributos

| Atributo | Tipo | Descrição |
|----------|------|-----------|
| width | double | Largura do retângulo |
| height | double | Altura do retângulo |

---

### Métodos

| Método | Retorno | Descrição |
|---------|---------|-----------|
| area() | double | Calcula a área do retângulo |
| perimeter() | double | Calcula o perímetro do retângulo |
| diagonal() | double | Calcula o comprimento da diagonal |

---

## Fórmulas Utilizadas

### Área

```text
Área = largura × altura
```

ou

```java
area = width * height;
```

---

### Perímetro

```text
Perímetro = 2 × (largura + altura)
```

ou

```java
perimeter = 2 * (width + height);
```

---

### Diagonal

Utilizando o **Teorema de Pitágoras**:

```text
Diagonal = √(largura² + altura²)
```

ou

```java
diagonal = Math.sqrt(width * width + height * height);
```

---

## Exemplo de Execução

```text
Enter rectangle width and height:

3.00
4.00

AREA = 12.00
PERIMETER = 14.00
DIAGONAL = 5.00
```

---

## Estrutura Esperada do Projeto

```text
src/
│
├── application/
│   └── App.java
│
└── entities/
    └── Rectangle.java
```

---

## Conceitos Trabalhados

- Programação Orientada a Objetos (POO)
- Classes e Objetos
- Atributos
- Métodos
- Encapsulamento básico
- Operações matemáticas
- Classe `Math`
- Entrada e saída de dados
- Organização de projetos em pacotes

---

## Desafio Extra

Implemente o método `toString()` na classe `Rectangle` para que seja possível exibir todas as informações do objeto utilizando apenas:

```java
System.out.println(rectangle);
```

Exemplo de saída:

```text
Rectangle
Area: 12.00
Perimeter: 14.00
Diagonal: 5.00
```