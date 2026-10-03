/***
 * A palavra "Bitwise" em inglês significa "bit a bit".
 *
 * As operações Bitwise permitem trabalhar diretamente
 * com os bits (0 e 1) que formam um número inteiro.
 *
 * Neste programa o usuário poderá:
 *
 * 1 - Informar dois números inteiros;
 * 2 - Escolher uma operação Bitwise;
 * 3 - Visualizar o resultado decimal e binário;
 * 4 - Realizar novas operações quantas vezes quiser.
 *
 * Operações disponíveis:
 *
 * &  -> AND (E)
 * |  -> OR  (OU)
 * ^  -> XOR (OU Exclusivo)
 *
 * O programa somente será encerrado quando o usuário
 * escolher a opção "Sair".
 *
 */
import java.util.Scanner;
public class ConversaoBitwise {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Variável responsável por controlar o programa
        var continuar = true;

        // Enquanto continuar for true, o programa continua executando
        while (continuar) {

            System.out.println("\n==================================");
            System.out.println("       OPERAÇÃO BITWISE");
            System.out.println("==================================");

            // Solicita o primeiro número ao usuário
            System.out.print("Informe o Primeiro Nº da Operação binária: ");
            var value1 = sc.nextInt();

            // Converte o primeiro número para binário
            var binary1 = Integer.toBinaryString(value1);

            // Exibe o primeiro número e sua representação binária
            System.out.printf("Primeiro Nº: %s (Representação Binária: %s)%n", value1, binary1);

            // Solicita o segundo número ao usuário
            System.out.print("Informe o Segundo Nº da Operação binária: ");
            var value2 = sc.nextInt();

            // Converte o segundo número para binário
            var binary2 = Integer.toBinaryString(value2);

            // Exibe o segundo número e sua representação binária
            System.out.printf("Segundo Nº: %s (Representação Binária: %s)%n", value2, binary2);

            // Apresenta as operações disponíveis
            System.out.println("\nEscolha a operação Bitwise:");
            System.out.println("&  -> AND");
            System.out.println("|  -> OR");
            System.out.println("^  -> XOR");

            // Solicita a operação ao usuário
            System.out.print("Digite a operação desejada: ");
            var operation = sc.next();

            // Variável que armazenará o resultado
            var result = 0;

            // Verifica qual operação foi escolhida
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

                default:
                    System.out.println("\nOperação inválida!");
                    continue;
            }

            // Converte o resultado para binário
            var binaryResult = Integer.toBinaryString(result);

            // Exibe a operação e o resultado
            System.out.printf("%n%s %s %s = %s (Representação Binária: %s)%n", value1, operation, value2, result, binaryResult);

            // Pergunta se o usuário deseja realizar outra operação
            System.out.println("\n==================================");
            System.out.println("Deseja realizar outra operação?");
            System.out.println("1 - Sim");
            System.out.println("2 - Não");
            System.out.println("==================================");

            System.out.print("Escolha uma opção: ");
            var opcao = sc.nextInt();

            // Verifica a escolha do usuário
            if (opcao == 2) {
                continuar = false;
            }
        }

        // Mensagem exibida quando o programa for encerrado
        System.out.println("\nPrograma encerrado!");
        System.out.println("Obrigado por utilizar a Calculadora Bitwise.");
        System.out.println("Programa Desenvolvido por: Engenheiro de Software, Evanei Freitas.");

        // Fecha o Scanner
        sc.close();
    }
}

