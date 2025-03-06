public class Aluno extends User {
    // Atributos específicos da classe Aluno
    private int matricula;  // Número de matrícula do aluno
    private Assinatura tipoAssinatura;  // Tipo de assinatura do aluno (Padrão ou Premium)

    // Construtor
    public Aluno(String nome, String descricao, Login loginInfos, int matricula, Assinatura tipoAssinatura) {
        super(nome, descricao, loginInfos);  // Chama o construtor da classe base User
        this.matricula = matricula;
        this.tipoAssinatura = tipoAssinatura;
    }

    // Métodos específicos da classe Aluno (Herança dos métodos de User)
    // Os métodos de User são herdados, como: login(), logout(), adicionarArquivoProprio(), etc.

    // Getters e Setters para os atributos específicos da classe Aluno
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public Assinatura getTipoAssinatura() {
        return tipoAssinatura;
    }

    public void setTipoAssinatura(Assinatura tipoAssinatura) {
        this.tipoAssinatura = tipoAssinatura;
    }

    // Exemplo de comportamento específico de um Aluno (se necessário)
    public void exibirInformacoesAluno() {
        System.out.println("Nome: " + nome);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Tipo de Assinatura: " + tipoAssinatura);
        System.out.println("Descrição: " + descricao);
        System.out.println("Avaliação: " + avaliacaoDoUsuario);
    }
}
