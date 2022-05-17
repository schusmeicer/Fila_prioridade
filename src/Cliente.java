import java.time.LocalTime;
public class Cliente {
    private String Nome;
    private String CC;
    private Integer Prioridade;
    private float Saldo;
    private LocalTime hora_entrada_na_fila;
    private LocalTime tempo_espera_fila;
    private LocalTime tempo_sendo_atendido;

    public String getExtrato() {
        return extrato;
    }

    public void setExtrato(String extrato) {
        this.extrato = extrato;
    }

    private String extrato;


    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getCC() {
        return CC;
    }

    public void setCC(String CC) {
        this.CC = CC;
    }

    public Integer getPrioridade() {
        return Prioridade;
    }

    public void setPrioridade(Integer prioridade) {
        Prioridade = prioridade;
    }

    public float getSaldo() {
        return Saldo;
    }

    public void setSaldo(float saldo) {
        Saldo = saldo;
    }

    public LocalTime getHora_entrada_na_fila() {
        return hora_entrada_na_fila;
    }

    public void setHora_entrada_na_fila(LocalTime hora_entrada_na_fila) {
        this.hora_entrada_na_fila = hora_entrada_na_fila;
    }

    public LocalTime getTempo_espera_fila() {
        return tempo_espera_fila;
    }

    public void setTempo_espera_fila(LocalTime tempo_espera_fila) {
        this.tempo_espera_fila = tempo_espera_fila;
    }

    public LocalTime getTempo_sendo_atendido() {
        return tempo_sendo_atendido;
    }

    public void setTempo_sendo_atendido(LocalTime tempo_sendo_atendido) {
        this.tempo_sendo_atendido = tempo_sendo_atendido;
    }


    public Cliente(String Nome,String CC,Integer Prioridade,float Saldo){
        this.Nome = Nome;
        this.CC = CC;
        this.Prioridade = Prioridade;
        this.Saldo = Saldo;
        this.hora_entrada_na_fila = LocalTime.now();
    }
}
