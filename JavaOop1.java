// Exemplo de Orientação a Objetos em Java

// 1. Classe Abstrata: Definição geral que pode ser herdada
abstract class Animal {
    // Atributo encapsulado (private)
    private String nome;

    // Construtor
    public Animal(String nome) {
        this.nome = nome;
    }

    // Método público para acessar o nome (getter)
    public String getNome() {
        return nome;
    }

    // Método abstrato (obrigatório implementar nas subclasses)
    public abstract void emitirSom();
}

// 2. Herança: Classe que herda de Animal
class Cachorro extends Animal {
    // Construtor específico da classe Cachorro
    public Cachorro(String nome) {
        super(nome); // Chamando o construtor da classe pai
    }

    // Implementação do método abstrato
    @Override
    public void emitirSom() {
        System.out.println(getNome() + " diz: Au Au!");
    }
}

// Outra classe que herda de Animal
class Gato extends Animal {
    public Gato(String nome) {
        super(nome);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " diz: Miau!");
    }
}

// 3. Polimorfismo: Trabalhar com referências de forma genérica
class Zoologico {
    public void fazerAnimalEmitirSom(Animal animal) {
        animal.emitirSom(); // Chama o método apropriado de acordo com o tipo do objeto
    }
}

// Classe principal para execução
public class JavaOop1 {
    public static void main(String[] args) {
        // Instanciação de objetos
        Cachorro cachorro = new Cachorro("Rex");
        Gato gato = new Gato("Mingau");

        // Exemplo de Polimorfismo
        Zoologico zoologico = new Zoologico();
        zoologico.fazerAnimalEmitirSom(cachorro);
        zoologico.fazerAnimalEmitirSom(gato);

        // Encapsulamento: Acesso controlado ao atributo nome
        System.out.println("Nome do cachorro: " + cachorro.getNome());
        System.out.println("Nome do gato: " + gato.getNome());
    }
}
