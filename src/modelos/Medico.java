package modelos;

import java.util.ArrayList;
import java.util.List;

public class Medico extends Pessoa implements Comparable<Medico> {
    private List<Paciente> listaPacientes;

    public Medico(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        this.listaPacientes = new ArrayList<>();
    }

    @Override
    public String toString() {
        String pacientes = "";

        for (Paciente paciente : listaPacientes){
            pacientes += paciente;
        }

        return "Nome: " + this.nome + " - CPF: " + this.cpf +
            " - Pacientes: " + pacientes;
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
    public void adicionarPaciente(Paciente paciente) throws Exception {
        if (paciente.getAtendido())
            throw new Exception("Paciente já foi atendido!");

        listaPacientes.add(paciente);
    }
    public void adicionarPaciente(List<Paciente> pacientes) throws Exception {
        for (Paciente paciente : pacientes) {
            adicionarPaciente(paciente);
        }
    }

    @Override
    public int compareTo(Medico medico) {
        return this.getCpf().compareTo(medico.getCpf());
    }
}
