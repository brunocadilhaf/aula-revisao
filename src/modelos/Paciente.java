package modelos;

public class Paciente extends Pessoa implements Comparable<Paciente> {
    private String observacao;
    private Medico medico;
    private Boolean atendido;

    public Paciente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        this.atendido = false;
    }

    @Override
    public String toString() {
        return "Nome: " + this.nome + " - CPF: " + this.cpf;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getObservacao() {
        return observacao;
    }
    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }
    public Medico getMedico() {
        return medico;
    }
    public void setMedico(Medico medico) {
        this.medico = medico;
    }
    public Boolean getAtendido() {
        return atendido;
    }

    public void setAtendido(Boolean atendido) {
        this.atendido = atendido;
    }

    @Override
    public int compareTo(Paciente paciente) {
        // TODO Auto-generated method stub
        return this.getCpf().compareTo(paciente.getCpf());
    }

}
