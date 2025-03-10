import java.util.Scanner;

// OBS: REMODELAR ESSA CLASSE E A SISTEMA!
// A CLASSE MAIN SERÁ APENAS PARA COMEÇAR A RODAR A CLASSE SISTEMA
// A CLASSE SISTEMA TERÁ QUASE TUDO DO QUE HÁ AQUI

public class Main {

    // Método estático para conectar o sistema
    public static void connectSystem() {
        // Criando uma instância do sistema
        Sistema sistema = new Sistema();
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
        sistema.userRegistration(aluno);
        sistema.userRegistration(moderador);

        switch(opcao) {
            case 1:
                sistema.fileStorage();
                break;
            case 2:
                sistema.acessRanking();
                break;
            case 3:
                sistema.acessGroups();
                break;
        }

        // Exibindo os usuários registrados
        sistema.exibirUsuarios();

        // Chamando os outros métodos do sistema
    }

    // Método principal (entry point) do programa
    public static void main(String[] args) {
        // Conectando o sistema
        connectSystem();
    }
}
