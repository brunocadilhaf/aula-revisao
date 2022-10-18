import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import modelos.Medico;
import modelos.Paciente;

public class App {
    public static void main(String[] args) throws Exception {
        //#1 - Introdução ao JAVA
        // Criar classe Medico (Nome, CPF) e Paciente (Nome, CPF, Observacao)

        //#2 - Encapsulamento
        // Criar encapsulamento dos atributos
        // Criar método na classe Medico para definir se ele está disponível
        // Criar método na classe Paciente para definir se ele foi atendido

        //#3 - Construtores
        // Criar construtor para classe Medico e Paciente

        //#4 - Versionamento git
        // --

        //#5 - Associação entre classes
        // Criar método na classe Medico para adicionar Paciente (Lista de pacientes)
        // Criar método na classe Paciente para adicionar Medico (Apenas um médico)

        //#6 - Herança
        // Criar classe Pessoa (Nome, CPF) e criar herança para as classes Medico e Paciente
        // Na classe Medico sobrescrever método toString(), apresentando nome, cpf e lista de pacientes
        // Na classe Paciente sobrescrever método toString(), apresentando nome e cpf

        //#7 - Tratamento de exceções
        // Criar validação dentro da classe Medico, no método de adicionar paciente, verificando se o paciente já foi atendido
        // Criar validação dentro da classe Paciente, no método de adicionar médico, verificando se o médico está disponível

        //#8 - Polimorfismo
        // Criar método na classe Medico, para adicionar uma lista de Paciente

        //#9 - Classes, métodos abstratos e interfaces
        // Faremos uso de interface para ordenar

        //#10 - Collections
        // Trocar vetores por ArrayList

        //#11 - Collections (Ordenação)
        // Criar ordenação padrão na classe Medico e Paciente por CPF
        // Criar opção para ordenar por Nome ou CPF

        //#12 - Stream (Manipulação)
        // Criar e apresentar filtro de pacientes já atendidos
        // Apresentar total de pacientes por médico.


        //#13 - Stream (Agrupamentos)
        // Apresentar total de pacientes por médico já atendidos e não atendidos.

        try
        {
            List<Medico> listaMedicos = new ArrayList<>();

            Medico med = new Medico("Dr. Pedro", "000.000.000-03");
            Medico med2 = new Medico("Dr. Drawzio", "000.000.000-01");
            Medico med3 = new Medico("Dr. Drawzio 2", "000.000.000-01");

            Paciente pac = new Paciente("Seu madruga", "111.111.111-11");
            pac.setObservacao("Muita preguiça");
            pac.setMedico(med);
    
            // pac.setAtendido(true);
    
            med.adicionarPaciente(pac);
            listaMedicos.add(med);
            listaMedicos.add(med2);
            listaMedicos.add(med3);

            listaMedicos.sort(null);
            listaMedicos.forEach(m -> System.out.println(m));

            listaMedicos.stream()
                .filter(p -> p.getCpf().contains("3"))
                .forEach(m -> System.out.println(m));
            
                
            Map<String, List<Medico>> novaLista =
                listaMedicos.stream().collect(Collectors.groupingBy(Medico::getCpf));

            novaLista.entrySet().forEach(l -> System.out.println(l.getValue()));
    
            // System.out.println(med);
            // System.out.println(pac);
        }
        catch (Exception ex) {
            System.out.println(ex.getMessage());
            System.out.println("Sistema será encerrado!");
        }
    }
}
