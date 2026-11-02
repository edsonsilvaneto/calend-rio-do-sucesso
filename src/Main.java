public class Main {
    public static void main(String[] args) {

        final String sim = "S";
        final String nao = "N";
        final String verde = "\u001B[32m";
        final String amarelo = "\u001B[33m";
        final String vermelho = "\u001B[31m";
        String estudou = "";
        String treinou = "";
        String estudou_concurso = "";
        String estudou_ingles = "";

        do {
            estudou = IO.readln("Você estudou?(S/N)");
                if (!estudou.equals(sim) && !estudou.equals(nao)) {
                    IO.println("Opção inválida! Digite S ou N");
                } 
        } while (!estudou.equals(sim) && !estudou.equals(nao));
            
        do { 
            treinou = IO.readln("Você treinou?(S/N)");
                if (!treinou.equals(sim) && !treinou.equals(nao)) {
                    IO.println("Opção inválida! Digite S ou N");
                }
            } while (!treinou.equals(sim) && !treinou.equals(nao));

        do {
            estudou_concurso = IO.readln("Você estudou para o concurso?(S/N)");
                if (!estudou_concurso.equals(sim) && !estudou_concurso.equals(nao)) {
                    IO.println("Opção inválida! Digite S ou N");
                }
            } while (!estudou_concurso.equals(sim) && !estudou_concurso.equals(nao));

        do {
            estudou_ingles = IO.readln("Você estudou inglês?(S/N)");
                if (!estudou_ingles.equals(sim) && !estudou_ingles.equals(nao)) {
                    IO.println("Opção inválida! Digite S ou N");
                }
            } while (!estudou_ingles.equals(sim) && !estudou_ingles.equals(nao));
        
        if (estudou.equals(sim) && treinou.equals(sim)) {
            IO.println(verde + "Parabéns");
        } else if ((estudou.equals(sim) && treinou.equals(nao)) || (estudou.equals(nao) && treinou.equals(sim))) {
            IO.println(amarelo + "Da pra melhorar!");
        } else if (estudou.equals(nao) && treinou.equals(nao)) {
            IO.println(vermelho + "Estude e treine mais!");
        }
    }
}
