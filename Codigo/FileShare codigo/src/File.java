public class File {
    // Atributos
    private String nome;  // Nome do arquivo
    private static int FILEID = 0;  // Identificador único do arquivo (constante)
    private Tipos_arquivos tipo;  // Tipo do arquivo (enum)
    private User autor;  // O usuário que fez o upload do arquivo
    private double avaliacao;  // Avaliação do arquivo

    // Construtor
    public File(String nome, Tipos_arquivos tipo, User autor) {
        this.nome = nome;
        this.tipo = tipo;
        this.autor = autor;
        this.avaliacao = 0.0;  // Avaliação inicial do arquivo
        FILEID++;  // Incrementa o identificador do arquivo
    }

    // Métodos
    public void avaliarArquivo(double avaliacao) {
        this.avaliacao = avaliacao;  // Atualiza a avaliação do arquivo
        System.out.println("Arquivo " + nome + " recebeu a avaliação " + avaliacao + " estrelas.");
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getFILEID() {
        return FILEID;
    }

    public Tipos_arquivos getTipo() {
        return tipo;
    }

    public void setTipo(Tipos_arquivos tipo) {
        this.tipo = tipo;
    }

    public User getAutor() {
        return autor;
    }

    public void setAutor(User autor) {
        this.autor = autor;
    }

    public double getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(double avaliacao) {
        this.avaliacao = avaliacao;
    }
}
