
public class Vetenerario {

    public int id;
    public String nome;
    public String email;
    public String telefone;
    public String especialidade;

    public Vetenerario(int id, String nome, String email, String telefone, String especialidade) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.especialidade = especialidade;
    }

    public Vetenerario(String nome, String email, String telefone, String especialidade) {
        this.id = 0;
        this.nome = "";
        this.email = "";
        this.telefone = "";
        this.especialidade = "";
    }

}
