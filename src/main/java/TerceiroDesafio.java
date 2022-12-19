import java.util.*;

public class TerceiroDesafio {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            int size = scanner.nextInt();
            int valorAlvo = scanner.nextInt();

            List<Integer> lista = new ArrayList<>();
            for (int posicao = 0; posicao < size; posicao += 1) {
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
