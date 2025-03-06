import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Ranking {
    // Atributos
    private User[] podio = new User[3];  // Armazena os 3 melhores usuários
    private ArrayList<User> usuariosOrdenados;  // Lista de usuários ordenados

    // Construtor
    public Ranking() {
        this.usuariosOrdenados = new ArrayList<>();
    }

    // Método para mostrar os 3 melhores usuários com mais arquivos
    public void mostrarUsuariosMaisArquivos() {
        // Ordena os usuários pela quantidade de arquivos (do maior para o menor)
        Collections.sort(usuariosOrdenados, new Comparator<User>() {
            @Override
            public int compare(User u1, User u2) {
                return Integer.compare(u2.getArquivos().size(), u1.getArquivos().size());
            }
        });

        // Exibe os 3 usuários com mais arquivos
        System.out.println("Top 3 usuários com mais arquivos:");
        for (int i = 0; i < 3 && i < usuariosOrdenados.size(); i++) {
            User user = usuariosOrdenados.get(i);
            System.out.println((i + 1) + ". " + user.getNome() + " - Arquivos: " + user.getArquivos().size());
        }
    }

    // Método para mostrar os 3 usuários melhor avaliados
    public void mostrarUsuariosMelhorAvaliados() {
        // Ordena os usuários pela avaliação (do maior para o menor)
        Collections.sort(usuariosOrdenados, new Comparator<User>() {
            @Override
            public int compare(User u1, User u2) {
                return Double.compare(u2.getAvaliacaoDoUsuario(), u1.getAvaliacaoDoUsuario());
            }
        });

        // Exibe os 3 usuários com melhores avaliações
        System.out.println("Top 3 usuários melhor avaliados:");
        for (int i = 0; i < 3 && i < usuariosOrdenados.size(); i++) {
            User user = usuariosOrdenados.get(i);
            System.out.println((i + 1) + ". " + user.getNome() + " - Avaliação: " + user.getAvaliacaoDoUsuario());
        }
    }

    // Método para premiar um usuário
    public void premiar() {
        if (usuariosOrdenados.isEmpty()) {
            System.out.println("Não há usuários suficientes para premiar.");
            return;
        }

        // Premia o primeiro usuário da lista
        User premiado = usuariosOrdenados.get(0);  // O usuário mais bem classificado
        System.out.println("Parabéns " + premiado.getNome() + ", você foi premiado com base no seu desempenho!");
    }

    // Getters e Setters
    public User[] getPodio() {
        return podio;
    }

    public void setPodio(User[] podio) {
        this.podio = podio;
    }

    public ArrayList<User> getUsuariosOrdenados() {
        return usuariosOrdenados;
    }

    public void setUsuariosOrdenados(ArrayList<User> usuariosOrdenados) {
        this.usuariosOrdenados = usuariosOrdenados;
    }
}
