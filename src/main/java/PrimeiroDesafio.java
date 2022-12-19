import org.jetbrains.annotations.NotNull;

import java.util.*;

public class PrimeiroDesafio {

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            int quantidadeNumeros = verificaPositivo();
            List<Integer> numerosPares = new ArrayList<Integer>();
            List<Integer> numerosImpares = new ArrayList<Integer>();
            for (int posicao = 0; posicao < quantidadeNumeros; posicao += 1) {
                int numero = verificaPositivo();
                if (numero % 2 == 0) {
                    numerosPares.add(numero);
                } else {
                    numerosImpares.add(numero);
                }
            }
            Collections.sort(numerosPares);
            numerosImpares.sort(Collections.reverseOrder());
            imprimeLista(numerosPares);
            imprimeLista(numerosImpares);
            scanner.close();
        } catch (Exception exception) {
            imprime("Ops! Alguma coisa deu errado. Rode o programa novamente.");
        }
    }

    public static void imprimeLista(@NotNull List<Integer> lista) {
        for (Integer integer : lista) {
            imprime(integer);
        }
    }

    public static int verificaPositivo() {
        Scanner scanner = new Scanner(System.in);
        int valor;
        do {
            valor = scanner.nextInt();
            if (valor < 1) {
                imprime("Por favor, digite um valor maior que '0'.");
            }
        } while (valor < 1);
        return valor;
    }

    public static void imprime(Object mensagem) {
        System.out.println(mensagem);
    }
}
