import java.text.DecimalFormat;
import java.util.Scanner;

public class SegundoDesafio {
    static DecimalFormat formatador = new DecimalFormat("0.00");

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);


            double valor = scanner.nextDouble();
            String valorFormatado = formatador.format(valor).replace(',', '.');
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
        double cemReais = saidaNotas(valor, 100.00, "nota");
        double cinquentaReais = saidaNotas(cemReais, 50.00, "nota");
        double vinteReais = saidaNotas(cinquentaReais, 20.00, "nota");
        double dezReais = saidaNotas(vinteReais, 10.00, "nota");
        double cincoReais = saidaNotas(dezReais, 5.00, "nota");
        return saidaNotas(cincoReais, 2.00,  "nota");
    }

    public static void moedas(double valor) {
        imprime("MOEDAS:");
        double umReal = saidaNotas(valor, 1.00, "moeda");
        double cinquentaCentavos = saidaNotas(umReal, 0.50, "moeda");
        double vinteCincoCentavos = saidaNotas(cinquentaCentavos, 0.25, "moeda");
        double dezCentavos = saidaNotas(vinteCincoCentavos, 0.10, "moeda");
        double cincoCentavos = saidaNotas(dezCentavos, 0.05, "moeda");
        saidaNotas(cincoCentavos, 0.01, "moeda");
    }

    public static double saidaNotas(double valor, double notas, String dinheiro) {
        int numeroNotas = (int) (valor / notas);
        String valorFormatado = formatador.format(notas).replace(',', '.');
        imprime(numeroNotas + " " + dinheiro + "(s) de R$ " + valorFormatado);
        return valor - (notas * numeroNotas);
    }

    public static void imprime(Object mensagem) {
        System.out.println(mensagem);
    }
}
