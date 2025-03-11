import java.util.ArrayList;
import java.util.Scanner;

public class Sistema implements SystemMethods {
    // Atributo
    private ArrayList<User> users;  // Lista de usuários no sistema

    // Construtor
    public Sistema() {
        users = new ArrayList<>();  // Inicializando a lista de usuários
        // Adicionando alguns usuários ao sistema
        users.add(new Aluno("João Silva", "Aluno de Ciência da Computação",
                new Login("joao@email.com", "senha123", "Seguranca@123"),
                12345, Assinatura.PADRAO));
        users.add(new Moderador("Maria Souza", "Moderadora do Sistema",
                new Login("maria@email.com", "senha456", "Seguranca@456"),
                2));
    }

    // Métodos

    // Método para registrar um novo usuário no sistema
    public void userRegistration() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do novo usuário:");
        String nome = sc.nextLine();

        System.out.println("Digite a descrição do novo usuário:");
        String descricao = sc.nextLine();

        System.out.println("Digite o e-mail do novo usuário:");
        String email = sc.nextLine();

        System.out.println("Digite a senha do novo usuário:");
        String senha = sc.nextLine();

        // Pergunta o tipo de usuário (Aluno ou Moderador)
        System.out.println("Escolha o tipo de usuário:");
        System.out.println("1 - Aluno");
        System.out.println("2 - Moderador");
        int tipo = sc.nextInt();
        sc.nextLine(); // Consome a nova linha após a entrada do número

        // Dependendo do tipo escolhido, cria um Aluno ou Moderador
        User novoUsuario;
        if (tipo == 1) {
            System.out.println("Digite o número de matrícula do Aluno:");
            int matricula = sc.nextInt();
            sc.nextLine(); // Consome a nova linha após a entrada do número

            System.out.println("Escolha o tipo de assinatura:");
            System.out.println("1 - Padrão");
            System.out.println("2 - Premium");
            int tipoAssinatura = sc.nextInt();
            sc.nextLine(); // Consome a nova linha após a entrada do número

            Assinatura assinatura = (tipoAssinatura == 1) ? Assinatura.PADRAO : Assinatura.PREMIUM;
            novoUsuario = new Aluno(nome, descricao, new Login(email, senha, "Seguranca@123"), matricula, assinatura);
        } else {
            System.out.println("Digite o nível do Moderador:");
            int nivel = sc.nextInt();
            sc.nextLine(); // Consome a nova linha após a entrada do número
            novoUsuario = new Moderador(nome, descricao, new Login(email, senha, "Seguranca@456"), nivel);
        }

        // Adiciona o novo usuário à lista de usuários
        users.add(novoUsuario);
        System.out.println("Usuário " + nome + " registrado com sucesso!");
    }

    // Método para fazer login de um usuário
    public void userLogin() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu e-mail:");
        String email = sc.nextLine();
        System.out.println("Digite sua senha:");
        String senha = sc.nextLine();

        // Verificar se as credenciais correspondem a algum usuário no sistema
        boolean loginValido = false;

        for (User user : users) {
            // Aqui, ao invés de descriptografar, verifica-se diretamente o e-mail e a senha
            if (user.getLoginInfos().getEmail().equals(email) && user.getLoginInfos().getSenha().equals(senha)) {
                user.login();  // Realiza o login do usuário
                loginValido = true;
                break;  // Se encontrar o usuário, não precisa continuar a busca
            }
        }

        if (!loginValido) {
            System.out.println("E-mail ou senha inválidos. Tente novamente.");
        } else {
            // Se o login for válido, exibe as opções de interação
            menuOpcoes();
        }
    }

    // Método para exibir o menu de opções após o login
    public void menuOpcoes() {
        Scanner sc = new Scanner(System.in);
        int opcao;

        // Apresentar opções para o usuário
        do {
            System.out.println("Escolha uma das opções de interação:");
            System.out.println("1 - Gerenciar armazenamento de arquivos");
            System.out.println("2 - Acessar o ranking dos usuários");
            System.out.println("3 - Acessar os grupos disponíveis");
            System.out.println("4 - Sair");
            System.out.print("Digite a opção desejada: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    this.fileStorage();
                    break;
                case 2:
                    this.acessRanking();
                    break;
                case 3:
                    this.acessGroups();
                    break;
                case 4:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 4);  // O menu fica ativo até o usuário escolher a opção de sair
    }

    // Método para gerenciar o armazenamento de arquivos
    public void fileStorage() {
        System.out.println("Gerenciando o armazenamento de arquivos no sistema.");
    }

    // Método para acessar o ranking de usuários
    public void acessRanking() {
        System.out.println("Acessando o ranking dos usuários...");
    }

    // Método para acessar os grupos disponíveis no sistema
    public void acessGroups() {
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

    public void exit() {
        System.out.println("Saindo do sistema...");
        System.exit(0);  // Finaliza a aplicação
    }

    // Método para rodar o sistema
    public void systemRun() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Bem-vindo ao sistema!");
        System.out.println("O que você deseja fazer?");
        System.out.println("1 - Fazer Login");
        System.out.println("2 - Registrar");
        System.out.println("3 - Sair");

        int opcao = sc.nextInt();
        sc.nextLine(); // Consome a nova linha após a entrada do número

        switch (opcao) {
            case 1:
                this.userLogin();  // Chama o método de login
                break;
            case 2:
                this.userRegistration();
                break;
            case 3:
                this.exit();  // Chama o método para sair
                break;
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
