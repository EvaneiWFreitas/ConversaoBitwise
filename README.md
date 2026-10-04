# 💻 Conversor Bitwise em Java

Um programa desenvolvido em **Java** para estudar e praticar **operações Bitwise (bit a bit)** utilizando números inteiros informados pelo usuário.

O programa permite escolher os números pelo teclado, selecionar uma operação Bitwise e visualizar o resultado tanto em **decimal** quanto em **binário**.

Além disso, o programa permanece em execução até que o usuário escolha a opção de encerramento.

---

## 📌 Sobre o projeto

O projeto foi desenvolvido com o objetivo de praticar conceitos fundamentais da linguagem **Java**, principalmente:

* Entrada de dados pelo teclado;
* Variáveis;
* Conversão de números para representação binária;
* Operadores Bitwise;
* Estrutura `switch`;
* Estrutura de repetição `while`;
* Estrutura condicional `if`;
* Uso da classe `Scanner`;
* Formatação de saída com `printf`.

O programa recebe dois números inteiros, permite escolher uma operação Bitwise e apresenta o resultado da operação.

---

## 🧠 O que são operações Bitwise?

A palavra **Bitwise** significa, de forma simplificada, **"bit a bit"**.

Os computadores representam os números internamente utilizando **bits**, que podem assumir dois valores:

```text
0 = desligado
1 = ligado
```

Por exemplo, o número decimal `5` pode ser representado em binário como:

```text
5 = 101
```

Enquanto o número `3` pode ser representado como:

```text
3 = 011
```

As operações Bitwise permitem realizar operações diretamente sobre esses bits.

---

# ⚙️ Operações disponíveis

Atualmente, o programa possui três operações Bitwise:

| Operador | Nome | Descrição                                 |                                                 |
| -------- | ---- | ----------------------------------------- | ----------------------------------------------- |
| `&`      | AND  | Retorna `1` quando os dois bits são `1`   |                                                 |
| `        | `    | OR                                        | Retorna `1` quando pelo menos um dos bits é `1` |
| `^`      | XOR  | Retorna `1` quando os bits são diferentes |                                                 |

---

## 🔹 Operador AND `&`

O operador `&` compara os bits dos dois números.

O resultado será `1` somente quando **os dois bits forem `1`**.

Exemplo:

```text
  6 = 110
  5 = 101
      ---
&     100
```

Resultado:

```text
6 & 5 = 4
```

---

## 🔹 Operador OR `|`

O operador `|` retorna `1` quando **pelo menos um dos bits possui o valor `1`**.

Exemplo:

```text
  6 = 110
  5 = 101
      ---
|     111
```

Resultado:

```text
6 | 5 = 7
```

---

## 🔹 Operador XOR `^`

O operador `^` significa **OU Exclusivo**.

Nesse caso, o resultado será `1` quando os bits forem diferentes.

Exemplo:

```text
  6 = 110
  5 = 101
      ---
^     011
```

Resultado:

```text
6 ^ 5 = 3
```

---

# 🔄 Funcionamento do programa

O programa funciona através de um ciclo de repetição.

Primeiramente, solicita o primeiro número:

```text
Informe o Primeiro Nº da Operação binária:
```

Depois solicita o segundo:

```text
Informe o Segundo Nº da Operação binária:
```

Em seguida, apresenta as operações disponíveis:

```text
Escolha a operação Bitwise:

&  -> AND
|  -> OR
^  -> XOR
```

O usuário escolhe a operação desejada.

O programa então apresenta o resultado em decimal e em binário.

Por fim, pergunta:

```text
Deseja realizar outra operação?

1 - Sim
2 - Não
```

Se escolher `1`, o programa retorna ao início e permite realizar uma nova operação.

Se escolher `2`, o programa é encerrado.

---

# 🖥️ Exemplo de execução

