
public class Consulta {

    public int id;
    public String data;
    public String descricao;
    public int petId;
    public float custo;
    public int veterinarioId;

    public Consulta(int id, String data, String descricao, int petId, float custo, int veterinarioId) {
        this.id = id;
        this.data = data;
        this.descricao = descricao;
        this.petId = petId;
        this.custo = custo;
        this.veterinarioId = veterinarioId;
    }

    public Consulta(String data, String descricao, int petId, float custo) {
        this.id = 0;
        this.data = "";
        this.descricao = "";
        this.petId = 0;
        this.custo = 0.0f;
        this.veterinarioId = 0;
    }
}
