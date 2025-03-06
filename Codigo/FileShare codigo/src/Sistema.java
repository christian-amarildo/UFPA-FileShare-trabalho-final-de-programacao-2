import java.util.ArrayList;

public class Sistema {
    // Atributo
    private ArrayList<User> users;  // Lista de usuários no sistema

    // Construtor
    public Sistema() {
        this.users = new ArrayList<>();
    }

    // Métodos

    // Método para registrar um novo usuário no sistema
    public void userRegistration(User user) {
        users.add(user);  // Adiciona o novo usuário à lista de usuários
        System.out.println("Usuário " + user.getNome() + " registrado com sucesso!");
    }

    // Método para gerenciar o armazenamento de arquivos
    public void fileStorage() {
        // Lógica de armazenamento de arquivos (exemplo simples)
        System.out.println("Gerenciando o armazenamento de arquivos no sistema.");
    }

    // Método para acessar o ranking de usuários
    public void acessRanking() {
        // Lógica para acessar e exibir o ranking dos usuários (exemplo simples)
        System.out.println("Acessando o ranking dos usuários...");
    }

    // Método para acessar os grupos disponíveis no sistema
    public void acessGroups() {
        // Lógica para acessar e exibir os grupos disponíveis (exemplo simples)
        System.out.println("Acessando os grupos disponíveis no sistema...");
    }

    // Método para exibir todos os usuários registrados no sistema
    public void exibirUsuarios() {
        if (users.isEmpty()) {
            System.out.println("Não há usuários registrados no sistema.");
        } else {
            System.out.println("Usuários registrados no sistema:");
            for (User user : users) {
                System.out.println("Nome: " + user.getNome() + ", Tipo de Usuário: " + user.getClass().getSimpleName());
            }
        }
    }

    // Getters e Setters
    public ArrayList<User> getUsers() {
        return users;
    }

    public void setUsers(ArrayList<User> users) {
        this.users = users;
    }
}
