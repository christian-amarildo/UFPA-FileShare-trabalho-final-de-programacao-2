import java.util.ArrayList;

public class Grupo {
    // Atributos
    private String nome;  // Nome do grupo
    private ArrayList<User> membros;  // Lista de membros do grupo
    private static int GROUPID = 0;  // Identificador único do grupo (constante)

    // Construtor
    public Grupo(String nome) {
        this.nome = nome;
        this.membros = new ArrayList<>();
    }

    // Métodos

    // Método para um usuário entrar no grupo
    public void entrarNoGrupo(User usuario) {
        membros.add(usuario);  // Adiciona o usuário à lista de membros do grupo
        System.out.println(usuario.getNome() + " entrou no grupo " + nome);
    }

    // Método para um usuário sair do grupo
    public void sairDoGrupo(User usuario) {
        if (membros.remove(usuario)) {
            System.out.println(usuario.getNome() + " saiu do grupo " + nome);
        } else {
            System.out.println(usuario.getNome() + " não é membro deste grupo.");
        }
    }

    // Método para mandar uma mensagem para todos os membros do grupo
    public void mandarMensagem(String mensagem) {
        System.out.println("Mensagem enviada para todos os membros do grupo " + nome + ": " + mensagem);
        // Aqui podemos simular que todos os membros receberam a mensagem
    }

    // Método para apagar a mensagem para todos os membros do grupo
    public void apagarMensagemParaTodos() {
        System.out.println("Todas as mensagens foram apagadas para todos os membros do grupo " + nome);
        // Simula a exclusão de todas as mensagens
    }

    // Método para apagar a mensagem apenas para o usuário que a enviou
    public void apagarMensagemParaMim(User usuario) {
        System.out.println("Mensagem apagada para " + usuario.getNome() + " no grupo " + nome);
        // Simula a exclusão de mensagens do usuário específico
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<User> getMembros() {
        return membros;
    }

    public void setMembros(ArrayList<User> membros) {
        this.membros = membros;
    }

    public static int getGROUPID() {
        return GROUPID;
    }

    public static void setGROUPID(int groupID) {
        GROUPID = groupID;
    }
}
