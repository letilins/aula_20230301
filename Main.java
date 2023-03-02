class Animal{
    String nome;
    int idade;

    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void comer() {
        System.out.println(this.nome + " está comendo");
    }

    public void dormir() {
        System.out.println(this.nome + " está dormindo");
    }
}

class Cachorro extends Animal {
    String raca;

    public Cachorro(String nome, int idade, String raca) {
        super("Cachorro " + nome, idade);
        this.raca = raca;
    }

    public void informarRaca() {
        System.out.println("A raça do " + this.nome + " é " + this.raca);
    }
}

    class Gato extends Animal{
        String cor = "Sem cor";
        public Gato(String nome, int idade, String cor){
            super(nome, idade);
            System.out.println(this.cor + "Atributo da Classe");
            System.out.println(cor + "Variavel do metodo ");
        }
    }
  
    public class Main{
        public static void main(String[]args) {
            Cachorro cachorro = new Cachorro("Rex", 5,"Vira-lata");
            cachorro.dormir();
            cachorro.comer();
            cachorro.informarRaca();
    
            Gato gato = new Gato("Bolinha", 2,"Laranja");
            gato.dormir();
            gato.comer();  
        }
    }