```text
==================================
       OPERAÇÃO BITWISE
==================================

Informe o Primeiro Nº da Operação binária: 10

Primeiro Nº: 10 (Representação Binária: 1010)

Informe o Segundo Nº da Operação binária: 6

Segundo Nº: 6 (Representação Binária: 110)

Escolha a operação Bitwise:
&  -> AND
|  -> OR
^  -> XOR

Digite a operação desejada: &

10 & 6 = 2 (Representação Binária: 10)

==================================
Deseja realizar outra operação?
1 - Sim
2 - Não
==================================

Escolha uma opção: 1
```

O programa continuará funcionando e poderá receber novos números e outra operação.

---

# 🛠️ Tecnologias utilizadas

* **Java**
* **Scanner**
* **Integer.toBinaryString()**
* **Switch**
* **While**
* **If**
* **Operadores Bitwise**

---

# 📂 Estrutura do projeto

Uma estrutura simples para o projeto:

```text
ConversorBitwise/
│
├── src/
│   └── ConversaoBitwise.java
│
└── README.md
```

---

# ▶️ Como executar

## 1. Verifique se o Java está instalado

No terminal ou Prompt de Comando, execute:

```bash
java -version
```

Também é possível verificar o compilador:

```bash
javac -version
```

---

## 2. Compile o programa

Entre na pasta onde está o arquivo:

```text
ConversaoBitwise.java
```

Depois execute:

```bash
javac ConversaoBitwise.java
```

---

## 3. Execute o programa

Depois da compilação:

```bash
java ConversaoBitwise
```

---

# 📚 Conceitos de Java praticados

Este projeto é especialmente útil para quem está começando a estudar Java.

### Scanner

Utilizado para receber informações digitadas pelo usuário:

```java
Scanner sc = new Scanner(System.in);
```

Por exemplo:

```java
var value1 = sc.nextInt();
```

---

### Integer.toBinaryString()

Utilizado para converter um número inteiro para sua representação binária:

```java
var binary1 = Integer.toBinaryString(value1);
```

Por exemplo:

```text
Decimal: 10
Binário: 1010
```

---

### Switch

Utilizado para determinar qual operação Bitwise o usuário escolheu:

```java
switch (operation) {

    case "&":
        result = value1 & value2;
        break;

    case "|":
        result = value1 | value2;
        break;

    case "^":
        result = value1 ^ value2;
        break;
}
```

---

### While

Utilizado para permitir que o usuário faça várias operações:

```java
while (continuar) {

    // operações

}
```

O programa somente termina quando a variável `continuar` recebe `false`.

---

# 🎯 Objetivo educacional

Este projeto faz parte dos estudos de programação em Java e tem como objetivo compreender, de maneira prática, como os operadores Bitwise funcionam.

Além das operações com bits, o projeto também permite praticar estruturas fundamentais da programação, como:

```text
Entrada de dados
      ↓
Processamento
      ↓
Estruturas de decisão
      ↓
Exibição do resultado
      ↓
Repetição
```

---

# 🚀 Possíveis melhorias futuras

O projeto pode ser expandido posteriormente para incluir outras operações Bitwise, como:

* `~` → NOT / Inversão;
* `<<` → Deslocamento para a esquerda;
* `>>` → Deslocamento para a direita;
* `>>>` → Deslocamento para a direita sem sinal.

Também podem ser adicionados:

* Menu numérico para escolher as operações;
* Validação dos dados digitados;
* Tratamento de entradas inválidas;
* Explicação passo a passo da operação em binário;
* Histórico das operações realizadas;
* Opção para limpar o histórico;
* Interface gráfica.

---

# 👨‍💻 Autor

**Evanei Freitas**
**Formado em: Bacharel em Engenharia de Software**
**Pós-Graduando em:CYBERCRIME E CYBERSECURITY: PREVENÇÃO E INVESTIGAÇÃO DE CRIMES DIGITAIS**

Projeto desenvolvido para fins de **estudo e prática de programação em Java**.

---

## 📄 Licença

Este projeto foi desenvolvido para fins educacionais e de aprendizado.

Sinta-se à vontade para estudar, modificar e utilizar o código como base para seus próprios exercícios.

---

⭐ **Se este projeto ajudou nos seus estudos, considere deixar uma estrela no repositório!**
