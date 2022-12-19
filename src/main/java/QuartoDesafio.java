import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuartoDesafio {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            int numeroFrases = scanner.nextInt();
            imprime(numeroFrases);
            List<String> listaFrases = new ArrayList<>();
            for (int posicao = 0; posicao <= numeroFrases; posicao += 1) {
                String frase = scanner.nextLine();

                if (frase.length() % 2 != 0) {
                    frase += " ";
                }
                testarLetrasMinusculas(frase);
                listaFrases.add(frase);
            }
            listaFrases.remove(0);
            imprime(listaFrases);
            List<String> frasesInvertidas = new ArrayList<>();
            for (String listaFrase : listaFrases) {
                verificaTamanhoFrase(listaFrase);
                int tamanhoMetadeFrase = listaFrase.length() / 2;
                String parteUm = listaFrase.substring(0, tamanhoMetadeFrase);
                String fraseInvertidaUm = new StringBuilder(parteUm).reverse().toString();
                String parteDois = listaFrase.substring(tamanhoMetadeFrase);
                String fraseInvertidaDois = new StringBuilder(parteDois).reverse().toString();
                String novaFrase = "" + fraseInvertidaUm + fraseInvertidaDois + "";
                frasesInvertidas.add(novaFrase);
            }
            imprime(frasesInvertidas);
            for (String fraseInvertida : frasesInvertidas) {
                imprime(fraseInvertida);
            }
        } catch (Exception exception) {
            imprime("Ops! Alguma coisa deu errado. Rode o programa novamente.");
        }
    }

    public static void testarLetrasMinusculas(@NotNull String frase) throws Exception {
        for (int posicao = 0; posicao < frase.length(); posicao++) {
            char caractere = frase.charAt(posicao);
            if (Character.isLowerCase(caractere)) {
                throw new Exception();
            }
        }
    }

    public static void verificaTamanhoFrase(@NotNull String frase) throws Exception {
        if (frase.length() < 2 || frase.length() > 99) {
            throw new Exception();
        }
    }

    public static void imprime(Object mensagem) {
        System.out.println(mensagem);
    }
}
