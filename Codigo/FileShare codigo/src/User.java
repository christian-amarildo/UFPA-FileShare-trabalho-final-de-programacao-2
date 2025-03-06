import java.util.ArrayList;

public abstract class User {
    // Atributos
    protected String nome;
    protected double avaliacaoDoUsuario;
    protected String descricao;
    protected static int USERID;  // constante estática
    protected Login loginInfos;  // informações de login do usuário
    protected ArrayList<File> arquivos;  // lista de arquivos do usuário
    protected ArrayList<Grupo> gruposDoUsuario;  // lista de grupos do usuário
    protected ArrayList<DirectMessage> directMessages;  // lista de mensagens diretas do usuário

    // Construtor
    public User(String nome, String descricao, Login loginInfos) {
        this.nome = nome;
        this.descricao = descricao;
        this.loginInfos = loginInfos;
        this.arquivos = new ArrayList<>();
        this.gruposDoUsuario = new ArrayList<>();
        this.directMessages = new ArrayList<>();
        this.avaliacaoDoUsuario = 0.0;  // avaliação inicial
    }

    // Métodos
    public void login() {
        // Implementação do login, que pode envolver autenticação usando loginInfos
        System.out.println("Usuário " + nome + " está logado.");
    }

    public void logout() {
        // Implementação do logout
        System.out.println("Usuário " + nome + " está deslogado.");
    }

    public void adicionarArquivoProprio(File arquivo) {
        // Adiciona um arquivo à lista de arquivos do usuário
        arquivos.add(arquivo);
        System.out.println("Arquivo " + arquivo.getNome() + " adicionado ao perfil do usuário " + nome + ".");
    }

    public void removerArquivoProprio(File arquivo) {
        // Remove um arquivo da lista de arquivos do usuário
        if (arquivos.remove(arquivo)) {
            System.out.println("Arquivo " + arquivo.getNome() + " removido do perfil do usuário " + nome + ".");
        } else {
            System.out.println("Arquivo não encontrado.");
        }
    }

    public void modificarArquivoProprio(File arquivo) {
        // Modifica um arquivo do usuário (simulado)
        System.out.println("Arquivo " + arquivo.getNome() + " modificado pelo usuário " + nome + ".");
    }

    public void avaliarUsuario(User outroUsuario, double avaliacao) {
        // Avaliar outro usuário
        outroUsuario.setAvaliacaoDoUsuario(avaliacao);
        System.out.println("Usuário " + nome + " avaliou o usuário " + outroUsuario.getNome() + " com " + avaliacao + " estrelas.");
    }

    public void avaliarArquivo(File arquivo, double avaliacao) {
        // Avaliar um arquivo
        arquivo.setAvaliacao(avaliacao);
        System.out.println("Usuário " + nome + " avaliou o arquivo " + arquivo.getNome() + " com " + avaliacao + " estrelas.");
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getAvaliacaoDoUsuario() {
        return avaliacaoDoUsuario;
    }

    public void setAvaliacaoDoUsuario(double avaliacaoDoUsuario) {
        this.avaliacaoDoUsuario = avaliacaoDoUsuario;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public static int getUserID() {
        return USERID;
    }

    public Login getLoginInfos() {
        return loginInfos;
    }

    public void setLoginInfos(Login loginInfos) {
        this.loginInfos = loginInfos;
    }

    public ArrayList<File> getArquivos() {
        return arquivos;
    }

    public void setArquivos(ArrayList<File> arquivos) {
        this.arquivos = arquivos;
    }

    public ArrayList<Grupo> getGruposDoUsuario() {
        return gruposDoUsuario;
    }

    public void setGruposDoUsuario(ArrayList<Grupo> gruposDoUsuario) {
        this.gruposDoUsuario = gruposDoUsuario;
    }

    public ArrayList<DirectMessage> getDirectMessages() {
        return directMessages;
    }

    public void setDirectMessages(ArrayList<DirectMessage> directMessages) {
        this.directMessages = directMessages;
    }
}
