import java.util.*;

public class TerceiroDesafio {
    public static void main(String[] args)
    {
        try {
            Scanner scanner = new Scanner(System.in);
            imprime("Qual é o tamanho da lista? ");
            int size = scanner.nextInt();
            imprime("Qual é o valor alvo?");
            int valorAlvo = scanner.nextInt();

            List<Integer> lista = new ArrayList<>();
            for (int posicao = 0; posicao < size; posicao += 1) {
                imprime("Adicione o " + (posicao + 1) + "° valor a lista: ");
                Integer valorLista = scanner.nextInt();
                lista.add(valorLista);
            }
            Collections.sort(lista);
            int numeroPares = 0;
            for (int posicao = 0; posicao < lista.size(); posicao += 1) {
                for (int ponto = 0; ponto < lista.size(); ponto += 1) {
                    int diferenca = posicao - ponto;
                    if (diferenca == valorAlvo) {
                        numeroPares += 1;
                    }
                }
            }
            imprime("O número de pares que satisfazem o critério: ");
            imprime(numeroPares);
            scanner.close();
        } catch (Exception exception) {
            imprime("Ops! Alguma coisa deu errado. Rode o programa novamente.");
        }

    }

    public static void imprime(Object mensagem) {
        System.out.println(mensagem);
    }
}
