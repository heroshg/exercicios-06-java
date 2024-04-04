public class Produto {
    private static int proximoCodigo = 1;
    private int codigo;
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.codigo = gerarCodigo(nome);
        this.nome = nome;
        this.preco = preco;
    }

    private int gerarCodigo(String nome) {
        return nome.hashCode();
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }
}
