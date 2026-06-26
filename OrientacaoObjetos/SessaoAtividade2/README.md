# Exercício 2: Cálculo de Salário de um Funcionário

## Objetivo

Desenvolver um programa em Java para gerenciar os dados de um funcionário.

O programa deverá ler as informações de um funcionário, calcular seu salário líquido e permitir o reajuste do salário bruto por uma porcentagem informada pelo usuário.

---

## Requisitos

O sistema deve ler os seguintes dados de um funcionário:

- Nome
- Salário Bruto (Gross Salary)
- Imposto (Tax)

Após a leitura dos dados, o programa deverá:

1. Exibir:
   - Nome do funcionário
   - Salário líquido

2. Ler uma porcentagem de aumento salarial.

3. Aplicar o aumento **somente sobre o salário bruto**.

4. Exibir novamente os dados atualizados do funcionário.

---

## Diagrama da Classe

```text
+--------------------------------------+
|              Employee                |
+--------------------------------------+
| - name : String                      |
| - grossSalary : double               |
| - tax : double                       |
+--------------------------------------+
| + netSalary() : double               |
| + increaseSalary(percentage:double)  |
+--------------------------------------+
```

---

## Estrutura da Classe

### Atributos

| Atributo | Tipo | Descrição |
|----------|------|-----------|
| name | String | Nome do funcionário |
| grossSalary | double | Salário bruto |
| tax | double | Valor do imposto descontado |

---

### Métodos

| Método | Retorno | Descrição |
|---------|---------|-----------|
| netSalary() | double | Calcula o salário líquido |
| increaseSalary(double percentage) | void | Aplica um aumento percentual ao salário bruto |

---

## Fórmulas Utilizadas

### Salário Líquido

```text
Salário Líquido = Salário Bruto - Imposto
```

ou

```java
netSalary = grossSalary - tax;
```

---

### Aumento Salarial

```text
Novo Salário Bruto = Salário Bruto + (Salário Bruto × Percentual / 100)
```

ou

```java
grossSalary += grossSalary * percentage / 100;
```

Após o reajuste, o salário líquido passa a ser:

```text
Salário Líquido = Novo Salário Bruto - Imposto
```

> **Observação:** O imposto permanece o mesmo após o reajuste.

---

## Exemplo de Execução

```text
Name: Joao Silva
Gross salary: 6000.00
Tax: 1000.00

Employee: Joao Silva, $5000.00

Which percentage to increase salary?
10.0

Updated data: Joao Silva, $5600.00
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
    └── Employee.java
```

---

## Conceitos Trabalhados

- Programação Orientada a Objetos (POO)
- Classes e Objetos
- Atributos
- Métodos
- Encapsulamento básico
- Operações matemáticas
- Manipulação de porcentagem
- Entrada e saída de dados
- Organização de projetos em pacotes
- Sobrescrita do método `toString()`

---

## Desafio Extra

Implemente o método `toString()` para que seja possível exibir os dados do funcionário utilizando apenas:

```java
System.out.println(employee);
```

Exemplo de saída:

```text
Employee: Joao Silva, $5000.00
```

Após o aumento salarial:

```text
Updated data: Joao Silva, $5600.00
```

---

## Resultado Esperado

Ao final do exercício, o programa deverá ser capaz de:

- Cadastrar um funcionário.
- Calcular automaticamente o salário líquido.
- Aplicar um reajuste percentual ao salário bruto.
- Exibir as informações atualizadas do funcionário.
- Utilizar uma classe (`Employee`) para encapsular os dados e comportamentos relacionados ao funcionário.