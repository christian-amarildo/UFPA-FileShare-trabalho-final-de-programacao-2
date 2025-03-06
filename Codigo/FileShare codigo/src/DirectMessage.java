import java.util.ArrayList;

public class DirectMessage {
    // Atributos
    private ArrayList<String> mensagens;  // Lista de mensagens enviadas
    private User user;  // O usuário que enviou a mensagem

    // Construtor
    public DirectMessage(User user) {
        this.user = user;
        this.mensagens = new ArrayList<>();
    }

    // Métodos

    // Método para mandar uma mensagem para o usuário
    public void mandarMensagem(String mensagem) {
        mensagens.add(mensagem);  // Adiciona a mensagem à lista
        System.out.println("Usuário " + user.getNome() + " enviou uma mensagem: " + mensagem);
    }

    // Método para apagar a mensagem para todos os usuários
    public void apagarMensagemParaTodos() {
        mensagens.clear();  // Limpa todas as mensagens
        System.out.println("Todas as mensagens de " + user.getNome() + " foram apagadas.");
    }

    // Método para apagar a mensagem apenas para o usuário que a enviou
    public void apagarMensagemParaMim() {
        if (!mensagens.isEmpty()) {
            mensagens.remove(mensagens.size() - 1);  // Remove a última mensagem enviada
            System.out.println("Mensagem apagada para " + user.getNome());
        } else {
            System.out.println("Não há mensagens para apagar.");
        }
    }

    // Getters e Setters
    public ArrayList<String> getMensagens() {
        return mensagens;
    }

    public void setMensagens(ArrayList<String> mensagens) {
        this.mensagens = mensagens;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
