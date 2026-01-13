
public class Cliente {

    public int id;
    public String nome;
    public String email;
    public int nif;
    public String morada;
    public String telefone;
    public Pets pets[];

    public Cliente(int id, String nome, String email, int nif, String morada, String telefone) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.nif = nif;
        this.morada = morada;
        this.telefone = telefone;
    }

    public Cliente(String nome, String email, int nif, String morada, String telefone) {
        this.id = 0;
        this.nome = "";
        this.email = "";
        this.nif = 0;
        this.morada = "";
        this.telefone = "";
    }
}
