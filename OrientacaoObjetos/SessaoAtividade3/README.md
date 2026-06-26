# Exercício 3: Avaliação de Aluno

## Objetivo

Desenvolver um programa em Java para calcular a nota final de um aluno com base nas notas obtidas durante os três trimestres do ano letivo.

O programa deverá utilizar uma classe `Student` para representar o aluno e realizar os cálculos da nota final, além de verificar se ele foi aprovado ou reprovado.

---

## Requisitos

O sistema deve ler os seguintes dados:

- Nome do aluno
- Nota do 1º trimestre (valor máximo: **30 pontos**)
- Nota do 2º trimestre (valor máximo: **35 pontos**)
- Nota do 3º trimestre (valor máximo: **35 pontos**)

Após a leitura dos dados, o programa deverá:

1. Calcular a nota final do aluno.
2. Exibir a nota final.
3. Informar se o aluno foi:
   - **PASS** (Aprovado), caso obtenha **60 pontos ou mais**.
   - **FAILED** (Reprovado), caso obtenha menos de **60 pontos**.
4. Caso o aluno seja reprovado, informar quantos pontos faltaram para atingir a nota mínima.

---

## Diagrama da Classe

```text
+------------------------------------+
|              Student               |
+------------------------------------+
| - name : String                    |
| - grade1 : double                  |
| - grade2 : double                  |
| - grade3 : double                  |
+------------------------------------+
| + finalGrade() : double            |
| + missingPoints() : double         |
+------------------------------------+
```

---

## Estrutura da Classe

### Atributos

| Atributo | Tipo | Descrição |
|----------|------|-----------|
| name | String | Nome do aluno |
| grade1 | double | Nota do 1º trimestre |
| grade2 | double | Nota do 2º trimestre |
| grade3 | double | Nota do 3º trimestre |

---

### Métodos

| Método | Retorno | Descrição |
|---------|---------|-----------|
| finalGrade() | double | Calcula a nota final do aluno |
| missingPoints() | double | Calcula quantos pontos faltam para aprovação |

---

## Regras de Negócio

- Nota máxima do **1º trimestre:** 30 pontos.
- Nota máxima do **2º trimestre:** 35 pontos.
- Nota máxima do **3º trimestre:** 35 pontos.
- Nota máxima total: **100 pontos**.
- O aluno será aprovado se obtiver **60 pontos ou mais**.

---

## Fórmulas Utilizadas

### Nota Final

```text
Nota Final = Nota1 + Nota2 + Nota3
```

ou

```java
finalGrade = grade1 + grade2 + grade3;
```

---

### Pontos Restantes

Caso o aluno seja reprovado:

```text
Pontos Faltantes = 60 - Nota Final
```

ou

```java
missingPoints = 60.0 - finalGrade();
```

---

## Exemplo de Execução 1

```text
Name: Alex Green

First grade:
27.00

Second grade:
31.00

Third grade:
32.00

FINAL GRADE = 90.00
PASS
```

---

## Exemplo de Execução 2

```text
Name: Alex Green

First grade:
17.00

Second grade:
20.00

Third grade:
15.00

FINAL GRADE = 52.00
FAILED
MISSING 8.00 POINTS
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
    └── Student.java
```

---

## Conceitos Trabalhados

- Programação Orientada a Objetos (POO)
- Classes e Objetos
- Atributos
- Métodos
- Operações matemáticas
- Estruturas condicionais (`if` e `else`)
- Entrada e saída de dados
- Organização de projetos em pacotes

---

## Desafio Extra

Implemente o método `toString()` para exibir automaticamente os dados do aluno.

Exemplo:

```java
System.out.println(student);
```

Saída esperada:

```text
Student: Alex Green
Final Grade: 90.00
Status: PASS
```

ou

```text
Student: Alex Green
Final Grade: 52.00
Status: FAILED
Missing Points: 8.00
```

---

## Resultado Esperado

Ao final do exercício, o programa deverá ser capaz de:

- Cadastrar um aluno.
- Calcular a nota final.
- Verificar automaticamente se o aluno foi aprovado ou reprovado.
- Informar a quantidade de pontos faltantes para aprovação, quando necessário.
- Utilizar uma classe (`Student`) para encapsular os dados e os comportamentos relacionados ao aluno.