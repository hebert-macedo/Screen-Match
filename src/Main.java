public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match");

        String title = "Top Gun: Maverick"; //Titulo
        String synopsis = "Filme de aventura com galã dos anos 80";
        int releaseYear = 2022; //Data de Lançamento
        boolean includedInPlan = true; //Incluído no Plano?
        double filmNote = 8.1; //Nota do filme
        double average = 9.8 + 6.3 + 8.0; //Média das avaliações
        int classification = (int) (average / 3);



        System.out.println("Filme: " + title);
        System.out.println("Sinopse: " + synopsis);
        System.out.println("Ano de lançamento: " + releaseYear);
        System.out.println("Incluído no plano? " + includedInPlan);
        System.out.println("Média das avaliações: " + classification);


    }
}

