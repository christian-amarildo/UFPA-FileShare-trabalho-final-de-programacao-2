import java.util.ArrayList;

public class Moderador extends User {
    // Atributo específico da classe Moderador
    private int nivel;  // Nível do moderador que determina seu poder no sistema

    // Construtor
    public Moderador(String nome, String descricao, Login loginInfos, int nivel) {
        super(nome, descricao, loginInfos);  // Chama o construtor da classe base User
        this.nivel = nivel;
    }

    // Métodos específicos da classe Moderador
    // O moderador pode alertar, banir e gerenciar arquivos de outros usuários

    // Método para alertar um usuário
    public void alertarUsuario(User usuario) {
        // Lógica para alertar o usuário (exemplo simples)
        System.out.println("Moderador " + nome + " alertou o usuário " + usuario.getNome());
    }

    // Método para banir um usuário
    public void banirUsuario(User usuario) {
        // Lógica para banir o usuário (exemplo simples)
        System.out.println("Moderador " + nome + " baniu o usuário " + usuario.getNome());
    }

    // Método para remover arquivos de um usuário
    public void removerArquivosDeUsuario(User usuario) {
        // Lógica para remover arquivos de um usuário
        ArrayList<File> arquivosUsuario = usuario.getArquivos();
        arquivosUsuario.clear();
        System.out.println("Moderador " + nome + " removeu todos os arquivos do usuário " + usuario.getNome());
    }

    // Método para modificar arquivos de um usuário
    public void modificarArquivoDeUsuario(User usuario, File arquivo) {
        // Lógica para modificar um arquivo de um usuário
        System.out.println("Moderador " + nome + " modificou o arquivo " + arquivo.getNome() + " do usuário " + usuario.getNome());
    }

    // Getters e Setters
    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    // Exemplo de comportamento adicional (pode ser removido ou alterado conforme necessidade)
    public void exibirInformacoesModerador() {
        System.out.println("Nome: " + nome);
        System.out.println("Nível do Moderador: " + nivel);
        System.out.println("Descrição: " + descricao);
        System.out.println("Avaliação: " + avaliacaoDoUsuario);
    }
}
