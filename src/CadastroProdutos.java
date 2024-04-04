import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CadastroProdutos {
    private Map<Integer, Produto> produtosPorCodigo;
    private Set<String> nomesProdutos;

    public CadastroProdutos() {
        produtosPorCodigo = new HashMap<>();
        nomesProdutos = new HashSet<>();
    }

    public void adicionarProduto(String nome, double preco) {
        // Verifica se o produto já existe pelo nome
        if (nomesProdutos.contains(nome)) {
            System.out.println("Produto já existe no cadastro.");
            return;
        }

        Produto novoProduto = new Produto(nome, preco);
        produtosPorCodigo.put(novoProduto.getCodigo(), novoProduto);
        nomesProdutos.add(nome);
        System.out.println("Produto adicionado com sucesso. Código: " + novoProduto.getCodigo());
    }

    public void removerProduto(int codigo) {
        Produto produtoARemover = produtosPorCodigo.get(codigo);
        if (produtoARemover != null) {
            produtosPorCodigo.remove(codigo);
            nomesProdutos.remove(produtoARemover.getNome());
            System.out.println("Produto removido com sucesso.");
        } else {
            System.out.println("Produto não encontrado no cadastro.");
        }
    }

    public Produto buscarProduto(int codigo) {
        return produtosPorCodigo.get(codigo);
    }

}
