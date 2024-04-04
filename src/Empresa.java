import java.util.HashMap;
import java.util.Map;

public class Empresa {
    private Map<String, Departamento> departamentos;

    public Empresa() {
        departamentos = new HashMap<>();
    }

    public void adicionarDepartamento(String nomeDepartamento) {
        if (!departamentos.containsKey(nomeDepartamento)) {
            departamentos.put(nomeDepartamento, new Departamento(nomeDepartamento));
            System.out.println("Departamento adicionado com sucesso.");
        } else {
            System.out.println("Departamento já existe na empresa.");
        }
    }

    public void removerDepartamento(String nomeDepartamento) {
        if (departamentos.containsKey(nomeDepartamento)) {
            departamentos.remove(nomeDepartamento);
            System.out.println("Departamento removido com sucesso.");
        } else {
            System.out.println("Departamento não encontrado na empresa.");
        }
    }

    public void adicionarFuncionario(String nomeDepartamento, Funcionario funcionario) {
        if (departamentos.containsKey(nomeDepartamento)) {
            Departamento departamento = departamentos.get(nomeDepartamento);
            // Verifica se o funcionário já existe pelo CPF
            boolean funcionarioDuplicado = departamento.getFuncionarios().contains(funcionario);
            if (!funcionarioDuplicado) {
                departamento.adicionarFuncionario(funcionario);
                System.out.println("Funcionário adicionado ao departamento com sucesso.");
            } else {
                System.out.println("Funcionário já existe no departamento.");
            }
        } else {
            System.out.println("Departamento não encontrado na empresa.");
        }
    }

    public void removerFuncionario(String nomeDepartamento, String cpf) {
        if (departamentos.containsKey(nomeDepartamento)) {
            Departamento departamento = departamentos.get(nomeDepartamento);
            Funcionario funcionarioARemover = null;
            for (Funcionario funcionario : departamento.getFuncionarios()) {
                if (funcionario.getCpf().equals(cpf)) {
                    funcionarioARemover = funcionario;
                    break;
                }
            }
            if (funcionarioARemover != null) {
                departamento.removerFuncionario(funcionarioARemover);
                System.out.println("Funcionário removido do departamento com sucesso.");
            } else {
                System.out.println("Funcionário não encontrado no departamento.");
            }
        } else {
            System.out.println("Departamento não encontrado na empresa.");
        }
    }

    public void exibirFuncionariosDepartamento(String nomeDepartamento) {
        if (departamentos.containsKey(nomeDepartamento)) {
            Departamento departamento = departamentos.get(nomeDepartamento);
            System.out.println("Funcionários do departamento " + departamento.getNome() + ":");
            for (Funcionario funcionario : departamento.getFuncionarios()) {
                System.out.println("Nome: " + funcionario.getNome() + ", Idade: " + funcionario.getIdade() + ", Cargo: " + funcionario.getCargo());
            }
        } else {
            System.out.println("Departamento não encontrado na empresa.");
        }
    }
}
