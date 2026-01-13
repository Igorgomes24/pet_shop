
public class Pets {

    public int id;
    public String nome;
    public int idade;
    public char genero;
    public String especie;
    public int clienteId;
    public Historico historico[];

    public Pets(int id, String nome, int idade, char genero, String especie, int clienteId) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.genero = genero;
        this.especie = especie;
        this.clienteId = clienteId;
    }

    public Pets(String nome, int idade, char genero, String especie, int clienteId) {
        this.id = 0;
        this.nome = "";
        this.idade = 0;
        this.genero = ' ';
        this.especie = "";
        this.clienteId = 0;
    }
}
