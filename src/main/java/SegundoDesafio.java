import java.text.DecimalFormat;
import java.util.Scanner;

public class SegundoDesafio {
    static DecimalFormat formatador = new DecimalFormat("0.00");

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            String valor = scanner.next();
            double valorDoube = Double.parseDouble(valor);
            String valorFormatado = formatador.format(valorDoube).replace(',', '.');
            double novoValor = Double.parseDouble(valorFormatado);
            double notasDois = notas(novoValor);
            moedas(notasDois);
            scanner.close();
        } catch (Exception exception) {
            imprime("Ops! Alguma coisa deu errado. Rode o programa novamente.");
        }
    }

    public static double notas(double valor) {
        imprime("NOTAS:");
        double cemReais = saida(valor, 100.00, "nota");
        double cinquentaReais = saida(cemReais, 50.00, "nota");
        double vinteReais = saida(cinquentaReais, 20.00, "nota");
        double dezReais = saida(vinteReais, 10.00, "nota");
        double cincoReais = saida(dezReais, 5.00, "nota");
        return saida(cincoReais, 2.00,  "nota");
    }

    public static void moedas(double valor) {
        imprime("MOEDAS:");
        double umReal = saida(valor, 1.00, "moeda");
        double cinquentaCentavos = saida(umReal, 0.50, "moeda");
        double vinteCincoCentavos = saida(cinquentaCentavos, 0.25, "moeda");
        double dezCentavos = saida(vinteCincoCentavos, 0.10, "moeda");
        double cincoCentavos = saida(dezCentavos, 0.05, "moeda");
        saida(cincoCentavos, 0.01, "moeda");
    }

    public static double saida(double valor, double notas, String dinheiro) {
        int numeroNotas = (int) (valor / notas);
        String valorFormatado = formatador.format(notas).replace(',', '.');
        imprime(numeroNotas + " " + dinheiro + "(s) de R$ " + valorFormatado);
        return valor - (notas * numeroNotas);
    }

    public static void imprime(Object mensagem) {
        System.out.println(mensagem);
    }
}
