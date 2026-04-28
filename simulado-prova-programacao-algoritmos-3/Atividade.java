import java.util.Scanner;

public class Atividade {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int[] notas = { 200, 100, 50, 20, 10, 5, 2, 1 };

        System.out.print("Digite o nome do cliente: ");
        String nomeCliente = teclado.nextLine();

        System.out.print("Digite o valor total da compra: ");
        double valorTotal = teclado.nextDouble();

        System.out.print("Digite o valor pago pelo cliente: ");
        double valorPago = teclado.nextDouble();

        double troco = valorPago - valorTotal;

        System.out.println("\nO cliente " + nomeCliente + " comprou: " + valorTotal + ", mas pagou: " + valorPago);

        for (int i = 0; i < notas.length; i++) {
            int quantidadeNotas = (int) (troco / notas[i]);
            troco = troco % notas[i];

            if (quantidadeNotas > 0) {
                System.out.println(quantidadeNotas + " nota(s) de R$" + notas[i]);
            }
        }
        teclado.close();
    }
}
