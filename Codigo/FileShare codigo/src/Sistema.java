import java.util.ArrayList;
import java.util.Scanner;

public class Sistema implements SystemMethods {
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

    public void systemRun() {
        Scanner sc = new Scanner(System.in);

        // Criando alguns usuários para registrar no sistema
        User aluno = new Aluno("João Silva", "Aluno de Ciência da Computação", new Login("joao@email.com", "senha123", "Seguranca@123"), 12345, Assinatura.PADRAO);
        User moderador = new Moderador("Maria Souza", "Moderadora do Sistema", new Login("maria@email.com", "senha456", "Seguranca@456"), 2);

        System.out.println("Bem vindo ao sistema!");
        System.out.println("O que você deseja fazer?");
        System.out.println("1 - Acessar seus arquivos");
        System.out.println("2 - Acessar os Rankings");
        System.out.println("3 - Acessar os grupos");

        int opcao = sc.nextInt();

        // Registrando os usuários no sistema
        this.userRegistration(aluno);
        this.userRegistration(moderador);

        switch(opcao) {
            case 1:
                this.fileStorage();
                break;
            case 2:
                this.acessRanking();
                break;
            case 3:
                this.acessGroups();
                break;
        }

        // Exibindo os usuários registrados
        this.exibirUsuarios();

        // Chamando os outros métodos do sistema
    }

    // Getters e Setters
    public ArrayList<User> getUsers() {
        return users;
    }

    public void setUsers(ArrayList<User> users) {
        this.users = users;
    }
}
