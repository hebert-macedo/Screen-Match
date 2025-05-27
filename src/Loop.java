import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double somaNotas = 0;
        double nota = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("Digite sua nota:  ");
            nota = leitura.nextDouble();
            somaNotas +=  nota;
        }

        mediaAvaliacao =  somaNotas / 3;
        System.out.println("Sua média de avaliações é " + mediaAvaliacao);

    }

}
