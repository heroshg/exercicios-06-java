import java.util.HashSet;
import java.util.Set;

public class Departamento {
    private String nome;
    private Set<Funcionario> funcionarios;

    public Departamento(String nome) {
        this.nome = nome;
        this.funcionarios = new HashSet<>();
    }

    public String getNome() {
        return nome;
    }

    public Set<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void adicionarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    public void removerFuncionario(Funcionario funcionario) {
        funcionarios.remove(funcionario);
    }
}
