public class Main {

    // Método estático para conectar o sistema
    public static void connectSystem() {
        // Criando uma instância do sistema
        Sistema sistema = new Sistema();

        // Criando alguns usuários para registrar no sistema
        User aluno = new Aluno("João Silva", "Aluno de Ciência da Computação", new Login("joao@email.com", "senha123", "Seguranca@123"), 12345, Assinatura.PADRAO);
        User moderador = new Moderador("Maria Souza", "Moderadora do Sistema", new Login("maria@email.com", "senha456", "Seguranca@456"), 2);

        // Registrando os usuários no sistema
        sistema.userRegistration(aluno);
        sistema.userRegistration(moderador);

        // Exibindo os usuários registrados
        sistema.exibirUsuarios();

        // Chamando os outros métodos do sistema
        sistema.fileStorage();
        sistema.acessRanking();
        sistema.acessGroups();
    }

    // Método principal (entry point) do programa
    public static void main(String[] args) {
        // Conectando o sistema
        connectSystem();
    }
}
