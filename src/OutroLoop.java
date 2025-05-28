import java.util.Scanner;

public class OutroLoop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double somaNotas = 0;
        double nota = 0;
        int totalDeNotas = 0;

        System.out.println("Diga a sua avaliação para o filme ou -1 para encerrar:  ");
        nota = leitura.nextDouble();

        if (nota == -1) {
            System.out.println("Obrigado");
            System.exit(0);

        } while (nota != -1) {
            System.out.println("Diga a sua avaliação para o filme ou -1 para encerrar:  ");
            nota = leitura.nextDouble();

            if (nota != -1){
                somaNotas +=  nota;
                totalDeNotas ++;

            }
        }

        mediaAvaliacao =  somaNotas / totalDeNotas;
        System.out.printf("Sua média de avaliações é %.1f",  mediaAvaliacao);

    }
}
