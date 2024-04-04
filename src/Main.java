//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Exercício 01
        Agenda agenda = new Agenda();

        Contato contato1 = new Contato("João", "123456789");
        Contato contato2 = new Contato("Maria", "987654321");
        Contato contato3 = new Contato("João", "999888777"); // Tentativa de adicionar um contato duplicado

        agenda.adicionarContato(contato1);
        agenda.adicionarContato(contato2);
        agenda.adicionarContato(contato3); // Isso deve falhar porque João já está na agenda

        agenda.removerContato("Maria");

        Contato contatoEncontrado = agenda.buscarContato("João");
        if (contatoEncontrado != null) {
            System.out.println("Telefone de João: " + contatoEncontrado.getTelefone());
        } else {
            System.out.println("Contato não encontrado.");
        }

        // Exercício 02
        CadastroProdutos cadastro = new CadastroProdutos();

        cadastro.adicionarProduto("Produto A", 10.5);
        cadastro.adicionarProduto("Produto B", 15.75);
        cadastro.adicionarProduto("Produto A", 20.0); // Tentativa de adicionar um produto com o mesmo nome

        cadastro.removerProduto("Produto A".hashCode());

        Produto produtoEncontrado = cadastro.buscarProduto("Produto B".hashCode());
        if (produtoEncontrado != null) {
            System.out.println("Nome do produto: " + produtoEncontrado.getNome());
            System.out.println("Preço do produto: " + produtoEncontrado.getPreco());
        } else {
            System.out.println("Produto não encontrado.");
        }
        //Exercício 03
        Empresa empresa = new Empresa();

        empresa.adicionarDepartamento("RH");
        empresa.adicionarDepartamento("TI");

        Funcionario func1 = new Funcionario("João", "123456789", 30, "Analista");
        Funcionario func2 = new Funcionario("Maria", "987654321", 25, "Desenvolvedor");

        empresa.adicionarFuncionario("RH", func1);
        empresa.adicionarFuncionario("TI", func2);

        empresa.exibirFuncionariosDepartamento("RH");

        empresa.removerFuncionario("RH", "123456789");

        empresa.exibirFuncionariosDepartamento("RH");

        empresa.removerDepartamento("TI");


    }

}
