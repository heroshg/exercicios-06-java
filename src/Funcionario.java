public class Funcionario {
    private String nome;
    private String cpf;
    private int idade;
    private String cargo;

    public Funcionario(String nome, String cpf, int idade, String cargo) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.cargo = cargo;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public int getIdade() {
        return idade;
    }

    public String getCargo() {
        return cargo;
    }
}
