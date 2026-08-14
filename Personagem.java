public class Personagem {
    public String nome;
    public String classe;
    public int nivel;
    public int vida;
    public double poder;

    public void Personagem(String nome, String classe, int nivel, int vida, double poder){
        this.nome = nome;
        this.classe = classe;
        this.nivel = nivel;
        this.vida = vida;
        this.poder = poder;
    }

    public void exibirStatus(){
        System.out.println("Nome: " + nome);
        System.out.println("Classe: " + classe);
        System.out.println("Nível: " + nivel);
        System.out.println("Vida: " + vida);
        System.out.println("Poder: " + poder);

    }
}


