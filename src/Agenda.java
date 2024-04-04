import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Agenda {

    Set<Contato> contatos;
    public Agenda() {
        contatos = new HashSet<>();
    }

    public void adicionarContato(Contato contato) {
        if(!contatos.contains(contato)) {
            contatos.add(contato);
            System.out.println("Contato cadastrado com sucesso!");
        }
    }

    public void removerContato(String nome) {
        Contato contatoARemover = null;
        for(Contato contato : contatos) {
            if(contato.getNome().equals(nome)) {
                contatoARemover = contato;
                break;
            }
        }

        if(contatoARemover != null) {
            contatos.remove(contatoARemover);
            System.out.println("Contato removido com sucesso!");
        } else {
            System.out.println("Contato não encontrado na agenda!");
        }
    }

    public Contato buscarContato(String nome) {
        for(Contato contato : contatos) {
            if(contato.getNome().equals(nome)) {
                return contato;
            }
        }
        return null;
    }

}
