public class Main {
    public static void main(String[] args) {
        String estudou = IO.readln("Você estudou?(S/N)");
        String estudou_concurso = IO.readln("Você estudou para o concurso?(S/N)");
        String estidou_ingles = IO.readln("Você estudou inglês?(S/N)");
        String treinou = IO.readln("Você treinou?(S/N)");

        final String verde = "\u001B[32m";
        final String amarelo = "\u001B[33m";
        final String vermelho = "\u001B[31m";
        
        if (estudou.equals("S") && treinou.equals("S")) {
            IO.println(verde + "Parabéns");
        } else if ((estudou.equals("S") && treinou.equals("N")) || (estudou.equals("N") && treinou.equals("S"))) {
            IO.println(amarelo + "Da pra melhorar!");
        } else {
            IO.println(vermelho + "Estude e treine mais!");
        }
    }
}
