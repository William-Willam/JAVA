# 📘 Membros Estáticos (`static`) em Java

## Conceito

Membros estáticos pertencem **à classe**, e não aos objetos (instâncias) da classe.

Por esse motivo, podem ser utilizados **sem a necessidade de criar um objeto**.

---

# Como acessar

Os membros estáticos são acessados utilizando o **nome da própria classe**.

### Exemplo

```java
Math.sqrt(25);

System.out.println(Math.PI);
```

---

# Membros de Instância

São membros que pertencem aos **objetos**.

Para utilizá-los é necessário criar uma instância da classe.

### Exemplo

```java
Produto p = new Produto();

p.nome = "Notebook";
```

---

# Aplicações mais comuns

## 1. Classes utilitárias

São classes que possuem métodos auxiliares para realizar cálculos ou outras operações.

### Exemplos

```java
Math.sqrt();
Math.pow();
Math.max();
```

---

## 2. Declaração de constantes

Constantes geralmente são declaradas utilizando `static final`.

### Exemplo

```java
public static final double PI = 3.14159;
```

---

# Classe Utilitária

Uma classe que possui apenas membros estáticos normalmente é utilizada como **classe utilitária**.

Como seus métodos pertencem à própria classe, normalmente **não faz sentido criar objetos** dessa classe.

---

# Exemplo

```java
public class Calculator {

    public static final double PI = 3.14159;

    public static double circumference(double r){
        return 2.0 * PI * r;
    }

    public static double volume(double r){
        return 4.0 * PI * r * r * r / 3.0;
    }
}
```

## Utilização

```java
double c = Calculator.circumference(3.0);

double v = Calculator.volume(3.0);
```

---

# Exercício de Fixação

Faça um programa para ler um valor numérico correspondente ao **raio**.

Em seguida, mostrar:

- Comprimento da circunferência;
- Volume da esfera;
- Valor de **PI** com duas casas decimais.

---

# Fórmulas

## Comprimento da Circunferência

\[
C = 2 \times PI \times raio
\]

ou

```text
C = 2 × PI × raio
```

---

## Volume da Esfera

\[
V = \frac{4 \times PI \times raio^3}{3}
\]

ou

```text
V = (4 × PI × raio³) / 3
```

---

# Resumo

| Membro | Pertence a | Precisa criar objeto? |
|---------|------------|-----------------------|
| **static** | Classe | ❌ Não |
| **Instância** | Objeto | ✅ Sim |

---

# Exemplo Comparativo

```java
public class Produto {

    // atributo de instância
    public String nome;

    // atributo estático
    public static double imposto = 0.18;

    // método de instância
    public void mostrarNome() {
        System.out.println(nome);
    }

    // método estático
    public static void mostrarImposto() {
        System.out.println(imposto);
    }
}
```

## Utilizando

```java
public class App {

    public static void main(String[] args) {

        Produto p = new Produto();

        p.nome = "Notebook";

        p.mostrarNome();

        Produto.mostrarImposto();

        System.out.println(Produto.imposto);
    }
}
```

---

# Conclusão

- `static` pertence à **classe**.
- Pode ser acessado utilizando o nome da classe.
- Não necessita da criação de objetos.
- Muito utilizado em **classes utilitárias** e para **constantes**.
- Membros de instância pertencem aos objetos e exigem a criação de uma instância da classe.