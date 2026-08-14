public class Main{
    public static void main(String[] args){
        Personagem player1 = new Personagem();
        player1.nome = "Art";
        player1.classe = "Mago";
        player1.nivel = 99;
        player1.vida = 265;
        player1.poder = 1350;

        player1.exibirStatus();
        System.out.println();

        Personagem player2 = new Personagem();
        player2.nome = "Priex";
        player2.classe = "Assassino";
        player2.nivel = 99;
        player2.vida = 445;
        player2.poder = 995;

        player2.exibirStatus();
    }
}